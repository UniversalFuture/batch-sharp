// Generated from C:\Users\tobe\Source\Repos\batch-sharp\batch-sharp_parsing\src\com\batch_sharp\BatchSharpLexer.g4 by ANTLR 4.5.1
package com.batch_sharp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BatchSharpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROBA=1, COMMA=2, DASH=3, DECIMAL=4, DOLLAR=5, DOT=6, EQUALS=7, H=8, 
		ID=9, LPAREN=10, NEWLINE=11, NUMBER=12, NUMERAL=13, PERCENT=14, RPAREN=15, 
		SEMI=16, SLASH=17, SINGLE_LINE_COMMENT=18, UNDERSCORE=19, WS=20, ZERO_X=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ARROBA", "COMMA", "DASH", "DECIMAL", "DOLLAR", "DOT", "EQUALS", "H", 
		"ID", "LPAREN", "NEWLINE", "NUMBER", "NUMERAL", "PERCENT", "RPAREN", "SEMI", 
		"SLASH", "SINGLE_LINE_COMMENT", "Input_character", "UNDERSCORE", "WS", 
		"ZERO_X"
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


	public BatchSharpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BatchSharpLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\6\5\67\n\5\r\5\16\58\3\5\3\5\6\5=\n\5\r\5\16\5>\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\7\nK\n\n\f\n\16\nN\13\n\3\13\3\13\3\f\3\f\3"+
		"\r\6\rU\n\r\r\r\16\rV\3\r\5\rZ\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23j\n\23\f\23\16\23m\13\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\6\26v\n\26\r\26\16\26w\3\26\3\26\3\27\3"+
		"\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\26-\27\3\2\7\3\2\62;\4\2C\\"+
		"c|\6\2//;;C\\c|\6\2\f\f\17\17\u0087\u0087\u202a\u202b\4\2\13\13\"\"\u0083"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2"+
		"\2\7\63\3\2\2\2\t\66\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21F\3"+
		"\2\2\2\23H\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35"+
		"]\3\2\2\2\37_\3\2\2\2!a\3\2\2\2#c\3\2\2\2%e\3\2\2\2\'p\3\2\2\2)r\3\2\2"+
		"\2+u\3\2\2\2-{\3\2\2\2/\60\7B\2\2\60\4\3\2\2\2\61\62\7.\2\2\62\6\3\2\2"+
		"\2\63\64\7/\2\2\64\b\3\2\2\2\65\67\t\2\2\2\66\65\3\2\2\2\678\3\2\2\28"+
		"\66\3\2\2\289\3\2\2\29:\3\2\2\2:<\7\60\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?\n\3\2\2\2@A\7&\2\2A\f\3\2\2\2BC\7\60\2\2C\16\3"+
		"\2\2\2DE\7?\2\2E\20\3\2\2\2FG\7j\2\2G\22\3\2\2\2HL\t\3\2\2IK\t\4\2\2J"+
		"I\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\24\3\2\2\2NL\3\2\2\2OP\7*\2\2"+
		"P\26\3\2\2\2QR\7\f\2\2R\30\3\2\2\2SU\t\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2WZ\3\2\2\2XZ\5\t\5\2YT\3\2\2\2YX\3\2\2\2Z\32\3\2\2\2[\\"+
		"\t\2\2\2\\\34\3\2\2\2]^\7\'\2\2^\36\3\2\2\2_`\7+\2\2` \3\2\2\2ab\7=\2"+
		"\2b\"\3\2\2\2cd\7\61\2\2d$\3\2\2\2ef\7\61\2\2fg\7\61\2\2gk\3\2\2\2hj\5"+
		"\'\24\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no"+
		"\b\23\2\2o&\3\2\2\2pq\n\5\2\2q(\3\2\2\2rs\7a\2\2s*\3\2\2\2tv\t\6\2\2u"+
		"t\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\26\3\2z,\3\2\2\2"+
		"{|\7\62\2\2|}\7z\2\2}.\3\2\2\2\n\28>LVYkw\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}