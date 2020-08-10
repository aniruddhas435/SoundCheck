// Generated from C:/Users/Aniruddha Sarkar/Documents/github/SoundCheck/src/main/resources\Raag.g4 by ANTLR 4.8
package com.soundcheck.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RaagParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		VARNAME=39, FLOAT=40, DIGIT=41, IGNORE=42;
	public static final int
		RULE_syntax = 0, RULE_declarations = 1, RULE_optionalDeclarations = 2, 
		RULE_outFileName = 3, RULE_start = 4, RULE_baseFreq = 5, RULE_beatsPerCycle = 6, 
		RULE_numCycles = 7, RULE_low = 8, RULE_high = 9, RULE_msec = 10, RULE_volume = 11, 
		RULE_playFileName = 12, RULE_wavFileName = 13, RULE_unit = 14, RULE_rule = 15, 
		RULE_derivation = 16, RULE_expression = 17, RULE_combinator = 18, RULE_sequence = 19, 
		RULE_option = 20, RULE_schemeCall = 21, RULE_schemeNameCalled = 22, RULE_variable = 23, 
		RULE_probability = 24, RULE_schemeBlock = 25, RULE_octave = 26, RULE_octaveOption = 27, 
		RULE_ascent = 28, RULE_descent = 29, RULE_arohan = 30, RULE_avarohan = 31, 
		RULE_schemes = 32, RULE_scheme = 33, RULE_schemeName = 34, RULE_schemeDerivation = 35, 
		RULE_schemeExpression = 36, RULE_schemeProbability = 37, RULE_schemeOption = 38, 
		RULE_combinatorScheme = 39, RULE_simpleScheme = 40, RULE_swar = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"syntax", "declarations", "optionalDeclarations", "outFileName", "start", 
			"baseFreq", "beatsPerCycle", "numCycles", "low", "high", "msec", "volume", 
			"playFileName", "wavFileName", "unit", "rule", "derivation", "expression", 
			"combinator", "sequence", "option", "schemeCall", "schemeNameCalled", 
			"variable", "probability", "schemeBlock", "octave", "octaveOption", "ascent", 
			"descent", "arohan", "avarohan", "schemes", "scheme", "schemeName", "schemeDerivation", 
			"schemeExpression", "schemeProbability", "schemeOption", "combinatorScheme", 
			"simpleScheme", "swar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'beatsPerCycle:'", "';'", "'numCycles:'", "'Range:'", "'-'", "'OutFile:'", 
			"'Start:'", "'base:'", "'msec:'", "'volume:'", "'playFile:'", "'wavFile:'", 
			"'->'", "'|'", "','", "'('", "')'", "'palta'", "'{'", "'}'", "'sargam'", 
			"'arohan'", "':'", "'avarohan'", "'Sa'", "'Re'", "'re'", "'Ga'", "'ga'", 
			"'Ma'", "'ma'", "'Pa'", "'Dha'", "'dha'", "'Ni'", "'ni'", "'*'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "VARNAME", "FLOAT", "DIGIT", "IGNORE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Raag.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RaagParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SyntaxContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<UnitContext> unit() {
			return getRuleContexts(UnitContext.class);
		}
		public UnitContext unit(int i) {
			return getRuleContext(UnitContext.class,i);
		}
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_syntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			declarations();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==VARNAME) {
				{
				{
				setState(85);
				unit();
				}
				}
				setState(90);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public BeatsPerCycleContext beatsPerCycle() {
			return getRuleContext(BeatsPerCycleContext.class,0);
		}
		public NumCyclesContext numCycles() {
			return getRuleContext(NumCyclesContext.class,0);
		}
		public LowContext low() {
			return getRuleContext(LowContext.class,0);
		}
		public HighContext high() {
			return getRuleContext(HighContext.class,0);
		}
		public OptionalDeclarationsContext optionalDeclarations() {
			return getRuleContext(OptionalDeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__0);
			setState(92);
			beatsPerCycle();
			setState(93);
			match(T__1);
			setState(94);
			match(T__2);
			setState(95);
			numCycles();
			setState(96);
			match(T__1);
			setState(97);
			match(T__3);
			setState(98);
			low();
			setState(99);
			match(T__4);
			setState(100);
			high();
			setState(101);
			match(T__1);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(102);
				optionalDeclarations();
				}
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

	public static class OptionalDeclarationsContext extends ParserRuleContext {
		public OutFileNameContext outFileName() {
			return getRuleContext(OutFileNameContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public BaseFreqContext baseFreq() {
			return getRuleContext(BaseFreqContext.class,0);
		}
		public MsecContext msec() {
			return getRuleContext(MsecContext.class,0);
		}
		public VolumeContext volume() {
			return getRuleContext(VolumeContext.class,0);
		}
		public PlayFileNameContext playFileName() {
			return getRuleContext(PlayFileNameContext.class,0);
		}
		public WavFileNameContext wavFileName() {
			return getRuleContext(WavFileNameContext.class,0);
		}
		public OptionalDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterOptionalDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitOptionalDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitOptionalDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalDeclarationsContext optionalDeclarations() throws RecognitionException {
		OptionalDeclarationsContext _localctx = new OptionalDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_optionalDeclarations);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__5);
				setState(106);
				outFileName();
				setState(107);
				match(T__1);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__6);
				setState(110);
				start();
				setState(111);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(T__7);
				setState(114);
				baseFreq();
				setState(115);
				match(T__1);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(T__8);
				setState(118);
				msec();
				setState(119);
				match(T__1);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(T__9);
				setState(122);
				volume();
				setState(123);
				match(T__1);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				match(T__10);
				setState(126);
				playFileName();
				setState(127);
				match(T__1);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				match(T__11);
				setState(130);
				wavFileName();
				setState(131);
				match(T__1);
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

	public static class OutFileNameContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RaagParser.VARNAME, 0); }
		public OutFileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outFileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterOutFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitOutFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitOutFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutFileNameContext outFileName() throws RecognitionException {
		OutFileNameContext _localctx = new OutFileNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_outFileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(VARNAME);
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RaagParser.VARNAME, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(VARNAME);
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

	public static class BaseFreqContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(RaagParser.FLOAT, 0); }
		public BaseFreqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseFreq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterBaseFreq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitBaseFreq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitBaseFreq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseFreqContext baseFreq() throws RecognitionException {
		BaseFreqContext _localctx = new BaseFreqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_baseFreq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(FLOAT);
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

	public static class BeatsPerCycleContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RaagParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RaagParser.DIGIT, i);
		}
		public BeatsPerCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beatsPerCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterBeatsPerCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitBeatsPerCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitBeatsPerCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeatsPerCycleContext beatsPerCycle() throws RecognitionException {
		BeatsPerCycleContext _localctx = new BeatsPerCycleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_beatsPerCycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				match(DIGIT);
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class NumCyclesContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RaagParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RaagParser.DIGIT, i);
		}
		public NumCyclesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numCycles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterNumCycles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitNumCycles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitNumCycles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumCyclesContext numCycles() throws RecognitionException {
		NumCyclesContext _localctx = new NumCyclesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numCycles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(DIGIT);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class LowContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RaagParser.VARNAME, 0); }
		public LowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_low; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterLow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitLow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitLow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowContext low() throws RecognitionException {
		LowContext _localctx = new LowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_low);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(VARNAME);
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

	public static class HighContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RaagParser.VARNAME, 0); }
		public HighContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_high; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterHigh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitHigh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitHigh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HighContext high() throws RecognitionException {
		HighContext _localctx = new HighContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_high);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(VARNAME);
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

	public static class MsecContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RaagParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RaagParser.DIGIT, i);
		}
		public MsecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterMsec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitMsec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitMsec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsecContext msec() throws RecognitionException {
		MsecContext _localctx = new MsecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_msec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(DIGIT);
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class VolumeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(RaagParser.FLOAT, 0); }
		public VolumeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_volume; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterVolume(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitVolume(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitVolume(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VolumeContext volume() throws RecognitionException {
		VolumeContext _localctx = new VolumeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_volume);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(FLOAT);
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

	public static class PlayFileNameContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RaagParser.VARNAME, 0); }
		public PlayFileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playFileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterPlayFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitPlayFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitPlayFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayFileNameContext playFileName() throws RecognitionException {
		PlayFileNameContext _localctx = new PlayFileNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_playFileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(VARNAME);
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

	public static class WavFileNameContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RaagParser.VARNAME, 0); }
		public WavFileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wavFileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterWavFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitWavFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitWavFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WavFileNameContext wavFileName() throws RecognitionException {
		WavFileNameContext _localctx = new WavFileNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_wavFileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(VARNAME);
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

	public static class UnitContext extends ParserRuleContext {
		public RuleContext rule() {
			return getRuleContext(RuleContext.class,0);
		}
		public SchemeBlockContext schemeBlock() {
			return getRuleContext(SchemeBlockContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unit);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				rule();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				schemeBlock();
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

	public static class RuleContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DerivationContext derivation() {
			return getRuleContext(DerivationContext.class,0);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			variable();
			setState(171);
			match(T__12);
			setState(172);
			derivation();
			setState(173);
			match(T__1);
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

	public static class DerivationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DerivationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterDerivation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitDerivation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitDerivation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivationContext derivation() throws RecognitionException {
		DerivationContext _localctx = new DerivationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_derivation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			expression();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(176);
				match(T__13);
				setState(177);
				expression();
				}
				}
				setState(182);
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

	public static class ExpressionContext extends ParserRuleContext {
		public CombinatorContext combinator() {
			return getRuleContext(CombinatorContext.class,0);
		}
		public ProbabilityContext probability() {
			return getRuleContext(ProbabilityContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				combinator();
				setState(184);
				match(T__14);
				setState(185);
				probability();
				}
				break;
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				sequence();
				setState(188);
				match(T__14);
				setState(189);
				probability();
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

	public static class CombinatorContext extends ParserRuleContext {
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public TerminalNode DIGIT() { return getToken(RaagParser.DIGIT, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__15);
			setState(194);
			option();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(195);
				match(T__4);
				setState(196);
				option();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__14);
			setState(203);
			match(DIGIT);
			setState(204);
			match(T__16);
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

	public static class SequenceContext extends ParserRuleContext {
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			option();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(207);
				match(T__4);
				setState(208);
				option();
				}
				}
				setState(213);
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RaagParser.VARNAME, 0); }
		public SwarContext swar() {
			return getRuleContext(SwarContext.class,0);
		}
		public SchemeCallContext schemeCall() {
			return getRuleContext(SchemeCallContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_option);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(VARNAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				swar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				schemeCall();
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

	public static class SchemeCallContext extends ParserRuleContext {
		public SchemeNameCalledContext schemeNameCalled() {
			return getRuleContext(SchemeNameCalledContext.class,0);
		}
		public SwarContext swar() {
			return getRuleContext(SwarContext.class,0);
		}
		public SchemeCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemeCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSchemeCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSchemeCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSchemeCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeCallContext schemeCall() throws RecognitionException {
		SchemeCallContext _localctx = new SchemeCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_schemeCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			schemeNameCalled();
			setState(220);
			match(T__15);
			setState(221);
			swar();
			setState(222);
			match(T__16);
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

	public static class SchemeNameCalledContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RaagParser.VARNAME, 0); }
		public SchemeNameCalledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemeNameCalled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSchemeNameCalled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSchemeNameCalled(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSchemeNameCalled(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeNameCalledContext schemeNameCalled() throws RecognitionException {
		SchemeNameCalledContext _localctx = new SchemeNameCalledContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_schemeNameCalled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(VARNAME);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RaagParser.VARNAME, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(VARNAME);
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

	public static class ProbabilityContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(RaagParser.FLOAT, 0); }
		public ProbabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterProbability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitProbability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitProbability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbabilityContext probability() throws RecognitionException {
		ProbabilityContext _localctx = new ProbabilityContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_probability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(FLOAT);
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

	public static class SchemeBlockContext extends ParserRuleContext {
		public OctaveContext octave() {
			return getRuleContext(OctaveContext.class,0);
		}
		public SchemesContext schemes() {
			return getRuleContext(SchemesContext.class,0);
		}
		public SchemeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSchemeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSchemeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSchemeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeBlockContext schemeBlock() throws RecognitionException {
		SchemeBlockContext _localctx = new SchemeBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_schemeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__17);
			setState(231);
			match(T__18);
			setState(232);
			octave();
			setState(233);
			schemes();
			setState(234);
			match(T__19);
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

	public static class OctaveContext extends ParserRuleContext {
		public OctaveOptionContext octaveOption() {
			return getRuleContext(OctaveOptionContext.class,0);
		}
		public OctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterOctave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitOctave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitOctave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveContext octave() throws RecognitionException {
		OctaveContext _localctx = new OctaveContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_octave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__20);
			setState(237);
			match(T__18);
			setState(238);
			octaveOption();
			setState(239);
			match(T__19);
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

	public static class OctaveOptionContext extends ParserRuleContext {
		public AscentContext ascent() {
			return getRuleContext(AscentContext.class,0);
		}
		public DescentContext descent() {
			return getRuleContext(DescentContext.class,0);
		}
		public OctaveOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octaveOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterOctaveOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitOctaveOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitOctaveOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveOptionContext octaveOption() throws RecognitionException {
		OctaveOptionContext _localctx = new OctaveOptionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_octaveOption);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				ascent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				ascent();
				setState(243);
				descent();
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

	public static class AscentContext extends ParserRuleContext {
		public ArohanContext arohan() {
			return getRuleContext(ArohanContext.class,0);
		}
		public AscentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterAscent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitAscent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitAscent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscentContext ascent() throws RecognitionException {
		AscentContext _localctx = new AscentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ascent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__21);
			setState(248);
			match(T__22);
			setState(249);
			arohan();
			setState(250);
			match(T__1);
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

	public static class DescentContext extends ParserRuleContext {
		public AvarohanContext avarohan() {
			return getRuleContext(AvarohanContext.class,0);
		}
		public DescentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterDescent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitDescent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitDescent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescentContext descent() throws RecognitionException {
		DescentContext _localctx = new DescentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_descent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__23);
			setState(253);
			match(T__22);
			setState(254);
			avarohan();
			setState(255);
			match(T__1);
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

	public static class ArohanContext extends ParserRuleContext {
		public List<SwarContext> swar() {
			return getRuleContexts(SwarContext.class);
		}
		public SwarContext swar(int i) {
			return getRuleContext(SwarContext.class,i);
		}
		public ArohanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arohan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterArohan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitArohan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitArohan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArohanContext arohan() throws RecognitionException {
		ArohanContext _localctx = new ArohanContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arohan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			swar();
			setState(260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				match(T__14);
				setState(259);
				swar();
				}
				}
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
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

	public static class AvarohanContext extends ParserRuleContext {
		public List<SwarContext> swar() {
			return getRuleContexts(SwarContext.class);
		}
		public SwarContext swar(int i) {
			return getRuleContext(SwarContext.class,i);
		}
		public AvarohanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avarohan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterAvarohan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitAvarohan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitAvarohan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvarohanContext avarohan() throws RecognitionException {
		AvarohanContext _localctx = new AvarohanContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_avarohan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			swar();
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				match(T__14);
				setState(266);
				swar();
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
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

	public static class SchemesContext extends ParserRuleContext {
		public List<SchemeContext> scheme() {
			return getRuleContexts(SchemeContext.class);
		}
		public SchemeContext scheme(int i) {
			return getRuleContext(SchemeContext.class,i);
		}
		public SchemesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSchemes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSchemes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSchemes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemesContext schemes() throws RecognitionException {
		SchemesContext _localctx = new SchemesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_schemes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(271);
				scheme();
				setState(272);
				match(T__1);
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARNAME );
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

	public static class SchemeContext extends ParserRuleContext {
		public SchemeNameContext schemeName() {
			return getRuleContext(SchemeNameContext.class,0);
		}
		public SchemeDerivationContext schemeDerivation() {
			return getRuleContext(SchemeDerivationContext.class,0);
		}
		public SchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitScheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			schemeName();
			setState(279);
			match(T__12);
			setState(280);
			schemeDerivation();
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

	public static class SchemeNameContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(RaagParser.VARNAME, 0); }
		public SchemeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSchemeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSchemeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSchemeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeNameContext schemeName() throws RecognitionException {
		SchemeNameContext _localctx = new SchemeNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_schemeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(VARNAME);
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

	public static class SchemeDerivationContext extends ParserRuleContext {
		public List<SchemeExpressionContext> schemeExpression() {
			return getRuleContexts(SchemeExpressionContext.class);
		}
		public SchemeExpressionContext schemeExpression(int i) {
			return getRuleContext(SchemeExpressionContext.class,i);
		}
		public SchemeDerivationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemeDerivation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSchemeDerivation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSchemeDerivation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSchemeDerivation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeDerivationContext schemeDerivation() throws RecognitionException {
		SchemeDerivationContext _localctx = new SchemeDerivationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_schemeDerivation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			schemeExpression();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(285);
				match(T__13);
				setState(286);
				schemeExpression();
				}
				}
				setState(291);
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

	public static class SchemeExpressionContext extends ParserRuleContext {
		public SchemeOptionContext schemeOption() {
			return getRuleContext(SchemeOptionContext.class,0);
		}
		public SchemeProbabilityContext schemeProbability() {
			return getRuleContext(SchemeProbabilityContext.class,0);
		}
		public SchemeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSchemeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSchemeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSchemeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeExpressionContext schemeExpression() throws RecognitionException {
		SchemeExpressionContext _localctx = new SchemeExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_schemeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			schemeOption();
			setState(293);
			match(T__14);
			setState(294);
			schemeProbability();
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

	public static class SchemeProbabilityContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(RaagParser.FLOAT, 0); }
		public SchemeProbabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemeProbability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSchemeProbability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSchemeProbability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSchemeProbability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeProbabilityContext schemeProbability() throws RecognitionException {
		SchemeProbabilityContext _localctx = new SchemeProbabilityContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_schemeProbability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(FLOAT);
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

	public static class SchemeOptionContext extends ParserRuleContext {
		public CombinatorSchemeContext combinatorScheme() {
			return getRuleContext(CombinatorSchemeContext.class,0);
		}
		public SimpleSchemeContext simpleScheme() {
			return getRuleContext(SimpleSchemeContext.class,0);
		}
		public SchemeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemeOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSchemeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSchemeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSchemeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeOptionContext schemeOption() throws RecognitionException {
		SchemeOptionContext _localctx = new SchemeOptionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_schemeOption);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				combinatorScheme();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				simpleScheme();
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

	public static class CombinatorSchemeContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RaagParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RaagParser.DIGIT, i);
		}
		public CombinatorSchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinatorScheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterCombinatorScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitCombinatorScheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitCombinatorScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorSchemeContext combinatorScheme() throws RecognitionException {
		CombinatorSchemeContext _localctx = new CombinatorSchemeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_combinatorScheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__15);
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				match(DIGIT);
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(308);
			match(T__14);
			setState(309);
			match(DIGIT);
			setState(310);
			match(T__16);
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

	public static class SimpleSchemeContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(RaagParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(RaagParser.DIGIT, i);
		}
		public SimpleSchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleScheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSimpleScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSimpleScheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSimpleScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSchemeContext simpleScheme() throws RecognitionException {
		SimpleSchemeContext _localctx = new SimpleSchemeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_simpleScheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				match(DIGIT);
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class SwarContext extends ParserRuleContext {
		public SwarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).enterSwar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaagListener ) ((RaagListener)listener).exitSwar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaagVisitor ) return ((RaagVisitor<? extends T>)visitor).visitSwar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwarContext swar() throws RecognitionException {
		SwarContext _localctx = new SwarContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_swar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36 || _la==T__37) {
				{
				setState(318);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0144\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0088"+
		"\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b\u0091\n\b\r\b\16\b\u0092\3\t\6\t"+
		"\u0096\n\t\r\t\16\t\u0097\3\n\3\n\3\13\3\13\3\f\6\f\u009f\n\f\r\f\16\f"+
		"\u00a0\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u00ab\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00b5\n\22\f\22\16\22\u00b8\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c2\n\23\3\24\3\24\3\24"+
		"\3\24\7\24\u00c8\n\24\f\24\16\24\u00cb\13\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\7\25\u00d4\n\25\f\25\16\25\u00d7\13\25\3\26\3\26\3\26\5\26"+
		"\u00dc\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\5\35\u00f8\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \6 \u0107\n \r \16 \u0108\3!\3!\3!\6!\u010e\n!\r!\16!\u010f\3\""+
		"\3\"\3\"\6\"\u0115\n\"\r\"\16\"\u0116\3#\3#\3#\3#\3$\3$\3%\3%\3%\7%\u0122"+
		"\n%\f%\16%\u0125\13%\3&\3&\3&\3&\3\'\3\'\3(\3(\5(\u012f\n(\3)\3)\6)\u0133"+
		"\n)\r)\16)\u0134\3)\3)\3)\3)\3*\6*\u013c\n*\r*\16*\u013d\3+\3+\5+\u0142"+
		"\n+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRT\2\4\3\2\33&\3\2\'(\2\u0134\2V\3\2\2\2\4]\3\2\2\2\6\u0087"+
		"\3\2\2\2\b\u0089\3\2\2\2\n\u008b\3\2\2\2\f\u008d\3\2\2\2\16\u0090\3\2"+
		"\2\2\20\u0095\3\2\2\2\22\u0099\3\2\2\2\24\u009b\3\2\2\2\26\u009e\3\2\2"+
		"\2\30\u00a2\3\2\2\2\32\u00a4\3\2\2\2\34\u00a6\3\2\2\2\36\u00aa\3\2\2\2"+
		" \u00ac\3\2\2\2\"\u00b1\3\2\2\2$\u00c1\3\2\2\2&\u00c3\3\2\2\2(\u00d0\3"+
		"\2\2\2*\u00db\3\2\2\2,\u00dd\3\2\2\2.\u00e2\3\2\2\2\60\u00e4\3\2\2\2\62"+
		"\u00e6\3\2\2\2\64\u00e8\3\2\2\2\66\u00ee\3\2\2\28\u00f7\3\2\2\2:\u00f9"+
		"\3\2\2\2<\u00fe\3\2\2\2>\u0103\3\2\2\2@\u010a\3\2\2\2B\u0114\3\2\2\2D"+
		"\u0118\3\2\2\2F\u011c\3\2\2\2H\u011e\3\2\2\2J\u0126\3\2\2\2L\u012a\3\2"+
		"\2\2N\u012e\3\2\2\2P\u0130\3\2\2\2R\u013b\3\2\2\2T\u013f\3\2\2\2VZ\5\4"+
		"\3\2WY\5\36\20\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\3\3\2\2\2\\"+
		"Z\3\2\2\2]^\7\3\2\2^_\5\16\b\2_`\7\4\2\2`a\7\5\2\2ab\5\20\t\2bc\7\4\2"+
		"\2cd\7\6\2\2de\5\22\n\2ef\7\7\2\2fg\5\24\13\2gi\7\4\2\2hj\5\6\4\2ih\3"+
		"\2\2\2ij\3\2\2\2j\5\3\2\2\2kl\7\b\2\2lm\5\b\5\2mn\7\4\2\2n\u0088\3\2\2"+
		"\2op\7\t\2\2pq\5\n\6\2qr\7\4\2\2r\u0088\3\2\2\2st\7\n\2\2tu\5\f\7\2uv"+
		"\7\4\2\2v\u0088\3\2\2\2wx\7\13\2\2xy\5\26\f\2yz\7\4\2\2z\u0088\3\2\2\2"+
		"{|\7\f\2\2|}\5\30\r\2}~\7\4\2\2~\u0088\3\2\2\2\177\u0080\7\r\2\2\u0080"+
		"\u0081\5\32\16\2\u0081\u0082\7\4\2\2\u0082\u0088\3\2\2\2\u0083\u0084\7"+
		"\16\2\2\u0084\u0085\5\34\17\2\u0085\u0086\7\4\2\2\u0086\u0088\3\2\2\2"+
		"\u0087k\3\2\2\2\u0087o\3\2\2\2\u0087s\3\2\2\2\u0087w\3\2\2\2\u0087{\3"+
		"\2\2\2\u0087\177\3\2\2\2\u0087\u0083\3\2\2\2\u0088\7\3\2\2\2\u0089\u008a"+
		"\7)\2\2\u008a\t\3\2\2\2\u008b\u008c\7)\2\2\u008c\13\3\2\2\2\u008d\u008e"+
		"\7*\2\2\u008e\r\3\2\2\2\u008f\u0091\7+\2\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\17\3\2\2\2\u0094"+
		"\u0096\7+\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\21\3\2\2\2\u0099\u009a\7)\2\2\u009a\23"+
		"\3\2\2\2\u009b\u009c\7)\2\2\u009c\25\3\2\2\2\u009d\u009f\7+\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\7*\2\2\u00a3\31\3\2\2\2\u00a4\u00a5"+
		"\7)\2\2\u00a5\33\3\2\2\2\u00a6\u00a7\7)\2\2\u00a7\35\3\2\2\2\u00a8\u00ab"+
		"\5 \21\2\u00a9\u00ab\5\64\33\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\37\3\2\2\2\u00ac\u00ad\5\60\31\2\u00ad\u00ae\7\17\2\2\u00ae\u00af"+
		"\5\"\22\2\u00af\u00b0\7\4\2\2\u00b0!\3\2\2\2\u00b1\u00b6\5$\23\2\u00b2"+
		"\u00b3\7\20\2\2\u00b3\u00b5\5$\23\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7#\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\5&\24\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc\5\62\32"+
		"\2\u00bc\u00c2\3\2\2\2\u00bd\u00be\5(\25\2\u00be\u00bf\7\21\2\2\u00bf"+
		"\u00c0\5\62\32\2\u00c0\u00c2\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00bd\3"+
		"\2\2\2\u00c2%\3\2\2\2\u00c3\u00c4\7\22\2\2\u00c4\u00c9\5*\26\2\u00c5\u00c6"+
		"\7\7\2\2\u00c6\u00c8\5*\26\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cd\7\21\2\2\u00cd\u00ce\7+\2\2\u00ce\u00cf\7\23\2\2\u00cf"+
		"\'\3\2\2\2\u00d0\u00d5\5*\26\2\u00d1\u00d2\7\7\2\2\u00d2\u00d4\5*\26\2"+
		"\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6)\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dc\7)\2\2\u00d9\u00dc"+
		"\5T+\2\u00da\u00dc\5,\27\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc+\3\2\2\2\u00dd\u00de\5.\30\2\u00de\u00df\7\22\2\2"+
		"\u00df\u00e0\5T+\2\u00e0\u00e1\7\23\2\2\u00e1-\3\2\2\2\u00e2\u00e3\7)"+
		"\2\2\u00e3/\3\2\2\2\u00e4\u00e5\7)\2\2\u00e5\61\3\2\2\2\u00e6\u00e7\7"+
		"*\2\2\u00e7\63\3\2\2\2\u00e8\u00e9\7\24\2\2\u00e9\u00ea\7\25\2\2\u00ea"+
		"\u00eb\5\66\34\2\u00eb\u00ec\5B\"\2\u00ec\u00ed\7\26\2\2\u00ed\65\3\2"+
		"\2\2\u00ee\u00ef\7\27\2\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1\58\35\2\u00f1"+
		"\u00f2\7\26\2\2\u00f2\67\3\2\2\2\u00f3\u00f8\5:\36\2\u00f4\u00f5\5:\36"+
		"\2\u00f5\u00f6\5<\37\2\u00f6\u00f8\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4"+
		"\3\2\2\2\u00f89\3\2\2\2\u00f9\u00fa\7\30\2\2\u00fa\u00fb\7\31\2\2\u00fb"+
		"\u00fc\5> \2\u00fc\u00fd\7\4\2\2\u00fd;\3\2\2\2\u00fe\u00ff\7\32\2\2\u00ff"+
		"\u0100\7\31\2\2\u0100\u0101\5@!\2\u0101\u0102\7\4\2\2\u0102=\3\2\2\2\u0103"+
		"\u0106\5T+\2\u0104\u0105\7\21\2\2\u0105\u0107\5T+\2\u0106\u0104\3\2\2"+
		"\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109?"+
		"\3\2\2\2\u010a\u010d\5T+\2\u010b\u010c\7\21\2\2\u010c\u010e\5T+\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110A\3\2\2\2\u0111\u0112\5D#\2\u0112\u0113\7\4\2\2\u0113\u0115"+
		"\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117C\3\2\2\2\u0118\u0119\5F$\2\u0119\u011a\7\17\2\2\u011a"+
		"\u011b\5H%\2\u011bE\3\2\2\2\u011c\u011d\7)\2\2\u011dG\3\2\2\2\u011e\u0123"+
		"\5J&\2\u011f\u0120\7\20\2\2\u0120\u0122\5J&\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124I\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0126\u0127\5N(\2\u0127\u0128\7\21\2\2\u0128\u0129"+
		"\5L\'\2\u0129K\3\2\2\2\u012a\u012b\7*\2\2\u012bM\3\2\2\2\u012c\u012f\5"+
		"P)\2\u012d\u012f\5R*\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012fO"+
		"\3\2\2\2\u0130\u0132\7\22\2\2\u0131\u0133\7+\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0137\7\21\2\2\u0137\u0138\7+\2\2\u0138\u0139\7\23\2\2\u0139"+
		"Q\3\2\2\2\u013a\u013c\7+\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013eS\3\2\2\2\u013f\u0141\t\2\2\2"+
		"\u0140\u0142\t\3\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142U\3"+
		"\2\2\2\27Zi\u0087\u0092\u0097\u00a0\u00aa\u00b6\u00c1\u00c9\u00d5\u00db"+
		"\u00f7\u0108\u010f\u0116\u0123\u012e\u0134\u013d\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}