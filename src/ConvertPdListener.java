import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.v4.runtime.TokenStream;

//tracked version
public class ConvertPdListener extends RowsBaseListener {
	class Pair{
		int objectNumber;
		int outletNumber;
		public Pair(int objectNum,int outletNumber){
			this.objectNumber = objectNum;
			this.outletNumber = outletNumber;
		}
		public String toString() {
			return objectNumber + "-" + outletNumber; 
		}
	}
	class PDObject{
		
		String name;
		String defaultVal;
		List<String> args;
		//integer -> PDObject's inletNumber
		//List<Pair> -> [{0,0}, {1,0}] means 0th object's 0th outlet and 1st object's 0th outlet are coming into this PDObject's inlet
		Map<Integer,List<Pair>> objectInlets;  
		Map<Integer,String> outputs;
		public PDObject(String name,String defaultVal){
			this.name = name;
			this.defaultVal = defaultVal;
			this.objectInlets = new HashMap<Integer,List<Pair>>();
			this.outputs = new HashMap<Integer,String>();
		}
		public PDObject(String name){
			this.name = name;
			this.defaultVal = "no-default";
			this.objectInlets = new HashMap<Integer,List<Pair>>();
			this.outputs = new HashMap<Integer,String>();
		}
		public PDObject(String name,List<String> args){
			this.name = name;
			this.defaultVal = "no-default";
			this.objectInlets = new HashMap<Integer,List<Pair>>();
			this.outputs = new HashMap<Integer,String>();
			this.args = args;
		}
		public String toString() {
			return name + objectInlets.toString();
		}
	}
	
	RowsParser parser;
	List<String> imports;
	List<String> exps;
	int objNo = 0;

	//new variables
	Map<Integer,PDObject> pdObjects;   //integer -> object number
	int dacObjectNumber;
	Map<Integer, String> definitions;
	


	public ConvertPdListener(RowsParser parser) {
		this.parser = parser;
		this.imports = new ArrayList<String>();
		this.exps = new ArrayList<String>();
		
		this.pdObjects = new HashMap<Integer,PDObject>();
		this.definitions = new HashMap<Integer, String>();
	}
	
//	@Override
//	public void exitExpr(RowsParser.ExprContext ctx){
//		TokenStream tokens = parser.getTokenStream();
//		System.out.println(tokens.getText(ctx));
//
//	}
	
	@Override
	public void enterFile(RowsParser.FileContext ctx){
		//		System.out.println("row:"+ctx.row().getText());
	}

	@Override
	public void exitFile(RowsParser.FileContext ctx) {
		//System.out.println(imports);
		//System.out.println(objects);
		//System.out.println(pdObjects);
		PDObject dacObject = pdObjects.get(dacObjectNumber);
		
		//Pair inlet0 = dacObject.objectInlets.get(0);
		String inlet0 = "";
		List<Pair> comingSourcesToInlet0 = dacObject.objectInlets.get(0);
		if(comingSourcesToInlet0 != null){
			for(int i=0; i<comingSourcesToInlet0.size(); i++){
				Pair pair = comingSourcesToInlet0.get(i);
	        	inlet0 += createObject_setOutput(pair.objectNumber,pair.outletNumber) + "+";
			}
			inlet0 = inlet0.substring(0, inlet0.length()-1);
		}
		
		
		String inlet1 = "";
		List<Pair> comingSourcesToInlet1 = dacObject.objectInlets.get(1);
		if(comingSourcesToInlet1 !=null){
			for(int i=0; i<comingSourcesToInlet1.size(); i++){
				Pair pair = comingSourcesToInlet1.get(i);
	        	inlet1 += createObject_setOutput(pair.objectNumber,pair.outletNumber) + "+";
			}
			inlet1 = inlet1.substring(0, inlet1.length()-1);
		}
		
		String process = "_";
		if(!inlet0.equalsIgnoreCase("") && inlet1.equalsIgnoreCase("")){
			process = String.format("process=%s;",inlet0);
		}
		else if(inlet0.equalsIgnoreCase("") && !inlet1.equalsIgnoreCase("")){
			process = String.format("process=%s;",inlet1);
		}
		else if(!inlet0.equalsIgnoreCase("") && !inlet1.equalsIgnoreCase("")){
			process = String.format("process=%s,%s;",inlet0,inlet1);
		}
		else{
			process = "process = _;";
		}
				
		
		
		//PRINT FAUST PROGRAM TREE
		if(imports.size() > 0){
			System.out.println(imports.get(0));
		}
		
		Iterator<Entry<Integer, String>> it = this.definitions.entrySet().iterator();
	    while (it.hasNext()) {	        
			Entry<Integer, String> pairs = it.next();
	        System.out.println(pairs.getValue());
	        it.remove(); // avoids a ConcurrentModificationException //REMOVES ALSO FROM HASH TABLE
	    }
	    
		System.out.println(process);
	}
	
	//Creates the object with given objectNumber and sets the numbered outlet output
	public String createObject_setOutput(int objectNumber,int outletNumber){
		
		PDObject pdObject = pdObjects.get(objectNumber);
		
		if(pdObject.name.equalsIgnoreCase("'osc~'")){
			//TODO Implement inlet1
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				for (int i = 0; i < comingSourcesToInlet0.size(); i++) {
					Pair tmp = comingSourcesToInlet0.get(i);
					inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber) + "+";
				}
				inlet0 = inlet0.substring(0, inlet0.length()-1);
				pdObject.defaultVal = inlet0;
			}		
			
			String output_on_outlet0 = String.format("osc%s", objectNumber);
			
			pdObject.outputs.put(outletNumber,output_on_outlet0);
			
			this.definitions.put(objectNumber, String.format("osc%s=osc(%s);", objectNumber,pdObject.defaultVal));
			return output_on_outlet0;
		}
		
		else if(pdObject.name.equalsIgnoreCase("'floatatom'")){
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				PDObject obj = pdObjects.get(tmp.objectNumber);
				if(obj.name.equalsIgnoreCase("'msg'")){
					String objOut = createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
					inlet0 +=  String.format("((1-checkbox%s)*number%s)+%s",tmp.objectNumber,objectNumber,objOut);
				}
				else{
					inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
				}
				//inlet0 = createObject_setOutput(tmp.objectNumber, tmp.objectNumber);
				
			}
			//IF NO COMING CONNECTION INTO INLET0
			else{
				inlet0 = String.format("number%s",objectNumber);
			}
			
			String output_on_outlet0 = String.format("%s",inlet0);						
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			//if(inlet0 == null){
				this.definitions.put(objectNumber, String.format("number%s=hslider(\"number %s\" ,440 ,0,4000,10);", objectNumber,objectNumber));
			//}
//			else{
//				
//				this.definitions.put(objectNumber, String.format("number%s=%s;", objectNumber,inlet0));
//			}
			
			return output_on_outlet0;

					
		}
		else if(pdObject.name.equalsIgnoreCase("PLUS")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				for (int i = 0; i < comingSourcesToInlet0.size(); i++) {
					Pair tmp = comingSourcesToInlet0.get(i);
					String out = createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
					inlet0 += out + "+";
				}
				inlet0 = inlet0.substring(0, inlet0.length()-1);
			}		
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			String inlet1="";
			if(comingSourcesToInlet1 !=null){
				for (int i = 0; i < comingSourcesToInlet1.size(); i++) {
					Pair tmp = comingSourcesToInlet1.get(i);
					String out = createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
					inlet1 += out + "+";
				}
				inlet1 = inlet1.substring(0, inlet1.length()-1);
				pdObject.defaultVal = inlet1; // this expression violates the cold inlet mechanism
			}		
						
			String output_on_outlet0 = String.format("(%s+%s)",inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("MINUS")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			Pair inlet0=null;
			if(comingSourcesToInlet0 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet0 = comingSourcesToInlet0.get(0);
			}		
			
			String coming_into_inlet0 = null;
			if(inlet0 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet0 = createObject_setOutput(inlet0.objectNumber, inlet0.outletNumber);				
			}
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			Pair inlet1=null;
			if(comingSourcesToInlet1 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet1 = comingSourcesToInlet1.get(0);
			}
			
			
			String coming_into_inlet1 = null;
			if(inlet1 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet1 = createObject_setOutput(inlet1.objectNumber, inlet1.outletNumber);
				pdObject.defaultVal = coming_into_inlet1; // this expression violates the cold inlet mechanism
			}
			
			String output_on_outlet0 = String.format("(%s-%s)",coming_into_inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("MULTIPLY")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="(";
			if(comingSourcesToInlet0 !=null){
				for (int i = 0; i < comingSourcesToInlet0.size(); i++) {
					Pair tmp = comingSourcesToInlet0.get(i);
					inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber) + "+";
				}
				inlet0 = inlet0.substring(0, inlet0.length()-1);
				inlet0 += ")";
			}		
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			String inlet1="(";
			if(comingSourcesToInlet1 !=null){
				for(int i=0; i< comingSourcesToInlet1.size(); i++){
					Pair obj = comingSourcesToInlet1.get(i);
					inlet1 += createObject_setOutput(obj.objectNumber, obj.outletNumber) + "+";
				}
				inlet1 = inlet1.substring(0, inlet1.length()-1);
				inlet1 += ")";
				pdObject.defaultVal = inlet1;
			}
			
			
			String output_on_outlet0 = String.format("(%s*%s)",inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("DIVIDE")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			Pair inlet0=null;
			if(comingSourcesToInlet0 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet0 = comingSourcesToInlet0.get(0);
			}		
			
			String coming_into_inlet0 = null;
			if(inlet0 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet0 = createObject_setOutput(inlet0.objectNumber, inlet0.outletNumber);				
			}
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			Pair inlet1=null;
			if(comingSourcesToInlet1 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet1 = comingSourcesToInlet1.get(0);
			}
			
			
			String coming_into_inlet1 = null;
			if(inlet1 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet1 = createObject_setOutput(inlet1.objectNumber, inlet1.outletNumber);
				pdObject.defaultVal = coming_into_inlet1; // this expression violates the cold inlet mechanism
			}
			
			String output_on_outlet0 = String.format("(%s/%s)",coming_into_inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("'pow'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			Pair inlet0=null;
			if(comingSourcesToInlet0 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet0 = comingSourcesToInlet0.get(0);
			}		
			
			String coming_into_inlet0 = null;
			if(inlet0 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet0 = createObject_setOutput(inlet0.objectNumber, inlet0.outletNumber);				
			}
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			Pair inlet1=null;
			if(comingSourcesToInlet1 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet1 = comingSourcesToInlet1.get(0);
			}
			
			
			String coming_into_inlet1 = null;
			if(inlet1 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet1 = createObject_setOutput(inlet1.objectNumber, inlet1.outletNumber);
				pdObject.defaultVal = coming_into_inlet1; // this expression violates the cold inlet mechanism
			}
			
			String output_on_outlet0 = String.format("(%s^%s)",coming_into_inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("'msg'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				Pair tmp = comingSourcesToInlet0.get(0);
				inlet0 = createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
			}
			
			
			String output_on_outlet0 = "";
			//Assume BANG as coming message
			if(!inlet0.equalsIgnoreCase("")){
				output_on_outlet0 = String.format("(%s*%s)",inlet0,pdObject.args.get(0));
			}
			//if there is no input then implement message object directly
			else{
				this.definitions.put(objectNumber, String.format("checkbox%s=checkbox(\"%s\");\n"
						+ "msg%s = checkbox%s * %s;", objectNumber,pdObject.args.get(0),objectNumber,objectNumber,pdObject.args.get(0)));
				output_on_outlet0 = String.format("(msg%s)",objectNumber);
			}
			
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("'trigger'")){
			//outputs
			List<String> outputs = new ArrayList<String>(pdObject.args.size());
			//System.out.println("trigger");
			
			Boolean bang = false;
			for(int i=0; i<pdObject.args.size(); i++){
				outputs.add("0");
				if(pdObject.args.get(i).equalsIgnoreCase("b")||pdObject.args.get(i).equalsIgnoreCase("bang")){
					outputs.set(i, String.format("t%sbang",objectNumber));
					bang = true;
				}			
			}
			if(bang==true){
				this.definitions.put(objectNumber,String.format("t%sbang = checkbox(\"t%sbang\");", objectNumber,objectNumber));
			}
			
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				Pair tmp = comingSourcesToInlet0.get(0);
				inlet0 = createObject_setOutput(tmp.objectNumber, tmp.outletNumber);	
			}
			
			for (int i = 0; i < outputs.size(); i++) {
				pdObject.outputs.put(i, outputs.get(i));
			}
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'bng'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			this.definitions.put(objectNumber,String.format("bang%s = checkbox(\"bang%s\");", objectNumber,objectNumber));
			if(comingSourcesToInlet0 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				Pair tmp = comingSourcesToInlet0.get(0);
				inlet0 = createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
			}
			String output_on_outlet0 = String.format("bang%s", objectNumber);
			return output_on_outlet0;
			
			
			
		}
		else{
			return "UIO";	
		}
		
		
	}

	@Override
	public void enterRow(RowsParser.RowContext ctx)	{		
		if(ctx.type.getType() == RowsParser.OBJ){
			
			if(ctx.name.getType() == RowsParser.OSC){
				imports.add("import(\"music.lib\");");
				String freq = "440";
				if(ctx.INT(2) != null){
					freq = ctx.INT(2).getText();
				}				
				
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.OSC],freq));
				objNo++;
			}
			
			else if(ctx.name.getType() == RowsParser.DAC){
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.DAC]));
				dacObjectNumber = objNo;
				objNo++;
			}
			
			else if(ctx.name.getType() == RowsParser.PLUS){
				String defaultVal = "0";
				if(ctx.INT(2) != null){
					defaultVal = ctx.INT(2).getText();
				}		
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.PLUS],defaultVal));
				objNo++;
			}
			
			else if(ctx.name.getType() == RowsParser.MINUS){
				String defaultVal = "0";
				if(ctx.INT(2) != null){
					defaultVal = ctx.INT(2).getText();
				}		
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.MINUS],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.MULTIPLY){
				String defaultVal = "0";
				if(ctx.INT(2) != null){
					defaultVal = ctx.INT(2).getText();
				}		
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.MULTIPLY],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.DIVIDE){
				String defaultVal = "0";
				if(ctx.INT(2) != null){
					defaultVal = ctx.INT(2).getText();
				}		
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.DIVIDE],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.POW){
				String defaultVal = "0";
				if(ctx.INT(2) != null){
					defaultVal = ctx.INT(2).getText();
				}		
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.POW],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.TRIGGER){
				List<String> args = new ArrayList<String>();
				//ignore canvas positions and get the first item in the message
				for(int i=5; i<ctx.getChildCount()-2; i++){
					args.add(ctx.getChild(i).toString());
				}
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.TRIGGER],args));
				objNo++;				
			}
			else if(ctx.name.getType() == RowsParser.BANG){
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.BANG]));
				objNo++;				
			}
		}
		
		else if(ctx.type.getType() == RowsParser.FLOATATOM){
			pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.FLOATATOM]));
			objNo++;
		}
		
		else if(ctx.type.getType() == RowsParser.CONNECT){			
			int srcObjNumber = Integer.parseInt(ctx.INT(0).getText());
			int srcOutletNumber = Integer.parseInt(ctx.INT(1).getText());
			int sinkObjNumber = Integer.parseInt(ctx.INT(2).getText());
			int sinkInletNumber = Integer.parseInt(ctx.INT(3).getText());
			
			PDObject sinkObj = pdObjects.get(sinkObjNumber);
			List<Pair> comingObjects = sinkObj.objectInlets.get(sinkInletNumber);
			if(comingObjects==null){
				comingObjects = new ArrayList<Pair>();				
			}
			comingObjects.add(new Pair(srcObjNumber, srcOutletNumber));
			sinkObj.objectInlets.put(sinkInletNumber, comingObjects);
		}		
		else if(ctx.type.getType() == RowsParser.MSG){
			List<String> args = new ArrayList<String>();
			//ignore canvas positions and get the first item in the message
			args.add(ctx.INT(2).getText());
			pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.MSG],args));
			objNo++;
		}
		
		

	}
}

