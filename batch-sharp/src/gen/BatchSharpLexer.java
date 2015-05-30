// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp\BatchSharpLexer.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROBA=1, DECIMAL=2, DIGIT=3, DIGITS=4, DOT=5, LETTER=6, LETTERS=7, LOWERCASE=8, 
		NUMBER=9, NUMBERS=10, UPPERCASE=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ARROBA", "DECIMAL", "DIGIT", "DIGITS", "DOT", "LETTER", "LETTERS", "LOWERCASE", 
		"NUMBER", "NUMBERS", "UPPERCASE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", null, null, null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARROBA", "DECIMAL", "DIGIT", "DIGITS", "DOT", "LETTER", "LETTERS", 
		"LOWERCASE", "NUMBER", "NUMBERS", "UPPERCASE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16M\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\6\5%\n\5\r\5\16"+
		"\5&\3\6\3\6\3\7\3\7\5\7-\n\7\3\b\6\b\60\n\b\r\b\16\b\61\3\t\6\t\65\n\t"+
		"\r\t\16\t\66\3\n\3\n\5\n;\n\n\3\13\6\13>\n\13\r\13\16\13?\3\f\6\fC\n\f"+
		"\r\f\16\fD\3\r\6\rH\n\r\r\r\16\rI\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\6\3\2\62;\3\2c|\3\2C\\\4\2\13"+
		"\13\"\"T\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7!\3\2\2\2\t$\3\2\2\2"+
		"\13(\3\2\2\2\r,\3\2\2\2\17/\3\2\2\2\21\64\3\2\2\2\23:\3\2\2\2\25=\3\2"+
		"\2\2\27B\3\2\2\2\31G\3\2\2\2\33\34\7B\2\2\34\4\3\2\2\2\35\36\5\t\5\2\36"+
		"\37\5\13\6\2\37 \5\t\5\2 \6\3\2\2\2!\"\t\2\2\2\"\b\3\2\2\2#%\5\7\4\2$"+
		"#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\n\3\2\2\2()\7\60\2\2)\f\3\2"+
		"\2\2*-\5\21\t\2+-\5\27\f\2,*\3\2\2\2,+\3\2\2\2-\16\3\2\2\2.\60\5\r\7\2"+
		"/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\20\3\2\2\2\63\65"+
		"\t\3\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\22"+
		"\3\2\2\28;\5\t\5\29;\5\5\3\2:8\3\2\2\2:9\3\2\2\2;\24\3\2\2\2<>\5\23\n"+
		"\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\26\3\2\2\2AC\t\4\2\2BA\3\2"+
		"\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\30\3\2\2\2FH\t\5\2\2GF\3\2\2\2HI\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\r\2\2L\32\3\2\2\2\13\2&,\61\66"+
		":?DI\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}