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
		XOBJ=1, NOBJ=2, DIVIDE=3, MULTIPLY=4, MINUS=5, PLUS=6, GT=7, EXPR=8, FLOATATOM=9, 
		OSC=10, DAC=11, METRO=12, MOD=13, FCOUNTER=14, SIG=15, CLIP=16, BP=17, 
		HIP=18, LOP=19, OBJ=20, CANVAS=21, CONNECT=22, MSG=23, POW=24, LINE=25, 
		UNPACK=26, INT=27, FLOAT=28, DIGIT=29, TRIGGER=30, BANG=31, VAR=32, STRING=33, 
		SEMICOLON=34, LPAREN=35, RPAREN=36, TAB=37, NL=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#X'", "'#N'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'>'", "'expr'", 
		"'floatatom'", "'osc~'", "'dac~'", "'metro'", "'mod'", "'fcounter'", "'sig~'", 
		"'clip~'", "'bp~'", "'hip~'", "'lop~'", "'obj'", "'canvas'", "'connect'", 
		"'msg'", "'pow'", "'line~'", "'unpack'", "INT", "FLOAT", "DIGIT", "'trigger'", 
		"'bng'", "VAR", "STRING", "';'", "'('", "')'", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"XOBJ", "NOBJ", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "GT", "EXPR", "FLOATATOM", 
		"OSC", "DAC", "METRO", "MOD", "FCOUNTER", "SIG", "CLIP", "BP", "HIP", 
		"LOP", "OBJ", "CANVAS", "CONNECT", "MSG", "POW", "LINE", "UNPACK", "INT", 
		"FLOAT", "DIGIT", "TRIGGER", "BANG", "VAR", "STRING", "SEMICOLON", "LPAREN", 
		"RPAREN", "TAB", "NL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u0111\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\5\6c\n\6\3\7\3\7"+
		"\3\7\5\7h\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\6\34\u00da"+
		"\n\34\r\34\16\34\u00db\3\35\6\35\u00df\n\35\r\35\16\35\u00e0\3\35\3\35"+
		"\7\35\u00e5\n\35\f\35\16\35\u00e8\13\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\6\"\u00fc\n\"\r\"\16\"\u00fd"+
		"\3#\3#\3$\3$\3%\3%\3&\6&\u0107\n&\r&\16&\u0108\3&\3&\3\'\5\'\u010e\n\'"+
		"\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\5\3\2\62;\4\2\62;C|\4\2\13\13\""+
		"\"\u011a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5R\3\2\2\2\7X"+
		"\3\2\2\2\t]\3\2\2\2\13b\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23"+
		"p\3\2\2\2\25z\3\2\2\2\27\177\3\2\2\2\31\u0084\3\2\2\2\33\u008a\3\2\2\2"+
		"\35\u008e\3\2\2\2\37\u0097\3\2\2\2!\u009c\3\2\2\2#\u00a2\3\2\2\2%\u00a6"+
		"\3\2\2\2\'\u00ab\3\2\2\2)\u00b0\3\2\2\2+\u00b4\3\2\2\2-\u00bb\3\2\2\2"+
		"/\u00c3\3\2\2\2\61\u00c7\3\2\2\2\63\u00cb\3\2\2\2\65\u00d1\3\2\2\2\67"+
		"\u00d9\3\2\2\29\u00de\3\2\2\2;\u00e9\3\2\2\2=\u00eb\3\2\2\2?\u00f3\3\2"+
		"\2\2A\u00f7\3\2\2\2C\u00fb\3\2\2\2E\u00ff\3\2\2\2G\u0101\3\2\2\2I\u0103"+
		"\3\2\2\2K\u0106\3\2\2\2M\u010d\3\2\2\2OP\7%\2\2PQ\7Z\2\2Q\4\3\2\2\2RS"+
		"\7%\2\2ST\7P\2\2T\6\3\2\2\2UY\7\61\2\2VW\7\61\2\2WY\7\u0080\2\2XU\3\2"+
		"\2\2XV\3\2\2\2Y\b\3\2\2\2Z^\7,\2\2[\\\7,\2\2\\^\7\u0080\2\2]Z\3\2\2\2"+
		"][\3\2\2\2^\n\3\2\2\2_c\7/\2\2`a\7/\2\2ac\7\u0080\2\2b_\3\2\2\2b`\3\2"+
		"\2\2c\f\3\2\2\2dh\7-\2\2ef\7-\2\2fh\7\u0080\2\2gd\3\2\2\2ge\3\2\2\2h\16"+
		"\3\2\2\2ij\7@\2\2j\20\3\2\2\2kl\7g\2\2lm\7z\2\2mn\7r\2\2no\7t\2\2o\22"+
		"\3\2\2\2pq\7h\2\2qr\7n\2\2rs\7q\2\2st\7c\2\2tu\7v\2\2uv\7c\2\2vw\7v\2"+
		"\2wx\7q\2\2xy\7o\2\2y\24\3\2\2\2z{\7q\2\2{|\7u\2\2|}\7e\2\2}~\7\u0080"+
		"\2\2~\26\3\2\2\2\177\u0080\7f\2\2\u0080\u0081\7c\2\2\u0081\u0082\7e\2"+
		"\2\u0082\u0083\7\u0080\2\2\u0083\30\3\2\2\2\u0084\u0085\7o\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7q\2\2\u0089"+
		"\32\3\2\2\2\u008a\u008b\7o\2\2\u008b\u008c\7q\2\2\u008c\u008d\7f\2\2\u008d"+
		"\34\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7e\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7w\2\2\u0092\u0093\7p\2\2\u0093\u0094\7v\2\2\u0094\u0095\7g\2\2"+
		"\u0095\u0096\7t\2\2\u0096\36\3\2\2\2\u0097\u0098\7u\2\2\u0098\u0099\7"+
		"k\2\2\u0099\u009a\7i\2\2\u009a\u009b\7\u0080\2\2\u009b \3\2\2\2\u009c"+
		"\u009d\7e\2\2\u009d\u009e\7n\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7r\2\2"+
		"\u00a0\u00a1\7\u0080\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4"+
		"\7r\2\2\u00a4\u00a5\7\u0080\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7j\2\2\u00a7"+
		"\u00a8\7k\2\2\u00a8\u00a9\7r\2\2\u00a9\u00aa\7\u0080\2\2\u00aa&\3\2\2"+
		"\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af"+
		"\7\u0080\2\2\u00af(\3\2\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7d\2\2\u00b2"+
		"\u00b3\7l\2\2\u00b3*\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7x\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7u\2\2"+
		"\u00ba,\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7p\2"+
		"\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6"+
		"\7i\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca"+
		"\7y\2\2\u00ca\62\3\2\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce"+
		"\7p\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7\u0080\2\2\u00d0\64\3\2\2\2\u00d1"+
		"\u00d2\7w\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7c\2\2"+
		"\u00d5\u00d6\7e\2\2\u00d6\u00d7\7m\2\2\u00d7\66\3\2\2\2\u00d8\u00da\5"+
		";\36\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc8\3\2\2\2\u00dd\u00df\5;\36\2\u00de\u00dd\3\2\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e6\7\60\2\2\u00e3\u00e5\5;\36\2\u00e4\u00e3\3\2\2\2"+
		"\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7:\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\t\2\2\2\u00ea<\3\2\2\2\u00eb\u00ec"+
		"\7v\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7i\2\2\u00ef"+
		"\u00f0\7i\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7t\2\2\u00f2>\3\2\2\2\u00f3"+
		"\u00f4\7d\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7i\2\2\u00f6@\3\2\2\2\u00f7"+
		"\u00f8\7&\2\2\u00f8\u00f9\5C\"\2\u00f9B\3\2\2\2\u00fa\u00fc\t\3\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00feD\3\2\2\2\u00ff\u0100\7=\2\2\u0100F\3\2\2\2\u0101\u0102\7*\2"+
		"\2\u0102H\3\2\2\2\u0103\u0104\7+\2\2\u0104J\3\2\2\2\u0105\u0107\t\4\2"+
		"\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b&\2\2\u010bL\3\2\2\2\u010c\u010e"+
		"\7\17\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010f\u0110\7\f\2\2\u0110N\3\2\2\2\r\2X]bg\u00db\u00e0\u00e6\u00fd\u0108"+
		"\u010d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}