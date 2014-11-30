// Generated from Rows.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RowsLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, PLUS=5, FLOATATOM=6, OSC=7, DAC=8, INT=9, 
		OBJ=10, CANVAS=11, CONNECT=12, TAB=13, NL=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#N'", "'-'", "'#X'", "';'", "'+'", "'floatatom'", "'osc~'", "'dac~'", 
		"INT", "'obj'", "'canvas'", "'connect'", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "PLUS", "FLOATATOM", "OSC", "DAC", "INT", 
		"OBJ", "CANVAS", "CONNECT", "TAB", "NL"
	};


	public RowsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rows.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\6\nA\n\n\r\n\16\nB\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16"+
		"Y\n\16\r\16\16\16Z\3\16\3\16\3\17\5\17`\n\17\3\17\3\17\2\2\20\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\4\3"+
		"\2\62;\4\2\13\13\"\"e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2"+
		"\2\2\5\"\3\2\2\2\7$\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17\65\3"+
		"\2\2\2\21:\3\2\2\2\23@\3\2\2\2\25D\3\2\2\2\27H\3\2\2\2\31O\3\2\2\2\33"+
		"X\3\2\2\2\35_\3\2\2\2\37 \7%\2\2 !\7P\2\2!\4\3\2\2\2\"#\7/\2\2#\6\3\2"+
		"\2\2$%\7%\2\2%&\7Z\2\2&\b\3\2\2\2\'(\7=\2\2(\n\3\2\2\2)*\7-\2\2*\f\3\2"+
		"\2\2+,\7h\2\2,-\7n\2\2-.\7q\2\2./\7c\2\2/\60\7v\2\2\60\61\7c\2\2\61\62"+
		"\7v\2\2\62\63\7q\2\2\63\64\7o\2\2\64\16\3\2\2\2\65\66\7q\2\2\66\67\7u"+
		"\2\2\678\7e\2\289\7\u0080\2\29\20\3\2\2\2:;\7f\2\2;<\7c\2\2<=\7e\2\2="+
		">\7\u0080\2\2>\22\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3"+
		"\2\2\2C\24\3\2\2\2DE\7q\2\2EF\7d\2\2FG\7l\2\2G\26\3\2\2\2HI\7e\2\2IJ\7"+
		"c\2\2JK\7p\2\2KL\7x\2\2LM\7c\2\2MN\7u\2\2N\30\3\2\2\2OP\7e\2\2PQ\7q\2"+
		"\2QR\7p\2\2RS\7p\2\2ST\7g\2\2TU\7e\2\2UV\7v\2\2V\32\3\2\2\2WY\t\3\2\2"+
		"XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\16\2\2]\34\3"+
		"\2\2\2^`\7\17\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\f\2\2b\36\3\2\2\2"+
		"\6\2BZ_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}