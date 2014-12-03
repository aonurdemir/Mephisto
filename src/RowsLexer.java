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
		OSC=9, DAC=10, INT=11, OBJ=12, CANVAS=13, CONNECT=14, TAB=15, NL=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'#N'", "'#X'", "';'", "'/'", "'*'", "'-'", "'+'", "'floatatom'", "'osc~'", 
		"'dac~'", "INT", "'obj'", "'canvas'", "'connect'", "TAB", "NL"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "FLOATATOM", 
		"OSC", "DAC", "INT", "OBJ", "CANVAS", "CONNECT", "TAB", "NL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\6\fI\n\f\r\f\16\fJ\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20a\n\20\r\20\16"+
		"\20b\3\20\3\20\3\21\5\21h\n\21\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\4\3\2\62"+
		";\4\2\13\13\"\"m\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\3#\3\2\2\2\5&\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3"+
		"\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23=\3\2\2\2\25B\3\2\2\2\27H\3\2\2\2"+
		"\31L\3\2\2\2\33P\3\2\2\2\35W\3\2\2\2\37`\3\2\2\2!g\3\2\2\2#$\7%\2\2$%"+
		"\7P\2\2%\4\3\2\2\2&\'\7%\2\2\'(\7Z\2\2(\6\3\2\2\2)*\7=\2\2*\b\3\2\2\2"+
		"+,\7\61\2\2,\n\3\2\2\2-.\7,\2\2.\f\3\2\2\2/\60\7/\2\2\60\16\3\2\2\2\61"+
		"\62\7-\2\2\62\20\3\2\2\2\63\64\7h\2\2\64\65\7n\2\2\65\66\7q\2\2\66\67"+
		"\7c\2\2\678\7v\2\289\7c\2\29:\7v\2\2:;\7q\2\2;<\7o\2\2<\22\3\2\2\2=>\7"+
		"q\2\2>?\7u\2\2?@\7e\2\2@A\7\u0080\2\2A\24\3\2\2\2BC\7f\2\2CD\7c\2\2DE"+
		"\7e\2\2EF\7\u0080\2\2F\26\3\2\2\2GI\t\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2"+
		"\2\2JK\3\2\2\2K\30\3\2\2\2LM\7q\2\2MN\7d\2\2NO\7l\2\2O\32\3\2\2\2PQ\7"+
		"e\2\2QR\7c\2\2RS\7p\2\2ST\7x\2\2TU\7c\2\2UV\7u\2\2V\34\3\2\2\2WX\7e\2"+
		"\2XY\7q\2\2YZ\7p\2\2Z[\7p\2\2[\\\7g\2\2\\]\7e\2\2]^\7v\2\2^\36\3\2\2\2"+
		"_a\t\3\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\20\2"+
		"\2e \3\2\2\2fh\7\17\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\f\2\2j\"\3\2"+
		"\2\2\6\2Jbg\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}