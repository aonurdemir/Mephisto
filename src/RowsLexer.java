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
		T__1=1, T__0=2, XOBJ=3, NOBJ=4, DIVIDE=5, MULTIPLY=6, MINUS=7, PLUS=8, 
		EXPR=9, FLOATATOM=10, OSC=11, DAC=12, OBJ=13, CANVAS=14, CONNECT=15, MSG=16, 
		POW=17, INT=18, TRIGGER=19, BANG=20, VAR=21, STRING=22, SEMICOLON=23, 
		TAB=24, NL=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "'#X'", "'#N'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'expr'", 
		"'floatatom'", "'osc~'", "'dac~'", "'obj'", "'canvas'", "'connect'", "'msg'", 
		"'pow'", "INT", "'trigger'", "'bng'", "VAR", "STRING", "';'", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "XOBJ", "NOBJ", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", 
		"EXPR", "FLOATATOM", "OSC", "DAC", "OBJ", "CANVAS", "CONNECT", "MSG", 
		"POW", "INT", "TRIGGER", "BANG", "VAR", "STRING", "SEMICOLON", "TAB", 
		"NL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\5"+
		"\6C\n\6\3\7\3\7\3\7\5\7H\n\7\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\5\tR\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\6\23\u0089\n\23\r\23\16\23\u008a"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\6\27\u009d\n\27\r\27\16\27\u009e\3\30\3\30\3\31\6\31\u00a4"+
		"\n\31\r\31\16\31\u00a5\3\31\3\31\3\32\5\32\u00ab\n\32\3\32\3\32\2\2\33"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\5\3\2\62;\4\2"+
		"\62;C|\4\2\13\13\"\"\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67"+
		"\3\2\2\2\79\3\2\2\2\t<\3\2\2\2\13B\3\2\2\2\rG\3\2\2\2\17L\3\2\2\2\21Q"+
		"\3\2\2\2\23S\3\2\2\2\25X\3\2\2\2\27b\3\2\2\2\31g\3\2\2\2\33l\3\2\2\2\35"+
		"p\3\2\2\2\37w\3\2\2\2!\177\3\2\2\2#\u0083\3\2\2\2%\u0088\3\2\2\2\'\u008c"+
		"\3\2\2\2)\u0094\3\2\2\2+\u0098\3\2\2\2-\u009c\3\2\2\2/\u00a0\3\2\2\2\61"+
		"\u00a3\3\2\2\2\63\u00aa\3\2\2\2\65\66\7+\2\2\66\4\3\2\2\2\678\7*\2\28"+
		"\6\3\2\2\29:\7%\2\2:;\7Z\2\2;\b\3\2\2\2<=\7%\2\2=>\7P\2\2>\n\3\2\2\2?"+
		"C\7\61\2\2@A\7\61\2\2AC\7\u0080\2\2B?\3\2\2\2B@\3\2\2\2C\f\3\2\2\2DH\7"+
		",\2\2EF\7,\2\2FH\7\u0080\2\2GD\3\2\2\2GE\3\2\2\2H\16\3\2\2\2IM\7/\2\2"+
		"JK\7/\2\2KM\7\u0080\2\2LI\3\2\2\2LJ\3\2\2\2M\20\3\2\2\2NR\7-\2\2OP\7-"+
		"\2\2PR\7\u0080\2\2QN\3\2\2\2QO\3\2\2\2R\22\3\2\2\2ST\7g\2\2TU\7z\2\2U"+
		"V\7r\2\2VW\7t\2\2W\24\3\2\2\2XY\7h\2\2YZ\7n\2\2Z[\7q\2\2[\\\7c\2\2\\]"+
		"\7v\2\2]^\7c\2\2^_\7v\2\2_`\7q\2\2`a\7o\2\2a\26\3\2\2\2bc\7q\2\2cd\7u"+
		"\2\2de\7e\2\2ef\7\u0080\2\2f\30\3\2\2\2gh\7f\2\2hi\7c\2\2ij\7e\2\2jk\7"+
		"\u0080\2\2k\32\3\2\2\2lm\7q\2\2mn\7d\2\2no\7l\2\2o\34\3\2\2\2pq\7e\2\2"+
		"qr\7c\2\2rs\7p\2\2st\7x\2\2tu\7c\2\2uv\7u\2\2v\36\3\2\2\2wx\7e\2\2xy\7"+
		"q\2\2yz\7p\2\2z{\7p\2\2{|\7g\2\2|}\7e\2\2}~\7v\2\2~ \3\2\2\2\177\u0080"+
		"\7o\2\2\u0080\u0081\7u\2\2\u0081\u0082\7i\2\2\u0082\"\3\2\2\2\u0083\u0084"+
		"\7r\2\2\u0084\u0085\7q\2\2\u0085\u0086\7y\2\2\u0086$\3\2\2\2\u0087\u0089"+
		"\t\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b&\3\2\2\2\u008c\u008d\7v\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7i\2\2\u0090\u0091\7i\2\2\u0091\u0092\7g\2\2"+
		"\u0092\u0093\7t\2\2\u0093(\3\2\2\2\u0094\u0095\7d\2\2\u0095\u0096\7p\2"+
		"\2\u0096\u0097\7i\2\2\u0097*\3\2\2\2\u0098\u0099\7&\2\2\u0099\u009a\5"+
		"-\27\2\u009a,\3\2\2\2\u009b\u009d\t\3\2\2\u009c\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f.\3\2\2\2\u00a0"+
		"\u00a1\7=\2\2\u00a1\60\3\2\2\2\u00a2\u00a4\t\4\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\b\31\2\2\u00a8\62\3\2\2\2\u00a9\u00ab\7\17\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\f"+
		"\2\2\u00ad\64\3\2\2\2\13\2BGLQ\u008a\u009e\u00a5\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}