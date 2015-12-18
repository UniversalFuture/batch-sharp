// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp_parsing/src/com/batch_sharp\BatchSharpPreProcessor.g4 by ANTLR 4.5
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
public class BatchSharpPreProcessorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROBA=1, COMMA=2, DASH=3, DECIMAL=4, DOLLAR=5, DOT=6, EQUALS=7, HEX=8, 
		ID=9, LPAREN=10, NEWLINE=11, NUMBER=12, PERCENT=13, RPAREN=14, SEMI=15, 
		SLASH=16, SINGLE_LINE_COMMENT=17, UNDERSCORE=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ARROBA", "COMMA", "DASH", "DECIMAL", "DOLLAR", "DOT", "EQUALS", "HEX", 
		"ID", "LPAREN", "NEWLINE", "NUMBER", "PERCENT", "RPAREN", "SEMI", "SLASH", 
		"SINGLE_LINE_COMMENT", "Input_character", "UNDERSCORE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "','", "'-'", null, "'$'", "'.'", "'='", null, null, "'('", 
		"'\n'", null, "'%'", "')'", "';'", "'/'", null, "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARROBA", "COMMA", "DASH", "DECIMAL", "DOLLAR", "DOT", "EQUALS", 
		"HEX", "ID", "LPAREN", "NEWLINE", "NUMBER", "PERCENT", "RPAREN", "SEMI", 
		"SLASH", "SINGLE_LINE_COMMENT", "UNDERSCORE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\63"+
		"\n\5\r\5\16\5\64\3\5\3\5\6\59\n\5\r\5\16\5:\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\6\tG\n\t\r\t\16\tH\3\t\6\tL\n\t\r\t\16\tM\3\t\5\tQ\n\t"+
		"\3\n\3\n\7\nU\n\n\f\n\16\nX\13\n\3\13\3\13\3\f\3\f\3\r\6\r_\n\r\r\r\16"+
		"\r`\3\r\5\rd\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\7\22r\n\22\f\22\16\22u\13\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\6\25~\n\25\r\25\16\25\177\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\24)\25\3"+
		"\2\b\3\2\62;\5\2\62;CHch\4\2C\\c|\6\2//;;C\\c|\6\2\f\f\17\17\u0087\u0087"+
		"\u202a\u202b\4\2\13\13\"\"\u008b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2"+
		"\5-\3\2\2\2\7/\3\2\2\2\t\62\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2"+
		"\21P\3\2\2\2\23R\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31c\3\2\2\2\33e\3\2\2"+
		"\2\35g\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#m\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)}"+
		"\3\2\2\2+,\7B\2\2,\4\3\2\2\2-.\7.\2\2.\6\3\2\2\2/\60\7/\2\2\60\b\3\2\2"+
		"\2\61\63\t\2\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2"+
		"\2\65\66\3\2\2\2\668\7\60\2\2\679\t\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;\n\3\2\2\2<=\7&\2\2=\f\3\2\2\2>?\7\60\2\2?\16\3\2\2\2@"+
		"A\7?\2\2A\20\3\2\2\2BC\7\62\2\2CD\7z\2\2DF\3\2\2\2EG\t\3\2\2FE\3\2\2\2"+
		"GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IQ\3\2\2\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\7j\2\2PB\3\2\2\2PK\3\2\2\2Q\22\3\2\2"+
		"\2RV\t\4\2\2SU\t\5\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\24\3\2"+
		"\2\2XV\3\2\2\2YZ\7*\2\2Z\26\3\2\2\2[\\\7\f\2\2\\\30\3\2\2\2]_\t\2\2\2"+
		"^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2bd\5\t\5\2c^\3\2\2\2"+
		"cb\3\2\2\2d\32\3\2\2\2ef\7\'\2\2f\34\3\2\2\2gh\7+\2\2h\36\3\2\2\2ij\7"+
		"=\2\2j \3\2\2\2kl\7\61\2\2l\"\3\2\2\2mn\7\61\2\2no\7\61\2\2os\3\2\2\2"+
		"pr\5%\23\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2"+
		"vw\b\22\2\2w$\3\2\2\2xy\n\6\2\2y&\3\2\2\2z{\7a\2\2{(\3\2\2\2|~\t\7\2\2"+
		"}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0082\b\25\3\2\u0082*\3\2\2\2\r\2\64:HMPV`cs\177\4\2\3\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}