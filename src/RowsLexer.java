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
		XOBJ=1, NOBJ=2, DIVIDE=3, MULTIPLY=4, MINUS=5, PLUS=6, GT=7, LT=8, EQ=9, 
		EXPR=10, FLOATATOM=11, OSC=12, PHASOR=13, DAC=14, METRO=15, MOD=16, FCOUNTER=17, 
		SIG=18, CLIP=19, BP=20, HIP=21, LOP=22, VCF=23, OBJ=24, CANVAS=25, CONNECT=26, 
		MSG=27, POW=28, LINE=29, UNPACK=30, COS=31, NOISE=32, TGL=33, MAX=34, 
		MIN=35, INT=36, FLOAT=37, DIGIT=38, TRIGGER=39, BANG=40, VAR=41, STRING=42, 
		SEMICOLON=43, LPAREN=44, RPAREN=45, TAB=46, NL=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#X'", "'#N'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'>'", "'<'", "'=='", 
		"'expr'", "'floatatom'", "'osc~'", "'phasor~'", "'dac~'", "'metro'", "'mod'", 
		"'fcounter'", "'sig~'", "'clip~'", "'bp~'", "'hip~'", "'lop~'", "'vcf~'", 
		"'obj'", "'canvas'", "'connect'", "'msg'", "'pow'", "'line~'", "'unpack'", 
		"'cos~'", "'noise~'", "'tgl'", "'max~'", "'min~'", "INT", "FLOAT", "DIGIT", 
		"'trigger'", "'bng'", "VAR", "STRING", "';'", "'('", "')'", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"XOBJ", "NOBJ", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "GT", "LT", "EQ", 
		"EXPR", "FLOATATOM", "OSC", "PHASOR", "DAC", "METRO", "MOD", "FCOUNTER", 
		"SIG", "CLIP", "BP", "HIP", "LOP", "VCF", "OBJ", "CANVAS", "CONNECT", 
		"MSG", "POW", "LINE", "UNPACK", "COS", "NOISE", "TGL", "MAX", "MIN", "INT", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u014f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\5\4k\n\4\3\5\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\5\6u\n\6\3\7\3\7\3\7\5\7"+
		"z\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3%\6%\u0118\n%\r%\16%\u0119\3&\6&\u011d\n&\r&\16&\u011e\3&"+
		"\3&\7&\u0123\n&\f&\16&\u0126\13&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3*\3*\3*\3+\6+\u013a\n+\r+\16+\u013b\3,\3,\3-\3-\3.\3.\3/\6/\u0145"+
		"\n/\r/\16/\u0146\3/\3/\3\60\5\60\u014c\n\60\3\60\3\60\2\2\61\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\5\3\2\62;\4\2\62;C|\4\2\13\13\""+
		"\"\u0158\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3a\3\2\2\2\5d\3\2\2\2\7j\3\2\2\2\to\3\2\2\2\13t\3\2\2\2\ry\3\2\2"+
		"\2\17{\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0082\3\2\2\2\27\u0087\3"+
		"\2\2\2\31\u0091\3\2\2\2\33\u0096\3\2\2\2\35\u009e\3\2\2\2\37\u00a3\3\2"+
		"\2\2!\u00a9\3\2\2\2#\u00ad\3\2\2\2%\u00b6\3\2\2\2\'\u00bb\3\2\2\2)\u00c1"+
		"\3\2\2\2+\u00c5\3\2\2\2-\u00ca\3\2\2\2/\u00cf\3\2\2\2\61\u00d4\3\2\2\2"+
		"\63\u00d8\3\2\2\2\65\u00df\3\2\2\2\67\u00e7\3\2\2\29\u00eb\3\2\2\2;\u00ef"+
		"\3\2\2\2=\u00f5\3\2\2\2?\u00fc\3\2\2\2A\u0101\3\2\2\2C\u0108\3\2\2\2E"+
		"\u010c\3\2\2\2G\u0111\3\2\2\2I\u0117\3\2\2\2K\u011c\3\2\2\2M\u0127\3\2"+
		"\2\2O\u0129\3\2\2\2Q\u0131\3\2\2\2S\u0135\3\2\2\2U\u0139\3\2\2\2W\u013d"+
		"\3\2\2\2Y\u013f\3\2\2\2[\u0141\3\2\2\2]\u0144\3\2\2\2_\u014b\3\2\2\2a"+
		"b\7%\2\2bc\7Z\2\2c\4\3\2\2\2de\7%\2\2ef\7P\2\2f\6\3\2\2\2gk\7\61\2\2h"+
		"i\7\61\2\2ik\7\u0080\2\2jg\3\2\2\2jh\3\2\2\2k\b\3\2\2\2lp\7,\2\2mn\7,"+
		"\2\2np\7\u0080\2\2ol\3\2\2\2om\3\2\2\2p\n\3\2\2\2qu\7/\2\2rs\7/\2\2su"+
		"\7\u0080\2\2tq\3\2\2\2tr\3\2\2\2u\f\3\2\2\2vz\7-\2\2wx\7-\2\2xz\7\u0080"+
		"\2\2yv\3\2\2\2yw\3\2\2\2z\16\3\2\2\2{|\7@\2\2|\20\3\2\2\2}~\7>\2\2~\22"+
		"\3\2\2\2\177\u0080\7?\2\2\u0080\u0081\7?\2\2\u0081\24\3\2\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0084\7z\2\2\u0084\u0085\7r\2\2\u0085\u0086\7t\2\2\u0086"+
		"\26\3\2\2\2\u0087\u0088\7h\2\2\u0088\u0089\7n\2\2\u0089\u008a\7q\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7v\2\2\u008c\u008d\7c\2\2\u008d\u008e\7v\2\2"+
		"\u008e\u008f\7q\2\2\u008f\u0090\7o\2\2\u0090\30\3\2\2\2\u0091\u0092\7"+
		"q\2\2\u0092\u0093\7u\2\2\u0093\u0094\7e\2\2\u0094\u0095\7\u0080\2\2\u0095"+
		"\32\3\2\2\2\u0096\u0097\7r\2\2\u0097\u0098\7j\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\u009d\7\u0080"+
		"\2\2\u009d\34\3\2\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1"+
		"\7e\2\2\u00a1\u00a2\7\u0080\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7o\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7q\2\2"+
		"\u00a8 \3\2\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7f\2"+
		"\2\u00ac\"\3\2\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7"+
		"q\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7t\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7i\2\2\u00b9\u00ba\7\u0080\2\2\u00ba&\3\2\2\2\u00bb"+
		"\u00bc\7e\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7r\2\2"+
		"\u00bf\u00c0\7\u0080\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3"+
		"\7r\2\2\u00c3\u00c4\7\u0080\2\2\u00c4*\3\2\2\2\u00c5\u00c6\7j\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7\u0080\2\2\u00c9,\3\2\2"+
		"\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce"+
		"\7\u0080\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7x\2\2\u00d0\u00d1\7e\2\2\u00d1"+
		"\u00d2\7h\2\2\u00d2\u00d3\7\u0080\2\2\u00d3\60\3\2\2\2\u00d4\u00d5\7q"+
		"\2\2\u00d5\u00d6\7d\2\2\u00d6\u00d7\7l\2\2\u00d7\62\3\2\2\2\u00d8\u00d9"+
		"\7e\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7x\2\2\u00dc"+
		"\u00dd\7c\2\2\u00dd\u00de\7u\2\2\u00de\64\3\2\2\2\u00df\u00e0\7e\2\2\u00e0"+
		"\u00e1\7q\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7g\2\2"+
		"\u00e4\u00e5\7e\2\2\u00e5\u00e6\7v\2\2\u00e6\66\3\2\2\2\u00e7\u00e8\7"+
		"o\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7i\2\2\u00ea8\3\2\2\2\u00eb\u00ec"+
		"\7r\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7y\2\2\u00ee:\3\2\2\2\u00ef\u00f0"+
		"\7n\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7\u0080\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7p\2"+
		"\2\u00f7\u00f8\7r\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb"+
		"\7m\2\2\u00fb>\3\2\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff"+
		"\7u\2\2\u00ff\u0100\7\u0080\2\2\u0100@\3\2\2\2\u0101\u0102\7p\2\2\u0102"+
		"\u0103\7q\2\2\u0103\u0104\7k\2\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2"+
		"\u0106\u0107\7\u0080\2\2\u0107B\3\2\2\2\u0108\u0109\7v\2\2\u0109\u010a"+
		"\7i\2\2\u010a\u010b\7n\2\2\u010bD\3\2\2\2\u010c\u010d\7o\2\2\u010d\u010e"+
		"\7c\2\2\u010e\u010f\7z\2\2\u010f\u0110\7\u0080\2\2\u0110F\3\2\2\2\u0111"+
		"\u0112\7o\2\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114\u0115\7\u0080"+
		"\2\2\u0115H\3\2\2\2\u0116\u0118\5M\'\2\u0117\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011aJ\3\2\2\2\u011b"+
		"\u011d\5M\'\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0124\7\60\2\2\u0121"+
		"\u0123\5M\'\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125L\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128"+
		"\t\2\2\2\u0128N\3\2\2\2\u0129\u012a\7v\2\2\u012a\u012b\7t\2\2\u012b\u012c"+
		"\7k\2\2\u012c\u012d\7i\2\2\u012d\u012e\7i\2\2\u012e\u012f\7g\2\2\u012f"+
		"\u0130\7t\2\2\u0130P\3\2\2\2\u0131\u0132\7d\2\2\u0132\u0133\7p\2\2\u0133"+
		"\u0134\7i\2\2\u0134R\3\2\2\2\u0135\u0136\7&\2\2\u0136\u0137\5U+\2\u0137"+
		"T\3\2\2\2\u0138\u013a\t\3\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013cV\3\2\2\2\u013d\u013e\7"+
		"=\2\2\u013eX\3\2\2\2\u013f\u0140\7*\2\2\u0140Z\3\2\2\2\u0141\u0142\7+"+
		"\2\2\u0142\\\3\2\2\2\u0143\u0145\t\4\2\2\u0144\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\b/\2\2\u0149^\3\2\2\2\u014a\u014c\7\17\2\2\u014b\u014a\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7\f\2\2\u014e`\3"+
		"\2\2\2\r\2joty\u0119\u011e\u0124\u013b\u0146\u014b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}