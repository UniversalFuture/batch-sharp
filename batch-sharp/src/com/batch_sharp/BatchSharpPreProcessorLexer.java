// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp/src\BatchSharpPreProcessor.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BatchSharpPreProcessorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROBA=1, DECIMAL=2, DIGIT=3, DIGITS=4, DOT=5, LETTER=6, LETTERS=7, LOWERCASE=8, 
		NEWLINE=9, NUMBER=10, NUMBERS=11, UPPERCASE=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ARROBA", "DECIMAL", "DIGIT", "DIGITS", "DOT", "LETTER", "LETTERS", "LOWERCASE", 
		"NEWLINE", "NUMBER", "NUMBERS", "UPPERCASE", "WS"
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


	public BatchSharpPreProcessorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BatchSharpPreProcessor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17K\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\6\5"+
		"\'\n\5\r\5\16\5(\3\6\3\6\3\7\3\7\5\7/\n\7\3\b\6\b\62\n\b\r\b\16\b\63\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\5\13<\n\13\3\f\6\f?\n\f\r\f\16\f@\3\r\3\r\3\16"+
		"\6\16F\n\16\r\16\16\16G\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\3\2\6\3\2\62;\3\2c|\3\2C\\\4\2\13\13"+
		"\"\"P\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7#\3\2\2\2\t"+
		"&\3\2\2\2\13*\3\2\2\2\r.\3\2\2\2\17\61\3\2\2\2\21\65\3\2\2\2\23\67\3\2"+
		"\2\2\25;\3\2\2\2\27>\3\2\2\2\31B\3\2\2\2\33E\3\2\2\2\35\36\7B\2\2\36\4"+
		"\3\2\2\2\37 \5\t\5\2 !\5\13\6\2!\"\5\t\5\2\"\6\3\2\2\2#$\t\2\2\2$\b\3"+
		"\2\2\2%\'\5\7\4\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\n\3\2\2\2"+
		"*+\7\60\2\2+\f\3\2\2\2,/\5\21\t\2-/\5\31\r\2.,\3\2\2\2.-\3\2\2\2/\16\3"+
		"\2\2\2\60\62\5\r\7\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\20\3\2\2\2\65\66\t\3\2\2\66\22\3\2\2\2\678\7\f\2\28\24\3\2\2"+
		"\29<\5\t\5\2:<\5\5\3\2;9\3\2\2\2;:\3\2\2\2<\26\3\2\2\2=?\5\25\13\2>=\3"+
		"\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\30\3\2\2\2BC\t\4\2\2C\32\3\2\2\2"+
		"DF\t\5\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\b\16\2"+
		"\2J\34\3\2\2\2\t\2(.\63;@G\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}