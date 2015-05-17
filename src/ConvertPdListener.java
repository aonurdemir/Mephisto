import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
		Map<Integer,String> outputTypes;
		public PDObject(String name,String defaultVal){
			this.name = name;
			this.defaultVal = defaultVal;
			this.objectInlets = new HashMap<Integer,List<Pair>>();
			this.outputs = new HashMap<Integer,String>();
			this.outputTypes = new HashMap<Integer,String>();
			
		}
		public PDObject(String name){
			this.name = name;
			this.defaultVal = "no-default";
			this.objectInlets = new HashMap<Integer,List<Pair>>();
			this.outputs = new HashMap<Integer,String>();
			this.outputTypes = new HashMap<Integer,String>();
		}
		public PDObject(String name,List<String> args){
			this.name = name;
			this.defaultVal = "no-default";
			this.objectInlets = new HashMap<Integer,List<Pair>>();
			this.outputs = new HashMap<Integer,String>();
			this.args = args;
			this.outputTypes = new HashMap<Integer,String>();
		}
		public String toString() {
			return name + objectInlets.toString();
		}
	}
	
	String fileName;
	RowsParser parser;
	List<String> imports;
	List<String> exps;
	int objNo = 0;

	//new variables
	Map<Integer,PDObject> pdObjects;   //integer -> object number
	int dacObjectNumber;
	Map<Integer, String> definitions;
	


	public ConvertPdListener(RowsParser parser,String fileName) {
		this.fileName = fileName;
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
	PrintWriter writer;
	@Override
	public void exitFile(RowsParser.FileContext ctx) {
		//System.out.println(imports);
		//System.out.println(objects);
		//System.out.println(pdObjects);
		try {
			writer = new PrintWriter(this.fileName.substring(0, this.fileName.length()-3)+".dsp", "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			for(int i=0; i<imports.size(); i++){
				System.out.println(imports.get(i));
				writer.println(imports.get(i));
			}
			
		}
		
		Iterator<Entry<Integer, String>> it = this.definitions.entrySet().iterator();
	    while (it.hasNext()) {	        
			Entry<Integer, String> pairs = it.next();
	        System.out.println(pairs.getValue());
			writer.println(pairs.getValue());
	        it.remove(); // avoids a ConcurrentModificationException //REMOVES ALSO FROM HASH TABLE
	    }
	    
		System.out.println(process);
	    writer.println(process);
	    writer.close();
	    System.out.println("created successfully: " + this.fileName.substring(0, this.fileName.length()-3)+".dsp");
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
			pdObject.outputTypes.put(outletNumber, "float");
			
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
				//if coming an input except for msg, ignore the floatatom element and pass the coming input as output
				else{
					String comingObjOutput = createObject_setOutput(tmp.objectNumber, tmp.outletNumber); 
//					if(obj.outputTypes.get(tmp.outletNumber).equalsIgnoreCase("float")){
//						
//					}
					inlet0 += comingObjOutput; 
				}
				//inlet0 = createObject_setOutput(tmp.objectNumber, tmp.objectNumber);
				
			}
			//IF NO COMING CONNECTION INTO INLET0
			else{
				inlet0 = String.format("number%s",objectNumber);
				String l = pdObject.args.get(0);
				String u = pdObject.args.get(1);
				if(Float.parseFloat(l) == 0){
					l = "0";
				}
				if(Float.parseFloat(u) == 0){
					u = "10000";
				}
				this.definitions.put(objectNumber, String.format("number%s=hslider(\"number %s\" ,1 ,%s,%s,0.1);", objectNumber,objectNumber,l,u));
			}
			
			String output_on_outlet0 = String.format("%s",inlet0);						
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(0, "float");
			//if(inlet0 == null){
				
			//}
//			else{
//				
//				this.definitions.put(objectNumber, String.format("number%s=%s;", objectNumber,inlet0));
//			}
			
			return output_on_outlet0;

					
		}
		else if(pdObject.name.equalsIgnoreCase("'tgl'")){
			this.definitions.put(objectNumber, String.format("checkbox%s=checkbox(\"checkbox %s\");", objectNumber,objectNumber));		
			String output_on_outlet0 = String.format("checkbox%s",objectNumber);						
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(0, "float");
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("PLUS")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				for (int i = 0; i < comingSourcesToInlet0.size(); i++) {
					Pair tmp = comingSourcesToInlet0.get(i);
					String out = createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
					PDObject obj = pdObjects.get(tmp.objectNumber);
					if(obj.outputTypes.get(tmp.outletNumber).equalsIgnoreCase("float")){
						inlet0 += out + "+";
					}
					
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
			pdObject.outputTypes.put(outletNumber, "float");
			
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
			pdObject.outputTypes.put(outletNumber, "float");
			
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
			pdObject.outputTypes.put(outletNumber, "float");
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
			pdObject.outputTypes.put(outletNumber, "float");
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
					pdObject.outputTypes.put(i, "bang");
					bang = true;
				}	
				else if(pdObject.args.get(i).equalsIgnoreCase("f")||pdObject.args.get(i).equalsIgnoreCase("float")){
					
					List<Pair> comingSources = pdObject.objectInlets.get(0);
					String inlet_0="";
					if(comingSources !=null){
						//TODO actually -> taking only the first object coming into inlet 0
						// expected -> should take all objects coming into inlet 0
						Pair tmp = comingSources.get(0);
						inlet_0 = createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
						outputs.set(i, String.format("%s",inlet_0));
						pdObject.outputTypes.put(i, "float");
					}
				}
			}
			if(bang==true){
				this.definitions.put(objectNumber,String.format("t%sbang = checkbox(\"t%sbang\");", objectNumber,objectNumber));
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
		else if(pdObject.name.equalsIgnoreCase("'fcounter'")){
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				String comingObjOutput = createObject_setOutput(tmp.objectNumber, tmp.outletNumber); 
				inlet0 += comingObjOutput; 
			}
			this.definitions.put(objectNumber,String.format("fcounter%s(nn) = int((+(1)~_)/((nn/1000)*SR));",objectNumber));
			String output_on_outlet0 = String.format("fcounter%s(%s)",objectNumber,inlet0);						
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(0, "float");		
			return output_on_outlet0;					
		}
		else if(pdObject.name.equalsIgnoreCase("'mod'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);				
			}		
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			String inlet1=null;
			if(comingSourcesToInlet1 !=null){
				Pair tmp =comingSourcesToInlet1.get(0);
				inlet1 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
				pdObject.defaultVal = inlet1;
			}
			
			String output_on_outlet0 = String.format("(%s%s%s)",inlet0,"%",pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(0, "float");		
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("'sig~'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);				
			}		
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			String inlet1="";
			if(comingSourcesToInlet1 !=null){
				Pair obj = comingSourcesToInlet1.get(0);
				inlet1 += createObject_setOutput(obj.objectNumber, obj.outletNumber);
				pdObject.defaultVal = inlet1;
			}
			String output_on_outlet0; 
			if(inlet0.equalsIgnoreCase("")){
				output_on_outlet0 = String.format("%s",pdObject.defaultVal);	
			}
			else{
				output_on_outlet0 = String.format("%s",inlet0);
			}
			
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(outletNumber, "float");
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'clip~'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="(";
			if(comingSourcesToInlet0 !=null){
				for(int i=0; i<comingSourcesToInlet0.size(); i++){
					Pair pair = comingSourcesToInlet0.get(i);
		        	inlet0 += createObject_setOutput(pair.objectNumber,pair.outletNumber) + "+";
				}
				inlet0 = inlet0.substring(0, inlet0.length()-1);
				inlet0 +=")";
			}
			imports.add("import(\"math.lib\");");
			this.definitions.put(objectNumber,String.format("clip%s(s) = if (s < (%s),  (%s) , if ( s>%s ,%s ,s) );",objectNumber,pdObject.args.get(0),pdObject.args.get(0),
					pdObject.args.get(1),pdObject.args.get(1)));
			

			String output_on_outlet0;
			output_on_outlet0 = String.format("clip%s(%s)",objectNumber,inlet0);
			
			
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(outletNumber, "float");
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'max~'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="(";
			if(comingSourcesToInlet0 !=null){
				for(int i=0; i<comingSourcesToInlet0.size(); i++){
					Pair pair = comingSourcesToInlet0.get(i);
		        	inlet0 += createObject_setOutput(pair.objectNumber,pair.outletNumber) + "+";
				}
				inlet0 = inlet0.substring(0, inlet0.length()-1);
				inlet0 +=")";
			}
			imports.add("import(\"math.lib\");");
			this.definitions.put(objectNumber,String.format("max%s(s) = if (s < (%s),  (%s) , s );",objectNumber,pdObject.defaultVal,pdObject.defaultVal));
			

			String output_on_outlet0;
			output_on_outlet0 = String.format("max%s(%s)",objectNumber,inlet0);
			
			
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(outletNumber, "float");
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'min~'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="(";
			if(comingSourcesToInlet0 !=null){
				for(int i=0; i<comingSourcesToInlet0.size(); i++){
					Pair pair = comingSourcesToInlet0.get(i);
		        	inlet0 += createObject_setOutput(pair.objectNumber,pair.outletNumber) + "+";
				}
				inlet0 = inlet0.substring(0, inlet0.length()-1);
				inlet0 +=")";
			}
			imports.add("import(\"math.lib\");");
			this.definitions.put(objectNumber,String.format("min%s(s) = if (s > (%s),  (%s) , s );",objectNumber,pdObject.defaultVal,pdObject.defaultVal));
			

			String output_on_outlet0;
			output_on_outlet0 = String.format("min%s(%s)",objectNumber,inlet0);
			
			
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(outletNumber, "float");
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'bp~'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);				
			}
			
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			String inlet1="";
			if(comingSourcesToInlet1 !=null){
				Pair tmp = comingSourcesToInlet1.get(0);
				inlet1 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);				
			}
			List<Pair> comingSourcesToInlet2 = pdObject.objectInlets.get(2);
			String inlet2="";
			if(comingSourcesToInlet2 !=null){
				Pair tmp = comingSourcesToInlet2.get(0);
				inlet2 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);				
			}
			String freq=pdObject.args.get(0);
			if(inlet1 != ""){
				freq = inlet1;
			}
			String Q=pdObject.args.get(1);
			if(inlet2 != ""){
				Q = inlet2;
			}
			
			imports.add("import(\"effect.lib\");");
			imports.add("import(\"filter.lib\");");
			//this.definitions.put(objectNumber, String.format("resonbp%s=%s:moog_vcf_2bn((%s/10),%s):*(70);", objectNumber,inlet0,Q,freq));
			this.definitions.put(objectNumber, String.format("resonbp%s=%s:resonbp(%s:smooth(0.999),%s:smooth(0.999),%s);", objectNumber,inlet0,freq,Q,"1"));
			String output_on_outlet0;
			output_on_outlet0 = String.format("resonbp%s",objectNumber);
			
			
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(outletNumber, "float");
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'hip~'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="(";
			if(comingSourcesToInlet0 !=null){
				for(int i=0; i<comingSourcesToInlet0.size(); i++){
					Pair pair = comingSourcesToInlet0.get(i);
		        	inlet0 += createObject_setOutput(pair.objectNumber,pair.outletNumber) + "+";
				}
				inlet0 = inlet0.substring(0, inlet0.length()-1);
				inlet0 +=")";
			}		
			imports.add("import(\"filter.lib\");");
			this.definitions.put(objectNumber, String.format("resonhp%s=%s:highpass(1,%s);", objectNumber,inlet0,pdObject.defaultVal));
			
			String output_on_outlet0;
			output_on_outlet0 = String.format("resonhp%s",objectNumber);
			
			
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(outletNumber, "float");
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'lop~'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="(";
			if(comingSourcesToInlet0 !=null){
				for(int i=0; i<comingSourcesToInlet0.size(); i++){
					Pair pair = comingSourcesToInlet0.get(i);
		        	inlet0 += createObject_setOutput(pair.objectNumber,pair.outletNumber) + "+";
				}
				inlet0 = inlet0.substring(0, inlet0.length()-1);
				inlet0 +=")";
			}		
			imports.add("import(\"filter.lib\");");
			this.definitions.put(objectNumber, String.format("resonlp%s=%s:lowpass(1,%s);", objectNumber,inlet0,pdObject.defaultVal));
			String output_on_outlet0;
			output_on_outlet0 = String.format("resonlp%s",objectNumber);
			
			
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(outletNumber, "float");
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'>'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);				
			}		
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			String inlet1=null;
			if(comingSourcesToInlet1 !=null){
				Pair tmp =comingSourcesToInlet1.get(0);
				inlet1 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
				pdObject.defaultVal = inlet1;
			}
			
			String output_on_outlet0 = String.format("(%s>%s)",inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(0, "float");		
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("'<'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);				
			}		
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			String inlet1=null;
			if(comingSourcesToInlet1 !=null){
				Pair tmp =comingSourcesToInlet1.get(0);
				inlet1 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
				pdObject.defaultVal = inlet1;
			}
			
			String output_on_outlet0 = String.format("(%s<%s)",inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(0, "float");		
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("'=='")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);				
			}		
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			String inlet1=null;
			if(comingSourcesToInlet1 !=null){
				Pair tmp =comingSourcesToInlet1.get(0);
				inlet1 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);
				pdObject.defaultVal = inlet1;
			}
			
			String output_on_outlet0 = String.format("(%s==%s)",inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(0, "float");		
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("'metro'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){				
				Pair pair = comingSourcesToInlet0.get(0);
	        	inlet0 += createObject_setOutput(pair.objectNumber,pair.outletNumber);
			}
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			String inlet1="";
			if(comingSourcesToInlet1 !=null){				
				Pair pair = comingSourcesToInlet1.get(0);
	        	inlet1 += createObject_setOutput(pair.objectNumber,pair.outletNumber);
			}
			imports.add("import(\"filter.lib\");");
			imports.add("import(\"music.lib\");");
			this.definitions.put(objectNumber,String.format("metro%s(toggle,t)=(((+(1)~_)%int(SR*t/1000))==0)*toggle",objectNumber));
			
			String output_on_outlet0;
			output_on_outlet0 = String.format("metro%s(%s,%s)",objectNumber,inlet0,inlet1);
			
			
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(outletNumber, "bang");
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'line~'")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);				
			}
			imports.add("import(\"math.lib\");");
			this.definitions.put(objectNumber,String.format("clip%s(s) = if (s < (%s),  (%s) , if ( s>%s ,%s ,s) );",objectNumber,pdObject.args.get(0),pdObject.args.get(0),
					pdObject.args.get(1),pdObject.args.get(1)));
			

			String output_on_outlet0;
			output_on_outlet0 = String.format("clip%s(%s)",objectNumber,inlet0);
			
			
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(outletNumber, "float");
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'unpack'")){
			//Collect objects coming into inlet 0
			
			PDObject msgObject;
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				for (int i = 0; i < comingSourcesToInlet0.size(); i++) {
					Pair tmp = comingSourcesToInlet0.get(i);
					//inlet0 += createObject_setOutput(tmp.objectNumber, tmp.outletNumber);	
					msgObject = pdObjects.get(tmp.objectNumber);
					String display = "";
					
						String output_on_outlet;
						output_on_outlet = String.format("(checkbox%s*%s)",tmp.objectNumber,msgObject.args.get(outletNumber));
						String tmpOut = pdObject.outputs.get(outletNumber);
						if(tmpOut !=null){
							//tmpOut+= "+" + output_on_outlet;
						}
						else{
							tmpOut = output_on_outlet;
						}
						
						pdObject.outputs.put(outletNumber, tmpOut);
						pdObject.outputTypes.put(outletNumber, "float");
						for (int j = 0; j < msgObject.args.size(); j++) {
							display += msgObject.args.get(j) + " ";
						}
						
					
					display = display.substring(0, display.length()-1);
					this.definitions.put(tmp.objectNumber, String.format("checkbox%s=checkbox(\"%s\");\n", tmp.objectNumber,display));
				}
						
				
			}	
			//return with respect to outlet number -> return what outletNumber is expected to return
			return pdObject.outputs.get(outletNumber);
		}
		else if(pdObject.name.equalsIgnoreCase("'phasor~'")){
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
			this.definitions.put(objectNumber, "phs(f) = +(1)~_ :%(44100/f): /(44100/f);\n");
			String output_on_outlet0 = String.format("phs(%s)", pdObject.defaultVal);
			
			pdObject.outputs.put(outletNumber,output_on_outlet0);
			pdObject.outputTypes.put(outletNumber, "float");
			
			//this.definitions.put(objectNumber, String.format("sawtooth%s=sawtooth(%s);", objectNumber,pdObject.defaultVal));
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("'cos~'")){
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				String comingObjOutput = createObject_setOutput(tmp.objectNumber, tmp.outletNumber); 
				inlet0 += comingObjOutput; 
			}
			
			String output_on_outlet0 = String.format("cos(2*PI*%s)",inlet0);						
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(0, "float");		
			return output_on_outlet0;					
		}
		
		else if(pdObject.name.equalsIgnoreCase("'noise~'")){
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				String comingObjOutput = createObject_setOutput(tmp.objectNumber, tmp.outletNumber); 
				inlet0 += comingObjOutput; 
			}
			
			String output_on_outlet0 = String.format("noise",inlet0);						
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(0, "float");		
			return output_on_outlet0;					
		}
		else if(pdObject.name.equalsIgnoreCase("'vcf~'")){
			List<Pair> comingSourcesToInlet0 = pdObject.objectInlets.get(0);
			String inlet0="";
			if(comingSourcesToInlet0 !=null){
				Pair tmp = comingSourcesToInlet0.get(0);
				String comingObjOutput = createObject_setOutput(tmp.objectNumber, tmp.outletNumber); 
				inlet0 += comingObjOutput; 
			}
			
			List<Pair> comingSourcesToInlet1 = pdObject.objectInlets.get(1);
			String inlet1=pdObject.args.get(0);
			if(comingSourcesToInlet1 !=null){
				Pair tmp = comingSourcesToInlet1.get(0);
				String comingObjOutput = createObject_setOutput(tmp.objectNumber, tmp.outletNumber); 
				inlet1 = comingObjOutput; 
			}
			
			List<Pair> comingSourcesToInlet2 = pdObject.objectInlets.get(2);
			String inlet2=pdObject.args.get(1);
			if(comingSourcesToInlet2 !=null){
				Pair tmp = comingSourcesToInlet2.get(0);
				String comingObjOutput = createObject_setOutput(tmp.objectNumber, tmp.outletNumber); 
				inlet2 = comingObjOutput; 
			}
			//this.definitions.put(objectNumber, "onepole(p) = *(1.0-(p)) : + ~ *(p);\n" + 
			//"moogvcf(mk,p) = (+ : onepole(p) : onepole(p) : onepole(p) : onepole(p)) ~ *(mk);\n" +
			//"mypole(fr) = 1.0-fr*2.0*PI/SR;\n");
			

			
			// : *(20: component(\"music.lib\").db2linear: smooth(0.999))
			String output_on_outlet0 = String.format("(%s:moog_vcf_2b((%s/10),%s)):*(70)",inlet0,inlet2,inlet1);						
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			pdObject.outputTypes.put(0, "float");		
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
				if(ctx.expr(0) != null){					
					freq = ctx.expr(0).getText();
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
				else if(ctx.FLOAT(0) != null){
					defaultVal=ctx.FLOAT(0).getText();
				}
			
					
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.PLUS],defaultVal));
				objNo++;
			}
			
			else if(ctx.name.getType() == RowsParser.MINUS){
				String defaultVal = "0";
				if(ctx.INT(2) != null){					
					defaultVal = ctx.INT(2).getText();
				}
				else if(ctx.FLOAT(0) != null){				
					defaultVal=ctx.FLOAT(0).getText();
				}		
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.MINUS],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.MULTIPLY){
				String defaultVal = "0";
				if(ctx.INT(2) != null){					
					defaultVal = ctx.INT(2).getText();
				}
				else if(ctx.FLOAT(0) != null){				
					defaultVal=ctx.FLOAT(0).getText();
				}	
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.MULTIPLY],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.DIVIDE){
				String defaultVal = "0";
				if(ctx.INT(2) != null){					
					defaultVal = ctx.INT(2).getText();
				}
				else if(ctx.FLOAT(0) != null){				
					defaultVal=ctx.FLOAT(0).getText();
				}		
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.DIVIDE],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.POW){
				String defaultVal = "0";
				if(ctx.INT(2) != null){					
					defaultVal = ctx.INT(2).getText();
				}
				else if(ctx.FLOAT(0) != null){					
					defaultVal=ctx.FLOAT(0).getText();
				}	
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.POW],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.TRIGGER){
				List<String> args = new ArrayList<String>();
				//ignore canvas positions and get the first item in the args
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
			else if(ctx.name.getType() == RowsParser.FCOUNTER){
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.FCOUNTER]));
				objNo++;				
			}
			else if(ctx.name.getType() == RowsParser.SIG){
				String defaultVal = "0";				
				if(ctx.INT(2) != null){					
					defaultVal = ctx.INT(2).getText();
				}
				else if(ctx.FLOAT(0) != null){				
					defaultVal=ctx.FLOAT(0).getText();
				}	
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.SIG],defaultVal));
				objNo++;				
			}
			else if(ctx.name.getType() == RowsParser.MOD){
				String defaultVal = "1";
				if(ctx.INT(2) != null){					
					defaultVal = ctx.INT(2).getText();
				}
				else if(ctx.FLOAT(0) != null){					
					defaultVal=ctx.FLOAT(0).getText();
				}	
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.MOD],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.CLIP){
				List<String> args = new ArrayList<String>();
				args.add(ctx.expr(0).getText());
				args.add(ctx.expr(1).getText());
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.CLIP],args));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.BP){
				List<String> args = new ArrayList<String>();
				args.add(ctx.expr(0).getText());
				args.add(ctx.expr(1).getText());
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.BP],args));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.HIP){
				String defaultVal = "0";
				if(ctx.expr(0) != null){					
					defaultVal = ctx.expr(0).getText();
				}				
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.HIP],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.LOP){
				String defaultVal = "0";
				if(ctx.expr(0) != null){					
					defaultVal = ctx.expr(0).getText();
				}				
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.LOP],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.GT){
				String defaultVal = "0";
				if(ctx.expr(0) != null){					
					defaultVal = ctx.expr(0).getText();
				}				
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.GT],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.MAX){
				String defaultVal = "0";
				if(ctx.expr(0) != null){					
					defaultVal = ctx.expr(0).getText();
				}				
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.MAX],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.MIN){
				String defaultVal = "0";
				if(ctx.expr(0) != null){					
					defaultVal = ctx.expr(0).getText();
				}				
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.MIN],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.LT){
				String defaultVal = "0";
				if(ctx.expr(0) != null){					
					defaultVal = ctx.expr(0).getText();
				}				
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.LT],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.EQ){
				String defaultVal = "0";
				if(ctx.expr(0) != null){					
					defaultVal = ctx.expr(0).getText();
				}				
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.EQ],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.METRO){
				String defaultVal = "1000";
				if(ctx.expr(0) != null){					
					defaultVal = ctx.expr(0).getText();
				}				
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.METRO],defaultVal));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.LINE){
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.LINE]));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.UNPACK){
				List<String> args = new ArrayList<String>();
				//ignore canvas positions and get the first item in the args
				for(int i=5; i<ctx.getChildCount()-2; i++){
					args.add(ctx.getChild(i).toString());
				}
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.UNPACK],args));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.PHASOR){
				imports.add("import(\"oscillator.lib\");");
				String freq = "440";
				if(ctx.INT(2) != null){					
					freq = ctx.INT(2).getText();
				}
				else if(ctx.FLOAT(0) != null){				
					freq=ctx.FLOAT(0).getText();
				}				
				
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.PHASOR],freq));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.COS){
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.COS]));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.TGL){
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.TGL]));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.VCF){
				imports.add("import(\"effect.lib\");");
				List<String> args = new ArrayList<String>();
				args.add(ctx.expr(0).getText());
				args.add(ctx.expr(1).getText());
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.VCF],args));
				objNo++;
			}
			else if(ctx.name.getType() == RowsParser.NOISE){
				pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.NOISE]));
				objNo++;
				imports.add("import(\"music.lib\");");
			}
			else{
				System.out.println("ERROR: There is an object which is not inserted in pdObjects."); ;	
			}
		}
		
		else if(ctx.type.getType() == RowsParser.FLOATATOM){
			List<String> args = new ArrayList<String>();
			args.add(ctx.expr(3).getText());
			args.add(ctx.expr(4).getText());
			pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.FLOATATOM],args));
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
			for(int i=4; i<ctx.getChildCount()-2; i++){
				args.add(ctx.getChild(i).toString());
				System.out.println(ctx.getChild(i).toString());
			}
			
			pdObjects.put(objNo, new PDObject(parser.getTokenNames()[RowsParser.MSG],args));
			objNo++;
		}
		
		

	}

}

