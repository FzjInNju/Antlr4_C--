// Generated from E:/sharefilepakage/ubuntu20/asdf/Lab/src\CmmLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LCOMMENT=2, WS=3, FLOAT=4, INT=5, SEMI=6, COMMA=7, ASSIGNOP=8, 
		RELOP=9, PLUS=10, MINUS=11, STAR=12, DIV=13, AND=14, OR=15, DOT=16, NOT=17, 
		LP=18, RP=19, LB=20, RB=21, LC=22, RC=23, TYPE=24, STRUCT=25, RETURN=26, 
		IF=27, ELSE=28, WHILE=29, ID=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "LCOMMENT", "WS", "FLOAT", "INT", "SEMI", "COMMA", "ASSIGNOP", 
			"RELOP", "PLUS", "MINUS", "STAR", "DIV", "AND", "OR", "DOT", "NOT", "LP", 
			"RP", "LB", "RB", "LC", "RC", "TYPE", "STRUCT", "RETURN", "IF", "ELSE", 
			"WHILE", "ID", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "';'", "','", "'='", null, "'+'", 
			"'-'", "'*'", "'/'", "'&&'", "'||'", "'.'", "'!'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", null, "'struct'", "'return'", "'if'", "'else'", 
			"'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "LCOMMENT", "WS", "FLOAT", "INT", "SEMI", "COMMA", "ASSIGNOP", 
			"RELOP", "PLUS", "MINUS", "STAR", "DIV", "AND", "OR", "DOT", "NOT", "LP", 
			"RP", "LB", "RB", "LC", "RC", "TYPE", "STRUCT", "RETURN", "IF", "ELSE", 
			"WHILE", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmmLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u010a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3S\n\3\f\3\16\3V\13\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4^\n\4\r\4\16\4_\3\4"+
		"\3\4\3\5\6\5e\n\5\r\5\16\5f\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\5\7\5q\n"+
		"\5\f\5\16\5t\13\5\3\5\3\5\6\5x\n\5\r\5\16\5y\5\5|\n\5\3\5\3\5\5\5\u0080"+
		"\n\5\3\5\6\5\u0083\n\5\r\5\16\5\u0084\5\5\u0087\n\5\3\5\6\5\u008a\n\5"+
		"\r\5\16\5\u008b\3\5\3\5\6\5\u0090\n\5\r\5\16\5\u0091\5\5\u0094\n\5\3\6"+
		"\3\6\6\6\u0098\n\6\r\6\16\6\u0099\3\6\3\6\3\6\7\6\u009f\n\6\f\6\16\6\u00a2"+
		"\13\6\3\6\3\6\3\6\6\6\u00a7\n\6\r\6\16\6\u00a8\5\6\u00ab\n\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bc\n\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e4\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37"+
		"\u0104\n\37\f\37\16\37\u0107\13\37\3 \3 \4GT\2!\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2\3\2\16\5\2\13\f"+
		"\17\17\"\"\4\2GGgg\4\2--//\3\2\62\62\3\2\629\3\2\63;\3\2\62;\4\2ZZzz\5"+
		"\2\62;CHch\4\2>>@@\5\2C\\aac|\6\2\62;C\\aac|\2\u0122\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3"+
		"A\3\2\2\2\5N\3\2\2\2\7]\3\2\2\2\t\u0093\3\2\2\2\13\u00aa\3\2\2\2\r\u00ac"+
		"\3\2\2\2\17\u00ae\3\2\2\2\21\u00b0\3\2\2\2\23\u00bb\3\2\2\2\25\u00bd\3"+
		"\2\2\2\27\u00bf\3\2\2\2\31\u00c1\3\2\2\2\33\u00c3\3\2\2\2\35\u00c5\3\2"+
		"\2\2\37\u00c8\3\2\2\2!\u00cb\3\2\2\2#\u00cd\3\2\2\2%\u00cf\3\2\2\2\'\u00d1"+
		"\3\2\2\2)\u00d3\3\2\2\2+\u00d5\3\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61"+
		"\u00e3\3\2\2\2\63\u00e5\3\2\2\2\65\u00ec\3\2\2\2\67\u00f3\3\2\2\29\u00f6"+
		"\3\2\2\2;\u00fb\3\2\2\2=\u0101\3\2\2\2?\u0108\3\2\2\2AB\7\61\2\2BC\7\61"+
		"\2\2CG\3\2\2\2DF\13\2\2\2ED\3\2\2\2FI\3\2\2\2GH\3\2\2\2GE\3\2\2\2HJ\3"+
		"\2\2\2IG\3\2\2\2JK\7\f\2\2KL\3\2\2\2LM\b\2\2\2M\4\3\2\2\2NO\7\61\2\2O"+
		"P\7,\2\2PT\3\2\2\2QS\13\2\2\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2TR\3\2\2\2"+
		"UW\3\2\2\2VT\3\2\2\2WX\7,\2\2XY\7\61\2\2YZ\3\2\2\2Z[\b\3\2\2[\6\3\2\2"+
		"\2\\^\t\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\b\4"+
		"\2\2b\b\3\2\2\2ce\5? \2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2"+
		"\2\2hl\7\60\2\2ik\5? \2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m|\3\2"+
		"\2\2nl\3\2\2\2oq\5? \2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2"+
		"\2tr\3\2\2\2uw\7\60\2\2vx\5? \2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z|\3\2\2\2{d\3\2\2\2{r\3\2\2\2|\u0086\3\2\2\2}\177\t\3\2\2~\u0080\t"+
		"\4\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083"+
		"\5? \2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086}\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0094\3\2\2\2\u0088\u008a\5? \2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\7\60\2\2\u008e\u0090\5? \2\u008f\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"{\3\2\2\2\u0093\u0089\3\2\2\2\u0094\n\3\2\2\2\u0095\u0097\t\5\2\2\u0096"+
		"\u0098\t\6\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u00ab\3\2\2\2\u009b\u00ab\t\5\2\2\u009c"+
		"\u00a0\t\7\2\2\u009d\u009f\t\b\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ab\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\t\5\2\2\u00a4\u00a6\t\t\2\2\u00a5\u00a7\t\n"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u0095\3\2\2\2\u00aa\u009b\3\2"+
		"\2\2\u00aa\u009c\3\2\2\2\u00aa\u00a3\3\2\2\2\u00ab\f\3\2\2\2\u00ac\u00ad"+
		"\7=\2\2\u00ad\16\3\2\2\2\u00ae\u00af\7.\2\2\u00af\20\3\2\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1\22\3\2\2\2\u00b2\u00bc\t\13\2\2\u00b3\u00b4\7@\2\2\u00b4"+
		"\u00bc\7?\2\2\u00b5\u00b6\7>\2\2\u00b6\u00bc\7?\2\2\u00b7\u00b8\7?\2\2"+
		"\u00b8\u00bc\7?\2\2\u00b9\u00ba\7#\2\2\u00ba\u00bc\7?\2\2\u00bb\u00b2"+
		"\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7-\2\2\u00be\26\3\2\2\2\u00bf"+
		"\u00c0\7/\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\32\3\2\2\2\u00c3"+
		"\u00c4\7\61\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\7(\2\2\u00c6\u00c7\7(\2\2"+
		"\u00c7\36\3\2\2\2\u00c8\u00c9\7~\2\2\u00c9\u00ca\7~\2\2\u00ca \3\2\2\2"+
		"\u00cb\u00cc\7\60\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\7#\2\2\u00ce$\3\2\2"+
		"\2\u00cf\u00d0\7*\2\2\u00d0&\3\2\2\2\u00d1\u00d2\7+\2\2\u00d2(\3\2\2\2"+
		"\u00d3\u00d4\7]\2\2\u00d4*\3\2\2\2\u00d5\u00d6\7_\2\2\u00d6,\3\2\2\2\u00d7"+
		"\u00d8\7}\2\2\u00d8.\3\2\2\2\u00d9\u00da\7\177\2\2\u00da\60\3\2\2\2\u00db"+
		"\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00e4\7v\2\2\u00de\u00df\7h\2\2"+
		"\u00df\u00e0\7n\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e4"+
		"\7v\2\2\u00e3\u00db\3\2\2\2\u00e3\u00de\3\2\2\2\u00e4\62\3\2\2\2\u00e5"+
		"\u00e6\7u\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7w\2\2"+
		"\u00e9\u00ea\7e\2\2\u00ea\u00eb\7v\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7"+
		"t\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1"+
		"\7t\2\2\u00f1\u00f2\7p\2\2\u00f2\66\3\2\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5"+
		"\7h\2\2\u00f58\3\2\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9"+
		"\7u\2\2\u00f9\u00fa\7g\2\2\u00fa:\3\2\2\2\u00fb\u00fc\7y\2\2\u00fc\u00fd"+
		"\7j\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7g\2\2\u0100"+
		"<\3\2\2\2\u0101\u0105\t\f\2\2\u0102\u0104\t\r\2\2\u0103\u0102\3\2\2\2"+
		"\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106>\3"+
		"\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\t\b\2\2\u0109@\3\2\2\2\30\2GT_"+
		"flry{\177\u0084\u0086\u008b\u0091\u0093\u0099\u00a0\u00a8\u00aa\u00bb"+
		"\u00e3\u0105\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}