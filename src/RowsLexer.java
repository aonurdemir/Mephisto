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
		T__3=1, T__2=2, T__1=3, T__0=4, DIVIDE=5, MULTIPLY=6, MINUS=7, PLUS=8, 
		FLOATATOM=9, OSC=10, DAC=11, INT=12, OBJ=13, CANVAS=14, CONNECT=15, MSG=16, 
		TAB=17, NL=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#N'", "'-'", "'#X'", "';'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'floatatom'", 
		"'osc~'", "'dac~'", "INT", "'obj'", "'canvas'", "'connect'", "'msg'", 
		"TAB", "NL"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", 
		"FLOATATOM", "OSC", "DAC", "INT", "OBJ", "CANVAS", "CONNECT", "MSG", "TAB", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5"+
		"\6\65\n\6\3\7\3\7\3\7\5\7:\n\7\3\b\3\b\3\b\5\b?\n\b\3\t\3\t\3\t\5\tD\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\6\r[\n\r\r\r\16\r\\\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\6\22w\n\22\r\22\16\22x\3\22\3\22\3\23\5\23~\n"+
		"\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\4\3\2\62;\4\2\13\13\"\"\u0087"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\3\'\3\2\2\2\5*\3\2\2\2\7,\3\2\2\2\t/\3\2\2\2\13\64\3\2"+
		"\2\2\r9\3\2\2\2\17>\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25O\3\2\2\2\27T\3"+
		"\2\2\2\31Z\3\2\2\2\33^\3\2\2\2\35b\3\2\2\2\37i\3\2\2\2!q\3\2\2\2#v\3\2"+
		"\2\2%}\3\2\2\2\'(\7%\2\2()\7P\2\2)\4\3\2\2\2*+\7/\2\2+\6\3\2\2\2,-\7%"+
		"\2\2-.\7Z\2\2.\b\3\2\2\2/\60\7=\2\2\60\n\3\2\2\2\61\65\7\61\2\2\62\63"+
		"\7\61\2\2\63\65\7\u0080\2\2\64\61\3\2\2\2\64\62\3\2\2\2\65\f\3\2\2\2\66"+
		":\7,\2\2\678\7,\2\28:\7\u0080\2\29\66\3\2\2\29\67\3\2\2\2:\16\3\2\2\2"+
		";?\7/\2\2<=\7/\2\2=?\7\u0080\2\2>;\3\2\2\2><\3\2\2\2?\20\3\2\2\2@D\7-"+
		"\2\2AB\7-\2\2BD\7\u0080\2\2C@\3\2\2\2CA\3\2\2\2D\22\3\2\2\2EF\7h\2\2F"+
		"G\7n\2\2GH\7q\2\2HI\7c\2\2IJ\7v\2\2JK\7c\2\2KL\7v\2\2LM\7q\2\2MN\7o\2"+
		"\2N\24\3\2\2\2OP\7q\2\2PQ\7u\2\2QR\7e\2\2RS\7\u0080\2\2S\26\3\2\2\2TU"+
		"\7f\2\2UV\7c\2\2VW\7e\2\2WX\7\u0080\2\2X\30\3\2\2\2Y[\t\2\2\2ZY\3\2\2"+
		"\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\32\3\2\2\2^_\7q\2\2_`\7d\2\2`a\7"+
		"l\2\2a\34\3\2\2\2bc\7e\2\2cd\7c\2\2de\7p\2\2ef\7x\2\2fg\7c\2\2gh\7u\2"+
		"\2h\36\3\2\2\2ij\7e\2\2jk\7q\2\2kl\7p\2\2lm\7p\2\2mn\7g\2\2no\7e\2\2o"+
		"p\7v\2\2p \3\2\2\2qr\7o\2\2rs\7u\2\2st\7i\2\2t\"\3\2\2\2uw\t\3\2\2vu\3"+
		"\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\22\2\2{$\3\2\2\2|~"+
		"\7\17\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\f\2\2\u0080&\3"+
		"\2\2\2\n\2\649>C\\x}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}