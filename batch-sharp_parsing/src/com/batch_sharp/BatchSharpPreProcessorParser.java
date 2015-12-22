// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp_parsing/src/com/batch_sharp\BatchSharpPreProcessor.g4 by ANTLR 4.5.1
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
public class BatchSharpPreProcessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ARROBA=2, BACKTICK=3, COMMA=4, CONST=5, DASH=6, DECIMAL=7, DOLLAR=8, 
		DOT=9, EQUALS=10, GT=11, H=12, HASH=13, INLINE=14, INLINEBACKTICK=15, 
		LBRACKET=16, LPAREN=17, LT=18, NUMBER=19, NUMERAL=20, PERCENT=21, RBRACKET=22, 
		RETURN=23, RPAREN=24, SEMI=25, SLASH=26, SINGLE_LINE_COMMENT=27, STRING=28, 
		TYPE_NUM=29, TYPE_STRING=30, UNDERSCORE=31, ZERO_X=32, ID=33;
	public static final int
		RULE_directive = 0;
	public static final String[] ruleNames = {
		"directive"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'@'", "'`'", "','", "'const'", "'-'", null, "'$'", "'.'", 
		"'='", "'>'", "'h'", "'#'", "'inline'", null, "'{'", "'('", "'<'", null, 
		null, "'%'", "'}'", "'return'", "')'", "';'", "'/'", null, null, "'num'", 
		"'string'", "'_'", "'0x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "ARROBA", "BACKTICK", "COMMA", "CONST", "DASH", "DECIMAL", 
		"DOLLAR", "DOT", "EQUALS", "GT", "H", "HASH", "INLINE", "INLINEBACKTICK", 
		"LBRACKET", "LPAREN", "LT", "NUMBER", "NUMERAL", "PERCENT", "RBRACKET", 
		"RETURN", "RPAREN", "SEMI", "SLASH", "SINGLE_LINE_COMMENT", "STRING", 
		"TYPE_NUM", "TYPE_STRING", "UNDERSCORE", "ZERO_X", "ID"
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
	public String getGrammarFileName() { return "BatchSharpPreProcessor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BatchSharpPreProcessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DirectiveContext extends ParserRuleContext {
		public Token key;
		public Token value;
		public TerminalNode ARROBA() { return getToken(BatchSharpPreProcessorParser.ARROBA, 0); }
		public List<TerminalNode> ID() { return getTokens(BatchSharpPreProcessorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BatchSharpPreProcessorParser.ID, i);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpPreProcessorListener ) ((BatchSharpPreProcessorListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatchSharpPreProcessorListener ) ((BatchSharpPreProcessorListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatchSharpPreProcessorVisitor ) return ((BatchSharpPreProcessorVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_directive);
		try {
			setState(7);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				match(ARROBA);
				setState(3);
				((DirectiveContext)_localctx).key = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4);
				match(ARROBA);
				setState(5);
				((DirectiveContext)_localctx).key = match(ID);
				setState(6);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\f\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2\n\n\2\3\2\2\2\3\2\2\2\13\2\t\3\2\2\2\4\5\7\4\2\2\5"+
		"\n\7#\2\2\6\7\7\4\2\2\7\b\7#\2\2\b\n\7#\2\2\t\4\3\2\2\2\t\6\3\2\2\2\n"+
		"\3\3\2\2\2\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}