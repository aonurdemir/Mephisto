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
		OSC=9, DAC=10, INT=11, OBJ=12, CANVAS=13, CONNECT=14, MSG=15, POW=16, 
		TAB=17, NL=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#N'", "'#X'", "';'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'floatatom'", 
		"'osc~'", "'dac~'", "INT", "'obj'", "'canvas'", "'connect'", "'msg'", 
		"'pow'", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "FLOATATOM", 
		"OSC", "DAC", "INT", "OBJ", "CANVAS", "CONNECT", "MSG", "POW", "TAB", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\5\5\63\n\5"+
		"\3\6\3\6\3\6\5\68\n\6\3\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\5\bB\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\6\fY\n\f\r\f\16\fZ\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\6\22y\n\22\r\22\16\22z\3\22\3\22\3\23\5"+
		"\23\u0080\n\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\4\3\2\62;\4\2\13"+
		"\13\"\"\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5*\3\2\2\2\7-\3\2\2\2\t\62\3\2"+
		"\2\2\13\67\3\2\2\2\r<\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23M\3\2\2\2\25R"+
		"\3\2\2\2\27X\3\2\2\2\31\\\3\2\2\2\33`\3\2\2\2\35g\3\2\2\2\37o\3\2\2\2"+
		"!s\3\2\2\2#x\3\2\2\2%\177\3\2\2\2\'(\7%\2\2()\7P\2\2)\4\3\2\2\2*+\7%\2"+
		"\2+,\7Z\2\2,\6\3\2\2\2-.\7=\2\2.\b\3\2\2\2/\63\7\61\2\2\60\61\7\61\2\2"+
		"\61\63\7\u0080\2\2\62/\3\2\2\2\62\60\3\2\2\2\63\n\3\2\2\2\648\7,\2\2\65"+
		"\66\7,\2\2\668\7\u0080\2\2\67\64\3\2\2\2\67\65\3\2\2\28\f\3\2\2\29=\7"+
		"/\2\2:;\7/\2\2;=\7\u0080\2\2<9\3\2\2\2<:\3\2\2\2=\16\3\2\2\2>B\7-\2\2"+
		"?@\7-\2\2@B\7\u0080\2\2A>\3\2\2\2A?\3\2\2\2B\20\3\2\2\2CD\7h\2\2DE\7n"+
		"\2\2EF\7q\2\2FG\7c\2\2GH\7v\2\2HI\7c\2\2IJ\7v\2\2JK\7q\2\2KL\7o\2\2L\22"+
		"\3\2\2\2MN\7q\2\2NO\7u\2\2OP\7e\2\2PQ\7\u0080\2\2Q\24\3\2\2\2RS\7f\2\2"+
		"ST\7c\2\2TU\7e\2\2UV\7\u0080\2\2V\26\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\30\3\2\2\2\\]\7q\2\2]^\7d\2\2^_\7l\2\2_\32\3"+
		"\2\2\2`a\7e\2\2ab\7c\2\2bc\7p\2\2cd\7x\2\2de\7c\2\2ef\7u\2\2f\34\3\2\2"+
		"\2gh\7e\2\2hi\7q\2\2ij\7p\2\2jk\7p\2\2kl\7g\2\2lm\7e\2\2mn\7v\2\2n\36"+
		"\3\2\2\2op\7o\2\2pq\7u\2\2qr\7i\2\2r \3\2\2\2st\7r\2\2tu\7q\2\2uv\7y\2"+
		"\2v\"\3\2\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2"+
		"\2\2|}\b\22\2\2}$\3\2\2\2~\u0080\7\17\2\2\177~\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0082\7\f\2\2\u0082&\3\2\2\2\n\2\62\67<A"+
		"Zz\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}