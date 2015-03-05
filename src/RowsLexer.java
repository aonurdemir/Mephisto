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
		SIG=18, CLIP=19, BP=20, HIP=21, LOP=22, OBJ=23, CANVAS=24, CONNECT=25, 
		MSG=26, POW=27, LINE=28, UNPACK=29, COS=30, INT=31, FLOAT=32, DIGIT=33, 
		TRIGGER=34, BANG=35, VAR=36, STRING=37, SEMICOLON=38, LPAREN=39, RPAREN=40, 
		TAB=41, NL=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#X'", "'#N'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'>'", "'<'", "'=='", 
		"'expr'", "'floatatom'", "'osc~'", "'phasor~'", "'dac~'", "'metro'", "'mod'", 
		"'fcounter'", "'sig~'", "'clip~'", "'bp~'", "'hip~'", "'lop~'", "'obj'", 
		"'canvas'", "'connect'", "'msg'", "'pow'", "'line~'", "'unpack'", "'cos~'", 
		"INT", "FLOAT", "DIGIT", "'trigger'", "'bng'", "VAR", "STRING", "';'", 
		"'('", "')'", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"XOBJ", "NOBJ", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "GT", "LT", "EQ", 
		"EXPR", "FLOATATOM", "OSC", "PHASOR", "DAC", "METRO", "MOD", "FCOUNTER", 
		"SIG", "CLIP", "BP", "HIP", "LOP", "OBJ", "CANVAS", "CONNECT", "MSG", 
		"POW", "LINE", "UNPACK", "COS", "INT", "FLOAT", "DIGIT", "TRIGGER", "BANG", 
		"VAR", "STRING", "SEMICOLON", "LPAREN", "RPAREN", "TAB", "NL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u012b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\5\5\5f\n\5\3\6\3"+
		"\6\3\6\5\6k\n\6\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \6 \u00f4\n \r \16 \u00f5\3!\6!\u00f9"+
		"\n!\r!\16!\u00fa\3!\3!\7!\u00ff\n!\f!\16!\u0102\13!\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\6&\u0116\n&\r&\16&\u0117\3\'\3\'"+
		"\3(\3(\3)\3)\3*\6*\u0121\n*\r*\16*\u0122\3*\3*\3+\5+\u0128\n+\3+\3+\2"+
		"\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\5\3\2\62;\4\2\62;C|\4\2\13\13\"\""+
		"\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Z\3\2\2\2\7`\3\2\2\2\te\3\2\2\2\13j\3\2"+
		"\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25x\3\2\2\2\27}\3"+
		"\2\2\2\31\u0087\3\2\2\2\33\u008c\3\2\2\2\35\u0094\3\2\2\2\37\u0099\3\2"+
		"\2\2!\u009f\3\2\2\2#\u00a3\3\2\2\2%\u00ac\3\2\2\2\'\u00b1\3\2\2\2)\u00b7"+
		"\3\2\2\2+\u00bb\3\2\2\2-\u00c0\3\2\2\2/\u00c5\3\2\2\2\61\u00c9\3\2\2\2"+
		"\63\u00d0\3\2\2\2\65\u00d8\3\2\2\2\67\u00dc\3\2\2\29\u00e0\3\2\2\2;\u00e6"+
		"\3\2\2\2=\u00ed\3\2\2\2?\u00f3\3\2\2\2A\u00f8\3\2\2\2C\u0103\3\2\2\2E"+
		"\u0105\3\2\2\2G\u010d\3\2\2\2I\u0111\3\2\2\2K\u0115\3\2\2\2M\u0119\3\2"+
		"\2\2O\u011b\3\2\2\2Q\u011d\3\2\2\2S\u0120\3\2\2\2U\u0127\3\2\2\2WX\7%"+
		"\2\2XY\7Z\2\2Y\4\3\2\2\2Z[\7%\2\2[\\\7P\2\2\\\6\3\2\2\2]a\7\61\2\2^_\7"+
		"\61\2\2_a\7\u0080\2\2`]\3\2\2\2`^\3\2\2\2a\b\3\2\2\2bf\7,\2\2cd\7,\2\2"+
		"df\7\u0080\2\2eb\3\2\2\2ec\3\2\2\2f\n\3\2\2\2gk\7/\2\2hi\7/\2\2ik\7\u0080"+
		"\2\2jg\3\2\2\2jh\3\2\2\2k\f\3\2\2\2lp\7-\2\2mn\7-\2\2np\7\u0080\2\2ol"+
		"\3\2\2\2om\3\2\2\2p\16\3\2\2\2qr\7@\2\2r\20\3\2\2\2st\7>\2\2t\22\3\2\2"+
		"\2uv\7?\2\2vw\7?\2\2w\24\3\2\2\2xy\7g\2\2yz\7z\2\2z{\7r\2\2{|\7t\2\2|"+
		"\26\3\2\2\2}~\7h\2\2~\177\7n\2\2\177\u0080\7q\2\2\u0080\u0081\7c\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7c\2\2\u0083\u0084\7v\2\2\u0084\u0085\7q\2\2"+
		"\u0085\u0086\7o\2\2\u0086\30\3\2\2\2\u0087\u0088\7q\2\2\u0088\u0089\7"+
		"u\2\2\u0089\u008a\7e\2\2\u008a\u008b\7\u0080\2\2\u008b\32\3\2\2\2\u008c"+
		"\u008d\7r\2\2\u008d\u008e\7j\2\2\u008e\u008f\7c\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0091\7q\2\2\u0091\u0092\7t\2\2\u0092\u0093\7\u0080\2\2\u0093\34"+
		"\3\2\2\2\u0094\u0095\7f\2\2\u0095\u0096\7c\2\2\u0096\u0097\7e\2\2\u0097"+
		"\u0098\7\u0080\2\2\u0098\36\3\2\2\2\u0099\u009a\7o\2\2\u009a\u009b\7g"+
		"\2\2\u009b\u009c\7v\2\2\u009c\u009d\7t\2\2\u009d\u009e\7q\2\2\u009e \3"+
		"\2\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7f\2\2\u00a2"+
		"\"\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7q\2\2\u00a6"+
		"\u00a7\7w\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\u00ab\7t\2\2\u00ab$\3\2\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7k\2"+
		"\2\u00ae\u00af\7i\2\2\u00af\u00b0\7\u0080\2\2\u00b0&\3\2\2\2\u00b1\u00b2"+
		"\7e\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7r\2\2\u00b5"+
		"\u00b6\7\u0080\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7d\2\2\u00b8\u00b9\7r\2"+
		"\2\u00b9\u00ba\7\u0080\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7\u0080\2\2\u00bf,\3\2\2\2\u00c0"+
		"\u00c1\7n\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7\u0080"+
		"\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8"+
		"\7l\2\2\u00c8\60\3\2\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc"+
		"\7p\2\2\u00cc\u00cd\7x\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7u\2\2\u00cf"+
		"\62\3\2\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7p\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7v\2\2"+
		"\u00d7\64\3\2\2\2\u00d8\u00d9\7o\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7"+
		"i\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7q\2\2\u00de\u00df"+
		"\7y\2\2\u00df8\3\2\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3"+
		"\7p\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7\u0080\2\2\u00e5:\3\2\2\2\u00e6"+
		"\u00e7\7w\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7c\2\2"+
		"\u00ea\u00eb\7e\2\2\u00eb\u00ec\7m\2\2\u00ec<\3\2\2\2\u00ed\u00ee\7e\2"+
		"\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7\u0080\2\2\u00f1"+
		">\3\2\2\2\u00f2\u00f4\5C\"\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6@\3\2\2\2\u00f7\u00f9\5C\"\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\7\60\2\2\u00fd\u00ff\5C\"\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101B\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\t\2\2\2\u0104D\3\2"+
		"\2\2\u0105\u0106\7v\2\2\u0106\u0107\7t\2\2\u0107\u0108\7k\2\2\u0108\u0109"+
		"\7i\2\2\u0109\u010a\7i\2\2\u010a\u010b\7g\2\2\u010b\u010c\7t\2\2\u010c"+
		"F\3\2\2\2\u010d\u010e\7d\2\2\u010e\u010f\7p\2\2\u010f\u0110\7i\2\2\u0110"+
		"H\3\2\2\2\u0111\u0112\7&\2\2\u0112\u0113\5K&\2\u0113J\3\2\2\2\u0114\u0116"+
		"\t\3\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118L\3\2\2\2\u0119\u011a\7=\2\2\u011aN\3\2\2\2\u011b"+
		"\u011c\7*\2\2\u011cP\3\2\2\2\u011d\u011e\7+\2\2\u011eR\3\2\2\2\u011f\u0121"+
		"\t\4\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b*\2\2\u0125T\3\2\2\2\u0126"+
		"\u0128\7\17\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3"+
		"\2\2\2\u0129\u012a\7\f\2\2\u012aV\3\2\2\2\r\2`ejo\u00f5\u00fa\u0100\u0117"+
		"\u0122\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}