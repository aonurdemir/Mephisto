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
		OSC=9, DAC=10, METRO=11, MOD=12, FCOUNTER=13, SIG=14, CLIP=15, BP=16, 
		HIP=17, OBJ=18, CANVAS=19, CONNECT=20, MSG=21, POW=22, INT=23, FLOAT=24, 
		DIGIT=25, TRIGGER=26, BANG=27, VAR=28, STRING=29, SEMICOLON=30, LPAREN=31, 
		RPAREN=32, TAB=33, NL=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#X'", "'#N'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'expr'", "'floatatom'", 
		"'osc~'", "'dac~'", "'metro'", "'mod'", "'fcounter'", "'sig~'", "'clip~'", 
		"'bp~'", "'hip~'", "'obj'", "'canvas'", "'connect'", "'msg'", "'pow'", 
		"INT", "FLOAT", "DIGIT", "'trigger'", "'bng'", "VAR", "STRING", "';'", 
		"'('", "')'", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"XOBJ", "NOBJ", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "EXPR", "FLOATATOM", 
		"OSC", "DAC", "METRO", "MOD", "FCOUNTER", "SIG", "CLIP", "BP", "HIP", 
		"OBJ", "CANVAS", "CONNECT", "MSG", "POW", "INT", "FLOAT", "DIGIT", "TRIGGER", 
		"BANG", "VAR", "STRING", "SEMICOLON", "LPAREN", "RPAREN", "TAB", "NL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4Q\n\4\3\5\3\5"+
		"\3\5\5\5V\n\5\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\6\30"+
		"\u00be\n\30\r\30\16\30\u00bf\3\31\6\31\u00c3\n\31\r\31\16\31\u00c4\3\31"+
		"\3\31\7\31\u00c9\n\31\f\31\16\31\u00cc\13\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\6\36"+
		"\u00e0\n\36\r\36\16\36\u00e1\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00eb\n\"\r"+
		"\"\16\"\u00ec\3\"\3\"\3#\5#\u00f2\n#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\5\3\2"+
		"\62;\4\2\62;C|\4\2\13\13\"\"\u00fe\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5J\3\2\2\2\7P\3\2\2\2\tU\3\2\2\2\13"+
		"Z\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21f\3\2\2\2\23p\3\2\2\2\25u\3\2\2\2\27"+
		"z\3\2\2\2\31\u0080\3\2\2\2\33\u0084\3\2\2\2\35\u008d\3\2\2\2\37\u0092"+
		"\3\2\2\2!\u0098\3\2\2\2#\u009c\3\2\2\2%\u00a1\3\2\2\2\'\u00a5\3\2\2\2"+
		")\u00ac\3\2\2\2+\u00b4\3\2\2\2-\u00b8\3\2\2\2/\u00bd\3\2\2\2\61\u00c2"+
		"\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf\3\2\2\2\67\u00d7\3\2\2\29\u00db\3\2"+
		"\2\2;\u00df\3\2\2\2=\u00e3\3\2\2\2?\u00e5\3\2\2\2A\u00e7\3\2\2\2C\u00ea"+
		"\3\2\2\2E\u00f1\3\2\2\2GH\7%\2\2HI\7Z\2\2I\4\3\2\2\2JK\7%\2\2KL\7P\2\2"+
		"L\6\3\2\2\2MQ\7\61\2\2NO\7\61\2\2OQ\7\u0080\2\2PM\3\2\2\2PN\3\2\2\2Q\b"+
		"\3\2\2\2RV\7,\2\2ST\7,\2\2TV\7\u0080\2\2UR\3\2\2\2US\3\2\2\2V\n\3\2\2"+
		"\2W[\7/\2\2XY\7/\2\2Y[\7\u0080\2\2ZW\3\2\2\2ZX\3\2\2\2[\f\3\2\2\2\\`\7"+
		"-\2\2]^\7-\2\2^`\7\u0080\2\2_\\\3\2\2\2_]\3\2\2\2`\16\3\2\2\2ab\7g\2\2"+
		"bc\7z\2\2cd\7r\2\2de\7t\2\2e\20\3\2\2\2fg\7h\2\2gh\7n\2\2hi\7q\2\2ij\7"+
		"c\2\2jk\7v\2\2kl\7c\2\2lm\7v\2\2mn\7q\2\2no\7o\2\2o\22\3\2\2\2pq\7q\2"+
		"\2qr\7u\2\2rs\7e\2\2st\7\u0080\2\2t\24\3\2\2\2uv\7f\2\2vw\7c\2\2wx\7e"+
		"\2\2xy\7\u0080\2\2y\26\3\2\2\2z{\7o\2\2{|\7g\2\2|}\7v\2\2}~\7t\2\2~\177"+
		"\7q\2\2\177\30\3\2\2\2\u0080\u0081\7o\2\2\u0081\u0082\7q\2\2\u0082\u0083"+
		"\7f\2\2\u0083\32\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086\7e\2\2\u0086\u0087"+
		"\7q\2\2\u0087\u0088\7w\2\2\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7t\2\2\u008c\34\3\2\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7i\2\2\u0090\u0091\7\u0080\2\2\u0091\36\3\2"+
		"\2\2\u0092\u0093\7e\2\2\u0093\u0094\7n\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7r\2\2\u0096\u0097\7\u0080\2\2\u0097 \3\2\2\2\u0098\u0099\7d\2\2\u0099"+
		"\u009a\7r\2\2\u009a\u009b\7\u0080\2\2\u009b\"\3\2\2\2\u009c\u009d\7j\2"+
		"\2\u009d\u009e\7k\2\2\u009e\u009f\7r\2\2\u009f\u00a0\7\u0080\2\2\u00a0"+
		"$\3\2\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4\7l\2\2\u00a4"+
		"&\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7x\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7u\2\2\u00ab(\3\2\2\2\u00ac"+
		"\u00ad\7e\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\u00b1\7g\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7v\2\2\u00b3*\3\2\2"+
		"\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7i\2\2\u00b7,\3\2"+
		"\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7y\2\2\u00bb.\3"+
		"\2\2\2\u00bc\u00be\5\63\32\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\60\3\2\2\2\u00c1\u00c3\5\63\32"+
		"\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca\7\60\2\2\u00c7\u00c9\5\63\32"+
		"\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\62\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\t\2\2\2\u00ce"+
		"\64\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7k\2\2\u00d2"+
		"\u00d3\7i\2\2\u00d3\u00d4\7i\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7t\2\2"+
		"\u00d6\66\3\2\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7"+
		"i\2\2\u00da8\3\2\2\2\u00db\u00dc\7&\2\2\u00dc\u00dd\5;\36\2\u00dd:\3\2"+
		"\2\2\u00de\u00e0\t\3\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7=\2\2\u00e4"+
		">\3\2\2\2\u00e5\u00e6\7*\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8B"+
		"\3\2\2\2\u00e9\u00eb\t\4\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\""+
		"\2\2\u00efD\3\2\2\2\u00f0\u00f2\7\17\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\f\2\2\u00f4F\3\2\2\2\r\2PU"+
		"Z_\u00bf\u00c4\u00ca\u00e1\u00ec\u00f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}