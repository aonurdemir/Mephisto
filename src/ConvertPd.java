import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
public class ConvertPd {
	public static void main(String[] args) throws Exception {
		String inputFile = null;
		if ( args.length>0 ) inputFile = args[0];
		InputStream is = System.in;
		if ( inputFile!=null ) is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		RowsLexer lexer = new RowsLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		RowsParser parser = new RowsParser(tokens);
		ParseTree tree = parser.file(); // parse
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		ConvertPdListener extractor = new ConvertPdListener(parser,inputFile);
		walker.walk(extractor, tree); // initiate walk of tree with listener
		
	}  
}

