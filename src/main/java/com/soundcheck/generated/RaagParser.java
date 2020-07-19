// Generated from C:/Users/Aniruddha Sarkar/IdeaProjects/SoundCheck/src/main/resources\Raag.g4 by ANTLR 4.8
package com.soundcheck.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		T__24=25, T__25=26, T__26=27, T__27=28, VARNAME=29, FLOAT=30, DIGIT=31, 
		IGNORE=32;
	public static final int
		RULE_syntax = 0, RULE_unit = 1, RULE_rule = 2, RULE_derivation = 3, RULE_expression = 4, 
		RULE_combinator = 5, RULE_sequence = 6, RULE_option = 7, RULE_schemeCall = 8, 
		RULE_schemeNameCalled = 9, RULE_variable = 10, RULE_probability = 11, 
		RULE_schemeBlock = 12, RULE_octave = 13, RULE_octaveOption = 14, RULE_ascent = 15, 
		RULE_descent = 16, RULE_arohan = 17, RULE_avarohan = 18, RULE_schemes = 19, 
		RULE_scheme = 20, RULE_schemeName = 21, RULE_schemeDerivation = 22, RULE_schemeExpression = 23, 
		RULE_schemeProbability = 24, RULE_schemeOption = 25, RULE_combinatorScheme = 26, 
		RULE_simpleScheme = 27, RULE_swar = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"syntax", "unit", "rule", "derivation", "expression", "combinator", "sequence", 
			"option", "schemeCall", "schemeNameCalled", "variable", "probability", 
			"schemeBlock", "octave", "octaveOption", "ascent", "descent", "arohan", 
			"avarohan", "schemes", "scheme", "schemeName", "schemeDerivation", "schemeExpression", 
			"schemeProbability", "schemeOption", "combinatorScheme", "simpleScheme", 
			"swar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "';'", "'|'", "','", "'('", "'-'", "')'", "'palta'", "'{'", 
			"'}'", "'sargam'", "'arohan'", "':'", "'avarohan'", "'Sa'", "'Re'", "'re'", 
			"'Ga'", "'ga'", "'Ma'", "'ma'", "'Pa'", "'Dha'", "'dha'", "'Ni'", "'ni'", 
			"'*'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "VARNAME", "FLOAT", "DIGIT", "IGNORE"
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==VARNAME) {
				{
				{
				setState(58);
				unit();
				}
				}
				setState(63);
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
		enterRule(_localctx, 2, RULE_unit);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				rule();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
		enterRule(_localctx, 4, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			variable();
			setState(69);
			match(T__0);
			setState(70);
			derivation();
			setState(71);
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
		enterRule(_localctx, 6, RULE_derivation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			expression();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(74);
				match(T__2);
				setState(75);
				expression();
				}
				}
				setState(80);
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
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				combinator();
				setState(82);
				match(T__3);
				setState(83);
				probability();
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				sequence();
				setState(86);
				match(T__3);
				setState(87);
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
		enterRule(_localctx, 10, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__4);
			setState(92);
			option();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(93);
				match(T__5);
				setState(94);
				option();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T__3);
			setState(101);
			match(DIGIT);
			setState(102);
			match(T__6);
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
		enterRule(_localctx, 12, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			option();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(105);
				match(T__5);
				setState(106);
				option();
				}
				}
				setState(111);
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
		enterRule(_localctx, 14, RULE_option);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(VARNAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				swar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
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
		enterRule(_localctx, 16, RULE_schemeCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			schemeNameCalled();
			setState(118);
			match(T__4);
			setState(119);
			swar();
			setState(120);
			match(T__6);
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
		enterRule(_localctx, 18, RULE_schemeNameCalled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		enterRule(_localctx, 22, RULE_probability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		enterRule(_localctx, 24, RULE_schemeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__7);
			setState(129);
			match(T__8);
			setState(130);
			octave();
			setState(131);
			schemes();
			setState(132);
			match(T__9);
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
		enterRule(_localctx, 26, RULE_octave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__10);
			setState(135);
			match(T__8);
			setState(136);
			octaveOption();
			setState(137);
			match(T__9);
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
		enterRule(_localctx, 28, RULE_octaveOption);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				ascent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				ascent();
				setState(141);
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
		enterRule(_localctx, 30, RULE_ascent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__11);
			setState(146);
			match(T__12);
			setState(147);
			arohan();
			setState(148);
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
		enterRule(_localctx, 32, RULE_descent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__13);
			setState(151);
			match(T__12);
			setState(152);
			avarohan();
			setState(153);
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
		enterRule(_localctx, 34, RULE_arohan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			swar();
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				match(T__3);
				setState(157);
				swar();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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
		enterRule(_localctx, 36, RULE_avarohan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			swar();
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				match(T__3);
				setState(164);
				swar();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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
		enterRule(_localctx, 38, RULE_schemes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				scheme();
				setState(170);
				match(T__1);
				}
				}
				setState(174); 
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
		enterRule(_localctx, 40, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			schemeName();
			setState(177);
			match(T__0);
			setState(178);
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
		enterRule(_localctx, 42, RULE_schemeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 44, RULE_schemeDerivation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			schemeExpression();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(183);
				match(T__2);
				setState(184);
				schemeExpression();
				}
				}
				setState(189);
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
		enterRule(_localctx, 46, RULE_schemeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			schemeOption();
			setState(191);
			match(T__3);
			setState(192);
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
		enterRule(_localctx, 48, RULE_schemeProbability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		enterRule(_localctx, 50, RULE_schemeOption);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				combinatorScheme();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
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
		enterRule(_localctx, 52, RULE_combinatorScheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__4);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				match(DIGIT);
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(206);
			match(T__3);
			setState(207);
			match(DIGIT);
			setState(208);
			match(T__6);
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
		enterRule(_localctx, 54, RULE_simpleScheme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				match(DIGIT);
				}
				}
				setState(213); 
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
		enterRule(_localctx, 56, RULE_swar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26 || _la==T__27) {
				{
				setState(216);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5O\n\5\f\5"+
		"\16\5R\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7"+
		"\7\7b\n\7\f\7\16\7e\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bn\n\b\f\b\16\b"+
		"q\13\b\3\t\3\t\3\t\5\tv\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\5\20\u0092\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\6\23\u00a1\n\23\r\23\16\23\u00a2\3\24\3\24\3\24\6"+
		"\24\u00a8\n\24\r\24\16\24\u00a9\3\25\3\25\3\25\6\25\u00af\n\25\r\25\16"+
		"\25\u00b0\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\7\30\u00bc\n\30"+
		"\f\30\16\30\u00bf\13\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\5\33\u00c9"+
		"\n\33\3\34\3\34\6\34\u00cd\n\34\r\34\16\34\u00ce\3\34\3\34\3\34\3\34\3"+
		"\35\6\35\u00d6\n\35\r\35\16\35\u00d7\3\36\3\36\5\36\u00dc\n\36\3\36\2"+
		"\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2"+
		"\4\3\2\21\34\3\2\35\36\2\u00d1\2?\3\2\2\2\4D\3\2\2\2\6F\3\2\2\2\bK\3\2"+
		"\2\2\n[\3\2\2\2\f]\3\2\2\2\16j\3\2\2\2\20u\3\2\2\2\22w\3\2\2\2\24|\3\2"+
		"\2\2\26~\3\2\2\2\30\u0080\3\2\2\2\32\u0082\3\2\2\2\34\u0088\3\2\2\2\36"+
		"\u0091\3\2\2\2 \u0093\3\2\2\2\"\u0098\3\2\2\2$\u009d\3\2\2\2&\u00a4\3"+
		"\2\2\2(\u00ae\3\2\2\2*\u00b2\3\2\2\2,\u00b6\3\2\2\2.\u00b8\3\2\2\2\60"+
		"\u00c0\3\2\2\2\62\u00c4\3\2\2\2\64\u00c8\3\2\2\2\66\u00ca\3\2\2\28\u00d5"+
		"\3\2\2\2:\u00d9\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@\3\3\2\2\2A?\3\2\2\2BE\5\6\4\2CE\5\32\16\2DB\3\2\2\2DC\3\2\2\2E\5"+
		"\3\2\2\2FG\5\26\f\2GH\7\3\2\2HI\5\b\5\2IJ\7\4\2\2J\7\3\2\2\2KP\5\n\6\2"+
		"LM\7\5\2\2MO\5\n\6\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\t\3\2\2"+
		"\2RP\3\2\2\2ST\5\f\7\2TU\7\6\2\2UV\5\30\r\2V\\\3\2\2\2WX\5\16\b\2XY\7"+
		"\6\2\2YZ\5\30\r\2Z\\\3\2\2\2[S\3\2\2\2[W\3\2\2\2\\\13\3\2\2\2]^\7\7\2"+
		"\2^c\5\20\t\2_`\7\b\2\2`b\5\20\t\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2df\3\2\2\2ec\3\2\2\2fg\7\6\2\2gh\7!\2\2hi\7\t\2\2i\r\3\2\2\2jo\5\20"+
		"\t\2kl\7\b\2\2ln\5\20\t\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\17"+
		"\3\2\2\2qo\3\2\2\2rv\7\37\2\2sv\5:\36\2tv\5\22\n\2ur\3\2\2\2us\3\2\2\2"+
		"ut\3\2\2\2v\21\3\2\2\2wx\5\24\13\2xy\7\7\2\2yz\5:\36\2z{\7\t\2\2{\23\3"+
		"\2\2\2|}\7\37\2\2}\25\3\2\2\2~\177\7\37\2\2\177\27\3\2\2\2\u0080\u0081"+
		"\7 \2\2\u0081\31\3\2\2\2\u0082\u0083\7\n\2\2\u0083\u0084\7\13\2\2\u0084"+
		"\u0085\5\34\17\2\u0085\u0086\5(\25\2\u0086\u0087\7\f\2\2\u0087\33\3\2"+
		"\2\2\u0088\u0089\7\r\2\2\u0089\u008a\7\13\2\2\u008a\u008b\5\36\20\2\u008b"+
		"\u008c\7\f\2\2\u008c\35\3\2\2\2\u008d\u0092\5 \21\2\u008e\u008f\5 \21"+
		"\2\u008f\u0090\5\"\22\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0092\37\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0095\7\17"+
		"\2\2\u0095\u0096\5$\23\2\u0096\u0097\7\4\2\2\u0097!\3\2\2\2\u0098\u0099"+
		"\7\20\2\2\u0099\u009a\7\17\2\2\u009a\u009b\5&\24\2\u009b\u009c\7\4\2\2"+
		"\u009c#\3\2\2\2\u009d\u00a0\5:\36\2\u009e\u009f\7\6\2\2\u009f\u00a1\5"+
		":\36\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3%\3\2\2\2\u00a4\u00a7\5:\36\2\u00a5\u00a6\7\6\2\2"+
		"\u00a6\u00a8\5:\36\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\'\3\2\2\2\u00ab\u00ac\5*\26\2\u00ac"+
		"\u00ad\7\4\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1)\3\2\2\2\u00b2\u00b3"+
		"\5,\27\2\u00b3\u00b4\7\3\2\2\u00b4\u00b5\5.\30\2\u00b5+\3\2\2\2\u00b6"+
		"\u00b7\7\37\2\2\u00b7-\3\2\2\2\u00b8\u00bd\5\60\31\2\u00b9\u00ba\7\5\2"+
		"\2\u00ba\u00bc\5\60\31\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be/\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\u00c0\u00c1\5\64\33\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\5\62\32\2\u00c3"+
		"\61\3\2\2\2\u00c4\u00c5\7 \2\2\u00c5\63\3\2\2\2\u00c6\u00c9\5\66\34\2"+
		"\u00c7\u00c9\58\35\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\65"+
		"\3\2\2\2\u00ca\u00cc\7\7\2\2\u00cb\u00cd\7!\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\7\6\2\2\u00d1\u00d2\7!\2\2\u00d2\u00d3\7\t\2\2\u00d3"+
		"\67\3\2\2\2\u00d4\u00d6\7!\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d89\3\2\2\2\u00d9\u00db\t"+
		"\2\2\2\u00da\u00dc\t\3\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		";\3\2\2\2\22?DP[cou\u0091\u00a2\u00a9\u00b0\u00bd\u00c8\u00ce\u00d7\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}