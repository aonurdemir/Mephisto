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
		XOBJ=1, NOBJ=2, DIVIDE=3, MULTIPLY=4, MINUS=5, PLUS=6, EXPR=7, FLOATATOM=8, 
		OSC=9, DAC=10, METRO=11, MOD=12, FCOUNTER=13, SIG=14, OBJ=15, CANVAS=16, 
		CONNECT=17, MSG=18, POW=19, INT=20, FLOAT=21, DIGIT=22, TRIGGER=23, BANG=24, 
		VAR=25, STRING=26, SEMICOLON=27, LPAREN=28, RPAREN=29, TAB=30, NL=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#X'", "'#N'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'expr'", "'floatatom'", 
		"'osc~'", "'dac~'", "'metro'", "'mod'", "'fcounter'", "'sig~'", "'obj'", 
		"'canvas'", "'connect'", "'msg'", "'pow'", "INT", "FLOAT", "DIGIT", "'trigger'", 
		"'bng'", "VAR", "STRING", "';'", "'('", "')'", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"XOBJ", "NOBJ", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "EXPR", "FLOATATOM", 
		"OSC", "DAC", "METRO", "MOD", "FCOUNTER", "SIG", "OBJ", "CANVAS", "CONNECT", 
		"MSG", "POW", "INT", "FLOAT", "DIGIT", "TRIGGER", "BANG", "VAR", "STRING", 
		"SEMICOLON", "LPAREN", "RPAREN", "TAB", "NL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\5\5P\n\5\3\6\3\6"+
		"\3\6\5\6U\n\6\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\6\25\u00a9\n\25\r\25\16\25\u00aa"+
		"\3\26\6\26\u00ae\n\26\r\26\16\26\u00af\3\26\3\26\7\26\u00b4\n\26\f\26"+
		"\16\26\u00b7\13\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\6\33\u00cb\n\33\r\33\16\33\u00cc"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u00d6\n\37\r\37\16\37\u00d7\3"+
		"\37\3\37\3 \5 \u00dd\n \3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\5\3\2\62;\4\2\62;C|\4\2\13"+
		"\13\"\"\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5D\3\2\2\2\7J\3\2\2"+
		"\2\tO\3\2\2\2\13T\3\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21`\3\2\2\2\23j\3\2\2"+
		"\2\25o\3\2\2\2\27t\3\2\2\2\31z\3\2\2\2\33~\3\2\2\2\35\u0087\3\2\2\2\37"+
		"\u008c\3\2\2\2!\u0090\3\2\2\2#\u0097\3\2\2\2%\u009f\3\2\2\2\'\u00a3\3"+
		"\2\2\2)\u00a8\3\2\2\2+\u00ad\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61"+
		"\u00c2\3\2\2\2\63\u00c6\3\2\2\2\65\u00ca\3\2\2\2\67\u00ce\3\2\2\29\u00d0"+
		"\3\2\2\2;\u00d2\3\2\2\2=\u00d5\3\2\2\2?\u00dc\3\2\2\2AB\7%\2\2BC\7Z\2"+
		"\2C\4\3\2\2\2DE\7%\2\2EF\7P\2\2F\6\3\2\2\2GK\7\61\2\2HI\7\61\2\2IK\7\u0080"+
		"\2\2JG\3\2\2\2JH\3\2\2\2K\b\3\2\2\2LP\7,\2\2MN\7,\2\2NP\7\u0080\2\2OL"+
		"\3\2\2\2OM\3\2\2\2P\n\3\2\2\2QU\7/\2\2RS\7/\2\2SU\7\u0080\2\2TQ\3\2\2"+
		"\2TR\3\2\2\2U\f\3\2\2\2VZ\7-\2\2WX\7-\2\2XZ\7\u0080\2\2YV\3\2\2\2YW\3"+
		"\2\2\2Z\16\3\2\2\2[\\\7g\2\2\\]\7z\2\2]^\7r\2\2^_\7t\2\2_\20\3\2\2\2`"+
		"a\7h\2\2ab\7n\2\2bc\7q\2\2cd\7c\2\2de\7v\2\2ef\7c\2\2fg\7v\2\2gh\7q\2"+
		"\2hi\7o\2\2i\22\3\2\2\2jk\7q\2\2kl\7u\2\2lm\7e\2\2mn\7\u0080\2\2n\24\3"+
		"\2\2\2op\7f\2\2pq\7c\2\2qr\7e\2\2rs\7\u0080\2\2s\26\3\2\2\2tu\7o\2\2u"+
		"v\7g\2\2vw\7v\2\2wx\7t\2\2xy\7q\2\2y\30\3\2\2\2z{\7o\2\2{|\7q\2\2|}\7"+
		"f\2\2}\32\3\2\2\2~\177\7h\2\2\177\u0080\7e\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7w\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084\u0085\7g\2\2"+
		"\u0085\u0086\7t\2\2\u0086\34\3\2\2\2\u0087\u0088\7u\2\2\u0088\u0089\7"+
		"k\2\2\u0089\u008a\7i\2\2\u008a\u008b\7\u0080\2\2\u008b\36\3\2\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7d\2\2\u008e\u008f\7l\2\2\u008f \3\2\2\2\u0090"+
		"\u0091\7e\2\2\u0091\u0092\7c\2\2\u0092\u0093\7p\2\2\u0093\u0094\7x\2\2"+
		"\u0094\u0095\7c\2\2\u0095\u0096\7u\2\2\u0096\"\3\2\2\2\u0097\u0098\7e"+
		"\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a\u009b\7p\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7e\2\2\u009d\u009e\7v\2\2\u009e$\3\2\2\2\u009f\u00a0"+
		"\7o\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7i\2\2\u00a2&\3\2\2\2\u00a3\u00a4"+
		"\7r\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7y\2\2\u00a6(\3\2\2\2\u00a7\u00a9"+
		"\5-\27\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab*\3\2\2\2\u00ac\u00ae\5-\27\2\u00ad\u00ac\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b5\7\60\2\2\u00b2\u00b4\5-\27\2\u00b3\u00b2\3\2\2\2"+
		"\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6,\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\t\2\2\2\u00b9.\3\2\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7i\2\2\u00be"+
		"\u00bf\7i\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1\60\3\2\2\2\u00c2"+
		"\u00c3\7d\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7i\2\2\u00c5\62\3\2\2\2\u00c6"+
		"\u00c7\7&\2\2\u00c7\u00c8\5\65\33\2\u00c8\64\3\2\2\2\u00c9\u00cb\t\3\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf8\3\2\2\2\u00d0\u00d1"+
		"\7*\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7+\2\2\u00d3<\3\2\2\2\u00d4\u00d6\t"+
		"\4\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b\37\2\2\u00da>\3\2\2\2"+
		"\u00db\u00dd\7\17\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\7\f\2\2\u00df@\3\2\2\2\r\2JOTY\u00aa\u00af\u00b5"+
		"\u00cc\u00d7\u00dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}