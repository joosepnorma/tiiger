// Generated from /home/madis/git/tiiger/Tiigrikeel.g4 by ANTLR 4.x
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
		T__1=25, T__0=26, MuutujaNimi=27, Täisarv=28, Komaga=29, Sõne=30, Tõeväärtus=31, 
		Kommentaar=32, Whitespace=33;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'\n'", "','", "'['", "'*'", "'-'", "'('", "':'", 
		"'<'", "'!='", "'<='", "'või'", "'{'", "'}'", "')'", "'+'", "'kui'", "'='", 
		"'>'", "'/'", "'=='", "'kuni'", "'>='", "'!'", "'tegevus'", "'ja'", "MuutujaNimi", 
		"Täisarv", "Komaga", "Sõne", "Tõeväärtus", "Kommentaar", "Whitespace"
	};
	public static final int
		RULE_programm = 0, RULE_lauseteJada = 1, RULE_lause = 2, RULE_kuiLause = 3, 
		RULE_kuniLause = 4, RULE_omistamine = 5, RULE_uusFunktsioon = 6, RULE_avaldis = 7, 
		RULE_tehe = 8, RULE_tehe4 = 9, RULE_tehe3 = 10, RULE_tehe2 = 11, RULE_tehe1 = 12, 
		RULE_tehe0 = 13, RULE_lausearvutus = 14, RULE_lausearvutus4 = 15, RULE_lausearvutus3 = 16, 
		RULE_lausearvutus2 = 17, RULE_lausearvutus1 = 18, RULE_lausearvutus0 = 19;
	public static final String[] ruleNames = {
		"programm", "lauseteJada", "lause", "kuiLause", "kuniLause", "omistamine", 
		"uusFunktsioon", "avaldis", "tehe", "tehe4", "tehe3", "tehe2", "tehe1", 
		"tehe0", "lausearvutus", "lausearvutus4", "lausearvutus3", "lausearvutus2", 
		"lausearvutus1", "lausearvutus0"
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
			setState(40); lauseteJada();
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(41); match(T__24);
						}
						}
						setState(44); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__24 );
					setState(46); lauseteJada();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(52); match(T__24);
				}
				}
				setState(57);
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
			setState(58); lause();
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59); match(T__24);
					setState(60); lause();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitLause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LauseContext lause() throws RecognitionException {
		LauseContext _localctx = new LauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lause);
		try {
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); kuiLause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); kuniLause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68); omistamine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69); uusFunktsioon();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70); avaldis();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71); match(T__13);
				setState(72); lauseteJada();
				setState(73); match(T__12);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitKuiLause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KuiLauseContext kuiLause() throws RecognitionException {
		KuiLauseContext _localctx = new KuiLauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kuiLause);
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); match(T__9);
				setState(78); match(T__19);
				setState(79); lausearvutus();
				setState(80); match(T__11);
				setState(81); match(T__18);
				setState(82); match(T__24);
				setState(83); lauseteJada();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); match(T__9);
				setState(86); match(T__19);
				setState(87); lausearvutus();
				setState(88); match(T__11);
				setState(89); match(T__18);
				setState(90); lause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); match(T__9);
				setState(93); lausearvutus();
				setState(94); match(T__18);
				setState(95); match(T__24);
				setState(96); lauseteJada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98); match(T__9);
				setState(99); lausearvutus();
				setState(100); match(T__18);
				setState(101); lause();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitKuniLause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KuniLauseContext kuniLause() throws RecognitionException {
		KuniLauseContext _localctx = new KuniLauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kuniLause);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); match(T__4);
				setState(106); match(T__19);
				setState(107); lausearvutus();
				setState(108); match(T__11);
				setState(109); match(T__18);
				setState(110); match(T__24);
				setState(111); lauseteJada();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); match(T__4);
				setState(114); match(T__19);
				setState(115); lausearvutus();
				setState(116); match(T__11);
				setState(117); match(T__18);
				setState(118); lause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); match(T__4);
				setState(121); lausearvutus();
				setState(122); match(T__18);
				setState(123); match(T__24);
				setState(124); lauseteJada();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126); match(T__4);
				setState(127); lausearvutus();
				setState(128); match(T__18);
				setState(129); lause();
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
			setState(133); match(MuutujaNimi);
			setState(134); match(T__8);
			setState(135); avaldis();
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
			setState(137); match(T__1);
			setState(138); match(MuutujaNimi);
			setState(139); match(T__19);
			setState(148);
			_la = _input.LA(1);
			if (_la==MuutujaNimi) {
				{
				setState(140); match(MuutujaNimi);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(141); match(T__23);
					setState(142); match(MuutujaNimi);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(150); match(T__11);
			setState(151); match(T__18);
			setState(152); lauseteJada();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitAvaldis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvaldisContext avaldis() throws RecognitionException {
		AvaldisContext _localctx = new AvaldisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_avaldis);
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); tehe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); lausearvutus();
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
			setState(158); tehe4(0);
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

			setState(161); tehe3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiitmineLahutamineContext(new Tehe4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tehe4);
					setState(163);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(164);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__10) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(165); tehe3(0);
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

			setState(172); tehe2();
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KorrutamineJagamineContext(new Tehe3Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tehe3);
					setState(174);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(175);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(176); tehe2();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitUnaarneMiinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tehe2Context tehe2() throws RecognitionException {
		Tehe2Context _localctx = new Tehe2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_tehe2);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new UnaarneMiinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182); match(T__20);
				setState(183); tehe2();
				}
				break;
			case T__19:
			case MuutujaNimi:
			case Täisarv:
			case Komaga:
			case Sõne:
			case Tõeväärtus:
				_localctx = new TriviaalneTehe2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184); tehe1();
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
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new FunktsioonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187); match(MuutujaNimi);
				setState(188); match(T__19);
				setState(197);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__2) | (1L << MuutujaNimi) | (1L << Täisarv) | (1L << Komaga) | (1L << Sõne) | (1L << Tõeväärtus))) != 0)) {
					{
					setState(189); avaldis();
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__23) {
						{
						{
						setState(190); match(T__23);
						setState(191); avaldis();
						}
						}
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(199); match(T__11);
				}
				break;
			case 2:
				_localctx = new JärjendiFunktsioonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200); match(MuutujaNimi);
				setState(201); match(T__22);
				setState(202); tehe();
				setState(203); match(T__25);
				}
				break;
			case 3:
				_localctx = new SulustatudTeheContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(205); match(T__19);
				setState(206); tehe();
				setState(207); match(T__11);
				}
				break;
			case 4:
				_localctx = new TriviaalneTehe1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(209); tehe0();
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
		public TerminalNode Täisarv() { return getToken(TiigrikeelParser.Täisarv, 0); }
		public TerminalNode MuutujaNimi() { return getToken(TiigrikeelParser.MuutujaNimi, 0); }
		public TerminalNode Sõne() { return getToken(TiigrikeelParser.Sõne, 0); }
		public TerminalNode Tõeväärtus() { return getToken(TiigrikeelParser.Tõeväärtus, 0); }
		public TerminalNode Komaga() { return getToken(TiigrikeelParser.Komaga, 0); }
		public Tehe0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tehe0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTehe0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tehe0Context tehe0() throws RecognitionException {
		Tehe0Context _localctx = new Tehe0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_tehe0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MuutujaNimi) | (1L << Täisarv) | (1L << Komaga) | (1L << Sõne) | (1L << Tõeväärtus))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
			setState(214); lausearvutus4(0);
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

			setState(217); lausearvutus3();
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DisjunktsioonContext(new Lausearvutus4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lausearvutus4);
					setState(219);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(220); match(T__14);
					setState(221); lausearvutus3();
					}
					} 
				}
				setState(226);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTriviaalneLausearvutus2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KonjunktsioonContext extends Lausearvutus3Context {
		public List<Lausearvutus2Context> lausearvutus2() {
			return getRuleContexts(Lausearvutus2Context.class);
		}
		public Lausearvutus2Context lausearvutus2(int i) {
			return getRuleContext(Lausearvutus2Context.class,i);
		}
		public KonjunktsioonContext(Lausearvutus3Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitKonjunktsioon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lausearvutus3Context lausearvutus3() throws RecognitionException {
		Lausearvutus3Context _localctx = new Lausearvutus3Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_lausearvutus3);
		try {
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new KonjunktsioonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227); lausearvutus2();
				setState(228); match(T__0);
				setState(229); lausearvutus2();
				}
				break;
			case 2:
				_localctx = new TriviaalneLausearvutus2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231); lausearvutus2();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTriviaalneLausearvutus1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TõeväärtusContext extends Lausearvutus2Context {
		public TerminalNode Tõeväärtus() { return getToken(TiigrikeelParser.Tõeväärtus, 0); }
		public TõeväärtusContext(Lausearvutus2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiigrikeelVisitor ) return ((TiigrikeelVisitor<? extends T>)visitor).visitTõeväärtus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EitusContext extends Lausearvutus2Context {
		public Lausearvutus2Context lausearvutus2() {
			return getRuleContext(Lausearvutus2Context.class,0);
		}
		public EitusContext(Lausearvutus2Context ctx) { copyFrom(ctx); }
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
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new EitusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234); match(T__2);
				setState(235); lausearvutus2();
				}
				break;
			case 2:
				_localctx = new SulustatudLausearvutusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236); match(T__19);
				setState(237); lausearvutus();
				setState(238); match(T__11);
				}
				break;
			case 3:
				_localctx = new TõeväärtusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240); match(Tõeväärtus);
				}
				break;
			case 4:
				_localctx = new TriviaalneLausearvutus1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(241); lausearvutus1();
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
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new VõrdlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244); tehe();
				setState(245);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__7) | (1L << T__5) | (1L << T__3))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(246); tehe();
				}
				break;
			case 2:
				_localctx = new TriviaalneLausearvutus0Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248); lausearvutus0();
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
			setState(251); match(MuutujaNimi);
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
	private boolean lausearvutus4_sempred(Lausearvutus4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\6\2-\n\2\r\2\16\2.\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\7\3@\n\3\f"+
		"\3\16\3C\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0086\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0092\n\b\f\b\16"+
		"\b\u0095\13\b\5\b\u0097\n\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u009f\n\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a9\n\13\f\13\16\13\u00ac\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\r\3\r"+
		"\3\r\5\r\u00bc\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u00c3\n\16\f\16\16\16"+
		"\u00c6\13\16\5\16\u00c8\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00d5\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00e1\n\21\f\21\16\21\u00e4\13\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00eb\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f5"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00fc\n\24\3\25\3\25\3\25\2\5\24\26"+
		" \26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\4\2\b\b\22\22\4"+
		"\2\7\7\26\26\3\2\35!\6\2\13\r\25\25\27\27\31\31\u010b\2*\3\2\2\2\4<\3"+
		"\2\2\2\6M\3\2\2\2\bi\3\2\2\2\n\u0085\3\2\2\2\f\u0087\3\2\2\2\16\u008b"+
		"\3\2\2\2\20\u009e\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2\2\26\u00ad\3"+
		"\2\2\2\30\u00bb\3\2\2\2\32\u00d4\3\2\2\2\34\u00d6\3\2\2\2\36\u00d8\3\2"+
		"\2\2 \u00da\3\2\2\2\"\u00ea\3\2\2\2$\u00f4\3\2\2\2&\u00fb\3\2\2\2(\u00fd"+
		"\3\2\2\2*\63\5\4\3\2+-\7\4\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2"+
		"/\60\3\2\2\2\60\62\5\4\3\2\61,\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\649\3\2\2\2\65\63\3\2\2\2\668\7\4\2\2\67\66\3\2\2\28;\3\2"+
		"\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<A\5\6\4\2=>\7\4\2\2>@"+
		"\5\6\4\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CA\3\2\2\2"+
		"DN\5\b\5\2EN\5\n\6\2FN\5\f\7\2GN\5\16\b\2HN\5\20\t\2IJ\7\17\2\2JK\5\4"+
		"\3\2KL\7\20\2\2LN\3\2\2\2MD\3\2\2\2ME\3\2\2\2MF\3\2\2\2MG\3\2\2\2MH\3"+
		"\2\2\2MI\3\2\2\2N\7\3\2\2\2OP\7\23\2\2PQ\7\t\2\2QR\5\36\20\2RS\7\21\2"+
		"\2ST\7\n\2\2TU\7\4\2\2UV\5\4\3\2Vj\3\2\2\2WX\7\23\2\2XY\7\t\2\2YZ\5\36"+
		"\20\2Z[\7\21\2\2[\\\7\n\2\2\\]\5\6\4\2]j\3\2\2\2^_\7\23\2\2_`\5\36\20"+
		"\2`a\7\n\2\2ab\7\4\2\2bc\5\4\3\2cj\3\2\2\2de\7\23\2\2ef\5\36\20\2fg\7"+
		"\n\2\2gh\5\6\4\2hj\3\2\2\2iO\3\2\2\2iW\3\2\2\2i^\3\2\2\2id\3\2\2\2j\t"+
		"\3\2\2\2kl\7\30\2\2lm\7\t\2\2mn\5\36\20\2no\7\21\2\2op\7\n\2\2pq\7\4\2"+
		"\2qr\5\4\3\2r\u0086\3\2\2\2st\7\30\2\2tu\7\t\2\2uv\5\36\20\2vw\7\21\2"+
		"\2wx\7\n\2\2xy\5\6\4\2y\u0086\3\2\2\2z{\7\30\2\2{|\5\36\20\2|}\7\n\2\2"+
		"}~\7\4\2\2~\177\5\4\3\2\177\u0086\3\2\2\2\u0080\u0081\7\30\2\2\u0081\u0082"+
		"\5\36\20\2\u0082\u0083\7\n\2\2\u0083\u0084\5\6\4\2\u0084\u0086\3\2\2\2"+
		"\u0085k\3\2\2\2\u0085s\3\2\2\2\u0085z\3\2\2\2\u0085\u0080\3\2\2\2\u0086"+
		"\13\3\2\2\2\u0087\u0088\7\35\2\2\u0088\u0089\7\24\2\2\u0089\u008a\5\20"+
		"\t\2\u008a\r\3\2\2\2\u008b\u008c\7\33\2\2\u008c\u008d\7\35\2\2\u008d\u0096"+
		"\7\t\2\2\u008e\u0093\7\35\2\2\u008f\u0090\7\5\2\2\u0090\u0092\7\35\2\2"+
		"\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u008e\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7"+
		"\n\2\2\u009a\u009b\5\4\3\2\u009b\17\3\2\2\2\u009c\u009f\5\22\n\2\u009d"+
		"\u009f\5\36\20\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\21\3\2"+
		"\2\2\u00a0\u00a1\5\24\13\2\u00a1\23\3\2\2\2\u00a2\u00a3\b\13\1\2\u00a3"+
		"\u00a4\5\26\f\2\u00a4\u00aa\3\2\2\2\u00a5\u00a6\f\4\2\2\u00a6\u00a7\t"+
		"\2\2\2\u00a7\u00a9\5\26\f\2\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\25\3\2\2\2\u00ac\u00aa\3\2\2"+
		"\2\u00ad\u00ae\b\f\1\2\u00ae\u00af\5\30\r\2\u00af\u00b5\3\2\2\2\u00b0"+
		"\u00b1\f\4\2\2\u00b1\u00b2\t\3\2\2\u00b2\u00b4\5\30\r\2\u00b3\u00b0\3"+
		"\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\27\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\b\2\2\u00b9\u00bc\5\30\r"+
		"\2\u00ba\u00bc\5\32\16\2\u00bb\u00b8\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\31\3\2\2\2\u00bd\u00be\7\35\2\2\u00be\u00c7\7\t\2\2\u00bf\u00c4\5\20"+
		"\t\2\u00c0\u00c1\7\5\2\2\u00c1\u00c3\5\20\t\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00d5\7\21\2\2\u00ca\u00cb\7\35\2\2\u00cb\u00cc\7"+
		"\6\2\2\u00cc\u00cd\5\22\n\2\u00cd\u00ce\7\3\2\2\u00ce\u00d5\3\2\2\2\u00cf"+
		"\u00d0\7\t\2\2\u00d0\u00d1\5\22\n\2\u00d1\u00d2\7\21\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d5\5\34\17\2\u00d4\u00bd\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4"+
		"\u00cf\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\t\4\2"+
		"\2\u00d7\35\3\2\2\2\u00d8\u00d9\5 \21\2\u00d9\37\3\2\2\2\u00da\u00db\b"+
		"\21\1\2\u00db\u00dc\5\"\22\2\u00dc\u00e2\3\2\2\2\u00dd\u00de\f\4\2\2\u00de"+
		"\u00df\7\16\2\2\u00df\u00e1\5\"\22\2\u00e0\u00dd\3\2\2\2\u00e1\u00e4\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3!\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e5\u00e6\5$\23\2\u00e6\u00e7\7\34\2\2\u00e7\u00e8\5$\23\2"+
		"\u00e8\u00eb\3\2\2\2\u00e9\u00eb\5$\23\2\u00ea\u00e5\3\2\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7\32\2\2\u00ed\u00f5\5$\23\2\u00ee"+
		"\u00ef\7\t\2\2\u00ef\u00f0\5\36\20\2\u00f0\u00f1\7\21\2\2\u00f1\u00f5"+
		"\3\2\2\2\u00f2\u00f5\7!\2\2\u00f3\u00f5\5&\24\2\u00f4\u00ec\3\2\2\2\u00f4"+
		"\u00ee\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5%\3\2\2\2"+
		"\u00f6\u00f7\5\22\n\2\u00f7\u00f8\t\5\2\2\u00f8\u00f9\5\22\n\2\u00f9\u00fc"+
		"\3\2\2\2\u00fa\u00fc\5(\25\2\u00fb\u00f6\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\'\3\2\2\2\u00fd\u00fe\7\35\2\2\u00fe)\3\2\2\2\26.\639AMi\u0085\u0093"+
		"\u0096\u009e\u00aa\u00b5\u00bb\u00c4\u00c7\u00d4\u00e2\u00ea\u00f4\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}