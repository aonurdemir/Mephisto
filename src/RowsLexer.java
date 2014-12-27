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
		OSC=9, DAC=10, INT=11, OBJ=12, CANVAS=13, CONNECT=14, MSG=15, TAB=16, 
		NL=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#N'", "'#X'", "';'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'floatatom'", 
		"'osc~'", "'dac~'", "INT", "'obj'", "'canvas'", "'connect'", "'msg'", 
		"TAB", "NL"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "FLOATATOM", 
		"OSC", "DAC", "INT", "OBJ", "CANVAS", "CONNECT", "MSG", "TAB", "NL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\5"+
		"\6\66\n\6\3\7\3\7\3\7\5\7;\n\7\3\b\3\b\3\b\5\b@\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\6\fW\n\f\r\f\16\fX\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\6"+
		"\21s\n\21\r\21\16\21t\3\21\3\21\3\22\5\22z\n\22\3\22\3\22\2\2\23\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\4\3\2\62;\4\2\13\13\"\"\u0083\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5(\3\2\2\2\7"+
		"+\3\2\2\2\t\60\3\2\2\2\13\65\3\2\2\2\r:\3\2\2\2\17?\3\2\2\2\21A\3\2\2"+
		"\2\23K\3\2\2\2\25P\3\2\2\2\27V\3\2\2\2\31Z\3\2\2\2\33^\3\2\2\2\35e\3\2"+
		"\2\2\37m\3\2\2\2!r\3\2\2\2#y\3\2\2\2%&\7%\2\2&\'\7P\2\2\'\4\3\2\2\2()"+
		"\7%\2\2)*\7Z\2\2*\6\3\2\2\2+,\7=\2\2,\b\3\2\2\2-\61\7\61\2\2./\7\61\2"+
		"\2/\61\7\u0080\2\2\60-\3\2\2\2\60.\3\2\2\2\61\n\3\2\2\2\62\66\7,\2\2\63"+
		"\64\7,\2\2\64\66\7\u0080\2\2\65\62\3\2\2\2\65\63\3\2\2\2\66\f\3\2\2\2"+
		"\67;\7/\2\289\7/\2\29;\7\u0080\2\2:\67\3\2\2\2:8\3\2\2\2;\16\3\2\2\2<"+
		"@\7-\2\2=>\7-\2\2>@\7\u0080\2\2?<\3\2\2\2?=\3\2\2\2@\20\3\2\2\2AB\7h\2"+
		"\2BC\7n\2\2CD\7q\2\2DE\7c\2\2EF\7v\2\2FG\7c\2\2GH\7v\2\2HI\7q\2\2IJ\7"+
		"o\2\2J\22\3\2\2\2KL\7q\2\2LM\7u\2\2MN\7e\2\2NO\7\u0080\2\2O\24\3\2\2\2"+
		"PQ\7f\2\2QR\7c\2\2RS\7e\2\2ST\7\u0080\2\2T\26\3\2\2\2UW\t\2\2\2VU\3\2"+
		"\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\30\3\2\2\2Z[\7q\2\2[\\\7d\2\2\\]\7"+
		"l\2\2]\32\3\2\2\2^_\7e\2\2_`\7c\2\2`a\7p\2\2ab\7x\2\2bc\7c\2\2cd\7u\2"+
		"\2d\34\3\2\2\2ef\7e\2\2fg\7q\2\2gh\7p\2\2hi\7p\2\2ij\7g\2\2jk\7e\2\2k"+
		"l\7v\2\2l\36\3\2\2\2mn\7o\2\2no\7u\2\2op\7i\2\2p \3\2\2\2qs\t\3\2\2rq"+
		"\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\21\2\2w\"\3\2\2\2"+
		"xz\7\17\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\f\2\2|$\3\2\2\2\n\2\60\65"+
		":?Xty\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}