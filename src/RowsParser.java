// Generated from Rows.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RowsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, PLUS=5, FLOATATOM=6, OSC=7, DAC=8, INT=9, 
		OBJ=10, CANVAS=11, CONNECT=12, TAB=13, NL=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'#N'", "'-'", "'#X'", "';'", "'+'", "'floatatom'", "'osc~'", 
		"'dac~'", "INT", "'obj'", "'canvas'", "'connect'", "TAB", "NL"
	};
	public static final int
		RULE_file = 0, RULE_row = 1;
	public static final String[] ruleNames = {
		"file", "row"
	};

	@Override
	public String getGrammarFileName() { return "Rows.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RowsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4); row();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==1 || _la==3 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public TerminalNode NL() { return getToken(RowsParser.NL, 0); }
		public TerminalNode FLOATATOM() { return getToken(RowsParser.FLOATATOM, 0); }
		public TerminalNode DAC() { return getToken(RowsParser.DAC, 0); }
		public TerminalNode CANVAS() { return getToken(RowsParser.CANVAS, 0); }
		public List<TerminalNode> INT() { return getTokens(RowsParser.INT); }
		public TerminalNode OBJ() { return getToken(RowsParser.OBJ, 0); }
		public TerminalNode CONNECT() { return getToken(RowsParser.CONNECT, 0); }
		public TerminalNode PLUS() { return getToken(RowsParser.PLUS, 0); }
		public TerminalNode INT(int i) {
			return getToken(RowsParser.INT, i);
		}
		public TerminalNode OSC() { return getToken(RowsParser.OSC, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_row);
		int _la;
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(9); match(3);
				setState(10); ((RowContext)_localctx).type = match(CONNECT);
				setState(12);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(11); match(INT);
					}
					break;
				}
				setState(15);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(14); match(INT);
					}
					break;
				}
				setState(18);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(17); match(INT);
					}
					break;
				}
				setState(21);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(20); match(INT);
					}
				}

				setState(23); match(4);
				setState(24); match(NL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25); match(3);
				setState(26); ((RowContext)_localctx).type = match(OBJ);
				setState(27); match(INT);
				setState(28); match(INT);
				setState(29); ((RowContext)_localctx).name = match(OSC);
				setState(31);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(30); match(INT);
					}
				}

				setState(33); match(4);
				setState(34); match(NL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35); match(3);
				setState(36); ((RowContext)_localctx).type = match(OBJ);
				setState(37); match(INT);
				setState(38); match(INT);
				setState(39); ((RowContext)_localctx).name = match(DAC);
				setState(40); match(4);
				setState(41); match(NL);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42); match(1);
				setState(43); ((RowContext)_localctx).type = match(CANVAS);
				setState(45);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(44); match(INT);
					}
					break;
				}
				setState(48);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(47); match(INT);
					}
					break;
				}
				setState(51);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(50); match(INT);
					}
					break;
				}
				setState(54);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(53); match(INT);
					}
					break;
				}
				setState(57);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(56); match(INT);
					}
				}

				setState(59); match(4);
				setState(60); match(NL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61); match(3);
				setState(62); ((RowContext)_localctx).type = match(FLOATATOM);
				setState(64);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(63); match(INT);
					}
					break;
				}
				setState(67);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(66); match(INT);
					}
					break;
				}
				setState(70);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(69); match(INT);
					}
					break;
				}
				setState(73);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(72); match(INT);
					}
					break;
				}
				setState(76);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(75); match(INT);
					}
					break;
				}
				setState(79);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(78); match(INT);
					}
				}

				setState(81); match(2);
				setState(82); match(2);
				setState(83); match(2);
				setState(84); match(4);
				setState(85); match(NL);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86); match(3);
				setState(87); ((RowContext)_localctx).type = match(OBJ);
				setState(88); match(INT);
				setState(89); match(INT);
				setState(90); ((RowContext)_localctx).name = match(PLUS);
				setState(92);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(91); match(INT);
					}
				}

				setState(94); match(4);
				setState(95); match(NL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20e\4\2\t\2\4\3\t"+
		"\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\5\3\17\n\3\3\3\5\3\22\n\3\3\3"+
		"\5\3\25\n\3\3\3\5\3\30\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\3\5\3\63\n"+
		"\3\3\3\5\3\66\n\3\3\3\5\39\n\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\5\3C\n"+
		"\3\3\3\5\3F\n\3\3\3\5\3I\n\3\3\3\5\3L\n\3\3\3\5\3O\n\3\3\3\5\3R\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3_\n\3\3\3\3\3\5\3c\n\3\3"+
		"\3\2\2\4\2\4\2\2y\2\7\3\2\2\2\4b\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3"+
		"\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2\2\2\13\f\7\5\2\2\f\16\7\16\2\2"+
		"\r\17\7\13\2\2\16\r\3\2\2\2\16\17\3\2\2\2\17\21\3\2\2\2\20\22\7\13\2\2"+
		"\21\20\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\25\7\13\2\2\24\23\3\2\2"+
		"\2\24\25\3\2\2\2\25\27\3\2\2\2\26\30\7\13\2\2\27\26\3\2\2\2\27\30\3\2"+
		"\2\2\30\31\3\2\2\2\31\32\7\6\2\2\32c\7\20\2\2\33\34\7\5\2\2\34\35\7\f"+
		"\2\2\35\36\7\13\2\2\36\37\7\13\2\2\37!\7\t\2\2 \"\7\13\2\2! \3\2\2\2!"+
		"\"\3\2\2\2\"#\3\2\2\2#$\7\6\2\2$c\7\20\2\2%&\7\5\2\2&\'\7\f\2\2\'(\7\13"+
		"\2\2()\7\13\2\2)*\7\n\2\2*+\7\6\2\2+c\7\20\2\2,-\7\3\2\2-/\7\r\2\2.\60"+
		"\7\13\2\2/.\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61\63\7\13\2\2\62\61\3\2"+
		"\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\7\13\2\2\65\64\3\2\2\2\65\66\3"+
		"\2\2\2\668\3\2\2\2\679\7\13\2\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\7\13"+
		"\2\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\6\2\2>c\7\20\2\2?@\7\5\2\2@B\7"+
		"\b\2\2AC\7\13\2\2BA\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\7\13\2\2ED\3\2\2\2E"+
		"F\3\2\2\2FH\3\2\2\2GI\7\13\2\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\7\13\2"+
		"\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\7\13\2\2NM\3\2\2\2NO\3\2\2\2OQ\3\2"+
		"\2\2PR\7\13\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\4\2\2TU\7\4\2\2UV\7"+
		"\4\2\2VW\7\6\2\2Wc\7\20\2\2XY\7\5\2\2YZ\7\f\2\2Z[\7\13\2\2[\\\7\13\2\2"+
		"\\^\7\7\2\2]_\7\13\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\6\2\2ac\7\20"+
		"\2\2b\13\3\2\2\2b\33\3\2\2\2b%\3\2\2\2b,\3\2\2\2b?\3\2\2\2bX\3\2\2\2c"+
		"\5\3\2\2\2\25\t\16\21\24\27!/\62\658;BEHKNQ^b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}