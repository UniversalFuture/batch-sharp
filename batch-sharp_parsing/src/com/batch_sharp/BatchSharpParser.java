// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp_parsing/src/com/batch_sharp\BatchSharp.g4 by ANTLR 4.5.1
package com.batch_sharp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BatchSharpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROBA=1, COMMA=2, DASH=3, DECIMAL=4, DOLLAR=5, DOT=6, EQUALS=7, H=8, 
		ID=9, LPAREN=10, NEWLINE=11, NUMBER=12, NUMERAL=13, PERCENT=14, RPAREN=15, 
		SEMI=16, SLASH=17, SINGLE_LINE_COMMENT=18, UNDERSCORE=19, WS=20, ZERO_X=21;
	public static final int
		RULE_compilationUnit = 0, RULE_codeline = 1, RULE_stmt = 2, RULE_callstmt = 3, 
		RULE_vardeclstmt = 4, RULE_expression = 5, RULE_expr = 6, RULE_call = 7, 
		RULE_number = 8, RULE_variable = 9, RULE_variable_dollar = 10, RULE_arguments = 11, 
		RULE_hex = 12, RULE_num = 13, RULE_directive = 14;
	public static final String[] ruleNames = {
		"compilationUnit", "codeline", "stmt", "callstmt", "vardeclstmt", "expression", 
		"expr", "call", "number", "variable", "variable_dollar", "arguments", 
		"hex", "num", "directive"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "','", "'-'", null, "'$'", "'.'", "'='", "'h'", null, "'('", 
		"'\n'", null, null, "'%'", "')'", "';'", "'/'", null, "'_'", null, "'0x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARROBA", "COMMA", "DASH", "DECIMAL", "DOLLAR", "DOT", "EQUALS", 
		"H", "ID", "LPAREN", "NEWLINE", "NUMBER", "NUMERAL", "PERCENT", "RPAREN", 
		"SEMI", "SLASH", "SINGLE_LINE_COMMENT", "UNDERSCORE", "WS", "ZERO_X"
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
	public String getGrammarFileName() { return "BatchSharp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BatchSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<CodelineContext> codeline() {
			return getRuleContexts(CodelineContext.class);
		}
		public CodelineContext codeline(int i) {
			return getRuleContext(CodelineContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BatchSharpParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BatchSharpParser.NEWLINE, i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					codeline();
					setState(32);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(31);
						match(SEMI);
						}
					}

					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(34);
						match(NEWLINE);
						}
						}
						setState(37); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(44);
			codeline();
			setState(46);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(45);
				match(SEMI);
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

	public static class CodelineContext extends ParserRuleContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public CodelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterCodeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitCodeline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitCodeline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodelineContext codeline() throws RecognitionException {
		CodelineContext _localctx = new CodelineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codeline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			switch (_input.LA(1)) {
			case ARROBA:
				{
				setState(48);
				directive();
				}
				break;
			case ID:
			case PERCENT:
				{
				setState(49);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StmtContext extends ParserRuleContext {
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public VardeclstmtContext vardeclstmt() {
			return getRuleContext(VardeclstmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(54);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				callstmt();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				vardeclstmt();
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

	public static class CallstmtContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterCallstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitCallstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitCallstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallstmtContext callstmt() throws RecognitionException {
		CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			call();
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

	public static class VardeclstmtContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(BatchSharpParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VardeclstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterVardeclstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitVardeclstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitVardeclstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclstmtContext vardeclstmt() throws RecognitionException {
		VardeclstmtContext _localctx = new VardeclstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardeclstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			variable();
			setState(59);
			match(EQUALS);
			setState(60);
			expression();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BatchSharpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BatchSharpParser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(67);
			switch (_input.LA(1)) {
			case DOLLAR:
			case ID:
			case NUMBER:
			case NUMERAL:
			case PERCENT:
			case ZERO_X:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				expr();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(LPAREN);
				setState(64);
				expr();
				setState(65);
				match(RPAREN);
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

	public static class ExprContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Variable_dollarContext variable_dollar() {
			return getRuleContext(Variable_dollarContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		int _la;
		try {
			setState(77);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				call();
				}
				break;
			case NUMBER:
			case NUMERAL:
			case ZERO_X:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					number();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << NUMERAL) | (1L << ZERO_X))) != 0) );
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				variable();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				variable_dollar();
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

	public static class CallContext extends ParserRuleContext {
		public Token func_name;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode ID() { return getToken(BatchSharpParser.ID, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call);
		try {
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((CallContext)_localctx).func_name = match(ID);
				setState(80);
				arguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				((CallContext)_localctx).func_name = match(ID);
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

	public static class NumberContext extends ParserRuleContext {
		public HexContext hex() {
			return getRuleContext(HexContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case NUMERAL:
			case ZERO_X:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				hex();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				num();
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

	public static class VariableContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> PERCENT() { return getTokens(BatchSharpParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(BatchSharpParser.PERCENT, i);
		}
		public TerminalNode ID() { return getToken(BatchSharpParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PERCENT);
			setState(89);
			((VariableContext)_localctx).name = match(ID);
			setState(91);
			_la = _input.LA(1);
			if (_la==PERCENT) {
				{
				setState(90);
				match(PERCENT);
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

	public static class Variable_dollarContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DOLLAR() { return getToken(BatchSharpParser.DOLLAR, 0); }
		public TerminalNode ID() { return getToken(BatchSharpParser.ID, 0); }
		public Variable_dollarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_dollar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterVariable_dollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitVariable_dollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitVariable_dollar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_dollarContext variable_dollar() throws RecognitionException {
		Variable_dollarContext _localctx = new Variable_dollarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_dollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(DOLLAR);
			setState(94);
			((Variable_dollarContext)_localctx).name = match(ID);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BatchSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BatchSharpParser.COMMA, i);
		}
		public TerminalNode LPAREN() { return getToken(BatchSharpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BatchSharpParser.RPAREN, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arguments);
		try {
			int _alt;
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(96);
						expression();
						setState(97);
						match(COMMA);
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(104);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(LPAREN);
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						expression();
						setState(107);
						match(COMMA);
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(114);
				expression();
				setState(115);
				match(RPAREN);
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

	public static class HexContext extends ParserRuleContext {
		public Token value;
		public TerminalNode ZERO_X() { return getToken(BatchSharpParser.ZERO_X, 0); }
		public List<TerminalNode> NUMERAL() { return getTokens(BatchSharpParser.NUMERAL); }
		public TerminalNode NUMERAL(int i) {
			return getToken(BatchSharpParser.NUMERAL, i);
		}
		public TerminalNode H() { return getToken(BatchSharpParser.H, 0); }
		public HexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexContext hex() throws RecognitionException {
		HexContext _localctx = new HexContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hex);
		int _la;
		try {
			int _alt;
			setState(131);
			switch (_input.LA(1)) {
			case ZERO_X:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(ZERO_X);
				setState(121); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(120);
						((HexContext)_localctx).value = match(NUMERAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(123); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NUMERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					((HexContext)_localctx).value = match(NUMERAL);
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERAL );
				setState(130);
				match(H);
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

	public static class NumContext extends ParserRuleContext {
		public Token value;
		public TerminalNode NUMBER() { return getToken(BatchSharpParser.NUMBER, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((NumContext)_localctx).value = match(NUMBER);
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

	public static class DirectiveContext extends ParserRuleContext {
		public Token key;
		public Token value;
		public TerminalNode ARROBA() { return getToken(BatchSharpParser.ARROBA, 0); }
		public List<TerminalNode> ID() { return getTokens(BatchSharpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BatchSharpParser.ID, i);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_directive);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(ARROBA);
				setState(136);
				((DirectiveContext)_localctx).key = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(ARROBA);
				setState(138);
				((DirectiveContext)_localctx).key = match(ID);
				setState(139);
				((DirectiveContext)_localctx).value = match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\3"+
		"\2\6\2&\n\2\r\2\16\2\'\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\5\2\61\n\2\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\5\49\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\5\7F\n\7\3\b\3\b\6\bJ\n\b\r\b\16\bK\3\b\3\b\5\bP\n\b\3\t\3\t\3"+
		"\t\5\tU\n\t\3\n\3\n\5\nY\n\n\3\13\3\13\3\13\5\13^\n\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\7\rf\n\r\f\r\16\ri\13\r\3\r\3\r\3\r\3\r\3\r\7\rp\n\r\f\r\16\r"+
		"s\13\r\3\r\3\r\3\r\5\rx\n\r\3\16\3\16\6\16|\n\16\r\16\16\16}\3\16\6\16"+
		"\u0081\n\16\r\16\16\16\u0082\3\16\5\16\u0086\n\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u008f\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36\2\2\u0096\2+\3\2\2\2\4\64\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\n"+
		"<\3\2\2\2\fE\3\2\2\2\16O\3\2\2\2\20T\3\2\2\2\22X\3\2\2\2\24Z\3\2\2\2\26"+
		"_\3\2\2\2\30w\3\2\2\2\32\u0085\3\2\2\2\34\u0087\3\2\2\2\36\u008e\3\2\2"+
		"\2 \"\5\4\3\2!#\7\22\2\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2\2$&\7\r\2\2%$\3"+
		"\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2) \3\2\2\2*-\3\2\2\2"+
		"+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2.\60\5\4\3\2/\61\7\22\2\2\60/"+
		"\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2\62\65\5\36\20\2\63\65\5\6\4\2\64\62"+
		"\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\669\5\b\5\2\679\5\n\6\28\66\3\2\2"+
		"\28\67\3\2\2\29\7\3\2\2\2:;\5\20\t\2;\t\3\2\2\2<=\5\24\13\2=>\7\t\2\2"+
		">?\5\f\7\2?\13\3\2\2\2@F\5\16\b\2AB\7\f\2\2BC\5\16\b\2CD\7\21\2\2DF\3"+
		"\2\2\2E@\3\2\2\2EA\3\2\2\2F\r\3\2\2\2GP\5\20\t\2HJ\5\22\n\2IH\3\2\2\2"+
		"JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LP\3\2\2\2MP\5\24\13\2NP\5\26\f\2OG\3\2"+
		"\2\2OI\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\17\3\2\2\2QR\7\13\2\2RU\5\30\r\2S"+
		"U\7\13\2\2TQ\3\2\2\2TS\3\2\2\2U\21\3\2\2\2VY\5\32\16\2WY\5\34\17\2XV\3"+
		"\2\2\2XW\3\2\2\2Y\23\3\2\2\2Z[\7\20\2\2[]\7\13\2\2\\^\7\20\2\2]\\\3\2"+
		"\2\2]^\3\2\2\2^\25\3\2\2\2_`\7\7\2\2`a\7\13\2\2a\27\3\2\2\2bc\5\f\7\2"+
		"cd\7\4\2\2df\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2"+
		"ig\3\2\2\2jx\5\f\7\2kq\7\f\2\2lm\5\f\7\2mn\7\4\2\2np\3\2\2\2ol\3\2\2\2"+
		"ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\5\f\7\2uv\7\21\2"+
		"\2vx\3\2\2\2wg\3\2\2\2wk\3\2\2\2x\31\3\2\2\2y{\7\27\2\2z|\7\17\2\2{z\3"+
		"\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0086\3\2\2\2\177\u0081\7\17\2\2"+
		"\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\7\n\2\2\u0085y\3\2\2\2\u0085"+
		"\u0080\3\2\2\2\u0086\33\3\2\2\2\u0087\u0088\7\16\2\2\u0088\35\3\2\2\2"+
		"\u0089\u008a\7\3\2\2\u008a\u008f\7\13\2\2\u008b\u008c\7\3\2\2\u008c\u008d"+
		"\7\13\2\2\u008d\u008f\7\13\2\2\u008e\u0089\3\2\2\2\u008e\u008b\3\2\2\2"+
		"\u008f\37\3\2\2\2\25\"\'+\60\648EKOTX]gqw}\u0082\u0085\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}