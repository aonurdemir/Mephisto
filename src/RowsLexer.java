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
		HIP=18, LOP=19, OBJ=20, CANVAS=21, CONNECT=22, MSG=23, POW=24, INT=25, 
		FLOAT=26, DIGIT=27, TRIGGER=28, BANG=29, VAR=30, STRING=31, SEMICOLON=32, 
		LPAREN=33, RPAREN=34, TAB=35, NL=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#X'", "'#N'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'>'", "'expr'", 
		"'floatatom'", "'osc~'", "'dac~'", "'metro'", "'mod'", "'fcounter'", "'sig~'", 
		"'clip~'", "'bp~'", "'hip~'", "'lop~'", "'obj'", "'canvas'", "'connect'", 
		"'msg'", "'pow'", "INT", "FLOAT", "DIGIT", "'trigger'", "'bng'", "VAR", 
		"STRING", "';'", "'('", "')'", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"XOBJ", "NOBJ", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "GT", "EXPR", "FLOATATOM", 
		"OSC", "DAC", "METRO", "MOD", "FCOUNTER", "SIG", "CLIP", "BP", "HIP", 
		"LOP", "OBJ", "CANVAS", "CONNECT", "MSG", "POW", "INT", "FLOAT", "DIGIT", 
		"TRIGGER", "BANG", "VAR", "STRING", "SEMICOLON", "LPAREN", "RPAREN", "TAB", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u0100\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4"+
		"U\n\4\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\5\7d\n\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\6\32\u00c9\n\32\r\32\16"+
		"\32\u00ca\3\33\6\33\u00ce\n\33\r\33\16\33\u00cf\3\33\3\33\7\33\u00d4\n"+
		"\33\f\33\16\33\u00d7\13\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \6 \u00eb\n \r \16 \u00ec\3"+
		"!\3!\3\"\3\"\3#\3#\3$\6$\u00f6\n$\r$\16$\u00f7\3$\3$\3%\5%\u00fd\n%\3"+
		"%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&\3\2\5\3\2\62;\4\2\62;C|\4\2\13\13\"\"\u0109"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\3K\3\2\2\2\5N\3\2\2\2\7T\3\2\2\2\tY\3\2\2\2\13^\3\2\2\2"+
		"\rc\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23l\3\2\2\2\25v\3\2\2\2\27{\3\2\2"+
		"\2\31\u0080\3\2\2\2\33\u0086\3\2\2\2\35\u008a\3\2\2\2\37\u0093\3\2\2\2"+
		"!\u0098\3\2\2\2#\u009e\3\2\2\2%\u00a2\3\2\2\2\'\u00a7\3\2\2\2)\u00ac\3"+
		"\2\2\2+\u00b0\3\2\2\2-\u00b7\3\2\2\2/\u00bf\3\2\2\2\61\u00c3\3\2\2\2\63"+
		"\u00c8\3\2\2\2\65\u00cd\3\2\2\2\67\u00d8\3\2\2\29\u00da\3\2\2\2;\u00e2"+
		"\3\2\2\2=\u00e6\3\2\2\2?\u00ea\3\2\2\2A\u00ee\3\2\2\2C\u00f0\3\2\2\2E"+
		"\u00f2\3\2\2\2G\u00f5\3\2\2\2I\u00fc\3\2\2\2KL\7%\2\2LM\7Z\2\2M\4\3\2"+
		"\2\2NO\7%\2\2OP\7P\2\2P\6\3\2\2\2QU\7\61\2\2RS\7\61\2\2SU\7\u0080\2\2"+
		"TQ\3\2\2\2TR\3\2\2\2U\b\3\2\2\2VZ\7,\2\2WX\7,\2\2XZ\7\u0080\2\2YV\3\2"+
		"\2\2YW\3\2\2\2Z\n\3\2\2\2[_\7/\2\2\\]\7/\2\2]_\7\u0080\2\2^[\3\2\2\2^"+
		"\\\3\2\2\2_\f\3\2\2\2`d\7-\2\2ab\7-\2\2bd\7\u0080\2\2c`\3\2\2\2ca\3\2"+
		"\2\2d\16\3\2\2\2ef\7@\2\2f\20\3\2\2\2gh\7g\2\2hi\7z\2\2ij\7r\2\2jk\7t"+
		"\2\2k\22\3\2\2\2lm\7h\2\2mn\7n\2\2no\7q\2\2op\7c\2\2pq\7v\2\2qr\7c\2\2"+
		"rs\7v\2\2st\7q\2\2tu\7o\2\2u\24\3\2\2\2vw\7q\2\2wx\7u\2\2xy\7e\2\2yz\7"+
		"\u0080\2\2z\26\3\2\2\2{|\7f\2\2|}\7c\2\2}~\7e\2\2~\177\7\u0080\2\2\177"+
		"\30\3\2\2\2\u0080\u0081\7o\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7t\2\2\u0084\u0085\7q\2\2\u0085\32\3\2\2\2\u0086\u0087\7o\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u0089\7f\2\2\u0089\34\3\2\2\2\u008a\u008b\7h\2\2\u008b"+
		"\u008c\7e\2\2\u008c\u008d\7q\2\2\u008d\u008e\7w\2\2\u008e\u008f\7p\2\2"+
		"\u008f\u0090\7v\2\2\u0090\u0091\7g\2\2\u0091\u0092\7t\2\2\u0092\36\3\2"+
		"\2\2\u0093\u0094\7u\2\2\u0094\u0095\7k\2\2\u0095\u0096\7i\2\2\u0096\u0097"+
		"\7\u0080\2\2\u0097 \3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a\7n\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7r\2\2\u009c\u009d\7\u0080\2\2\u009d\"\3\2\2"+
		"\2\u009e\u009f\7d\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7\u0080\2\2\u00a1"+
		"$\3\2\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7r\2\2\u00a5"+
		"\u00a6\7\u0080\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7q\2"+
		"\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7\u0080\2\2\u00ab(\3\2\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7l\2\2\u00af*\3\2\2\2\u00b0\u00b1"+
		"\7e\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7x\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7u\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8"+
		"\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7g\2\2"+
		"\u00bc\u00bd\7e\2\2\u00bd\u00be\7v\2\2\u00be.\3\2\2\2\u00bf\u00c0\7o\2"+
		"\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7i\2\2\u00c2\60\3\2\2\2\u00c3\u00c4"+
		"\7r\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7y\2\2\u00c6\62\3\2\2\2\u00c7\u00c9"+
		"\5\67\34\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00cb\64\3\2\2\2\u00cc\u00ce\5\67\34\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d5\7\60\2\2\u00d2\u00d4\5\67\34\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\66\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\t\2\2\2\u00d98\3\2\2\2\u00da"+
		"\u00db\7v\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7i\2\2"+
		"\u00de\u00df\7i\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7t\2\2\u00e1:\3\2\2"+
		"\2\u00e2\u00e3\7d\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7i\2\2\u00e5<\3\2"+
		"\2\2\u00e6\u00e7\7&\2\2\u00e7\u00e8\5? \2\u00e8>\3\2\2\2\u00e9\u00eb\t"+
		"\3\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7=\2\2\u00efB\3\2\2\2\u00f0"+
		"\u00f1\7*\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7+\2\2\u00f3F\3\2\2\2\u00f4\u00f6"+
		"\t\4\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b$\2\2\u00faH\3\2\2\2\u00fb"+
		"\u00fd\7\17\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe\u00ff\7\f\2\2\u00ffJ\3\2\2\2\r\2TY^c\u00ca\u00cf\u00d5\u00ec"+
		"\u00f7\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}