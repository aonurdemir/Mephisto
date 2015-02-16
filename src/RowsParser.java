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
		XOBJ=1, NOBJ=2, DIVIDE=3, MULTIPLY=4, MINUS=5, PLUS=6, GT=7, EXPR=8, FLOATATOM=9, 
		OSC=10, DAC=11, METRO=12, MOD=13, FCOUNTER=14, SIG=15, CLIP=16, BP=17, 
		HIP=18, LOP=19, OBJ=20, CANVAS=21, CONNECT=22, MSG=23, POW=24, INT=25, 
		FLOAT=26, DIGIT=27, TRIGGER=28, BANG=29, VAR=30, STRING=31, SEMICOLON=32, 
		LPAREN=33, RPAREN=34, TAB=35, NL=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'#X'", "'#N'", "DIVIDE", "MULTIPLY", "MINUS", "PLUS", "'>'", 
		"'expr'", "'floatatom'", "'osc~'", "'dac~'", "'metro'", "'mod'", "'fcounter'", 
		"'sig~'", "'clip~'", "'bp~'", "'hip~'", "'lop~'", "'obj'", "'canvas'", 
		"'connect'", "'msg'", "'pow'", "INT", "FLOAT", "DIGIT", "'trigger'", "'bng'", 
		"VAR", "STRING", "';'", "'('", "')'", "TAB", "NL"
	};
	public static final int
		RULE_file = 0, RULE_row = 1, RULE_expr = 2;
	public static final String[] ruleNames = {
		"file", "row", "expr"
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
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6); row();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==XOBJ || _la==NOBJ );
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
		public Token number;
		public TerminalNode CLIP() { return getToken(RowsParser.CLIP, 0); }
		public TerminalNode STRING(int i) {
			return getToken(RowsParser.STRING, i);
		}
		public TerminalNode CANVAS() { return getToken(RowsParser.CANVAS, 0); }
		public List<TerminalNode> INT() { return getTokens(RowsParser.INT); }
		public TerminalNode SIG() { return getToken(RowsParser.SIG, 0); }
		public TerminalNode MSG() { return getToken(RowsParser.MSG, 0); }
		public TerminalNode LOP() { return getToken(RowsParser.LOP, 0); }
		public TerminalNode INT(int i) {
			return getToken(RowsParser.INT, i);
		}
		public TerminalNode DIVIDE() { return getToken(RowsParser.DIVIDE, 0); }
		public TerminalNode HIP() { return getToken(RowsParser.HIP, 0); }
		public TerminalNode NL(int i) {
			return getToken(RowsParser.NL, i);
		}
		public TerminalNode XOBJ() { return getToken(RowsParser.XOBJ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode FLOAT(int i) {
			return getToken(RowsParser.FLOAT, i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OBJ() { return getToken(RowsParser.OBJ, 0); }
		public TerminalNode PLUS() { return getToken(RowsParser.PLUS, 0); }
		public TerminalNode OSC() { return getToken(RowsParser.OSC, 0); }
		public List<TerminalNode> NL() { return getTokens(RowsParser.NL); }
		public TerminalNode SEMICOLON() { return getToken(RowsParser.SEMICOLON, 0); }
		public TerminalNode FLOATATOM() { return getToken(RowsParser.FLOATATOM, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(RowsParser.FLOAT); }
		public TerminalNode BP() { return getToken(RowsParser.BP, 0); }
		public TerminalNode BANG() { return getToken(RowsParser.BANG, 0); }
		public List<TerminalNode> MINUS() { return getTokens(RowsParser.MINUS); }
		public TerminalNode MULTIPLY() { return getToken(RowsParser.MULTIPLY, 0); }
		public TerminalNode EXPR() { return getToken(RowsParser.EXPR, 0); }
		public TerminalNode METRO() { return getToken(RowsParser.METRO, 0); }
		public TerminalNode TRIGGER() { return getToken(RowsParser.TRIGGER, 0); }
		public TerminalNode MINUS(int i) {
			return getToken(RowsParser.MINUS, i);
		}
		public TerminalNode NOBJ() { return getToken(RowsParser.NOBJ, 0); }
		public TerminalNode DAC() { return getToken(RowsParser.DAC, 0); }
		public TerminalNode CONNECT() { return getToken(RowsParser.CONNECT, 0); }
		public TerminalNode FCOUNTER() { return getToken(RowsParser.FCOUNTER, 0); }
		public TerminalNode GT() { return getToken(RowsParser.GT, 0); }
		public List<TerminalNode> STRING() { return getTokens(RowsParser.STRING); }
		public TerminalNode MOD() { return getToken(RowsParser.MOD, 0); }
		public TerminalNode POW() { return getToken(RowsParser.POW, 0); }
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
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11); match(XOBJ);
				setState(12); ((RowContext)_localctx).type = match(CONNECT);
				setState(14);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(13); match(INT);
					}
					break;
				}
				setState(17);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(16); match(INT);
					}
					break;
				}
				setState(20);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(19); match(INT);
					}
					break;
				}
				setState(23);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(22); match(INT);
					}
				}

				setState(25); match(SEMICOLON);
				setState(26); match(NL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); match(XOBJ);
				setState(28); ((RowContext)_localctx).type = match(OBJ);
				setState(29); match(INT);
				setState(30); match(INT);
				setState(31); ((RowContext)_localctx).name = match(OSC);
				setState(33);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(32); match(INT);
					}
				}

				setState(35); match(SEMICOLON);
				setState(36); match(NL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37); match(XOBJ);
				setState(38); ((RowContext)_localctx).type = match(OBJ);
				setState(39); match(INT);
				setState(40); match(INT);
				setState(41); ((RowContext)_localctx).name = match(DAC);
				setState(42); match(SEMICOLON);
				setState(43); match(NL);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44); match(NOBJ);
				setState(45); ((RowContext)_localctx).type = match(CANVAS);
				setState(47);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(46); match(INT);
					}
					break;
				}
				setState(50);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(49); match(INT);
					}
					break;
				}
				setState(53);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(52); match(INT);
					}
					break;
				}
				setState(56);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(55); match(INT);
					}
					break;
				}
				setState(59);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(58); match(INT);
					}
				}

				setState(61); match(SEMICOLON);
				setState(62); match(NL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63); match(XOBJ);
				setState(64); ((RowContext)_localctx).type = match(FLOATATOM);
				setState(66);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(65); match(INT);
					}
					break;
				}
				setState(69);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(68); match(INT);
					}
					break;
				}
				setState(72);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(71); match(INT);
					}
					break;
				}
				setState(75);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(74); match(INT);
					}
					break;
				}
				setState(78);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(77); match(INT);
					}
					break;
				}
				setState(81);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(80); match(INT);
					}
				}

				setState(83); match(MINUS);
				setState(84); match(MINUS);
				setState(85); match(MINUS);
				setState(86); match(SEMICOLON);
				setState(87); match(NL);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88); match(XOBJ);
				setState(89); ((RowContext)_localctx).type = match(OBJ);
				setState(90); match(INT);
				setState(91); match(INT);
				setState(92); ((RowContext)_localctx).name = match(PLUS);
				setState(94);
				_la = _input.LA(1);
				if (_la==INT || _la==FLOAT) {
					{
					setState(93);
					((RowContext)_localctx).number = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
						((RowContext)_localctx).number = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(96); match(SEMICOLON);
				setState(97); match(NL);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98); match(XOBJ);
				setState(99); ((RowContext)_localctx).type = match(OBJ);
				setState(100); match(INT);
				setState(101); match(INT);
				setState(102); ((RowContext)_localctx).name = match(MINUS);
				setState(104);
				_la = _input.LA(1);
				if (_la==INT || _la==FLOAT) {
					{
					setState(103);
					((RowContext)_localctx).number = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
						((RowContext)_localctx).number = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(106); match(SEMICOLON);
				setState(107); match(NL);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108); match(XOBJ);
				setState(109); ((RowContext)_localctx).type = match(OBJ);
				setState(110); match(INT);
				setState(111); match(INT);
				setState(112); ((RowContext)_localctx).name = match(MULTIPLY);
				setState(114);
				_la = _input.LA(1);
				if (_la==INT || _la==FLOAT) {
					{
					setState(113);
					((RowContext)_localctx).number = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
						((RowContext)_localctx).number = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(116); match(SEMICOLON);
				setState(117); match(NL);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(118); match(XOBJ);
				setState(119); ((RowContext)_localctx).type = match(OBJ);
				setState(120); match(INT);
				setState(121); match(INT);
				setState(122); ((RowContext)_localctx).name = match(DIVIDE);
				setState(124);
				_la = _input.LA(1);
				if (_la==INT || _la==FLOAT) {
					{
					setState(123);
					((RowContext)_localctx).number = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
						((RowContext)_localctx).number = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(126); match(SEMICOLON);
				setState(127); match(NL);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(128); match(XOBJ);
				setState(129); ((RowContext)_localctx).type = match(OBJ);
				setState(130); match(INT);
				setState(131); match(INT);
				setState(132); ((RowContext)_localctx).name = match(POW);
				setState(134);
				_la = _input.LA(1);
				if (_la==INT || _la==FLOAT) {
					{
					setState(133);
					((RowContext)_localctx).number = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
						((RowContext)_localctx).number = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(136); match(SEMICOLON);
				setState(137); match(NL);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(138); match(XOBJ);
				setState(139); ((RowContext)_localctx).type = match(OBJ);
				setState(140); match(INT);
				setState(141); match(INT);
				setState(142); ((RowContext)_localctx).name = match(TRIGGER);
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0) );
				setState(148); match(SEMICOLON);
				setState(149); match(NL);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(150); match(XOBJ);
				setState(151); ((RowContext)_localctx).type = match(OBJ);
				setState(152); match(INT);
				setState(153); match(INT);
				setState(154); ((RowContext)_localctx).name = match(BANG);
				setState(155); match(INT);
				setState(156); match(INT);
				setState(157); match(INT);
				setState(158); match(INT);
				setState(159); match(STRING);
				setState(160); match(STRING);
				setState(161); match(STRING);
				setState(162); match(INT);
				setState(163); match(INT);
				setState(164); match(INT);
				setState(165); match(INT);
				setState(166); expr(0);
				setState(167); expr(0);
				setState(168); match(NL);
				setState(169); expr(0);
				setState(170); match(SEMICOLON);
				setState(171); match(NL);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(173); match(XOBJ);
				setState(174); ((RowContext)_localctx).type = match(OBJ);
				setState(175); match(INT);
				setState(176); match(INT);
				setState(177); ((RowContext)_localctx).name = match(EXPR);
				setState(178); expr(0);
				setState(179); match(SEMICOLON);
				setState(180); match(NL);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(182); match(XOBJ);
				setState(183); ((RowContext)_localctx).type = match(MSG);
				setState(184); match(INT);
				setState(185); match(INT);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT || _la==FLOAT) {
					{
					{
					setState(186);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192); match(SEMICOLON);
				setState(193); match(NL);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(194); match(XOBJ);
				setState(195); ((RowContext)_localctx).type = match(OBJ);
				setState(196); match(INT);
				setState(197); match(INT);
				setState(198); ((RowContext)_localctx).name = match(METRO);
				setState(199); match(INT);
				setState(200); match(SEMICOLON);
				setState(201); match(NL);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(202); match(XOBJ);
				setState(203); ((RowContext)_localctx).type = match(OBJ);
				setState(204); match(INT);
				setState(205); match(INT);
				setState(206); ((RowContext)_localctx).name = match(FCOUNTER);
				setState(207); match(SEMICOLON);
				setState(208); match(NL);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(209); match(XOBJ);
				setState(210); ((RowContext)_localctx).type = match(OBJ);
				setState(211); match(INT);
				setState(212); match(INT);
				setState(213); ((RowContext)_localctx).name = match(MOD);
				setState(214); match(INT);
				setState(215); match(SEMICOLON);
				setState(216); match(NL);
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(217); match(XOBJ);
				setState(218); ((RowContext)_localctx).type = match(OBJ);
				setState(219); match(INT);
				setState(220); match(INT);
				setState(221); ((RowContext)_localctx).name = match(CLIP);
				setState(222); expr(0);
				setState(223); expr(0);
				setState(224); match(SEMICOLON);
				setState(225); match(NL);
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(227); match(XOBJ);
				setState(228); ((RowContext)_localctx).type = match(OBJ);
				setState(229); match(INT);
				setState(230); match(INT);
				setState(231); ((RowContext)_localctx).name = match(BP);
				setState(232); expr(0);
				setState(233); expr(0);
				setState(234); match(SEMICOLON);
				setState(235); match(NL);
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(237); match(XOBJ);
				setState(238); ((RowContext)_localctx).type = match(OBJ);
				setState(239); match(INT);
				setState(240); match(INT);
				setState(241); ((RowContext)_localctx).name = match(HIP);
				setState(243);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << INT) | (1L << FLOAT) | (1L << VAR) | (1L << LPAREN))) != 0)) {
					{
					setState(242); expr(0);
					}
				}

				setState(245); match(SEMICOLON);
				setState(246); match(NL);
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(247); match(XOBJ);
				setState(248); ((RowContext)_localctx).type = match(OBJ);
				setState(249); match(INT);
				setState(250); match(INT);
				setState(251); ((RowContext)_localctx).name = match(LOP);
				setState(253);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << INT) | (1L << FLOAT) | (1L << VAR) | (1L << LPAREN))) != 0)) {
					{
					setState(252); expr(0);
					}
				}

				setState(255); match(SEMICOLON);
				setState(256); match(NL);
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(257); match(XOBJ);
				setState(258); ((RowContext)_localctx).type = match(OBJ);
				setState(259); match(INT);
				setState(260); match(INT);
				setState(261); ((RowContext)_localctx).name = match(GT);
				setState(263);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << INT) | (1L << FLOAT) | (1L << VAR) | (1L << LPAREN))) != 0)) {
					{
					setState(262); expr(0);
					}
				}

				setState(265); match(SEMICOLON);
				setState(266); match(NL);
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(267); match(XOBJ);
				setState(268); ((RowContext)_localctx).type = match(OBJ);
				setState(269); match(INT);
				setState(270); match(INT);
				setState(271); ((RowContext)_localctx).name = match(SIG);
				setState(273);
				_la = _input.LA(1);
				if (_la==INT || _la==FLOAT) {
					{
					setState(272);
					((RowContext)_localctx).number = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==FLOAT) ) {
						((RowContext)_localctx).number = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(275); match(SEMICOLON);
				setState(276); match(NL);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(RowsParser.MINUS, 0); }
		public MinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).exitMinus(this);
		}
	}
	public static class ParenContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RowsParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(RowsParser.LPAREN, 0); }
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).exitParen(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(RowsParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(RowsParser.DIVIDE, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).exitMulDiv(this);
		}
	}
	public static class SingleContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(RowsParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(RowsParser.INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode MINUS() { return getToken(RowsParser.MINUS, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode VAR() { return getToken(RowsParser.VAR, 0); }
		public TerminalNode PLUS() { return getToken(RowsParser.PLUS, 0); }
		public SingleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RowsListener ) ((RowsListener)listener).exitSingle(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new MinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(280); match(MINUS);
				setState(281); expr(2);
				}
				break;
			case INT:
			case FLOAT:
			case VAR:
				{
				_localctx = new SingleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << VAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283); match(LPAREN);
				setState(284); expr(0);
				setState(285); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(290);
						_la = _input.LA(1);
						if ( !(_la==DIVIDE || _la==MULTIPLY) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(291); expr(5);
						}
						break;

					case 2:
						{
						_localctx = new SingleContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(293);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(294); expr(4);
						}
						break;
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);

		case 1: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u012f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\5\3\21\n\3\3\3\5"+
		"\3\24\n\3\3\3\5\3\27\n\3\3\3\5\3\32\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3$\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\3\5\3\65\n\3\3\3\5\38\n\3\3\3\5\3;\n\3\3\3\5\3>\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3E\n\3\3\3\5\3H\n\3\3\3\5\3K\n\3\3\3\5\3N\n\3\3\3\5\3Q\n\3\3\3"+
		"\5\3T\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3k\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"u\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\177\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u0089\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\u0093\n"+
		"\3\r\3\16\3\u0094\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00be\n\3\f\3\16\3\u00c1\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00f6"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0100\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u010a\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0114\n"+
		"\3\3\3\3\3\5\3\u0118\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0122\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u012a\n\4\f\4\16\4\u012d\13\4\3\4\2\3\6\5"+
		"\2\4\6\2\7\3\2\33\34\4\2\33\34!!\4\2\33\34  \3\2\5\6\3\2\7\b\u0161\2\t"+
		"\3\2\2\2\4\u0117\3\2\2\2\6\u0121\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13"+
		"\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\7\3\2\2\16\20\7\30"+
		"\2\2\17\21\7\33\2\2\20\17\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\24\7"+
		"\33\2\2\23\22\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\27\7\33\2\2\26\25"+
		"\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\32\7\33\2\2\31\30\3\2\2\2\31\32"+
		"\3\2\2\2\32\33\3\2\2\2\33\34\7\"\2\2\34\u0118\7&\2\2\35\36\7\3\2\2\36"+
		"\37\7\26\2\2\37 \7\33\2\2 !\7\33\2\2!#\7\f\2\2\"$\7\33\2\2#\"\3\2\2\2"+
		"#$\3\2\2\2$%\3\2\2\2%&\7\"\2\2&\u0118\7&\2\2\'(\7\3\2\2()\7\26\2\2)*\7"+
		"\33\2\2*+\7\33\2\2+,\7\r\2\2,-\7\"\2\2-\u0118\7&\2\2./\7\4\2\2/\61\7\27"+
		"\2\2\60\62\7\33\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\65\7"+
		"\33\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\668\7\33\2\2\67\66\3"+
		"\2\2\2\678\3\2\2\28:\3\2\2\29;\7\33\2\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2"+
		"<>\7\33\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\"\2\2@\u0118\7&\2\2AB\7"+
		"\3\2\2BD\7\13\2\2CE\7\33\2\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\7\33\2\2"+
		"GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\7\33\2\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2"+
		"\2LN\7\33\2\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\7\33\2\2PO\3\2\2\2PQ\3\2"+
		"\2\2QS\3\2\2\2RT\7\33\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\7\2\2VW\7"+
		"\7\2\2WX\7\7\2\2XY\7\"\2\2Y\u0118\7&\2\2Z[\7\3\2\2[\\\7\26\2\2\\]\7\33"+
		"\2\2]^\7\33\2\2^`\7\b\2\2_a\t\2\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7"+
		"\"\2\2c\u0118\7&\2\2de\7\3\2\2ef\7\26\2\2fg\7\33\2\2gh\7\33\2\2hj\7\7"+
		"\2\2ik\t\2\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\"\2\2m\u0118\7&\2\2n"+
		"o\7\3\2\2op\7\26\2\2pq\7\33\2\2qr\7\33\2\2rt\7\6\2\2su\t\2\2\2ts\3\2\2"+
		"\2tu\3\2\2\2uv\3\2\2\2vw\7\"\2\2w\u0118\7&\2\2xy\7\3\2\2yz\7\26\2\2z{"+
		"\7\33\2\2{|\7\33\2\2|~\7\5\2\2}\177\t\2\2\2~}\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\7\"\2\2\u0081\u0118\7&\2\2\u0082\u0083\7\3"+
		"\2\2\u0083\u0084\7\26\2\2\u0084\u0085\7\33\2\2\u0085\u0086\7\33\2\2\u0086"+
		"\u0088\7\32\2\2\u0087\u0089\t\2\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\"\2\2\u008b\u0118\7&\2\2\u008c"+
		"\u008d\7\3\2\2\u008d\u008e\7\26\2\2\u008e\u008f\7\33\2\2\u008f\u0090\7"+
		"\33\2\2\u0090\u0092\7\36\2\2\u0091\u0093\t\3\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7\"\2\2\u0097\u0118\7&\2\2\u0098\u0099\7\3\2\2\u0099"+
		"\u009a\7\26\2\2\u009a\u009b\7\33\2\2\u009b\u009c\7\33\2\2\u009c\u009d"+
		"\7\37\2\2\u009d\u009e\7\33\2\2\u009e\u009f\7\33\2\2\u009f\u00a0\7\33\2"+
		"\2\u00a0\u00a1\7\33\2\2\u00a1\u00a2\7!\2\2\u00a2\u00a3\7!\2\2\u00a3\u00a4"+
		"\7!\2\2\u00a4\u00a5\7\33\2\2\u00a5\u00a6\7\33\2\2\u00a6\u00a7\7\33\2\2"+
		"\u00a7\u00a8\7\33\2\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa\5\6\4\2\u00aa\u00ab"+
		"\7&\2\2\u00ab\u00ac\5\6\4\2\u00ac\u00ad\7\"\2\2\u00ad\u00ae\7&\2\2\u00ae"+
		"\u0118\3\2\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2\7"+
		"\33\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\7\n\2\2\u00b4\u00b5\5\6\4\2\u00b5"+
		"\u00b6\7\"\2\2\u00b6\u00b7\7&\2\2\u00b7\u0118\3\2\2\2\u00b8\u00b9\7\3"+
		"\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\7\33\2\2\u00bb\u00bf\7\33\2\2\u00bc"+
		"\u00be\t\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\7\"\2\2\u00c3\u0118\7&\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6\7\26"+
		"\2\2\u00c6\u00c7\7\33\2\2\u00c7\u00c8\7\33\2\2\u00c8\u00c9\7\16\2\2\u00c9"+
		"\u00ca\7\33\2\2\u00ca\u00cb\7\"\2\2\u00cb\u0118\7&\2\2\u00cc\u00cd\7\3"+
		"\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\7\33\2\2\u00cf\u00d0\7\33\2\2\u00d0"+
		"\u00d1\7\20\2\2\u00d1\u00d2\7\"\2\2\u00d2\u0118\7&\2\2\u00d3\u00d4\7\3"+
		"\2\2\u00d4\u00d5\7\26\2\2\u00d5\u00d6\7\33\2\2\u00d6\u00d7\7\33\2\2\u00d7"+
		"\u00d8\7\17\2\2\u00d8\u00d9\7\33\2\2\u00d9\u00da\7\"\2\2\u00da\u0118\7"+
		"&\2\2\u00db\u00dc\7\3\2\2\u00dc\u00dd\7\26\2\2\u00dd\u00de\7\33\2\2\u00de"+
		"\u00df\7\33\2\2\u00df\u00e0\7\22\2\2\u00e0\u00e1\5\6\4\2\u00e1\u00e2\5"+
		"\6\4\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\7&\2\2\u00e4\u0118\3\2\2\2\u00e5"+
		"\u00e6\7\3\2\2\u00e6\u00e7\7\26\2\2\u00e7\u00e8\7\33\2\2\u00e8\u00e9\7"+
		"\33\2\2\u00e9\u00ea\7\23\2\2\u00ea\u00eb\5\6\4\2\u00eb\u00ec\5\6\4\2\u00ec"+
		"\u00ed\7\"\2\2\u00ed\u00ee\7&\2\2\u00ee\u0118\3\2\2\2\u00ef\u00f0\7\3"+
		"\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\7\33\2\2\u00f2\u00f3\7\33\2\2\u00f3"+
		"\u00f5\7\24\2\2\u00f4\u00f6\5\6\4\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\"\2\2\u00f8\u0118\7&\2\2\u00f9"+
		"\u00fa\7\3\2\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc\7\33\2\2\u00fc\u00fd\7"+
		"\33\2\2\u00fd\u00ff\7\25\2\2\u00fe\u0100\5\6\4\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\"\2\2\u0102\u0118\7&"+
		"\2\2\u0103\u0104\7\3\2\2\u0104\u0105\7\26\2\2\u0105\u0106\7\33\2\2\u0106"+
		"\u0107\7\33\2\2\u0107\u0109\7\t\2\2\u0108\u010a\5\6\4\2\u0109\u0108\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7\"\2\2\u010c"+
		"\u0118\7&\2\2\u010d\u010e\7\3\2\2\u010e\u010f\7\26\2\2\u010f\u0110\7\33"+
		"\2\2\u0110\u0111\7\33\2\2\u0111\u0113\7\21\2\2\u0112\u0114\t\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7\""+
		"\2\2\u0116\u0118\7&\2\2\u0117\r\3\2\2\2\u0117\35\3\2\2\2\u0117\'\3\2\2"+
		"\2\u0117.\3\2\2\2\u0117A\3\2\2\2\u0117Z\3\2\2\2\u0117d\3\2\2\2\u0117n"+
		"\3\2\2\2\u0117x\3\2\2\2\u0117\u0082\3\2\2\2\u0117\u008c\3\2\2\2\u0117"+
		"\u0098\3\2\2\2\u0117\u00af\3\2\2\2\u0117\u00b8\3\2\2\2\u0117\u00c4\3\2"+
		"\2\2\u0117\u00cc\3\2\2\2\u0117\u00d3\3\2\2\2\u0117\u00db\3\2\2\2\u0117"+
		"\u00e5\3\2\2\2\u0117\u00ef\3\2\2\2\u0117\u00f9\3\2\2\2\u0117\u0103\3\2"+
		"\2\2\u0117\u010d\3\2\2\2\u0118\5\3\2\2\2\u0119\u011a\b\4\1\2\u011a\u011b"+
		"\7\7\2\2\u011b\u0122\5\6\4\4\u011c\u0122\t\4\2\2\u011d\u011e\7#\2\2\u011e"+
		"\u011f\5\6\4\2\u011f\u0120\7$\2\2\u0120\u0122\3\2\2\2\u0121\u0119\3\2"+
		"\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0122\u012b\3\2\2\2\u0123"+
		"\u0124\f\6\2\2\u0124\u0125\t\5\2\2\u0125\u012a\5\6\4\7\u0126\u0127\f\5"+
		"\2\2\u0127\u0128\t\6\2\2\u0128\u012a\5\6\4\6\u0129\u0123\3\2\2\2\u0129"+
		"\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\7\3\2\2\2\u012d\u012b\3\2\2\2\"\13\20\23\26\31#\61\64\67:="+
		"DGJMPS`jt~\u0088\u0094\u00bf\u00f5\u00ff\u0109\u0113\u0117\u0121\u0129"+
		"\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}