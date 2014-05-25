// Generated from /home/madis/git/tiiger/src/Tiigrikeel.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TiigrikeelParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, Tõeväärtus=27, MuutujaNimi=28, Täisarv=29, Komaga=30, 
		Sõne=31, Kommentaar=32, Whitespace=33;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'\n'", "','", "'['", "'*'", "'-'", "'('", "':'", 
		"'<'", "'!='", "'<='", "'või'", "'{'", "'}'", "')'", "'+'", "'kui'", "'='", 
		"'>'", "'/'", "'=='", "'kuni'", "'>='", "'!'", "'tegevus'", "'ja'", "Tõeväärtus", 
		"MuutujaNimi", "Täisarv", "Komaga", "Sõne", "Kommentaar", "Whitespace"
	};
	public static final int
		RULE_programm = 0, RULE_lauseteJada = 1, RULE_lause = 2, RULE_kuiLause = 3, 
		RULE_kuniLause = 4, RULE_omistamine = 5, RULE_uusFunktsioon = 6, RULE_avaldis = 7, 
		RULE_tehe = 8, RULE_tehe4 = 9, RULE_tehe3 = 10, RULE_tehe2 = 11, RULE_tehe1 = 12, 
		RULE_tehe0 = 13, RULE_lausearvutus = 14, RULE_lausearvutus4 = 15, RULE_lausearvutus3 = 16, 
		RULE_lausearvutus2 = 17, RULE_lausearvutus1 = 18, RULE_lausearvutus0 = 19, 
		RULE_hulk = 20;
	public static final String[] ruleNames = {
		"programm", "lauseteJada", "lause", "kuiLause", "kuniLause", "omistamine", 
		"uusFunktsioon", "avaldis", "tehe", "tehe4", "tehe3", "tehe2", "tehe1", 
		"tehe0", "lausearvutus", "lausearvutus4", "lausearvutus3", "lausearvutus2", 
		"lausearvutus1", "lausearvutus0", "hulk"
	};

	@Override
	public String getGrammarFileName() { return "Tiigrikeel.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TiigrikeelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammContext extends ParserRuleContext {
		public LauseteJadaContext lauseteJada(int i) {
			return getRuleContext(LauseteJadaContext.class,i);
		}
		public List<LauseteJadaContext> lauseteJada() {
			return getRuleContexts(LauseteJadaContext.class);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitProgramm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitProgramm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(42); match(T__24);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48); lauseteJada();
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(49); match(T__24);
						}
						}
						setState(52); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__24 );
					setState(54); lauseteJada();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(60); match(T__24);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LauseteJadaContext extends ParserRuleContext {
		public LauseContext lause(int i) {
			return getRuleContext(LauseContext.class,i);
		}
		public List<LauseContext> lause() {
			return getRuleContexts(LauseContext.class);
		}
		public LauseteJadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lauseteJada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterLauseteJada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitLauseteJada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitLauseteJada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LauseteJadaContext lauseteJada() throws RecognitionException {
		LauseteJadaContext _localctx = new LauseteJadaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lauseteJada);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66); lause();
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67); match(T__24);
					setState(68); lause();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
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

	public static class LauseContext extends ParserRuleContext {
		public KuniLauseContext kuniLause() {
			return getRuleContext(KuniLauseContext.class,0);
		}
		public KuiLauseContext kuiLause() {
			return getRuleContext(KuiLauseContext.class,0);
		}
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public OmistamineContext omistamine() {
			return getRuleContext(OmistamineContext.class,0);
		}
		public LauseteJadaContext lauseteJada() {
			return getRuleContext(LauseteJadaContext.class,0);
		}
		public UusFunktsioonContext uusFunktsioon() {
			return getRuleContext(UusFunktsioonContext.class,0);
		}
		public LauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterLause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitLause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitLause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LauseContext lause() throws RecognitionException {
		LauseContext _localctx = new LauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lause);
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); kuiLause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); kuniLause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); omistamine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77); uusFunktsioon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78); avaldis();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79); match(T__13);
				setState(80); lauseteJada();
				setState(81); match(T__12);
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

	public static class KuiLauseContext extends ParserRuleContext {
		public LauseContext lause() {
			return getRuleContext(LauseContext.class,0);
		}
		public LausearvutusContext lausearvutus() {
			return getRuleContext(LausearvutusContext.class,0);
		}
		public LauseteJadaContext lauseteJada() {
			return getRuleContext(LauseteJadaContext.class,0);
		}
		public KuiLauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kuiLause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterKuiLause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitKuiLause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitKuiLause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KuiLauseContext kuiLause() throws RecognitionException {
		KuiLauseContext _localctx = new KuiLauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kuiLause);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); match(T__9);
				setState(86); match(T__19);
				setState(87); lausearvutus();
				setState(88); match(T__11);
				setState(89); match(T__18);
				setState(90); match(T__24);
				setState(91); lauseteJada();
				setState(93);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(92); match(T__24);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(T__9);
				setState(96); match(T__19);
				setState(97); lausearvutus();
				setState(98); match(T__11);
				setState(99); match(T__18);
				setState(100); lause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); match(T__9);
				setState(103); lausearvutus();
				setState(104); match(T__18);
				setState(105); match(T__24);
				setState(106); lauseteJada();
				setState(108);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(107); match(T__24);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110); match(T__9);
				setState(111); lausearvutus();
				setState(112); match(T__18);
				setState(113); lause();
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

	public static class KuniLauseContext extends ParserRuleContext {
		public LauseContext lause() {
			return getRuleContext(LauseContext.class,0);
		}
		public LausearvutusContext lausearvutus() {
			return getRuleContext(LausearvutusContext.class,0);
		}
		public LauseteJadaContext lauseteJada() {
			return getRuleContext(LauseteJadaContext.class,0);
		}
		public KuniLauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kuniLause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterKuniLause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitKuniLause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitKuniLause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KuniLauseContext kuniLause() throws RecognitionException {
		KuniLauseContext _localctx = new KuniLauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kuniLause);
		try {
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); match(T__4);
				setState(118); match(T__19);
				setState(119); lausearvutus();
				setState(120); match(T__11);
				setState(121); match(T__18);
				setState(122); match(T__24);
				setState(123); lauseteJada();
				setState(125);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(124); match(T__24);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); match(T__4);
				setState(128); match(T__19);
				setState(129); lausearvutus();
				setState(130); match(T__11);
				setState(131); match(T__18);
				setState(132); lause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); match(T__4);
				setState(135); lausearvutus();
				setState(136); match(T__18);
				setState(137); match(T__24);
				setState(138); lauseteJada();
				setState(140);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(139); match(T__24);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142); match(T__4);
				setState(143); lausearvutus();
				setState(144); match(T__18);
				setState(145); lause();
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

	public static class OmistamineContext extends ParserRuleContext {
		public TerminalNode MuutujaNimi() { return getToken(TiigrikeelParser.MuutujaNimi, 0); }
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public OmistamineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_omistamine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterOmistamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitOmistamine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitOmistamine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmistamineContext omistamine() throws RecognitionException {
		OmistamineContext _localctx = new OmistamineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_omistamine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(MuutujaNimi);
			setState(150); match(T__8);
			setState(151); avaldis();
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

	public static class UusFunktsioonContext extends ParserRuleContext {
		public List<TerminalNode> MuutujaNimi() { return getTokens(TiigrikeelParser.MuutujaNimi); }
		public TerminalNode MuutujaNimi(int i) {
			return getToken(TiigrikeelParser.MuutujaNimi, i);
		}
		public LauseteJadaContext lauseteJada() {
			return getRuleContext(LauseteJadaContext.class,0);
		}
		public UusFunktsioonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uusFunktsioon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterUusFunktsioon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitUusFunktsioon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitUusFunktsioon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UusFunktsioonContext uusFunktsioon() throws RecognitionException {
		UusFunktsioonContext _localctx = new UusFunktsioonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_uusFunktsioon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(T__1);
			setState(154); match(MuutujaNimi);
			setState(155); match(T__19);
			setState(164);
			_la = _input.LA(1);
			if (_la==MuutujaNimi) {
				{
				setState(156); match(MuutujaNimi);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(157); match(T__23);
					setState(158); match(MuutujaNimi);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(166); match(T__11);
			setState(167); match(T__18);
			setState(168); match(T__24);
			setState(169); lauseteJada();
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

	public static class AvaldisContext extends ParserRuleContext {
		public HulkContext hulk() {
			return getRuleContext(HulkContext.class,0);
		}
		public LausearvutusContext lausearvutus() {
			return getRuleContext(LausearvutusContext.class,0);
		}
		public TeheContext tehe() {
			return getRuleContext(TeheContext.class,0);
		}
		public AvaldisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterAvaldis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitAvaldis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitAvaldis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvaldisContext avaldis() throws RecognitionException {
		AvaldisContext _localctx = new AvaldisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_avaldis);
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171); lausearvutus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); tehe();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173); hulk();
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

	public static class TeheContext extends ParserRuleContext {
		public Tehe4Context tehe4() {
			return getRuleContext(Tehe4Context.class,0);
		}
		public TeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tehe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTehe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTehe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTehe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TeheContext tehe() throws RecognitionException {
		TeheContext _localctx = new TeheContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); tehe4(0);
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

	public static class Tehe4Context extends ParserRuleContext {
		public Tehe4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tehe4; }
	 
		public Tehe4Context() { }
		public void copyFrom(Tehe4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiitmineLahutamineContext extends Tehe4Context {
		public Tehe4Context tehe4() {
			return getRuleContext(Tehe4Context.class,0);
		}
		public Tehe3Context tehe3() {
			return getRuleContext(Tehe3Context.class,0);
		}
		public LiitmineLahutamineContext(Tehe4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterLiitmineLahutamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitLiitmineLahutamine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitLiitmineLahutamine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TriviaalneTehe4Context extends Tehe4Context {
		public Tehe3Context tehe3() {
			return getRuleContext(Tehe3Context.class,0);
		}
		public TriviaalneTehe4Context(Tehe4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTriviaalneTehe4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTriviaalneTehe4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTriviaalneTehe4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tehe4Context tehe4() throws RecognitionException {
		return tehe4(0);
	}

	private Tehe4Context tehe4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tehe4Context _localctx = new Tehe4Context(_ctx, _parentState);
		Tehe4Context _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_tehe4, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneTehe4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(179); tehe3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiitmineLahutamineContext(new Tehe4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tehe4);
					setState(181);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(182);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__10) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(183); tehe3(0);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Tehe3Context extends ParserRuleContext {
		public Tehe3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tehe3; }
	 
		public Tehe3Context() { }
		public void copyFrom(Tehe3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TriviaalneTehe3Context extends Tehe3Context {
		public Tehe2Context tehe2() {
			return getRuleContext(Tehe2Context.class,0);
		}
		public TriviaalneTehe3Context(Tehe3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTriviaalneTehe3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTriviaalneTehe3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTriviaalneTehe3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KorrutamineJagamineContext extends Tehe3Context {
		public Tehe2Context tehe2() {
			return getRuleContext(Tehe2Context.class,0);
		}
		public Tehe3Context tehe3() {
			return getRuleContext(Tehe3Context.class,0);
		}
		public KorrutamineJagamineContext(Tehe3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterKorrutamineJagamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitKorrutamineJagamine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitKorrutamineJagamine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tehe3Context tehe3() throws RecognitionException {
		return tehe3(0);
	}

	private Tehe3Context tehe3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tehe3Context _localctx = new Tehe3Context(_ctx, _parentState);
		Tehe3Context _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_tehe3, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneTehe3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(190); tehe2();
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KorrutamineJagamineContext(new Tehe3Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tehe3);
					setState(192);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(193);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(194); tehe2();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class Tehe2Context extends ParserRuleContext {
		public Tehe2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tehe2; }
	 
		public Tehe2Context() { }
		public void copyFrom(Tehe2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TriviaalneTehe2Context extends Tehe2Context {
		public Tehe1Context tehe1() {
			return getRuleContext(Tehe1Context.class,0);
		}
		public TriviaalneTehe2Context(Tehe2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTriviaalneTehe2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTriviaalneTehe2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTriviaalneTehe2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaarneMiinusContext extends Tehe2Context {
		public Tehe2Context tehe2() {
			return getRuleContext(Tehe2Context.class,0);
		}
		public UnaarneMiinusContext(Tehe2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterUnaarneMiinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitUnaarneMiinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitUnaarneMiinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tehe2Context tehe2() throws RecognitionException {
		Tehe2Context _localctx = new Tehe2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_tehe2);
		try {
			setState(203);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new UnaarneMiinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200); match(T__20);
				setState(201); tehe2();
				}
				break;
			case T__19:
			case Tõeväärtus:
			case MuutujaNimi:
			case Täisarv:
			case Komaga:
			case Sõne:
				_localctx = new TriviaalneTehe2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202); tehe1();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tehe1Context extends ParserRuleContext {
		public Tehe1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tehe1; }
	 
		public Tehe1Context() { }
		public void copyFrom(Tehe1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SulustatudTeheContext extends Tehe1Context {
		public TeheContext tehe() {
			return getRuleContext(TeheContext.class,0);
		}
		public SulustatudTeheContext(Tehe1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterSulustatudTehe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitSulustatudTehe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitSulustatudTehe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunktsioonContext extends Tehe1Context {
		public TerminalNode MuutujaNimi() { return getToken(TiigrikeelParser.MuutujaNimi, 0); }
		public List<AvaldisContext> avaldis() {
			return getRuleContexts(AvaldisContext.class);
		}
		public AvaldisContext avaldis(int i) {
			return getRuleContext(AvaldisContext.class,i);
		}
		public FunktsioonContext(Tehe1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterFunktsioon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitFunktsioon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitFunktsioon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TriviaalneTehe1Context extends Tehe1Context {
		public Tehe0Context tehe0() {
			return getRuleContext(Tehe0Context.class,0);
		}
		public TriviaalneTehe1Context(Tehe1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTriviaalneTehe1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTriviaalneTehe1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTriviaalneTehe1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JärjendiFunktsioonContext extends Tehe1Context {
		public TerminalNode MuutujaNimi() { return getToken(TiigrikeelParser.MuutujaNimi, 0); }
		public TeheContext tehe() {
			return getRuleContext(TeheContext.class,0);
		}
		public JärjendiFunktsioonContext(Tehe1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterJärjendiFunktsioon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitJärjendiFunktsioon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitJärjendiFunktsioon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tehe1Context tehe1() throws RecognitionException {
		Tehe1Context _localctx = new Tehe1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_tehe1);
		int _la;
		try {
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new FunktsioonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205); match(MuutujaNimi);
				setState(206); match(T__19);
				setState(215);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__2) | (1L << Tõeväärtus) | (1L << MuutujaNimi) | (1L << Täisarv) | (1L << Komaga) | (1L << Sõne))) != 0)) {
					{
					setState(207); avaldis();
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__23) {
						{
						{
						setState(208); match(T__23);
						setState(209); avaldis();
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(217); match(T__11);
				}
				break;
			case 2:
				_localctx = new JärjendiFunktsioonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(MuutujaNimi);
				setState(219); match(T__22);
				setState(220); tehe();
				setState(221); match(T__25);
				}
				break;
			case 3:
				_localctx = new SulustatudTeheContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223); match(T__19);
				setState(224); tehe();
				setState(225); match(T__11);
				}
				break;
			case 4:
				_localctx = new TriviaalneTehe1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(227); tehe0();
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

	public static class Tehe0Context extends ParserRuleContext {
		public Tehe0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tehe0; }
	 
		public Tehe0Context() { }
		public void copyFrom(Tehe0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TõeväärtusR2Context extends Tehe0Context {
		public TerminalNode Tõeväärtus() { return getToken(TiigrikeelParser.Tõeväärtus, 0); }
		public TõeväärtusR2Context(Tehe0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTõeväärtusR2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTõeväärtusR2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTõeväärtusR2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KomagaRContext extends Tehe0Context {
		public TerminalNode Komaga() { return getToken(TiigrikeelParser.Komaga, 0); }
		public KomagaRContext(Tehe0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterKomagaR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitKomagaR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitKomagaR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TäisarvRContext extends Tehe0Context {
		public TerminalNode Täisarv() { return getToken(TiigrikeelParser.Täisarv, 0); }
		public TäisarvRContext(Tehe0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTäisarvR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTäisarvR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTäisarvR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SõneRContext extends Tehe0Context {
		public TerminalNode Sõne() { return getToken(TiigrikeelParser.Sõne, 0); }
		public SõneRContext(Tehe0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterSõneR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitSõneR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitSõneR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MuutujaNimiRContext extends Tehe0Context {
		public TerminalNode MuutujaNimi() { return getToken(TiigrikeelParser.MuutujaNimi, 0); }
		public MuutujaNimiRContext(Tehe0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterMuutujaNimiR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitMuutujaNimiR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitMuutujaNimiR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tehe0Context tehe0() throws RecognitionException {
		Tehe0Context _localctx = new Tehe0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_tehe0);
		try {
			setState(235);
			switch (_input.LA(1)) {
			case Tõeväärtus:
				_localctx = new TõeväärtusR2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230); match(Tõeväärtus);
				}
				break;
			case MuutujaNimi:
				_localctx = new MuutujaNimiRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231); match(MuutujaNimi);
				}
				break;
			case Täisarv:
				_localctx = new TäisarvRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(232); match(Täisarv);
				}
				break;
			case Komaga:
				_localctx = new KomagaRContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233); match(Komaga);
				}
				break;
			case Sõne:
				_localctx = new SõneRContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(234); match(Sõne);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LausearvutusContext extends ParserRuleContext {
		public Lausearvutus4Context lausearvutus4() {
			return getRuleContext(Lausearvutus4Context.class,0);
		}
		public LausearvutusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lausearvutus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterLausearvutus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitLausearvutus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitLausearvutus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LausearvutusContext lausearvutus() throws RecognitionException {
		LausearvutusContext _localctx = new LausearvutusContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lausearvutus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); lausearvutus4(0);
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

	public static class Lausearvutus4Context extends ParserRuleContext {
		public Lausearvutus4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lausearvutus4; }
	 
		public Lausearvutus4Context() { }
		public void copyFrom(Lausearvutus4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TriviaalneLausearvutus3Context extends Lausearvutus4Context {
		public Lausearvutus3Context lausearvutus3() {
			return getRuleContext(Lausearvutus3Context.class,0);
		}
		public TriviaalneLausearvutus3Context(Lausearvutus4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTriviaalneLausearvutus3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTriviaalneLausearvutus3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTriviaalneLausearvutus3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DisjunktsioonContext extends Lausearvutus4Context {
		public Lausearvutus3Context lausearvutus3() {
			return getRuleContext(Lausearvutus3Context.class,0);
		}
		public Lausearvutus4Context lausearvutus4() {
			return getRuleContext(Lausearvutus4Context.class,0);
		}
		public DisjunktsioonContext(Lausearvutus4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterDisjunktsioon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitDisjunktsioon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitDisjunktsioon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lausearvutus4Context lausearvutus4() throws RecognitionException {
		return lausearvutus4(0);
	}

	private Lausearvutus4Context lausearvutus4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lausearvutus4Context _localctx = new Lausearvutus4Context(_ctx, _parentState);
		Lausearvutus4Context _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_lausearvutus4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneLausearvutus3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(240); lausearvutus3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DisjunktsioonContext(new Lausearvutus4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lausearvutus4);
					setState(242);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(243); match(T__14);
					setState(244); lausearvutus3(0);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Lausearvutus3Context extends ParserRuleContext {
		public Lausearvutus3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lausearvutus3; }
	 
		public Lausearvutus3Context() { }
		public void copyFrom(Lausearvutus3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TriviaalneLausearvutus2Context extends Lausearvutus3Context {
		public Lausearvutus2Context lausearvutus2() {
			return getRuleContext(Lausearvutus2Context.class,0);
		}
		public TriviaalneLausearvutus2Context(Lausearvutus3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTriviaalneLausearvutus2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTriviaalneLausearvutus2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTriviaalneLausearvutus2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KonjunktsioonContext extends Lausearvutus3Context {
		public Lausearvutus2Context lausearvutus2() {
			return getRuleContext(Lausearvutus2Context.class,0);
		}
		public Lausearvutus3Context lausearvutus3() {
			return getRuleContext(Lausearvutus3Context.class,0);
		}
		public KonjunktsioonContext(Lausearvutus3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterKonjunktsioon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitKonjunktsioon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitKonjunktsioon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lausearvutus3Context lausearvutus3() throws RecognitionException {
		return lausearvutus3(0);
	}

	private Lausearvutus3Context lausearvutus3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lausearvutus3Context _localctx = new Lausearvutus3Context(_ctx, _parentState);
		Lausearvutus3Context _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_lausearvutus3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneLausearvutus2Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(251); lausearvutus2();
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KonjunktsioonContext(new Lausearvutus3Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lausearvutus3);
					setState(253);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(254); match(T__0);
					setState(255); lausearvutus2();
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Lausearvutus2Context extends ParserRuleContext {
		public Lausearvutus2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lausearvutus2; }
	 
		public Lausearvutus2Context() { }
		public void copyFrom(Lausearvutus2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SulustatudLausearvutusContext extends Lausearvutus2Context {
		public LausearvutusContext lausearvutus() {
			return getRuleContext(LausearvutusContext.class,0);
		}
		public SulustatudLausearvutusContext(Lausearvutus2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterSulustatudLausearvutus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitSulustatudLausearvutus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitSulustatudLausearvutus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TriviaalneLausearvutus1Context extends Lausearvutus2Context {
		public Lausearvutus1Context lausearvutus1() {
			return getRuleContext(Lausearvutus1Context.class,0);
		}
		public TriviaalneLausearvutus1Context(Lausearvutus2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTriviaalneLausearvutus1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTriviaalneLausearvutus1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTriviaalneLausearvutus1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EitusContext extends Lausearvutus2Context {
		public Lausearvutus2Context lausearvutus2() {
			return getRuleContext(Lausearvutus2Context.class,0);
		}
		public EitusContext(Lausearvutus2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterEitus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitEitus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitEitus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lausearvutus2Context lausearvutus2() throws RecognitionException {
		Lausearvutus2Context _localctx = new Lausearvutus2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_lausearvutus2);
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new EitusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261); match(T__2);
				setState(262); lausearvutus2();
				}
				break;
			case 2:
				_localctx = new SulustatudLausearvutusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263); match(T__19);
				setState(264); lausearvutus();
				setState(265); match(T__11);
				}
				break;
			case 3:
				_localctx = new TriviaalneLausearvutus1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267); lausearvutus1();
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

	public static class Lausearvutus1Context extends ParserRuleContext {
		public Lausearvutus1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lausearvutus1; }
	 
		public Lausearvutus1Context() { }
		public void copyFrom(Lausearvutus1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TriviaalneLausearvutus0Context extends Lausearvutus1Context {
		public Lausearvutus0Context lausearvutus0() {
			return getRuleContext(Lausearvutus0Context.class,0);
		}
		public TriviaalneLausearvutus0Context(Lausearvutus1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterTriviaalneLausearvutus0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitTriviaalneLausearvutus0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTriviaalneLausearvutus0(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VõrdlusContext extends Lausearvutus1Context {
		public TeheContext tehe(int i) {
			return getRuleContext(TeheContext.class,i);
		}
		public List<TeheContext> tehe() {
			return getRuleContexts(TeheContext.class);
		}
		public VõrdlusContext(Lausearvutus1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterVõrdlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitVõrdlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitVõrdlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lausearvutus1Context lausearvutus1() throws RecognitionException {
		Lausearvutus1Context _localctx = new Lausearvutus1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_lausearvutus1);
		int _la;
		try {
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new VõrdlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270); tehe();
				setState(271);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__7) | (1L << T__5) | (1L << T__3))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(272); tehe();
				}
				break;
			case 2:
				_localctx = new TriviaalneLausearvutus0Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274); lausearvutus0();
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

	public static class Lausearvutus0Context extends ParserRuleContext {
		public TerminalNode MuutujaNimi() { return getToken(TiigrikeelParser.MuutujaNimi, 0); }
		public Lausearvutus0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lausearvutus0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterLausearvutus0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitLausearvutus0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitLausearvutus0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lausearvutus0Context lausearvutus0() throws RecognitionException {
		Lausearvutus0Context _localctx = new Lausearvutus0Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_lausearvutus0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(MuutujaNimi);
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

	public static class HulkContext extends ParserRuleContext {
		public List<AvaldisContext> avaldis() {
			return getRuleContexts(AvaldisContext.class);
		}
		public AvaldisContext avaldis(int i) {
			return getRuleContext(AvaldisContext.class,i);
		}
		public HulkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hulk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).enterHulk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiigrikeelListener ) ((TiigrikeelListener)listener).exitHulk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitHulk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HulkContext hulk() throws RecognitionException {
		HulkContext _localctx = new HulkContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hulk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(T__19);
			setState(288);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__2) | (1L << Tõeväärtus) | (1L << MuutujaNimi) | (1L << Täisarv) | (1L << Komaga) | (1L << Sõne))) != 0)) {
				{
				setState(280); avaldis();
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(281); match(T__23);
					setState(282); avaldis();
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(290); match(T__11);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9: return tehe4_sempred((Tehe4Context)_localctx, predIndex);
		case 10: return tehe3_sempred((Tehe3Context)_localctx, predIndex);
		case 15: return lausearvutus4_sempred((Lausearvutus4Context)_localctx, predIndex);
		case 16: return lausearvutus3_sempred((Lausearvutus3Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean tehe3_sempred(Tehe3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean tehe4_sempred(Tehe4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lausearvutus3_sempred(Lausearvutus3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lausearvutus4_sempred(Lausearvutus4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\6\2\65\n\2\r\2\16\2\66\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5v\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008f\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0096\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00a2\n\b\f\b\16\b\u00a5\13\b\5\b\u00a7\n\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\5\t\u00b1\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00bb"+
		"\n\13\f\13\16\13\u00be\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c6\n\f\f\f"+
		"\16\f\u00c9\13\f\3\r\3\r\3\r\5\r\u00ce\n\r\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u00d5\n\16\f\16\16\16\u00d8\13\16\5\16\u00da\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e7\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00ee\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00f8\n\21\f\21\16\21\u00fb\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u0103\n\22\f\22\16\22\u0106\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u010f\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u0116\n\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\7\26\u011e\n\26\f\26\16\26\u0121\13\26\5\26\u0123\n"+
		"\26\3\26\3\26\3\26\2\6\24\26 \"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\5\4\2\b\b\22\22\4\2\7\7\26\26\6\2\13\r\25\25\27\27\31\31"+
		"\u013c\2/\3\2\2\2\4D\3\2\2\2\6U\3\2\2\2\bu\3\2\2\2\n\u0095\3\2\2\2\f\u0097"+
		"\3\2\2\2\16\u009b\3\2\2\2\20\u00b0\3\2\2\2\22\u00b2\3\2\2\2\24\u00b4\3"+
		"\2\2\2\26\u00bf\3\2\2\2\30\u00cd\3\2\2\2\32\u00e6\3\2\2\2\34\u00ed\3\2"+
		"\2\2\36\u00ef\3\2\2\2 \u00f1\3\2\2\2\"\u00fc\3\2\2\2$\u010e\3\2\2\2&\u0115"+
		"\3\2\2\2(\u0117\3\2\2\2*\u0119\3\2\2\2,.\7\4\2\2-,\3\2\2\2.\61\3\2\2\2"+
		"/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62;\5\4\3\2\63\65\7\4"+
		"\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2"+
		"\28:\5\4\3\29\64\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2"+
		"\2\2>@\7\4\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3"+
		"\2\2\2DI\5\6\4\2EF\7\4\2\2FH\5\6\4\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3"+
		"\2\2\2J\5\3\2\2\2KI\3\2\2\2LV\5\b\5\2MV\5\n\6\2NV\5\f\7\2OV\5\16\b\2P"+
		"V\5\20\t\2QR\7\17\2\2RS\5\4\3\2ST\7\20\2\2TV\3\2\2\2UL\3\2\2\2UM\3\2\2"+
		"\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2V\7\3\2\2\2WX\7\23\2\2XY\7\t"+
		"\2\2YZ\5\36\20\2Z[\7\21\2\2[\\\7\n\2\2\\]\7\4\2\2]_\5\4\3\2^`\7\4\2\2"+
		"_^\3\2\2\2_`\3\2\2\2`v\3\2\2\2ab\7\23\2\2bc\7\t\2\2cd\5\36\20\2de\7\21"+
		"\2\2ef\7\n\2\2fg\5\6\4\2gv\3\2\2\2hi\7\23\2\2ij\5\36\20\2jk\7\n\2\2kl"+
		"\7\4\2\2ln\5\4\3\2mo\7\4\2\2nm\3\2\2\2no\3\2\2\2ov\3\2\2\2pq\7\23\2\2"+
		"qr\5\36\20\2rs\7\n\2\2st\5\6\4\2tv\3\2\2\2uW\3\2\2\2ua\3\2\2\2uh\3\2\2"+
		"\2up\3\2\2\2v\t\3\2\2\2wx\7\30\2\2xy\7\t\2\2yz\5\36\20\2z{\7\21\2\2{|"+
		"\7\n\2\2|}\7\4\2\2}\177\5\4\3\2~\u0080\7\4\2\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0096\3\2\2\2\u0081\u0082\7\30\2\2\u0082\u0083\7\t\2\2"+
		"\u0083\u0084\5\36\20\2\u0084\u0085\7\21\2\2\u0085\u0086\7\n\2\2\u0086"+
		"\u0087\5\6\4\2\u0087\u0096\3\2\2\2\u0088\u0089\7\30\2\2\u0089\u008a\5"+
		"\36\20\2\u008a\u008b\7\n\2\2\u008b\u008c\7\4\2\2\u008c\u008e\5\4\3\2\u008d"+
		"\u008f\7\4\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0096\3\2"+
		"\2\2\u0090\u0091\7\30\2\2\u0091\u0092\5\36\20\2\u0092\u0093\7\n\2\2\u0093"+
		"\u0094\5\6\4\2\u0094\u0096\3\2\2\2\u0095w\3\2\2\2\u0095\u0081\3\2\2\2"+
		"\u0095\u0088\3\2\2\2\u0095\u0090\3\2\2\2\u0096\13\3\2\2\2\u0097\u0098"+
		"\7\36\2\2\u0098\u0099\7\24\2\2\u0099\u009a\5\20\t\2\u009a\r\3\2\2\2\u009b"+
		"\u009c\7\33\2\2\u009c\u009d\7\36\2\2\u009d\u00a6\7\t\2\2\u009e\u00a3\7"+
		"\36\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a2\7\36\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u009e\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\7\21\2\2\u00a9\u00aa\7\n\2\2\u00aa\u00ab\7"+
		"\4\2\2\u00ab\u00ac\5\4\3\2\u00ac\17\3\2\2\2\u00ad\u00b1\5\36\20\2\u00ae"+
		"\u00b1\5\22\n\2\u00af\u00b1\5*\26\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3"+
		"\2\2\2\u00b0\u00af\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b3\5\24\13\2\u00b3"+
		"\23\3\2\2\2\u00b4\u00b5\b\13\1\2\u00b5\u00b6\5\26\f\2\u00b6\u00bc\3\2"+
		"\2\2\u00b7\u00b8\f\4\2\2\u00b8\u00b9\t\2\2\2\u00b9\u00bb\5\26\f\2\u00ba"+
		"\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\25\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\f\1\2\u00c0\u00c1"+
		"\5\30\r\2\u00c1\u00c7\3\2\2\2\u00c2\u00c3\f\4\2\2\u00c3\u00c4\t\3\2\2"+
		"\u00c4\u00c6\5\30\r\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\27\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\7\b\2\2\u00cb\u00ce\5\30\r\2\u00cc\u00ce\5\32\16\2\u00cd\u00ca"+
		"\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\31\3\2\2\2\u00cf\u00d0\7\36\2\2\u00d0"+
		"\u00d9\7\t\2\2\u00d1\u00d6\5\20\t\2\u00d2\u00d3\7\5\2\2\u00d3\u00d5\5"+
		"\20\t\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00d1\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e7\7\21\2\2\u00dc"+
		"\u00dd\7\36\2\2\u00dd\u00de\7\6\2\2\u00de\u00df\5\22\n\2\u00df\u00e0\7"+
		"\3\2\2\u00e0\u00e7\3\2\2\2\u00e1\u00e2\7\t\2\2\u00e2\u00e3\5\22\n\2\u00e3"+
		"\u00e4\7\21\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5\34\17\2\u00e6\u00cf"+
		"\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\33\3\2\2\2\u00e8\u00ee\7\35\2\2\u00e9\u00ee\7\36\2\2\u00ea\u00ee\7\37"+
		"\2\2\u00eb\u00ee\7 \2\2\u00ec\u00ee\7!\2\2\u00ed\u00e8\3\2\2\2\u00ed\u00e9"+
		"\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\35\3\2\2\2\u00ef\u00f0\5 \21\2\u00f0\37\3\2\2\2\u00f1\u00f2\b\21\1\2"+
		"\u00f2\u00f3\5\"\22\2\u00f3\u00f9\3\2\2\2\u00f4\u00f5\f\4\2\2\u00f5\u00f6"+
		"\7\16\2\2\u00f6\u00f8\5\"\22\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa!\3\2\2\2\u00fb\u00f9\3"+
		"\2\2\2\u00fc\u00fd\b\22\1\2\u00fd\u00fe\5$\23\2\u00fe\u0104\3\2\2\2\u00ff"+
		"\u0100\f\4\2\2\u0100\u0101\7\34\2\2\u0101\u0103\5$\23\2\u0102\u00ff\3"+
		"\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"#\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\32\2\2\u0108\u010f\5$\23\2"+
		"\u0109\u010a\7\t\2\2\u010a\u010b\5\36\20\2\u010b\u010c\7\21\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010f\5&\24\2\u010e\u0107\3\2\2\2\u010e\u0109\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010f%\3\2\2\2\u0110\u0111\5\22\n\2\u0111\u0112"+
		"\t\4\2\2\u0112\u0113\5\22\n\2\u0113\u0116\3\2\2\2\u0114\u0116\5(\25\2"+
		"\u0115\u0110\3\2\2\2\u0115\u0114\3\2\2\2\u0116\'\3\2\2\2\u0117\u0118\7"+
		"\36\2\2\u0118)\3\2\2\2\u0119\u0122\7\t\2\2\u011a\u011f\5\20\t\2\u011b"+
		"\u011c\7\5\2\2\u011c\u011e\5\20\t\2\u011d\u011b\3\2\2\2\u011e\u0121\3"+
		"\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u011a\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\7\21\2\2\u0125+\3\2\2\2\36/\66;AIU_nu\177\u008e\u0095"+
		"\u00a3\u00a6\u00b0\u00bc\u00c7\u00cd\u00d6\u00d9\u00e6\u00ed\u00f9\u0104"+
		"\u010e\u0115\u011f\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}