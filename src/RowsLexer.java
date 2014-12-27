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
		T__2=1, T__1=2, T__0=3, DIVIDE=4, MULTIPLY=5, MINUS=6, PLUS=7, FLOATATOM=8, 
		OSC=9, DAC=10, OBJ=11, CANVAS=12, CONNECT=13, MSG=14, POW=15, INT=16, 
		TRIGGER=17, STRING=18, TAB=19, NL=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#N'", "'#X'", "';'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'floatatom'", 
		"'osc~'", "'dac~'", "'obj'", "'canvas'", "'connect'", "'msg'", "'pow'", 
		"INT", "'trigger'", "STRING", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "FLOATATOM", 
		"OSC", "DAC", "OBJ", "CANVAS", "CONNECT", "MSG", "POW", "INT", "TRIGGER", 
		"STRING", "TAB", "NL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\5\5\67\n\5\3\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\5\7A\n\7\3\b\3"+
		"\b\3\b\5\bF\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\6\21x\n\21\r\21\16\21y\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\6\23\u0085\n\23\r\23\16\23\u0086\3\24\6\24\u008a\n"+
		"\24\r\24\16\24\u008b\3\24\3\24\3\25\5\25\u0091\n\25\3\25\3\25\2\2\26\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26\3\2\5\3\2\62;\4\2\62;C|\4\2\13\13\"\"\u009b\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5.\3\2\2\2\7\61\3\2\2"+
		"\2\t\66\3\2\2\2\13;\3\2\2\2\r@\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23Q\3\2"+
		"\2\2\25V\3\2\2\2\27[\3\2\2\2\31_\3\2\2\2\33f\3\2\2\2\35n\3\2\2\2\37r\3"+
		"\2\2\2!w\3\2\2\2#{\3\2\2\2%\u0084\3\2\2\2\'\u0089\3\2\2\2)\u0090\3\2\2"+
		"\2+,\7%\2\2,-\7P\2\2-\4\3\2\2\2./\7%\2\2/\60\7Z\2\2\60\6\3\2\2\2\61\62"+
		"\7=\2\2\62\b\3\2\2\2\63\67\7\61\2\2\64\65\7\61\2\2\65\67\7\u0080\2\2\66"+
		"\63\3\2\2\2\66\64\3\2\2\2\67\n\3\2\2\28<\7,\2\29:\7,\2\2:<\7\u0080\2\2"+
		";8\3\2\2\2;9\3\2\2\2<\f\3\2\2\2=A\7/\2\2>?\7/\2\2?A\7\u0080\2\2@=\3\2"+
		"\2\2@>\3\2\2\2A\16\3\2\2\2BF\7-\2\2CD\7-\2\2DF\7\u0080\2\2EB\3\2\2\2E"+
		"C\3\2\2\2F\20\3\2\2\2GH\7h\2\2HI\7n\2\2IJ\7q\2\2JK\7c\2\2KL\7v\2\2LM\7"+
		"c\2\2MN\7v\2\2NO\7q\2\2OP\7o\2\2P\22\3\2\2\2QR\7q\2\2RS\7u\2\2ST\7e\2"+
		"\2TU\7\u0080\2\2U\24\3\2\2\2VW\7f\2\2WX\7c\2\2XY\7e\2\2YZ\7\u0080\2\2"+
		"Z\26\3\2\2\2[\\\7q\2\2\\]\7d\2\2]^\7l\2\2^\30\3\2\2\2_`\7e\2\2`a\7c\2"+
		"\2ab\7p\2\2bc\7x\2\2cd\7c\2\2de\7u\2\2e\32\3\2\2\2fg\7e\2\2gh\7q\2\2h"+
		"i\7p\2\2ij\7p\2\2jk\7g\2\2kl\7e\2\2lm\7v\2\2m\34\3\2\2\2no\7o\2\2op\7"+
		"u\2\2pq\7i\2\2q\36\3\2\2\2rs\7r\2\2st\7q\2\2tu\7y\2\2u \3\2\2\2vx\t\2"+
		"\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\"\3\2\2\2{|\7v\2\2|}\7t"+
		"\2\2}~\7k\2\2~\177\7i\2\2\177\u0080\7i\2\2\u0080\u0081\7g\2\2\u0081\u0082"+
		"\7t\2\2\u0082$\3\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087&\3\2\2\2\u0088"+
		"\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\24\2\2\u008e"+
		"(\3\2\2\2\u008f\u0091\7\17\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0093\7\f\2\2\u0093*\3\2\2\2\13\2\66;@Ey\u0086"+
		"\u008b\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}