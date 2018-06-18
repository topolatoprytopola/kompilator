// Generated from C:/Users/damia/Desktop/kompilator/src/main/java\C.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INTT=3, DOUBLET=4, BOOLEANT=5, VOIDT=6, IFT=7, WHILET=8, 
		RETURNT=9, FORT=10, ASSIGT=11, EQUALT=12, PLUST=13, MINUST=14, MULTIT=15, 
		DIVT=16, BIGGERT=17, SMALLERT=18, DIFFRENTT=19, LROBRACKETT=20, RROBRACKETT=21, 
		LSQBRACKETT=22, RSQBRACKETT=23, LBRACKETT=24, RBRACKETT=25, SMOREQT=26, 
		BIOREQT=27, COMMENTT=28, INCT=29, DECRT=30, BOOLEAN=31, INT=32, DOUBLE=33, 
		NAME=34, Whitespace=35, LineComment=36, BlockComment=37;
	public static final int
		RULE_start = 0, RULE_function = 1, RULE_variables = 2, RULE_variable = 3, 
		RULE_functionname = 4, RULE_inside = 5, RULE_returnf = 6, RULE_line = 7, 
		RULE_assignment = 8, RULE_math = 9, RULE_operation = 10, RULE_comparison = 11, 
		RULE_compsign = 12, RULE_acc = 13, RULE_dec = 14, RULE_iff = 15, RULE_value = 16, 
		RULE_type = 17;
	public static final String[] ruleNames = {
		"start", "function", "variables", "variable", "functionname", "inside", 
		"returnf", "line", "assignment", "math", "operation", "comparison", "compsign", 
		"acc", "dec", "iff", "value", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "';'", "'int'", "'double'", "'boolean'", "'void'", "'if'", 
		"'while'", "'return'", "'for'", "'='", "'=='", "'+'", "'-'", "'*'", "'/'", 
		"'>'", "'<'", "'!='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<='", 
		"'>='", "'//'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INTT", "DOUBLET", "BOOLEANT", "VOIDT", "IFT", "WHILET", 
		"RETURNT", "FORT", "ASSIGT", "EQUALT", "PLUST", "MINUST", "MULTIT", "DIVT", 
		"BIGGERT", "SMALLERT", "DIFFRENTT", "LROBRACKETT", "RROBRACKETT", "LSQBRACKETT", 
		"RSQBRACKETT", "LBRACKETT", "RBRACKETT", "SMOREQT", "BIOREQT", "COMMENTT", 
		"INCT", "DECRT", "BOOLEAN", "INT", "DOUBLE", "NAME", "Whitespace", "LineComment", 
		"BlockComment"
	};
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
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTT) | (1L << DOUBLET) | (1L << BOOLEANT) | (1L << VOIDT))) != 0)) {
				{
				{
				setState(36);
				function();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionnameContext functionname() {
			return getRuleContext(FunctionnameContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public InsideContext inside() {
			return getRuleContext(InsideContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			functionname();
			setState(45);
			match(LROBRACKETT);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTT) | (1L << DOUBLET) | (1L << BOOLEANT) | (1L << VOIDT))) != 0)) {
				{
				setState(46);
				variables();
				}
			}

			setState(49);
			match(RROBRACKETT);
			setState(50);
			match(LBRACKETT);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTT) | (1L << DOUBLET) | (1L << BOOLEANT) | (1L << VOIDT) | (1L << IFT) | (1L << RETURNT) | (1L << BOOLEAN) | (1L << INT) | (1L << DOUBLE) | (1L << NAME))) != 0)) {
				{
				setState(51);
				inside();
				}
			}

			setState(54);
			match(RBRACKETT);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				variable();
				setState(58);
				match(T__0);
				setState(59);
				variables();
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

	public static class VariableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(CParser.NAME, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			type();
			setState(64);
			match(NAME);
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

	public static class FunctionnameContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(CParser.NAME, 0); }
		public FunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterFunctionname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitFunctionname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitFunctionname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionnameContext functionname() throws RecognitionException {
		FunctionnameContext _localctx = new FunctionnameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			type();
			setState(67);
			match(NAME);
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

	public static class InsideContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public InsideContext inside() {
			return getRuleContext(InsideContext.class,0);
		}
		public InsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsideContext inside() throws RecognitionException {
		InsideContext _localctx = new InsideContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inside);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			line();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTT) | (1L << DOUBLET) | (1L << BOOLEANT) | (1L << VOIDT) | (1L << IFT) | (1L << RETURNT) | (1L << BOOLEAN) | (1L << INT) | (1L << DOUBLE) | (1L << NAME))) != 0)) {
				{
				setState(70);
				inside();
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

	public static class ReturnfContext extends ParserRuleContext {
		public TerminalNode RETURNT() { return getToken(CParser.RETURNT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NAME() { return getToken(CParser.NAME, 0); }
		public ReturnfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterReturnf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitReturnf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitReturnf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnfContext returnf() throws RecognitionException {
		ReturnfContext _localctx = new ReturnfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnf);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(RETURNT);
				setState(74);
				value();
				setState(75);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(RETURNT);
				setState(78);
				match(NAME);
				setState(79);
				match(T__1);
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

	public static class LineContext extends ParserRuleContext {
		public AccContext acc() {
			return getRuleContext(AccContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IffContext iff() {
			return getRuleContext(IffContext.class,0);
		}
		public ReturnfContext returnf() {
			return getRuleContext(ReturnfContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_line);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				acc();
				setState(83);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				dec();
				setState(86);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				assignment();
				setState(89);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				iff();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				returnf();
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGT() { return getToken(CParser.ASSIGT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				variable();
				setState(96);
				match(ASSIGT);
				setState(97);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				variable();
				setState(100);
				match(ASSIGT);
				setState(101);
				math();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				value();
				setState(104);
				match(ASSIGT);
				setState(105);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				value();
				setState(108);
				match(ASSIGT);
				setState(109);
				math();
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

	public static class MathContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_math);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			value();
			setState(114);
			operation();
			setState(115);
			value();
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode PLUST() { return getToken(CParser.PLUST, 0); }
		public TerminalNode MINUST() { return getToken(CParser.MINUST, 0); }
		public TerminalNode DIVT() { return getToken(CParser.DIVT, 0); }
		public TerminalNode MULTIT() { return getToken(CParser.MULTIT, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUST) | (1L << MINUST) | (1L << MULTIT) | (1L << DIVT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public CompsignContext compsign() {
			return getRuleContext(CompsignContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			value();
			setState(120);
			compsign();
			setState(121);
			value();
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

	public static class CompsignContext extends ParserRuleContext {
		public TerminalNode EQUALT() { return getToken(CParser.EQUALT, 0); }
		public TerminalNode BIGGERT() { return getToken(CParser.BIGGERT, 0); }
		public TerminalNode SMALLERT() { return getToken(CParser.SMALLERT, 0); }
		public TerminalNode DIFFRENTT() { return getToken(CParser.DIFFRENTT, 0); }
		public TerminalNode SMOREQT() { return getToken(CParser.SMOREQT, 0); }
		public TerminalNode BIOREQT() { return getToken(CParser.BIOREQT, 0); }
		public CompsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compsign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterCompsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitCompsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitCompsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompsignContext compsign() throws RecognitionException {
		CompsignContext _localctx = new CompsignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compsign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALT) | (1L << BIGGERT) | (1L << SMALLERT) | (1L << DIFFRENTT) | (1L << SMOREQT) | (1L << BIOREQT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AccContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CParser.NAME, 0); }
		public TerminalNode INCT() { return getToken(CParser.INCT, 0); }
		public AccContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterAcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitAcc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitAcc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccContext acc() throws RecognitionException {
		AccContext _localctx = new AccContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_acc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(NAME);
			setState(126);
			match(INCT);
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

	public static class DecContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CParser.NAME, 0); }
		public TerminalNode DECRT() { return getToken(CParser.DECRT, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(NAME);
			setState(129);
			match(DECRT);
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

	public static class IffContext extends ParserRuleContext {
		public TerminalNode IFT() { return getToken(CParser.IFT, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public InsideContext inside() {
			return getRuleContext(InsideContext.class,0);
		}
		public IffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterIff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitIff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitIff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IffContext iff() throws RecognitionException {
		IffContext _localctx = new IffContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IFT);
			setState(132);
			match(LROBRACKETT);
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(133);
				comparison();
				}
				break;
			case 2:
				{
				setState(134);
				value();
				}
				break;
			}
			setState(137);
			match(RROBRACKETT);
			setState(138);
			match(LBRACKETT);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTT) | (1L << DOUBLET) | (1L << BOOLEANT) | (1L << VOIDT) | (1L << IFT) | (1L << RETURNT) | (1L << BOOLEAN) | (1L << INT) | (1L << DOUBLE) | (1L << NAME))) != 0)) {
				{
				setState(139);
				inside();
				}
			}

			setState(142);
			match(RBRACKETT);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(CParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(CParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CParser.DOUBLE, 0); }
		public TerminalNode NAME() { return getToken(CParser.NAME, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << DOUBLE) | (1L << NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DOUBLET() { return getToken(CParser.DOUBLET, 0); }
		public TerminalNode BOOLEANT() { return getToken(CParser.BOOLEANT, 0); }
		public TerminalNode VOIDT() { return getToken(CParser.VOIDT, 0); }
		public TerminalNode INTT() { return getToken(CParser.INTT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CListener ) ((CListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVisitor ) return ((CVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTT) | (1L << DOUBLET) | (1L << BOOLEANT) | (1L << VOIDT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0097\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\3\3\3\3\3\5\3\67\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\5\7J\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\5\21\u008a\n\21\3\21\3\21\3\21\5\21\u008f\n\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$\2\6\3\2\17\22\5\2\16\16\23\25\34\35\3\2!$\3\2\5\b\2\u0093"+
		"\2)\3\2\2\2\4.\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nD\3\2\2\2\fG\3\2\2\2\16"+
		"R\3\2\2\2\20_\3\2\2\2\22q\3\2\2\2\24s\3\2\2\2\26w\3\2\2\2\30y\3\2\2\2"+
		"\32}\3\2\2\2\34\177\3\2\2\2\36\u0082\3\2\2\2 \u0085\3\2\2\2\"\u0092\3"+
		"\2\2\2$\u0094\3\2\2\2&(\5\4\3\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2"+
		"\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2\2./\5\n\6\2/\61\7\26\2\2\60"+
		"\62\5\6\4\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\27\2\2\64"+
		"\66\7\32\2\2\65\67\5\f\7\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7"+
		"\33\2\29\5\3\2\2\2:@\5\b\5\2;<\5\b\5\2<=\7\3\2\2=>\5\6\4\2>@\3\2\2\2?"+
		":\3\2\2\2?;\3\2\2\2@\7\3\2\2\2AB\5$\23\2BC\7$\2\2C\t\3\2\2\2DE\5$\23\2"+
		"EF\7$\2\2F\13\3\2\2\2GI\5\20\t\2HJ\5\f\7\2IH\3\2\2\2IJ\3\2\2\2J\r\3\2"+
		"\2\2KL\7\13\2\2LM\5\"\22\2MN\7\4\2\2NS\3\2\2\2OP\7\13\2\2PQ\7$\2\2QS\7"+
		"\4\2\2RK\3\2\2\2RO\3\2\2\2S\17\3\2\2\2TU\5\34\17\2UV\7\4\2\2V`\3\2\2\2"+
		"WX\5\36\20\2XY\7\4\2\2Y`\3\2\2\2Z[\5\22\n\2[\\\7\4\2\2\\`\3\2\2\2]`\5"+
		" \21\2^`\5\16\b\2_T\3\2\2\2_W\3\2\2\2_Z\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\21"+
		"\3\2\2\2ab\5\b\5\2bc\7\r\2\2cd\5\"\22\2dr\3\2\2\2ef\5\b\5\2fg\7\r\2\2"+
		"gh\5\24\13\2hr\3\2\2\2ij\5\"\22\2jk\7\r\2\2kl\5\"\22\2lr\3\2\2\2mn\5\""+
		"\22\2no\7\r\2\2op\5\24\13\2pr\3\2\2\2qa\3\2\2\2qe\3\2\2\2qi\3\2\2\2qm"+
		"\3\2\2\2r\23\3\2\2\2st\5\"\22\2tu\5\26\f\2uv\5\"\22\2v\25\3\2\2\2wx\t"+
		"\2\2\2x\27\3\2\2\2yz\5\"\22\2z{\5\32\16\2{|\5\"\22\2|\31\3\2\2\2}~\t\3"+
		"\2\2~\33\3\2\2\2\177\u0080\7$\2\2\u0080\u0081\7\37\2\2\u0081\35\3\2\2"+
		"\2\u0082\u0083\7$\2\2\u0083\u0084\7 \2\2\u0084\37\3\2\2\2\u0085\u0086"+
		"\7\t\2\2\u0086\u0089\7\26\2\2\u0087\u008a\5\30\r\2\u0088\u008a\5\"\22"+
		"\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\7\27\2\2\u008c\u008e\7\32\2\2\u008d\u008f\5\f\7\2\u008e\u008d\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\33\2\2\u0091!\3"+
		"\2\2\2\u0092\u0093\t\4\2\2\u0093#\3\2\2\2\u0094\u0095\t\5\2\2\u0095%\3"+
		"\2\2\2\f)\61\66?IR_q\u0089\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}