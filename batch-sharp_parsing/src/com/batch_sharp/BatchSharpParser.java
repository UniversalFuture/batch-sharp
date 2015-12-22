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
		WS=1, PLUS=2, MINUS=3, TO_THE_POWER_OF=4, DIVIDED_BY=5, TIMES=6, ARROBA=7, 
		BACKTICK=8, BOOL_AND=9, BOOL_EQUALS=10, BOOL_OR=11, CATCH=12, COMMA=13, 
		CONST=14, DASH=15, DECIMAL=16, DIR=17, DOLLAR=18, DOT=19, ELSE=20, EQUALS=21, 
		FILE=22, FOR=23, GE=24, GT=25, H=26, HASH=27, IF=28, IN=29, INLINE=30, 
		INLINEBACKTICK=31, INLINESTMT=32, LBRACKET=33, LPAREN=34, LSQUARE=35, 
		LE=36, LT=37, NOT_EQUALS=38, NUMBER=39, NUMERAL=40, PERCENT=41, RBRACKET=42, 
		RECURSIVE=43, RETURN=44, RPAREN=45, RSQUARE=46, SEMI=47, SLASH=48, SINGLE_LINE_COMMENT=49, 
		STRING=50, TRY=51, TYPE_ARRAY=52, TYPE_INT=53, TYPE_STRING=54, UNDERSCORE=55, 
		ZERO_X=56, ID=57;
	public static final int
		RULE_compilationUnit = 0, RULE_codeline = 1, RULE_directive = 2, RULE_singleDirective = 3, 
		RULE_doubleDirective = 4, RULE_directive_value = 5, RULE_stmt = 6, RULE_callstmt = 7, 
		RULE_array_assignmentstmt = 8, RULE_assignmentstmt = 9, RULE_forstmt = 10, 
		RULE_foreachstmt = 11, RULE_forstmt_file = 12, RULE_foreachstmt_file = 13, 
		RULE_foreachstmt_file_in_dir = 14, RULE_forstmt_dir = 15, RULE_foreachstmt_dir = 16, 
		RULE_funcdeclstmt = 17, RULE_ifseries = 18, RULE_ifstmt = 19, RULE_elseifstmt = 20, 
		RULE_elsestmt = 21, RULE_inlinestmt = 22, RULE_inplacearithmeticstmt = 23, 
		RULE_incrementstmt = 24, RULE_returnstmt = 25, RULE_tryseries = 26, RULE_trystmt = 27, 
		RULE_catchstmt = 28, RULE_typedvardeclstmt = 29, RULE_expression = 30, 
		RULE_array = 31, RULE_expr = 32, RULE_array_elem = 33, RULE_arithmeticexpr = 34, 
		RULE_call = 35, RULE_function_name = 36, RULE_interpolated_string = 37, 
		RULE_number = 38, RULE_variable = 39, RULE_inlineexpr = 40, RULE_arguments = 41, 
		RULE_boolean_operator = 42, RULE_hex = 43, RULE_decimal = 44, RULE_parameters = 45, 
		RULE_typedparameter = 46, RULE_typespecifier = 47;
	public static final String[] ruleNames = {
		"compilationUnit", "codeline", "directive", "singleDirective", "doubleDirective", 
		"directive_value", "stmt", "callstmt", "array_assignmentstmt", "assignmentstmt", 
		"forstmt", "foreachstmt", "forstmt_file", "foreachstmt_file", "foreachstmt_file_in_dir", 
		"forstmt_dir", "foreachstmt_dir", "funcdeclstmt", "ifseries", "ifstmt", 
		"elseifstmt", "elsestmt", "inlinestmt", "inplacearithmeticstmt", "incrementstmt", 
		"returnstmt", "tryseries", "trystmt", "catchstmt", "typedvardeclstmt", 
		"expression", "array", "expr", "array_elem", "arithmeticexpr", "call", 
		"function_name", "interpolated_string", "number", "variable", "inlineexpr", 
		"arguments", "boolean_operator", "hex", "decimal", "parameters", "typedparameter", 
		"typespecifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'+'", null, "'^'", null, "'*'", "'@'", "'`'", "'&&'", "'=='", 
		"'||'", "'catch'", "','", "'const'", null, null, "'dir'", "'$'", "'.'", 
		"'else'", "'='", "'file'", "'for'", "'>='", "'>'", "'h'", "'#'", "'if'", 
		"'in'", "'inline'", null, null, "'{'", "'('", "'['", "'<='", "'<'", "'!='", 
		null, null, "'%'", "'}'", "'recursive'", "'return'", "')'", "']'", "';'", 
		null, null, null, "'try'", "'array'", "'int'", "'string'", "'_'", "'0x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "PLUS", "MINUS", "TO_THE_POWER_OF", "DIVIDED_BY", "TIMES", 
		"ARROBA", "BACKTICK", "BOOL_AND", "BOOL_EQUALS", "BOOL_OR", "CATCH", "COMMA", 
		"CONST", "DASH", "DECIMAL", "DIR", "DOLLAR", "DOT", "ELSE", "EQUALS", 
		"FILE", "FOR", "GE", "GT", "H", "HASH", "IF", "IN", "INLINE", "INLINEBACKTICK", 
		"INLINESTMT", "LBRACKET", "LPAREN", "LSQUARE", "LE", "LT", "NOT_EQUALS", 
		"NUMBER", "NUMERAL", "PERCENT", "RBRACKET", "RECURSIVE", "RETURN", "RPAREN", 
		"RSQUARE", "SEMI", "SLASH", "SINGLE_LINE_COMMENT", "STRING", "TRY", "TYPE_ARRAY", 
		"TYPE_INT", "TYPE_STRING", "UNDERSCORE", "ZERO_X", "ID"
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
		public java.util.HashMap<String, BatchSharpObject> globals =  new java.util.HashMap<String, BatchSharpObject>();
		public java.util.HashMap<String, BatchSharpObject> constants =  new java.util.HashMap<String, BatchSharpObject>();
		public java.util.HashMap<String, BatchSharpObject.BatchSharpTypes> variableTypes =  new java.util.HashMap<String, BatchSharpObject.BatchSharpTypes>();
		public java.util.HashMap<String, BatchSharpObject.BatchSharpTypes> functionTypes =  new java.util.HashMap<String, BatchSharpObject.BatchSharpTypes>();
		public java.util.HashMap<String, String> directives =  new java.util.HashMap<String, String>();
		public java.util.HashMap<String, BatchSharpParser.FuncdeclstmtContext> functions =  new java.util.HashMap<String, BatchSharpParser.FuncdeclstmtContext>();
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
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					codeline();
					setState(98);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(97);
						match(SEMI);
						}
					}

					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(105);
			codeline();
			setState(107);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(106);
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
		public FuncdeclstmtContext funcdeclstmt() {
			return getRuleContext(FuncdeclstmtContext.class,0);
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
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(109);
				directive();
				}
				break;
			case 2:
				{
				setState(110);
				stmt();
				}
				break;
			case 3:
				{
				setState(111);
				funcdeclstmt();
				}
				break;
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

	public static class DirectiveContext extends ParserRuleContext {
		public SingleDirectiveContext singleDirective() {
			return getRuleContext(SingleDirectiveContext.class,0);
		}
		public DoubleDirectiveContext doubleDirective() {
			return getRuleContext(DoubleDirectiveContext.class,0);
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
		enterRule(_localctx, 4, RULE_directive);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				singleDirective();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				doubleDirective();
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

	public static class SingleDirectiveContext extends ParserRuleContext {
		public Token key;
		public TerminalNode ARROBA() { return getToken(BatchSharpParser.ARROBA, 0); }
		public TerminalNode ID() { return getToken(BatchSharpParser.ID, 0); }
		public SingleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterSingleDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitSingleDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitSingleDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDirectiveContext singleDirective() throws RecognitionException {
		SingleDirectiveContext _localctx = new SingleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ARROBA);
			setState(119);
			((SingleDirectiveContext)_localctx).key = match(ID);
			 ((CompilationUnitContext)getInvokingContext(0)).directives.put((((SingleDirectiveContext)_localctx).key!=null?((SingleDirectiveContext)_localctx).key.getText():null), ""); 
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

	public static class DoubleDirectiveContext extends ParserRuleContext {
		public Token key;
		public Directive_valueContext value;
		public TerminalNode ARROBA() { return getToken(BatchSharpParser.ARROBA, 0); }
		public TerminalNode ID() { return getToken(BatchSharpParser.ID, 0); }
		public Directive_valueContext directive_value() {
			return getRuleContext(Directive_valueContext.class,0);
		}
		public DoubleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterDoubleDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitDoubleDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitDoubleDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleDirectiveContext doubleDirective() throws RecognitionException {
		DoubleDirectiveContext _localctx = new DoubleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_doubleDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ARROBA);
			setState(123);
			((DoubleDirectiveContext)_localctx).key = match(ID);
			setState(124);
			((DoubleDirectiveContext)_localctx).value = directive_value();
			 ((CompilationUnitContext)getInvokingContext(0)).directives.put((((DoubleDirectiveContext)_localctx).key!=null?((DoubleDirectiveContext)_localctx).key.getText():null), (((DoubleDirectiveContext)_localctx).value!=null?_input.getText(((DoubleDirectiveContext)_localctx).value.start,((DoubleDirectiveContext)_localctx).value.stop):null)); 
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

	public static class Directive_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BatchSharpParser.STRING, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(BatchSharpParser.ID, 0); }
		public Directive_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterDirective_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitDirective_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitDirective_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_valueContext directive_value() throws RecognitionException {
		Directive_valueContext _localctx = new Directive_valueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_directive_value);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(STRING);
				}
				break;
			case MINUS:
			case NUMBER:
			case NUMERAL:
			case ZERO_X:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(ID);
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

	public static class StmtContext extends ParserRuleContext {
		public CallstmtContext callstmt() {
			return getRuleContext(CallstmtContext.class,0);
		}
		public TypedvardeclstmtContext typedvardeclstmt() {
			return getRuleContext(TypedvardeclstmtContext.class,0);
		}
		public AssignmentstmtContext assignmentstmt() {
			return getRuleContext(AssignmentstmtContext.class,0);
		}
		public InlinestmtContext inlinestmt() {
			return getRuleContext(InlinestmtContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public ForeachstmtContext foreachstmt() {
			return getRuleContext(ForeachstmtContext.class,0);
		}
		public Forstmt_fileContext forstmt_file() {
			return getRuleContext(Forstmt_fileContext.class,0);
		}
		public Foreachstmt_fileContext foreachstmt_file() {
			return getRuleContext(Foreachstmt_fileContext.class,0);
		}
		public Forstmt_dirContext forstmt_dir() {
			return getRuleContext(Forstmt_dirContext.class,0);
		}
		public Foreachstmt_dirContext foreachstmt_dir() {
			return getRuleContext(Foreachstmt_dirContext.class,0);
		}
		public InplacearithmeticstmtContext inplacearithmeticstmt() {
			return getRuleContext(InplacearithmeticstmtContext.class,0);
		}
		public IncrementstmtContext incrementstmt() {
			return getRuleContext(IncrementstmtContext.class,0);
		}
		public IfseriesContext ifseries() {
			return getRuleContext(IfseriesContext.class,0);
		}
		public TryseriesContext tryseries() {
			return getRuleContext(TryseriesContext.class,0);
		}
		public Array_assignmentstmtContext array_assignmentstmt() {
			return getRuleContext(Array_assignmentstmtContext.class,0);
		}
		public Foreachstmt_file_in_dirContext foreachstmt_file_in_dir() {
			return getRuleContext(Foreachstmt_file_in_dirContext.class,0);
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
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				callstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				typedvardeclstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				assignmentstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				inlinestmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				returnstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				forstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				foreachstmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				forstmt_file();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				foreachstmt_file();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(141);
				forstmt_dir();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(142);
				foreachstmt_dir();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(143);
				inplacearithmeticstmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(144);
				incrementstmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(145);
				ifseries();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(146);
				tryseries();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(147);
				array_assignmentstmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(148);
				foreachstmt_file_in_dir();
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
		enterRule(_localctx, 14, RULE_callstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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

	public static class Array_assignmentstmtContext extends ParserRuleContext {
		public ExpressionContext value;
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(BatchSharpParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_assignmentstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignmentstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterArray_assignmentstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitArray_assignmentstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitArray_assignmentstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_assignmentstmtContext array_assignmentstmt() throws RecognitionException {
		Array_assignmentstmtContext _localctx = new Array_assignmentstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_assignmentstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			array_elem();
			setState(154);
			match(EQUALS);
			setState(155);
			((Array_assignmentstmtContext)_localctx).value = expression();
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

	public static class AssignmentstmtContext extends ParserRuleContext {
		public ExpressionContext value;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(BatchSharpParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONST() { return getToken(BatchSharpParser.CONST, 0); }
		public AssignmentstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterAssignmentstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitAssignmentstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitAssignmentstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentstmtContext assignmentstmt() throws RecognitionException {
		AssignmentstmtContext _localctx = new AssignmentstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(157);
				match(CONST);
				}
			}

			setState(160);
			variable();
			setState(161);
			match(EQUALS);
			setState(162);
			((AssignmentstmtContext)_localctx).value = expression();
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

	public static class ForstmtContext extends ParserRuleContext {
		public ExpressionContext low;
		public ExpressionContext high;
		public TerminalNode FOR() { return getToken(BatchSharpParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(BatchSharpParser.LPAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(BatchSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BatchSharpParser.DOT, i);
		}
		public TerminalNode RPAREN() { return getToken(BatchSharpParser.RPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitForstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitForstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(FOR);
			setState(165);
			match(LPAREN);
			setState(166);
			((ForstmtContext)_localctx).low = expression();
			setState(167);
			match(DOT);
			setState(168);
			match(DOT);
			setState(169);
			((ForstmtContext)_localctx).high = expression();
			setState(170);
			match(RPAREN);
			setState(171);
			match(LBRACKET);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(172);
				stmt();
				setState(174);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(173);
					match(SEMI);
					}
				}

				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(RBRACKET);
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

	public static class ForeachstmtContext extends ParserRuleContext {
		public ExpressionContext low;
		public ExpressionContext high;
		public TerminalNode FOR() { return getToken(BatchSharpParser.FOR, 0); }
		public TypedparameterContext typedparameter() {
			return getRuleContext(TypedparameterContext.class,0);
		}
		public TerminalNode IN() { return getToken(BatchSharpParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(BatchSharpParser.LPAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(BatchSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BatchSharpParser.DOT, i);
		}
		public TerminalNode RPAREN() { return getToken(BatchSharpParser.RPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public ForeachstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterForeachstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitForeachstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitForeachstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachstmtContext foreachstmt() throws RecognitionException {
		ForeachstmtContext _localctx = new ForeachstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_foreachstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(FOR);
			setState(184);
			typedparameter();
			setState(185);
			match(IN);
			setState(186);
			match(LPAREN);
			setState(187);
			((ForeachstmtContext)_localctx).low = expression();
			setState(188);
			match(DOT);
			setState(189);
			match(DOT);
			setState(190);
			((ForeachstmtContext)_localctx).high = expression();
			setState(191);
			match(RPAREN);
			setState(192);
			match(LBRACKET);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(193);
				stmt();
				setState(195);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(194);
					match(SEMI);
					}
				}

				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(RBRACKET);
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

	public static class Forstmt_fileContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BatchSharpParser.FOR, 0); }
		public TerminalNode FILE() { return getToken(BatchSharpParser.FILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public Forstmt_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterForstmt_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitForstmt_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitForstmt_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forstmt_fileContext forstmt_file() throws RecognitionException {
		Forstmt_fileContext _localctx = new Forstmt_fileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forstmt_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(FOR);
			setState(205);
			match(FILE);
			setState(206);
			expression();
			setState(207);
			match(LBRACKET);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(208);
				stmt();
				setState(210);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(209);
					match(SEMI);
					}
				}

				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(RBRACKET);
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

	public static class Foreachstmt_fileContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BatchSharpParser.FOR, 0); }
		public TypedparameterContext typedparameter() {
			return getRuleContext(TypedparameterContext.class,0);
		}
		public TerminalNode IN() { return getToken(BatchSharpParser.IN, 0); }
		public TerminalNode FILE() { return getToken(BatchSharpParser.FILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public Foreachstmt_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachstmt_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterForeachstmt_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitForeachstmt_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitForeachstmt_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreachstmt_fileContext foreachstmt_file() throws RecognitionException {
		Foreachstmt_fileContext _localctx = new Foreachstmt_fileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_foreachstmt_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(FOR);
			setState(220);
			typedparameter();
			setState(221);
			match(IN);
			setState(222);
			match(FILE);
			setState(223);
			expression();
			setState(224);
			match(LBRACKET);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(225);
				stmt();
				setState(227);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(226);
					match(SEMI);
					}
				}

				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(RBRACKET);
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

	public static class Foreachstmt_file_in_dirContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BatchSharpParser.FOR, 0); }
		public TerminalNode FILE() { return getToken(BatchSharpParser.FILE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IN() { return getToken(BatchSharpParser.IN, 0); }
		public TerminalNode DIR() { return getToken(BatchSharpParser.DIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public TerminalNode RECURSIVE() { return getToken(BatchSharpParser.RECURSIVE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public Foreachstmt_file_in_dirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachstmt_file_in_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterForeachstmt_file_in_dir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitForeachstmt_file_in_dir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitForeachstmt_file_in_dir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreachstmt_file_in_dirContext foreachstmt_file_in_dir() throws RecognitionException {
		Foreachstmt_file_in_dirContext _localctx = new Foreachstmt_file_in_dirContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_foreachstmt_file_in_dir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(FOR);
			setState(238);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(237);
				match(RECURSIVE);
				}
			}

			setState(240);
			match(FILE);
			setState(241);
			variable();
			setState(242);
			match(IN);
			setState(243);
			match(DIR);
			setState(244);
			expression();
			setState(245);
			match(LBRACKET);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(246);
				stmt();
				setState(248);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(247);
					match(SEMI);
					}
				}

				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(RBRACKET);
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

	public static class Forstmt_dirContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BatchSharpParser.FOR, 0); }
		public TerminalNode DIR() { return getToken(BatchSharpParser.DIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public TerminalNode RECURSIVE() { return getToken(BatchSharpParser.RECURSIVE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public Forstmt_dirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterForstmt_dir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitForstmt_dir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitForstmt_dir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forstmt_dirContext forstmt_dir() throws RecognitionException {
		Forstmt_dirContext _localctx = new Forstmt_dirContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forstmt_dir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(FOR);
			setState(259);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(258);
				match(RECURSIVE);
				}
			}

			setState(261);
			match(DIR);
			setState(262);
			expression();
			setState(263);
			match(LBRACKET);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(264);
				stmt();
				setState(266);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(265);
					match(SEMI);
					}
				}

				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(RBRACKET);
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

	public static class Foreachstmt_dirContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BatchSharpParser.FOR, 0); }
		public TypedparameterContext typedparameter() {
			return getRuleContext(TypedparameterContext.class,0);
		}
		public TerminalNode IN() { return getToken(BatchSharpParser.IN, 0); }
		public TerminalNode DIR() { return getToken(BatchSharpParser.DIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public TerminalNode RECURSIVE() { return getToken(BatchSharpParser.RECURSIVE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public Foreachstmt_dirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachstmt_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterForeachstmt_dir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitForeachstmt_dir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitForeachstmt_dir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreachstmt_dirContext foreachstmt_dir() throws RecognitionException {
		Foreachstmt_dirContext _localctx = new Foreachstmt_dirContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_foreachstmt_dir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(FOR);
			setState(277);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(276);
				match(RECURSIVE);
				}
			}

			setState(279);
			typedparameter();
			setState(280);
			match(IN);
			setState(281);
			match(DIR);
			setState(282);
			expression();
			setState(283);
			match(LBRACKET);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(284);
				stmt();
				setState(286);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(285);
					match(SEMI);
					}
				}

				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(RBRACKET);
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

	public static class FuncdeclstmtContext extends ParserRuleContext {
		public java.util.HashMap<String, BatchSharpObject> scope =  new java.util.HashMap<String, BatchSharpObject>();
		public java.util.HashMap<String, BatchSharpObject.BatchSharpTypes> variableTypes =  new java.util.HashMap<String, BatchSharpObject.BatchSharpTypes>();
		public java.util.HashMap<String, BatchSharpObject> params =  new java.util.HashMap<String, BatchSharpObject>();
		public java.util.HashMap<String, BatchSharpObject> constants =  new java.util.HashMap<String, BatchSharpObject>();
		public Boolean eof =  false;
		public Function_nameContext func_name;
		public TerminalNode LPAREN() { return getToken(BatchSharpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BatchSharpParser.RPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public FuncdeclstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdeclstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterFuncdeclstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitFuncdeclstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitFuncdeclstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclstmtContext funcdeclstmt() throws RecognitionException {
		FuncdeclstmtContext _localctx = new FuncdeclstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcdeclstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(295);
				typespecifier();
				}
				break;
			}
			setState(298);
			((FuncdeclstmtContext)_localctx).func_name = function_name();
			setState(299);
			match(LPAREN);
			setState(301);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOLLAR) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING))) != 0)) {
				{
				setState(300);
				parameters();
				}
			}

			setState(303);
			match(RPAREN);
			setState(304);
			match(LBRACKET);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(305);
				stmt();
				setState(307);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(306);
					match(SEMI);
					}
				}

				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(RBRACKET);
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

	public static class IfseriesContext extends ParserRuleContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public List<ElseifstmtContext> elseifstmt() {
			return getRuleContexts(ElseifstmtContext.class);
		}
		public ElseifstmtContext elseifstmt(int i) {
			return getRuleContext(ElseifstmtContext.class,i);
		}
		public ElsestmtContext elsestmt() {
			return getRuleContext(ElsestmtContext.class,0);
		}
		public IfseriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifseries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterIfseries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitIfseries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitIfseries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfseriesContext ifseries() throws RecognitionException {
		IfseriesContext _localctx = new IfseriesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifseries);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			ifstmt();
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(317);
					elseifstmt();
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(323);
				elsestmt();
				}
				break;
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

	public static class IfstmtContext extends ParserRuleContext {
		public ExpressionContext condition1;
		public ExpressionContext condition2;
		public TerminalNode IF() { return getToken(BatchSharpParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(BatchSharpParser.LPAREN, 0); }
		public Boolean_operatorContext boolean_operator() {
			return getRuleContext(Boolean_operatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BatchSharpParser.RPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(IF);
			setState(327);
			match(LPAREN);
			setState(328);
			((IfstmtContext)_localctx).condition1 = expression();
			setState(329);
			boolean_operator();
			setState(330);
			((IfstmtContext)_localctx).condition2 = expression();
			setState(331);
			match(RPAREN);
			setState(332);
			match(LBRACKET);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(333);
				stmt();
				setState(335);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(334);
					match(SEMI);
					}
				}

				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(RBRACKET);
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

	public static class ElseifstmtContext extends ParserRuleContext {
		public ExpressionContext condition1;
		public ExpressionContext condition2;
		public TerminalNode ELSE() { return getToken(BatchSharpParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(BatchSharpParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(BatchSharpParser.LPAREN, 0); }
		public Boolean_operatorContext boolean_operator() {
			return getRuleContext(Boolean_operatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BatchSharpParser.RPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public ElseifstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterElseifstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitElseifstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitElseifstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifstmtContext elseifstmt() throws RecognitionException {
		ElseifstmtContext _localctx = new ElseifstmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(ELSE);
			setState(345);
			match(IF);
			setState(346);
			match(LPAREN);
			setState(347);
			((ElseifstmtContext)_localctx).condition1 = expression();
			setState(348);
			boolean_operator();
			setState(349);
			((ElseifstmtContext)_localctx).condition2 = expression();
			setState(350);
			match(RPAREN);
			setState(351);
			match(LBRACKET);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(352);
				stmt();
				setState(354);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(353);
					match(SEMI);
					}
				}

				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(RBRACKET);
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

	public static class ElsestmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BatchSharpParser.ELSE, 0); }
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public ElsestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterElsestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitElsestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitElsestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestmtContext elsestmt() throws RecognitionException {
		ElsestmtContext _localctx = new ElsestmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elsestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(ELSE);
			setState(364);
			match(LBRACKET);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(365);
				stmt();
				setState(367);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(366);
					match(SEMI);
					}
				}

				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			match(RBRACKET);
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

	public static class InlinestmtContext extends ParserRuleContext {
		public TerminalNode INLINESTMT() { return getToken(BatchSharpParser.INLINESTMT, 0); }
		public InlinestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlinestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterInlinestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitInlinestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitInlinestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlinestmtContext inlinestmt() throws RecognitionException {
		InlinestmtContext _localctx = new InlinestmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inlinestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(INLINESTMT);
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

	public static class InplacearithmeticstmtContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(BatchSharpParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BatchSharpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BatchSharpParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(BatchSharpParser.TIMES, 0); }
		public TerminalNode DIVIDED_BY() { return getToken(BatchSharpParser.DIVIDED_BY, 0); }
		public InplacearithmeticstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inplacearithmeticstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterInplacearithmeticstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitInplacearithmeticstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitInplacearithmeticstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InplacearithmeticstmtContext inplacearithmeticstmt() throws RecognitionException {
		InplacearithmeticstmtContext _localctx = new InplacearithmeticstmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inplacearithmeticstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			variable();
			setState(379);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIVIDED_BY) | (1L << TIMES))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(380);
			match(EQUALS);
			setState(381);
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

	public static class IncrementstmtContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(BatchSharpParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BatchSharpParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(BatchSharpParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BatchSharpParser.MINUS, i);
		}
		public IncrementstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterIncrementstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitIncrementstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitIncrementstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementstmtContext incrementstmt() throws RecognitionException {
		IncrementstmtContext _localctx = new IncrementstmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_incrementstmt);
		try {
			setState(391);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				variable();
				setState(384);
				match(PLUS);
				setState(385);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				variable();
				setState(388);
				match(MINUS);
				setState(389);
				match(MINUS);
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

	public static class ReturnstmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BatchSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(RETURN);
			setState(394);
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

	public static class TryseriesContext extends ParserRuleContext {
		public TrystmtContext trystmt() {
			return getRuleContext(TrystmtContext.class,0);
		}
		public CatchstmtContext catchstmt() {
			return getRuleContext(CatchstmtContext.class,0);
		}
		public TryseriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryseries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterTryseries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitTryseries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitTryseries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryseriesContext tryseries() throws RecognitionException {
		TryseriesContext _localctx = new TryseriesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tryseries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			trystmt();
			setState(397);
			catchstmt();
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

	public static class TrystmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(BatchSharpParser.TRY, 0); }
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public TrystmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trystmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterTrystmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitTrystmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitTrystmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrystmtContext trystmt() throws RecognitionException {
		TrystmtContext _localctx = new TrystmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_trystmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(TRY);
			setState(400);
			match(LBRACKET);
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(401);
				stmt();
				setState(403);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(402);
					match(SEMI);
					}
				}

				}
				}
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0) );
			setState(409);
			match(RBRACKET);
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

	public static class CatchstmtContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(BatchSharpParser.CATCH, 0); }
		public TerminalNode LBRACKET() { return getToken(BatchSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BatchSharpParser.RBRACKET, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(BatchSharpParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BatchSharpParser.SEMI, i);
		}
		public TerminalNode LPAREN() { return getToken(BatchSharpParser.LPAREN, 0); }
		public TypedparameterContext typedparameter() {
			return getRuleContext(TypedparameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BatchSharpParser.RPAREN, 0); }
		public CatchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterCatchstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitCatchstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitCatchstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchstmtContext catchstmt() throws RecognitionException {
		CatchstmtContext _localctx = new CatchstmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_catchstmt);
		int _la;
		try {
			setState(439);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(CATCH);
				setState(412);
				match(LBRACKET);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
					{
					{
					setState(413);
					stmt();
					setState(415);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(414);
						match(SEMI);
						}
					}

					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(422);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(CATCH);
				setState(424);
				match(LPAREN);
				setState(425);
				typedparameter();
				setState(426);
				match(RPAREN);
				setState(427);
				match(LBRACKET);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << CONST) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << FOR) | (1L << IF) | (1L << IN) | (1L << INLINESTMT) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) {
					{
					{
					setState(428);
					stmt();
					setState(430);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(429);
						match(SEMI);
						}
					}

					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				match(RBRACKET);
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

	public static class TypedvardeclstmtContext extends ParserRuleContext {
		public ExpressionContext value;
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(BatchSharpParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONST() { return getToken(BatchSharpParser.CONST, 0); }
		public TypedvardeclstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedvardeclstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterTypedvardeclstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitTypedvardeclstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitTypedvardeclstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedvardeclstmtContext typedvardeclstmt() throws RecognitionException {
		TypedvardeclstmtContext _localctx = new TypedvardeclstmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typedvardeclstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(441);
				match(CONST);
				}
			}

			setState(444);
			typespecifier();
			setState(445);
			variable();
			setState(446);
			match(EQUALS);
			setState(447);
			((TypedvardeclstmtContext)_localctx).value = expression();
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
		public ArithmeticexprContext arithmeticexpr() {
			return getRuleContext(ArithmeticexprContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_expression);
		try {
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(LPAREN);
				setState(451);
				expr();
				setState(452);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				arithmeticexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(455);
				match(LPAREN);
				setState(456);
				arithmeticexpr();
				setState(457);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(BatchSharpParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(BatchSharpParser.RSQUARE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BatchSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BatchSharpParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array);
		try {
			int _alt;
			setState(475);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(LSQUARE);
				setState(462);
				match(RSQUARE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(LSQUARE);
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(464);
						expr();
						setState(465);
						match(COMMA);
						}
						} 
					}
					setState(471);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(472);
				expr();
				setState(473);
				match(RSQUARE);
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
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public InlineexprContext inlineexpr() {
			return getRuleContext(InlineexprContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BatchSharpParser.STRING, 0); }
		public Interpolated_stringContext interpolated_string() {
			return getRuleContext(Interpolated_stringContext.class,0);
		}
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
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
		enterRule(_localctx, 64, RULE_expr);
		try {
			setState(485);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				inlineexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(480);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(481);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(482);
				interpolated_string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(483);
				array_elem();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(484);
				array();
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

	public static class Array_elemContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(BatchSharpParser.LSQUARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(BatchSharpParser.RSQUARE, 0); }
		public Array_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterArray_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitArray_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitArray_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_elemContext array_elem() throws RecognitionException {
		Array_elemContext _localctx = new Array_elemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_array_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			variable();
			setState(488);
			match(LSQUARE);
			setState(489);
			expr();
			setState(490);
			match(RSQUARE);
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

	public static class ArithmeticexprContext extends ParserRuleContext {
		public ExprContext first;
		public ExprContext second;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(BatchSharpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BatchSharpParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(BatchSharpParser.TIMES, 0); }
		public TerminalNode DIVIDED_BY() { return getToken(BatchSharpParser.DIVIDED_BY, 0); }
		public TerminalNode TO_THE_POWER_OF() { return getToken(BatchSharpParser.TO_THE_POWER_OF, 0); }
		public ArithmeticexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterArithmeticexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitArithmeticexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitArithmeticexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticexprContext arithmeticexpr() throws RecognitionException {
		ArithmeticexprContext _localctx = new ArithmeticexprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arithmeticexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			((ArithmeticexprContext)_localctx).first = expr();
			setState(493);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TO_THE_POWER_OF) | (1L << DIVIDED_BY) | (1L << TIMES))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(494);
			((ArithmeticexprContext)_localctx).second = expr();
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
		public Function_nameContext func_name;
		public TerminalNode LPAREN() { return getToken(BatchSharpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BatchSharpParser.RPAREN, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			((CallContext)_localctx).func_name = function_name();
			setState(497);
			match(LPAREN);
			setState(499);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << CATCH) | (1L << DIR) | (1L << DOLLAR) | (1L << ELSE) | (1L << FILE) | (1L << IF) | (1L << IN) | (1L << INLINEBACKTICK) | (1L << LPAREN) | (1L << LSQUARE) | (1L << NUMBER) | (1L << NUMERAL) | (1L << RETURN) | (1L << STRING) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ZERO_X) | (1L << ID))) != 0)) {
				{
				setState(498);
				arguments();
				}
			}

			setState(501);
			match(RPAREN);
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

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BatchSharpParser.ID, 0); }
		public TerminalNode FILE() { return getToken(BatchSharpParser.FILE, 0); }
		public TerminalNode DIR() { return getToken(BatchSharpParser.DIR, 0); }
		public TerminalNode TYPE_ARRAY() { return getToken(BatchSharpParser.TYPE_ARRAY, 0); }
		public TerminalNode TYPE_INT() { return getToken(BatchSharpParser.TYPE_INT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(BatchSharpParser.TYPE_STRING, 0); }
		public TerminalNode IN() { return getToken(BatchSharpParser.IN, 0); }
		public TerminalNode RETURN() { return getToken(BatchSharpParser.RETURN, 0); }
		public TerminalNode IF() { return getToken(BatchSharpParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(BatchSharpParser.ELSE, 0); }
		public TerminalNode TRY() { return getToken(BatchSharpParser.TRY, 0); }
		public TerminalNode CATCH() { return getToken(BatchSharpParser.CATCH, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << DIR) | (1L << ELSE) | (1L << FILE) | (1L << IF) | (1L << IN) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Interpolated_stringContext extends ParserRuleContext {
		public Token string;
		public TerminalNode DOLLAR() { return getToken(BatchSharpParser.DOLLAR, 0); }
		public TerminalNode STRING() { return getToken(BatchSharpParser.STRING, 0); }
		public Interpolated_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterInterpolated_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitInterpolated_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitInterpolated_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_stringContext interpolated_string() throws RecognitionException {
		Interpolated_stringContext _localctx = new Interpolated_stringContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_interpolated_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(DOLLAR);
			setState(506);
			((Interpolated_stringContext)_localctx).string = match(STRING);
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
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
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
		enterRule(_localctx, 76, RULE_number);
		try {
			setState(510);
			switch (_input.LA(1)) {
			case NUMERAL:
			case ZERO_X:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				hex();
				}
				break;
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				decimal();
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
		public String identifier;
		public Token name;
		public TerminalNode DOLLAR() { return getToken(BatchSharpParser.DOLLAR, 0); }
		public TerminalNode ID() { return getToken(BatchSharpParser.ID, 0); }
		public TerminalNode FILE() { return getToken(BatchSharpParser.FILE, 0); }
		public TerminalNode DIR() { return getToken(BatchSharpParser.DIR, 0); }
		public TerminalNode TYPE_ARRAY() { return getToken(BatchSharpParser.TYPE_ARRAY, 0); }
		public TerminalNode TYPE_INT() { return getToken(BatchSharpParser.TYPE_INT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(BatchSharpParser.TYPE_STRING, 0); }
		public TerminalNode IN() { return getToken(BatchSharpParser.IN, 0); }
		public TerminalNode RETURN() { return getToken(BatchSharpParser.RETURN, 0); }
		public TerminalNode IF() { return getToken(BatchSharpParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(BatchSharpParser.ELSE, 0); }
		public TerminalNode TRY() { return getToken(BatchSharpParser.TRY, 0); }
		public TerminalNode CATCH() { return getToken(BatchSharpParser.CATCH, 0); }
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
		enterRule(_localctx, 78, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(DOLLAR);
			setState(513);
			((VariableContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CATCH) | (1L << DIR) | (1L << ELSE) | (1L << FILE) | (1L << IF) | (1L << IN) | (1L << RETURN) | (1L << TRY) | (1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << ID))) != 0)) ) {
				((VariableContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			 ((VariableContext)_localctx).identifier =  (((VariableContext)_localctx).name!=null?((VariableContext)_localctx).name.getText():null); 
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

	public static class InlineexprContext extends ParserRuleContext {
		public TerminalNode INLINEBACKTICK() { return getToken(BatchSharpParser.INLINEBACKTICK, 0); }
		public InlineexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterInlineexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitInlineexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitInlineexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineexprContext inlineexpr() throws RecognitionException {
		InlineexprContext _localctx = new InlineexprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_inlineexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(INLINEBACKTICK);
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
		enterRule(_localctx, 82, RULE_arguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(518);
					expression();
					setState(519);
					match(COMMA);
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(526);
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

	public static class Boolean_operatorContext extends ParserRuleContext {
		public TerminalNode BOOL_EQUALS() { return getToken(BatchSharpParser.BOOL_EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(BatchSharpParser.NOT_EQUALS, 0); }
		public TerminalNode LE() { return getToken(BatchSharpParser.LE, 0); }
		public TerminalNode GE() { return getToken(BatchSharpParser.GE, 0); }
		public TerminalNode LT() { return getToken(BatchSharpParser.LT, 0); }
		public TerminalNode GT() { return getToken(BatchSharpParser.GT, 0); }
		public Boolean_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterBoolean_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitBoolean_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitBoolean_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_operatorContext boolean_operator() throws RecognitionException {
		Boolean_operatorContext _localctx = new Boolean_operatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_boolean_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_EQUALS) | (1L << GE) | (1L << GT) | (1L << LE) | (1L << LT) | (1L << NOT_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 86, RULE_hex);
		int _la;
		try {
			setState(542);
			switch (_input.LA(1)) {
			case ZERO_X:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(ZERO_X);
				setState(532); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(531);
					((HexContext)_localctx).value = match(NUMERAL);
					}
					}
					setState(534); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERAL );
				}
				break;
			case NUMERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(536);
					((HexContext)_localctx).value = match(NUMERAL);
					}
					}
					setState(539); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERAL );
				setState(541);
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

	public static class DecimalContext extends ParserRuleContext {
		public Token value;
		public TerminalNode NUMBER() { return getToken(BatchSharpParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(BatchSharpParser.MINUS, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(544);
				match(MINUS);
				}
			}

			setState(547);
			((DecimalContext)_localctx).value = match(NUMBER);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<TypedparameterContext> typedparameter() {
			return getRuleContexts(TypedparameterContext.class);
		}
		public TypedparameterContext typedparameter(int i) {
			return getRuleContext(TypedparameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BatchSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BatchSharpParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(549);
					typedparameter();
					setState(550);
					match(COMMA);
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(557);
			typedparameter();
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

	public static class TypedparameterContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public TypedparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterTypedparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitTypedparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitTypedparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedparameterContext typedparameter() throws RecognitionException {
		TypedparameterContext _localctx = new TypedparameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typedparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING))) != 0)) {
				{
				setState(559);
				typespecifier();
				}
			}

			setState(562);
			variable();
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

	public static class TypespecifierContext extends ParserRuleContext {
		public Token type;
		public TerminalNode TYPE_ARRAY() { return getToken(BatchSharpParser.TYPE_ARRAY, 0); }
		public TerminalNode TYPE_INT() { return getToken(BatchSharpParser.TYPE_INT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(BatchSharpParser.TYPE_STRING, 0); }
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterTypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitTypespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitTypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typespecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			((TypespecifierContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_ARRAY) | (1L << TYPE_INT) | (1L << TYPE_STRING))) != 0)) ) {
				((TypespecifierContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u0239\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\5\2e\n\2\7\2g\n\2\f"+
		"\2\16\2j\13\2\3\2\3\2\5\2n\n\2\3\3\3\3\3\3\5\3s\n\3\3\4\3\4\5\4w\n\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u0085\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0098\n"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\5\13\u00a1\n\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n\f\7\f\u00b3\n\f\f\f"+
		"\16\f\u00b6\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00c6\n\r\7\r\u00c8\n\r\f\r\16\r\u00cb\13\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00d5\n\16\7\16\u00d7\n\16\f\16\16\16\u00da\13"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17"+
		"\7\17\u00e8\n\17\f\17\16\17\u00eb\13\17\3\17\3\17\3\20\3\20\5\20\u00f1"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fb\n\20\7\20\u00fd"+
		"\n\20\f\20\16\20\u0100\13\20\3\20\3\20\3\21\3\21\5\21\u0106\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u010d\n\21\7\21\u010f\n\21\f\21\16\21\u0112"+
		"\13\21\3\21\3\21\3\22\3\22\5\22\u0118\n\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0121\n\22\7\22\u0123\n\22\f\22\16\22\u0126\13\22\3\22\3"+
		"\22\3\23\5\23\u012b\n\23\3\23\3\23\3\23\5\23\u0130\n\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0136\n\23\7\23\u0138\n\23\f\23\16\23\u013b\13\23\3\23\3\23"+
		"\3\24\3\24\7\24\u0141\n\24\f\24\16\24\u0144\13\24\3\24\5\24\u0147\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0152\n\25\7\25\u0154"+
		"\n\25\f\25\16\25\u0157\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0165\n\26\7\26\u0167\n\26\f\26\16\26\u016a\13"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0172\n\27\7\27\u0174\n\27\f\27"+
		"\16\27\u0177\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u018a\n\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0196\n\35\6\35\u0198\n\35\r\35\16"+
		"\35\u0199\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u01a2\n\36\7\36\u01a4\n\36"+
		"\f\36\16\36\u01a7\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01b1"+
		"\n\36\7\36\u01b3\n\36\f\36\16\36\u01b6\13\36\3\36\3\36\5\36\u01ba\n\36"+
		"\3\37\5\37\u01bd\n\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \5 \u01ce\n \3!\3!\3!\3!\3!\3!\7!\u01d6\n!\f!\16!\u01d9\13!\3!"+
		"\3!\3!\5!\u01de\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01e8\n\"\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\5%\u01f6\n%\3%\3%\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\5(\u0201\n(\3)\3)\3)\3)\3*\3*\3+\3+\3+\7+\u020c\n+\f+\16+\u020f\13"+
		"+\3+\3+\3,\3,\3-\3-\6-\u0217\n-\r-\16-\u0218\3-\6-\u021c\n-\r-\16-\u021d"+
		"\3-\5-\u0221\n-\3.\5.\u0224\n.\3.\3.\3/\3/\3/\7/\u022b\n/\f/\16/\u022e"+
		"\13/\3/\3/\3\60\5\60\u0233\n\60\3\60\3\60\3\61\3\61\3\61\2\2\62\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`\2\7\4\2\4\5\7\b\3\2\4\b\n\2\16\16\23\23\26\26\30\30\36\37..\65"+
		"8;;\5\2\f\f\32\33&(\3\2\668\u025c\2h\3\2\2\2\4r\3\2\2\2\6v\3\2\2\2\bx"+
		"\3\2\2\2\n|\3\2\2\2\f\u0084\3\2\2\2\16\u0097\3\2\2\2\20\u0099\3\2\2\2"+
		"\22\u009b\3\2\2\2\24\u00a0\3\2\2\2\26\u00a6\3\2\2\2\30\u00b9\3\2\2\2\32"+
		"\u00ce\3\2\2\2\34\u00dd\3\2\2\2\36\u00ee\3\2\2\2 \u0103\3\2\2\2\"\u0115"+
		"\3\2\2\2$\u012a\3\2\2\2&\u013e\3\2\2\2(\u0148\3\2\2\2*\u015a\3\2\2\2,"+
		"\u016d\3\2\2\2.\u017a\3\2\2\2\60\u017c\3\2\2\2\62\u0189\3\2\2\2\64\u018b"+
		"\3\2\2\2\66\u018e\3\2\2\28\u0191\3\2\2\2:\u01b9\3\2\2\2<\u01bc\3\2\2\2"+
		">\u01cd\3\2\2\2@\u01dd\3\2\2\2B\u01e7\3\2\2\2D\u01e9\3\2\2\2F\u01ee\3"+
		"\2\2\2H\u01f2\3\2\2\2J\u01f9\3\2\2\2L\u01fb\3\2\2\2N\u0200\3\2\2\2P\u0202"+
		"\3\2\2\2R\u0206\3\2\2\2T\u020d\3\2\2\2V\u0212\3\2\2\2X\u0220\3\2\2\2Z"+
		"\u0223\3\2\2\2\\\u022c\3\2\2\2^\u0232\3\2\2\2`\u0236\3\2\2\2bd\5\4\3\2"+
		"ce\7\61\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2"+
		"\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2km\5\4\3\2ln\7\61\2\2ml\3\2\2\2mn\3\2"+
		"\2\2n\3\3\2\2\2os\5\6\4\2ps\5\16\b\2qs\5$\23\2ro\3\2\2\2rp\3\2\2\2rq\3"+
		"\2\2\2s\5\3\2\2\2tw\5\b\5\2uw\5\n\6\2vt\3\2\2\2vu\3\2\2\2w\7\3\2\2\2x"+
		"y\7\t\2\2yz\7;\2\2z{\b\5\1\2{\t\3\2\2\2|}\7\t\2\2}~\7;\2\2~\177\5\f\7"+
		"\2\177\u0080\b\6\1\2\u0080\13\3\2\2\2\u0081\u0085\7\64\2\2\u0082\u0085"+
		"\5N(\2\u0083\u0085\7;\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\r\3\2\2\2\u0086\u0098\5\20\t\2\u0087\u0098\5<\37"+
		"\2\u0088\u0098\5\24\13\2\u0089\u0098\5.\30\2\u008a\u0098\5\64\33\2\u008b"+
		"\u0098\5\26\f\2\u008c\u0098\5\30\r\2\u008d\u0098\5\32\16\2\u008e\u0098"+
		"\5\34\17\2\u008f\u0098\5 \21\2\u0090\u0098\5\"\22\2\u0091\u0098\5\60\31"+
		"\2\u0092\u0098\5\62\32\2\u0093\u0098\5&\24\2\u0094\u0098\5\66\34\2\u0095"+
		"\u0098\5\22\n\2\u0096\u0098\5\36\20\2\u0097\u0086\3\2\2\2\u0097\u0087"+
		"\3\2\2\2\u0097\u0088\3\2\2\2\u0097\u0089\3\2\2\2\u0097\u008a\3\2\2\2\u0097"+
		"\u008b\3\2\2\2\u0097\u008c\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u008e\3\2"+
		"\2\2\u0097\u008f\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097"+
		"\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0096\3\2\2\2\u0098\17\3\2\2\2\u0099\u009a\5H%\2\u009a\21\3"+
		"\2\2\2\u009b\u009c\5D#\2\u009c\u009d\7\27\2\2\u009d\u009e\5> \2\u009e"+
		"\23\3\2\2\2\u009f\u00a1\7\20\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2"+
		"\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5P)\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5"+
		"\5> \2\u00a5\25\3\2\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a8\7$\2\2\u00a8"+
		"\u00a9\5> \2\u00a9\u00aa\7\25\2\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\5>"+
		" \2\u00ac\u00ad\7/\2\2\u00ad\u00b4\7#\2\2\u00ae\u00b0\5\16\b\2\u00af\u00b1"+
		"\7\61\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2"+
		"\u00b2\u00ae\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7,\2\2\u00b8"+
		"\27\3\2\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb\5^\60\2\u00bb\u00bc\7\37"+
		"\2\2\u00bc\u00bd\7$\2\2\u00bd\u00be\5> \2\u00be\u00bf\7\25\2\2\u00bf\u00c0"+
		"\7\25\2\2\u00c0\u00c1\5> \2\u00c1\u00c2\7/\2\2\u00c2\u00c9\7#\2\2\u00c3"+
		"\u00c5\5\16\b\2\u00c4\u00c6\7\61\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3"+
		"\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cd\7,\2\2\u00cd\31\3\2\2\2\u00ce\u00cf\7\31\2\2\u00cf\u00d0"+
		"\7\30\2\2\u00d0\u00d1\5> \2\u00d1\u00d8\7#\2\2\u00d2\u00d4\5\16\b\2\u00d3"+
		"\u00d5\7\61\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3"+
		"\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7,"+
		"\2\2\u00dc\33\3\2\2\2\u00dd\u00de\7\31\2\2\u00de\u00df\5^\60\2\u00df\u00e0"+
		"\7\37\2\2\u00e0\u00e1\7\30\2\2\u00e1\u00e2\5> \2\u00e2\u00e9\7#\2\2\u00e3"+
		"\u00e5\5\16\b\2\u00e4\u00e6\7\61\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ed\7,\2\2\u00ed\35\3\2\2\2\u00ee\u00f0\7\31\2\2\u00ef\u00f1"+
		"\7-\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\7\30\2\2\u00f3\u00f4\5P)\2\u00f4\u00f5\7\37\2\2\u00f5\u00f6\7\23"+
		"\2\2\u00f6\u00f7\5> \2\u00f7\u00fe\7#\2\2\u00f8\u00fa\5\16\b\2\u00f9\u00fb"+
		"\7\61\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2"+
		"\u00fc\u00f8\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7,\2\2\u0102"+
		"\37\3\2\2\2\u0103\u0105\7\31\2\2\u0104\u0106\7-\2\2\u0105\u0104\3\2\2"+
		"\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\23\2\2\u0108"+
		"\u0109\5> \2\u0109\u0110\7#\2\2\u010a\u010c\5\16\b\2\u010b\u010d\7\61"+
		"\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010a\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7,\2\2\u0114"+
		"!\3\2\2\2\u0115\u0117\7\31\2\2\u0116\u0118\7-\2\2\u0117\u0116\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\5^\60\2\u011a\u011b"+
		"\7\37\2\2\u011b\u011c\7\23\2\2\u011c\u011d\5> \2\u011d\u0124\7#\2\2\u011e"+
		"\u0120\5\16\b\2\u011f\u0121\7\61\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3"+
		"\2\2\2\u0121\u0123\3\2\2\2\u0122\u011e\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0128\7,\2\2\u0128#\3\2\2\2\u0129\u012b\5`\61\2\u012a\u0129"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5J&\2\u012d"+
		"\u012f\7$\2\2\u012e\u0130\5\\/\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2"+
		"\2\u0130\u0131\3\2\2\2\u0131\u0132\7/\2\2\u0132\u0139\7#\2\2\u0133\u0135"+
		"\5\16\b\2\u0134\u0136\7\61\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2"+
		"\u0136\u0138\3\2\2\2\u0137\u0133\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013d\7,\2\2\u013d%\3\2\2\2\u013e\u0142\5(\25\2\u013f\u0141\5*\26\2\u0140"+
		"\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\5,\27\2\u0146"+
		"\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\'\3\2\2\2\u0148\u0149\7\36\2"+
		"\2\u0149\u014a\7$\2\2\u014a\u014b\5> \2\u014b\u014c\5V,\2\u014c\u014d"+
		"\5> \2\u014d\u014e\7/\2\2\u014e\u0155\7#\2\2\u014f\u0151\5\16\b\2\u0150"+
		"\u0152\7\61\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3"+
		"\2\2\2\u0153\u014f\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7,"+
		"\2\2\u0159)\3\2\2\2\u015a\u015b\7\26\2\2\u015b\u015c\7\36\2\2\u015c\u015d"+
		"\7$\2\2\u015d\u015e\5> \2\u015e\u015f\5V,\2\u015f\u0160\5> \2\u0160\u0161"+
		"\7/\2\2\u0161\u0168\7#\2\2\u0162\u0164\5\16\b\2\u0163\u0165\7\61\2\2\u0164"+
		"\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0162\3\2"+
		"\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7,\2\2\u016c+\3\2\2\2\u016d"+
		"\u016e\7\26\2\2\u016e\u0175\7#\2\2\u016f\u0171\5\16\b\2\u0170\u0172\7"+
		"\61\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u016f\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7,\2\2\u0179"+
		"-\3\2\2\2\u017a\u017b\7\"\2\2\u017b/\3\2\2\2\u017c\u017d\5P)\2\u017d\u017e"+
		"\t\2\2\2\u017e\u017f\7\27\2\2\u017f\u0180\5> \2\u0180\61\3\2\2\2\u0181"+
		"\u0182\5P)\2\u0182\u0183\7\4\2\2\u0183\u0184\7\4\2\2\u0184\u018a\3\2\2"+
		"\2\u0185\u0186\5P)\2\u0186\u0187\7\5\2\2\u0187\u0188\7\5\2\2\u0188\u018a"+
		"\3\2\2\2\u0189\u0181\3\2\2\2\u0189\u0185\3\2\2\2\u018a\63\3\2\2\2\u018b"+
		"\u018c\7.\2\2\u018c\u018d\5> \2\u018d\65\3\2\2\2\u018e\u018f\58\35\2\u018f"+
		"\u0190\5:\36\2\u0190\67\3\2\2\2\u0191\u0192\7\65\2\2\u0192\u0197\7#\2"+
		"\2\u0193\u0195\5\16\b\2\u0194\u0196\7\61\2\2\u0195\u0194\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0193\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\7,\2\2\u019c9\3\2\2\2\u019d\u019e\7\16\2\2\u019e\u01a5\7#\2\2\u019f"+
		"\u01a1\5\16\b\2\u01a0\u01a2\7\61\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3"+
		"\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019f\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2"+
		"\2\2\u01a8\u01ba\7,\2\2\u01a9\u01aa\7\16\2\2\u01aa\u01ab\7$\2\2\u01ab"+
		"\u01ac\5^\60\2\u01ac\u01ad\7/\2\2\u01ad\u01b4\7#\2\2\u01ae\u01b0\5\16"+
		"\b\2\u01af\u01b1\7\61\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b3\3\2\2\2\u01b2\u01ae\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b8\7,\2\2\u01b8\u01ba\3\2\2\2\u01b9\u019d\3\2\2\2\u01b9\u01a9\3\2"+
		"\2\2\u01ba;\3\2\2\2\u01bb\u01bd\7\20\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5`\61\2\u01bf\u01c0\5P)\2\u01c0"+
		"\u01c1\7\27\2\2\u01c1\u01c2\5> \2\u01c2=\3\2\2\2\u01c3\u01ce\5B\"\2\u01c4"+
		"\u01c5\7$\2\2\u01c5\u01c6\5B\"\2\u01c6\u01c7\7/\2\2\u01c7\u01ce\3\2\2"+
		"\2\u01c8\u01ce\5F$\2\u01c9\u01ca\7$\2\2\u01ca\u01cb\5F$\2\u01cb\u01cc"+
		"\7/\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c3\3\2\2\2\u01cd\u01c4\3\2\2\2\u01cd"+
		"\u01c8\3\2\2\2\u01cd\u01c9\3\2\2\2\u01ce?\3\2\2\2\u01cf\u01d0\7%\2\2\u01d0"+
		"\u01de\7\60\2\2\u01d1\u01d7\7%\2\2\u01d2\u01d3\5B\"\2\u01d3\u01d4\7\17"+
		"\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2"+
		"\2\2\u01da\u01db\5B\"\2\u01db\u01dc\7\60\2\2\u01dc\u01de\3\2\2\2\u01dd"+
		"\u01cf\3\2\2\2\u01dd\u01d1\3\2\2\2\u01deA\3\2\2\2\u01df\u01e8\5H%\2\u01e0"+
		"\u01e8\5N(\2\u01e1\u01e8\5R*\2\u01e2\u01e8\5P)\2\u01e3\u01e8\7\64\2\2"+
		"\u01e4\u01e8\5L\'\2\u01e5\u01e8\5D#\2\u01e6\u01e8\5@!\2\u01e7\u01df\3"+
		"\2\2\2\u01e7\u01e0\3\2\2\2\u01e7\u01e1\3\2\2\2\u01e7\u01e2\3\2\2\2\u01e7"+
		"\u01e3\3\2\2\2\u01e7\u01e4\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2"+
		"\2\2\u01e8C\3\2\2\2\u01e9\u01ea\5P)\2\u01ea\u01eb\7%\2\2\u01eb\u01ec\5"+
		"B\"\2\u01ec\u01ed\7\60\2\2\u01edE\3\2\2\2\u01ee\u01ef\5B\"\2\u01ef\u01f0"+
		"\t\3\2\2\u01f0\u01f1\5B\"\2\u01f1G\3\2\2\2\u01f2\u01f3\5J&\2\u01f3\u01f5"+
		"\7$\2\2\u01f4\u01f6\5T+\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f8\7/\2\2\u01f8I\3\2\2\2\u01f9\u01fa\t\4\2\2\u01fa"+
		"K\3\2\2\2\u01fb\u01fc\7\24\2\2\u01fc\u01fd\7\64\2\2\u01fdM\3\2\2\2\u01fe"+
		"\u0201\5X-\2\u01ff\u0201\5Z.\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2"+
		"\u0201O\3\2\2\2\u0202\u0203\7\24\2\2\u0203\u0204\t\4\2\2\u0204\u0205\b"+
		")\1\2\u0205Q\3\2\2\2\u0206\u0207\7!\2\2\u0207S\3\2\2\2\u0208\u0209\5>"+
		" \2\u0209\u020a\7\17\2\2\u020a\u020c\3\2\2\2\u020b\u0208\3\2\2\2\u020c"+
		"\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2"+
		"\2\2\u020f\u020d\3\2\2\2\u0210\u0211\5> \2\u0211U\3\2\2\2\u0212\u0213"+
		"\t\5\2\2\u0213W\3\2\2\2\u0214\u0216\7:\2\2\u0215\u0217\7*\2\2\u0216\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u0221\3\2\2\2\u021a\u021c\7*\2\2\u021b\u021a\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0221\7\34\2\2\u0220\u0214\3\2\2\2\u0220\u021b\3\2\2\2\u0221Y\3\2\2\2"+
		"\u0222\u0224\7\5\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0226\7)\2\2\u0226[\3\2\2\2\u0227\u0228\5^\60\2\u0228\u0229"+
		"\7\17\2\2\u0229\u022b\3\2\2\2\u022a\u0227\3\2\2\2\u022b\u022e\3\2\2\2"+
		"\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c"+
		"\3\2\2\2\u022f\u0230\5^\60\2\u0230]\3\2\2\2\u0231\u0233\5`\61\2\u0232"+
		"\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\5P"+
		")\2\u0235_\3\2\2\2\u0236\u0237\t\6\2\2\u0237a\3\2\2\2=dhmrv\u0084\u0097"+
		"\u00a0\u00b0\u00b4\u00c5\u00c9\u00d4\u00d8\u00e5\u00e9\u00f0\u00fa\u00fe"+
		"\u0105\u010c\u0110\u0117\u0120\u0124\u012a\u012f\u0135\u0139\u0142\u0146"+
		"\u0151\u0155\u0164\u0168\u0171\u0175\u0189\u0195\u0199\u01a1\u01a5\u01b0"+
		"\u01b4\u01b9\u01bc\u01cd\u01d7\u01dd\u01e7\u01f5\u0200\u020d\u0218\u021d"+
		"\u0220\u0223\u022c\u0232";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}