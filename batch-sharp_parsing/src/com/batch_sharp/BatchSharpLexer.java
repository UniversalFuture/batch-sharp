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
		WS=1, PLUS=2, MINUS=3, TO_THE_POWER_OF=4, DIVIDED_BY=5, TIMES=6, ARROBA=7, 
		BACKTICK=8, BOOL_AND=9, BOOL_EQUALS=10, BOOL_OR=11, CATCH=12, COMMA=13, 
		CONST=14, DASH=15, DECIMAL=16, DIR=17, DOLLAR=18, DOT=19, ELSE=20, EQUALS=21, 
		FILE=22, FOR=23, GE=24, GT=25, H=26, HASH=27, IF=28, IN=29, INLINE=30, 
		INLINEBACKTICK=31, INLINESTMT=32, LBRACKET=33, LPAREN=34, LSQUARE=35, 
		LE=36, LT=37, NOT_EQUALS=38, NUMBER=39, NUMERAL=40, PERCENT=41, RBRACKET=42, 
		RECURSIVE=43, RETURN=44, RPAREN=45, RSQUARE=46, SEMI=47, SLASH=48, SINGLE_LINE_COMMENT=49, 
		STRING=50, TRY=51, TYPE_ARRAY=52, TYPE_INT=53, TYPE_STRING=54, UNDERSCORE=55, 
		ZERO_X=56, ID=57;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "NEWLINE", "PLUS", "MINUS", "TO_THE_POWER_OF", "DIVIDED_BY", "TIMES", 
		"ARROBA", "BACKTICK", "BOOL_AND", "BOOL_EQUALS", "BOOL_OR", "CATCH", "COMMA", 
		"CONST", "DASH", "DECIMAL", "DIR", "DOLLAR", "DOT", "ELSE", "EQUALS", 
		"FILE", "FOR", "GE", "GT", "H", "HASH", "IF", "IN", "INLINE", "INLINEBACKTICK", 
		"INLINESTMT", "LBRACKET", "LPAREN", "LSQUARE", "LE", "LT", "NOT_EQUALS", 
		"NUMBER", "NUMERAL", "PERCENT", "RBRACKET", "RECURSIVE", "RETURN", "RPAREN", 
		"RSQUARE", "SEMI", "SLASH", "SINGLE_LINE_COMMENT", "Input_character", 
		"STRING", "TRY", "TYPE_ARRAY", "TYPE_INT", "TYPE_STRING", "UNDERSCORE", 
		"ZERO_X", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2;\u0164\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\6\2|\n\2\r\2\16\2}\3\2\3\2\3\3\3\3\3\3\5\3\u0085\n\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\6\22\u00af\n\22\r\22\16\22\u00b0\3\22\3\22"+
		"\6\22\u00b5\n\22\r\22\16\22\u00b6\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\6!\u00e9\n!\r!\16!\u00ea"+
		"\3!\3!\3\"\3\"\3\"\6\"\u00f2\n\"\r\"\16\"\u00f3\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\6)\u0108\n)\r)\16)\u0109\3)\5)\u010d"+
		"\n)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3."+
		"\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0132"+
		"\n\63\f\63\16\63\u0135\13\63\3\63\3\63\3\64\3\64\3\65\3\65\7\65\u013d"+
		"\n\65\f\65\16\65\u0140\13\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3;\3;\3;\3<"+
		"\3<\7<\u0160\n<\f<\16<\u0163\13<\4\u00ea\u00f3\2=\3\3\5\2\7\4\t\5\13\6"+
		"\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24"+
		")\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'"+
		"O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\2i\64k\65m\66o\67q8s9u:w;\3\2\t\4\2"+
		"\13\13\"\"\4\2\f\f\17\17\3\2\62;\6\2\f\f\17\17\u0087\u0087\u202a\u202b"+
		"\5\2\f\f\17\17$$\4\2C\\c|\6\2//;;C\\c|\u016d\2\3\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\3{\3\2\2\2\5\u0084\3\2\2\2\7\u0086\3\2\2\2\t\u0088\3\2\2\2\13"+
		"\u008a\3\2\2\2\r\u008c\3\2\2\2\17\u008e\3\2\2\2\21\u0090\3\2\2\2\23\u0092"+
		"\3\2\2\2\25\u0094\3\2\2\2\27\u0097\3\2\2\2\31\u009a\3\2\2\2\33\u009d\3"+
		"\2\2\2\35\u00a3\3\2\2\2\37\u00a5\3\2\2\2!\u00ab\3\2\2\2#\u00ae\3\2\2\2"+
		"%\u00b8\3\2\2\2\'\u00bc\3\2\2\2)\u00be\3\2\2\2+\u00c0\3\2\2\2-\u00c5\3"+
		"\2\2\2/\u00c7\3\2\2\2\61\u00cc\3\2\2\2\63\u00d0\3\2\2\2\65\u00d3\3\2\2"+
		"\2\67\u00d5\3\2\2\29\u00d7\3\2\2\2;\u00d9\3\2\2\2=\u00dc\3\2\2\2?\u00df"+
		"\3\2\2\2A\u00e6\3\2\2\2C\u00ee\3\2\2\2E\u00f8\3\2\2\2G\u00fa\3\2\2\2I"+
		"\u00fc\3\2\2\2K\u00fe\3\2\2\2M\u0101\3\2\2\2O\u0103\3\2\2\2Q\u010c\3\2"+
		"\2\2S\u010e\3\2\2\2U\u0110\3\2\2\2W\u0112\3\2\2\2Y\u0114\3\2\2\2[\u011e"+
		"\3\2\2\2]\u0125\3\2\2\2_\u0127\3\2\2\2a\u0129\3\2\2\2c\u012b\3\2\2\2e"+
		"\u012d\3\2\2\2g\u0138\3\2\2\2i\u013a\3\2\2\2k\u0143\3\2\2\2m\u0147\3\2"+
		"\2\2o\u014d\3\2\2\2q\u0151\3\2\2\2s\u0158\3\2\2\2u\u015a\3\2\2\2w\u015d"+
		"\3\2\2\2y|\t\2\2\2z|\5\5\3\2{y\3\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}"+
		"~\3\2\2\2~\177\3\2\2\2\177\u0080\b\2\2\2\u0080\4\3\2\2\2\u0081\u0085\t"+
		"\3\2\2\u0082\u0083\7\17\2\2\u0083\u0085\7\f\2\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\6\3\2\2\2\u0086\u0087\7-\2\2\u0087\b\3\2\2\2\u0088"+
		"\u0089\7/\2\2\u0089\n\3\2\2\2\u008a\u008b\7`\2\2\u008b\f\3\2\2\2\u008c"+
		"\u008d\7\61\2\2\u008d\16\3\2\2\2\u008e\u008f\7,\2\2\u008f\20\3\2\2\2\u0090"+
		"\u0091\7B\2\2\u0091\22\3\2\2\2\u0092\u0093\7b\2\2\u0093\24\3\2\2\2\u0094"+
		"\u0095\7(\2\2\u0095\u0096\7(\2\2\u0096\26\3\2\2\2\u0097\u0098\7?\2\2\u0098"+
		"\u0099\7?\2\2\u0099\30\3\2\2\2\u009a\u009b\7~\2\2\u009b\u009c\7~\2\2\u009c"+
		"\32\3\2\2\2\u009d\u009e\7e\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\u00a1\7e\2\2\u00a1\u00a2\7j\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7u\2\2\u00a9\u00aa\7v\2\2\u00aa \3\2\2\2\u00ab\u00ac\7/\2\2\u00ac"+
		"\"\3\2\2\2\u00ad\u00af\t\4\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4"+
		"\7\60\2\2\u00b3\u00b5\t\4\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7"+
		"f\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7t\2\2\u00bb&\3\2\2\2\u00bc\u00bd"+
		"\7&\2\2\u00bd(\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf*\3\2\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		",\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6.\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2\u00cb\60\3\2\2\2\u00cc\u00cd"+
		"\7h\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7t\2\2\u00cf\62\3\2\2\2\u00d0\u00d1"+
		"\7@\2\2\u00d1\u00d2\7?\2\2\u00d2\64\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4\66"+
		"\3\2\2\2\u00d5\u00d6\7j\2\2\u00d68\3\2\2\2\u00d7\u00d8\7%\2\2\u00d8:\3"+
		"\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7h\2\2\u00db<\3\2\2\2\u00dc\u00dd"+
		"\7k\2\2\u00dd\u00de\7p\2\2\u00de>\3\2\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5@\3\2\2\2\u00e6\u00e8\5\23\n\2\u00e7\u00e9\13\2\2\2"+
		"\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5\23\n\2\u00edB\3\2\2\2\u00ee"+
		"\u00ef\5\23\n\2\u00ef\u00f1\5\23\n\2\u00f0\u00f2\13\2\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\5\23\n\2\u00f6\u00f7\5\23\n\2\u00f7D\3\2\2"+
		"\2\u00f8\u00f9\7}\2\2\u00f9F\3\2\2\2\u00fa\u00fb\7*\2\2\u00fbH\3\2\2\2"+
		"\u00fc\u00fd\7]\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff\u0100\7?\2"+
		"\2\u0100L\3\2\2\2\u0101\u0102\7>\2\2\u0102N\3\2\2\2\u0103\u0104\7#\2\2"+
		"\u0104\u0105\7?\2\2\u0105P\3\2\2\2\u0106\u0108\t\4\2\2\u0107\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u010d\5#\22\2\u010c\u0107\3\2\2\2\u010c\u010b\3\2"+
		"\2\2\u010dR\3\2\2\2\u010e\u010f\t\4\2\2\u010fT\3\2\2\2\u0110\u0111\7\'"+
		"\2\2\u0111V\3\2\2\2\u0112\u0113\7\177\2\2\u0113X\3\2\2\2\u0114\u0115\7"+
		"t\2\2\u0115\u0116\7g\2\2\u0116\u0117\7e\2\2\u0117\u0118\7w\2\2\u0118\u0119"+
		"\7t\2\2\u0119\u011a\7u\2\2\u011a\u011b\7k\2\2\u011b\u011c\7x\2\2\u011c"+
		"\u011d\7g\2\2\u011dZ\3\2\2\2\u011e\u011f\7t\2\2\u011f\u0120\7g\2\2\u0120"+
		"\u0121\7v\2\2\u0121\u0122\7w\2\2\u0122\u0123\7t\2\2\u0123\u0124\7p\2\2"+
		"\u0124\\\3\2\2\2\u0125\u0126\7+\2\2\u0126^\3\2\2\2\u0127\u0128\7_\2\2"+
		"\u0128`\3\2\2\2\u0129\u012a\7=\2\2\u012ab\3\2\2\2\u012b\u012c\7\61\2\2"+
		"\u012cd\3\2\2\2\u012d\u012e\7\61\2\2\u012e\u012f\7\61\2\2\u012f\u0133"+
		"\3\2\2\2\u0130\u0132\5g\64\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0137\b\63\3\2\u0137f\3\2\2\2\u0138\u0139\n\5\2\2\u0139h\3"+
		"\2\2\2\u013a\u013e\7$\2\2\u013b\u013d\n\6\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7$\2\2\u0142j\3\2\2\2\u0143\u0144"+
		"\7v\2\2\u0144\u0145\7t\2\2\u0145\u0146\7{\2\2\u0146l\3\2\2\2\u0147\u0148"+
		"\7c\2\2\u0148\u0149\7t\2\2\u0149\u014a\7t\2\2\u014a\u014b\7c\2\2\u014b"+
		"\u014c\7{\2\2\u014cn\3\2\2\2\u014d\u014e\7k\2\2\u014e\u014f\7p\2\2\u014f"+
		"\u0150\7v\2\2\u0150p\3\2\2\2\u0151\u0152\7u\2\2\u0152\u0153\7v\2\2\u0153"+
		"\u0154\7t\2\2\u0154\u0155\7k\2\2\u0155\u0156\7p\2\2\u0156\u0157\7i\2\2"+
		"\u0157r\3\2\2\2\u0158\u0159\7a\2\2\u0159t\3\2\2\2\u015a\u015b\7\62\2\2"+
		"\u015b\u015c\7z\2\2\u015cv\3\2\2\2\u015d\u0161\t\7\2\2\u015e\u0160\t\b"+
		"\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162x\3\2\2\2\u0163\u0161\3\2\2\2\17\2{}\u0084\u00b0\u00b6"+
		"\u00ea\u00f3\u0109\u010c\u0133\u013e\u0161\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}