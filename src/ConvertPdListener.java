import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
				
		
		
		//PRINT FASUT PROGRAM TREE
		System.out.println(imports.get(0));
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
			List<Pair> comingSourcecsToInlet0 = pdObject.objectInlets.get(0);
			Pair inlet0=null;
			if(comingSourcecsToInlet0 !=null){
				inlet0 = comingSourcecsToInlet0.get(0);        
			}
					
			
			//Create the object coming into current PDObject's inlet and get its output
			String coming_into_inlet0 = null;
			if(inlet0 != null){
				coming_into_inlet0 = createObject_setOutput(inlet0.objectNumber, inlet0.objectNumber);
				pdObject.defaultVal = coming_into_inlet0;
			}
			
			String output_on_outlet0 = String.format("osc%s", objectNumber);
			
			pdObject.outputs.put(outletNumber,output_on_outlet0);
			this.definitions.put(objectNumber, String.format("osc%s=osc(%s);", objectNumber,pdObject.defaultVal));
			return output_on_outlet0;
		}
		
		else if(pdObject.name.equalsIgnoreCase("'floatatom'")){
			List<Pair> comingSourcecsToInlet0 = pdObject.objectInlets.get(0);
			Pair inlet0=null;
			if(comingSourcecsToInlet0 !=null){
				inlet0 = comingSourcecsToInlet0.get(0);
			}		
			
			String coming_into_inlet0 = null;
			if(inlet0 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet0 = createObject_setOutput(inlet0.objectNumber, inlet0.objectNumber);				
			}
			
			
			String output_on_outlet0 = String.format("number%s",objectNumber);						
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			if(coming_into_inlet0 == null){
				this.definitions.put(objectNumber, String.format("number%s=hslider(\"number %s\" ,440 ,0,4000,10);", objectNumber,objectNumber));
			}
			else{
				this.definitions.put(objectNumber, String.format("number%s=%s;", objectNumber,coming_into_inlet0));
			}
			
			return output_on_outlet0;

					
		}
		else if(pdObject.name.equalsIgnoreCase("PLUS")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcecsToInlet0 = pdObject.objectInlets.get(0);
			Pair inlet0=null;
			if(comingSourcecsToInlet0 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet0 = comingSourcecsToInlet0.get(0);
			}		
			
			String coming_into_inlet0 = null;
			if(inlet0 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet0 = createObject_setOutput(inlet0.objectNumber, inlet0.objectNumber);				
			}
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcecsToInlet1 = pdObject.objectInlets.get(1);
			Pair inlet1=null;
			if(comingSourcecsToInlet1 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet1 = comingSourcecsToInlet1.get(0);
			}
			
			
			String coming_into_inlet1 = null;
			if(inlet1 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet1 = createObject_setOutput(inlet1.objectNumber, inlet1.objectNumber);
				pdObject.defaultVal = coming_into_inlet1; // this expression violates the cold inlet mechanism
			}
			
			String output_on_outlet0 = String.format("(%s+%s)",coming_into_inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("MINUS")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcecsToInlet0 = pdObject.objectInlets.get(0);
			Pair inlet0=null;
			if(comingSourcecsToInlet0 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet0 = comingSourcecsToInlet0.get(0);
			}		
			
			String coming_into_inlet0 = null;
			if(inlet0 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet0 = createObject_setOutput(inlet0.objectNumber, inlet0.objectNumber);				
			}
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcecsToInlet1 = pdObject.objectInlets.get(1);
			Pair inlet1=null;
			if(comingSourcecsToInlet1 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet1 = comingSourcecsToInlet1.get(0);
			}
			
			
			String coming_into_inlet1 = null;
			if(inlet1 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet1 = createObject_setOutput(inlet1.objectNumber, inlet1.objectNumber);
				pdObject.defaultVal = coming_into_inlet1; // this expression violates the cold inlet mechanism
			}
			
			String output_on_outlet0 = String.format("(%s-%s)",coming_into_inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("MULTIPLY")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcecsToInlet0 = pdObject.objectInlets.get(0);
			Pair inlet0=null;
			if(comingSourcecsToInlet0 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet0 = comingSourcecsToInlet0.get(0);
			}		
			
			String coming_into_inlet0 = null;
			if(inlet0 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet0 = createObject_setOutput(inlet0.objectNumber, inlet0.objectNumber);				
			}
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcecsToInlet1 = pdObject.objectInlets.get(1);
			Pair inlet1=null;
			if(comingSourcecsToInlet1 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet1 = comingSourcecsToInlet1.get(0);
			}
			
			
			String coming_into_inlet1 = null;
			if(inlet1 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet1 = createObject_setOutput(inlet1.objectNumber, inlet1.objectNumber);
				pdObject.defaultVal = coming_into_inlet1; // this expression violates the cold inlet mechanism
			}
			
			String output_on_outlet0 = String.format("(%s*%s)",coming_into_inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else if(pdObject.name.equalsIgnoreCase("DIVIDE")){
			//Collect objects coming into inlet 0
			List<Pair> comingSourcecsToInlet0 = pdObject.objectInlets.get(0);
			Pair inlet0=null;
			if(comingSourcecsToInlet0 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet0 = comingSourcecsToInlet0.get(0);
			}		
			
			String coming_into_inlet0 = null;
			if(inlet0 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet0 = createObject_setOutput(inlet0.objectNumber, inlet0.objectNumber);				
			}
			
			//Collect objects coming into inlet 1
			List<Pair> comingSourcecsToInlet1 = pdObject.objectInlets.get(1);
			Pair inlet1=null;
			if(comingSourcecsToInlet1 !=null){
				//TODO actually -> taking only the first object coming into inlet 0
				// expected -> should take all objects coming into inlet 0
				inlet1 = comingSourcecsToInlet1.get(0);
			}
			
			
			String coming_into_inlet1 = null;
			if(inlet1 != null){
				//Create the object coming into current PDObject and get its output 
				coming_into_inlet1 = createObject_setOutput(inlet1.objectNumber, inlet1.objectNumber);
				pdObject.defaultVal = coming_into_inlet1; // this expression violates the cold inlet mechanism
			}
			
			String output_on_outlet0 = String.format("(%s/%s)",coming_into_inlet0,pdObject.defaultVal);
			pdObject.outputs.put(outletNumber, output_on_outlet0);
			
			//return with respect to outlet number -> return what outletNumber is expected to return
			return output_on_outlet0;
		}
		else{
			return null;	
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
		
		


	}
}

