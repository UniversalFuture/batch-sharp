// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp/src\BatchSharp.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROBA=1, DECIMAL=2, DIGIT=3, DIGITS=4, DOT=5, LETTER=6, LETTERS=7, LOWERCASE=8, 
		NEWLINE=9, NUMBER=10, NUMBERS=11, UPPERCASE=12, WS=13;
	public static final int
		RULE_application = 0, RULE_codeline = 1, RULE_c = 2, RULE_directive = 3;
	public static final String[] ruleNames = {
		"application", "codeline", "c", "directive"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", null, null, null, "'.'", null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARROBA", "DECIMAL", "DIGIT", "DIGITS", "DOT", "LETTER", "LETTERS", 
		"LOWERCASE", "NEWLINE", "NUMBER", "NUMBERS", "UPPERCASE", "WS"
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
	@NotNull
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
	public static class ApplicationContext extends ParserRuleContext {
		public List<CodelineContext> codeline() {
			return getRuleContexts(CodelineContext.class);
		}
		public CodelineContext codeline(int i) {
			return getRuleContext(CodelineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BatchSharpParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BatchSharpParser.NEWLINE, i);
		}
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_application);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(8); 
					codeline();
					setState(10); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(9); 
						match(NEWLINE);
						}
						}
						setState(12); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					}
					} 
				}
				setState(18);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(19); 
			codeline();
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
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21); 
				directive();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ARROBA );
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

	public static class CContext extends ParserRuleContext {
		public CodelineContext codeline() {
			return getRuleContext(CodelineContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BatchSharpParser.NEWLINE, 0); }
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpListener ) ((BatchSharpListener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpVisitor ) return ((BatchSharpVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			codeline();
			setState(27); 
			match(NEWLINE);
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
		public TerminalNode ARROBA() { return getToken(BatchSharpParser.ARROBA, 0); }
		public List<TerminalNode> LETTERS() { return getTokens(BatchSharpParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(BatchSharpParser.LETTERS, i);
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
		enterRule(_localctx, 6, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			match(ARROBA);
			setState(30); 
			match(LETTERS);
			setState(31); 
			match(LETTERS);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\6\2\r\n\2\r\2\16\2\16\7\2\21\n\2\f\2\16\2\24"+
		"\13\2\3\2\3\2\3\3\6\3\31\n\3\r\3\16\3\32\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\2\2\6\2\4\6\b\2\2\"\2\22\3\2\2\2\4\30\3\2\2\2\6\34\3\2\2\2\b\37\3\2"+
		"\2\2\n\f\5\4\3\2\13\r\7\13\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2"+
		"\16\17\3\2\2\2\17\21\3\2\2\2\20\n\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2"+
		"\22\23\3\2\2\2\23\25\3\2\2\2\24\22\3\2\2\2\25\26\5\4\3\2\26\3\3\2\2\2"+
		"\27\31\5\b\5\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2"+
		"\33\5\3\2\2\2\34\35\5\4\3\2\35\36\7\13\2\2\36\7\3\2\2\2\37 \7\3\2\2 !"+
		"\7\t\2\2!\"\7\t\2\2\"\t\3\2\2\2\5\16\22\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}