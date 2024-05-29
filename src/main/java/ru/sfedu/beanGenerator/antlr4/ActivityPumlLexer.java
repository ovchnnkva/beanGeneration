// Generated from /home/anna/Рабочий стол/my-todo/src/main/resources/antlr4/ActivityPuml.g4 by ANTLR 4.13.1
package ru.sfedu.beanGenerator.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ActivityPumlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TITLE=2, ELSE=3, IF=4, IS=5, THEN=6, ENDIF=7, BRACKET=8, START_UML=9, 
		START=10, FORK_START=11, FORK_END=12, NOTE_START=13, NOTE_END=14, END=15, 
		END_UML=16, BRANCH_VAL=17, ATRIBUTE_KEY=18, ATRIBUTE_START=19, ATRIBUTE_END=20, 
		ATRIBUTE_CONTENT=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TITLE", "ELSE", "IF", "IS", "THEN", "ENDIF", "BRACKET", "START_UML", 
			"START", "FORK_START", "FORK_END", "NOTE_START", "NOTE_END", "END", "END_UML", 
			"BRANCH_VAL", "ATRIBUTE_KEY", "ATRIBUTE_START", "ATRIBUTE_END", "ATRIBUTE_CONTENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' then'", "'title '", "'else'", "'if '", "' is '", "' then '", 
			"'endif'", null, "'@startuml'", "'start'", "'fork'", "'end fork'", null, 
			"'end note'", null, "'@enduml'", null, null, "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TITLE", "ELSE", "IF", "IS", "THEN", "ENDIF", "BRACKET", 
			"START_UML", "START", "FORK_START", "FORK_END", "NOTE_START", "NOTE_END", 
			"END", "END_UML", "BRANCH_VAL", "ATRIBUTE_KEY", "ATRIBUTE_START", "ATRIBUTE_END", 
			"ATRIBUTE_CONTENT", "WS"
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


	public ActivityPumlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ActivityPuml.g4"; }

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
		"\u0004\u0000\u0016\u00c2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0085"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00a1\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0004\u0011\u00b0\b\u0011\u000b\u0011\f\u0011"+
		"\u00b1\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0004\u0014\u00bb\b\u0014\u000b\u0014\f\u0014\u00bc"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000"+
		"\u0004\u0001\u0000()\u0002\u0000AZ__\t\u0000 \"**,.09>?__a{}}\u0410\u044f"+
		"\u0003\u0000\t\n\r\r  \u00c9\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-"+
		"\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u0005:\u0001\u0000"+
		"\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000"+
		"\u000bH\u0001\u0000\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000fU\u0001"+
		"\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000\u0013a\u0001\u0000\u0000"+
		"\u0000\u0015g\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019"+
		"u\u0001\u0000\u0000\u0000\u001b\u0086\u0001\u0000\u0000\u0000\u001d\u00a0"+
		"\u0001\u0000\u0000\u0000\u001f\u00a2\u0001\u0000\u0000\u0000!\u00aa\u0001"+
		"\u0000\u0000\u0000#\u00af\u0001\u0000\u0000\u0000%\u00b5\u0001\u0000\u0000"+
		"\u0000\'\u00b7\u0001\u0000\u0000\u0000)\u00ba\u0001\u0000\u0000\u0000"+
		"+\u00be\u0001\u0000\u0000\u0000-.\u0005 \u0000\u0000./\u0005t\u0000\u0000"+
		"/0\u0005h\u0000\u000001\u0005e\u0000\u000012\u0005n\u0000\u00002\u0002"+
		"\u0001\u0000\u0000\u000034\u0005t\u0000\u000045\u0005i\u0000\u000056\u0005"+
		"t\u0000\u000067\u0005l\u0000\u000078\u0005e\u0000\u000089\u0005 \u0000"+
		"\u00009\u0004\u0001\u0000\u0000\u0000:;\u0005e\u0000\u0000;<\u0005l\u0000"+
		"\u0000<=\u0005s\u0000\u0000=>\u0005e\u0000\u0000>\u0006\u0001\u0000\u0000"+
		"\u0000?@\u0005i\u0000\u0000@A\u0005f\u0000\u0000AB\u0005 \u0000\u0000"+
		"B\b\u0001\u0000\u0000\u0000CD\u0005 \u0000\u0000DE\u0005i\u0000\u0000"+
		"EF\u0005s\u0000\u0000FG\u0005 \u0000\u0000G\n\u0001\u0000\u0000\u0000"+
		"HI\u0005 \u0000\u0000IJ\u0005t\u0000\u0000JK\u0005h\u0000\u0000KL\u0005"+
		"e\u0000\u0000LM\u0005n\u0000\u0000MN\u0005 \u0000\u0000N\f\u0001\u0000"+
		"\u0000\u0000OP\u0005e\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005d\u0000"+
		"\u0000RS\u0005i\u0000\u0000ST\u0005f\u0000\u0000T\u000e\u0001\u0000\u0000"+
		"\u0000UV\u0007\u0000\u0000\u0000V\u0010\u0001\u0000\u0000\u0000WX\u0005"+
		"@\u0000\u0000XY\u0005s\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005a\u0000"+
		"\u0000[\\\u0005r\u0000\u0000\\]\u0005t\u0000\u0000]^\u0005u\u0000\u0000"+
		"^_\u0005m\u0000\u0000_`\u0005l\u0000\u0000`\u0012\u0001\u0000\u0000\u0000"+
		"ab\u0005s\u0000\u0000bc\u0005t\u0000\u0000cd\u0005a\u0000\u0000de\u0005"+
		"r\u0000\u0000ef\u0005t\u0000\u0000f\u0014\u0001\u0000\u0000\u0000gh\u0005"+
		"f\u0000\u0000hi\u0005o\u0000\u0000ij\u0005r\u0000\u0000jk\u0005k\u0000"+
		"\u0000k\u0016\u0001\u0000\u0000\u0000lm\u0005e\u0000\u0000mn\u0005n\u0000"+
		"\u0000no\u0005d\u0000\u0000op\u0005 \u0000\u0000pq\u0005f\u0000\u0000"+
		"qr\u0005o\u0000\u0000rs\u0005r\u0000\u0000st\u0005k\u0000\u0000t\u0018"+
		"\u0001\u0000\u0000\u0000uv\u0005n\u0000\u0000vw\u0005o\u0000\u0000wx\u0005"+
		"t\u0000\u0000xy\u0005e\u0000\u0000y\u0084\u0001\u0000\u0000\u0000z{\u0005"+
		"r\u0000\u0000{|\u0005i\u0000\u0000|}\u0005g\u0000\u0000}~\u0005h\u0000"+
		"\u0000~\u0085\u0005t\u0000\u0000\u007f\u0085\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005l\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082\u0083\u0005"+
		"f\u0000\u0000\u0083\u0085\u0005t\u0000\u0000\u0084z\u0001\u0000\u0000"+
		"\u0000\u0084\u007f\u0001\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u001a\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u0088\u0005n\u0000\u0000\u0088"+
		"\u0089\u0005d\u0000\u0000\u0089\u008a\u0005 \u0000\u0000\u008a\u008b\u0005"+
		"n\u0000\u0000\u008b\u008c\u0005o\u0000\u0000\u008c\u008d\u0005t\u0000"+
		"\u0000\u008d\u008e\u0005e\u0000\u0000\u008e\u001c\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005s\u0000\u0000\u0090\u0091\u0005t\u0000\u0000\u0091\u0092"+
		"\u0005o\u0000\u0000\u0092\u00a1\u0005p\u0000\u0000\u0093\u0094\u0005e"+
		"\u0000\u0000\u0094\u0095\u0005n\u0000\u0000\u0095\u00a1\u0005d\u0000\u0000"+
		"\u0096\u0097\u0005k\u0000\u0000\u0097\u0098\u0005i\u0000\u0000\u0098\u0099"+
		"\u0005l\u0000\u0000\u0099\u00a1\u0005l\u0000\u0000\u009a\u009b\u0005d"+
		"\u0000\u0000\u009b\u009c\u0005e\u0000\u0000\u009c\u009d\u0005t\u0000\u0000"+
		"\u009d\u009e\u0005a\u0000\u0000\u009e\u009f\u0005c\u0000\u0000\u009f\u00a1"+
		"\u0005h\u0000\u0000\u00a0\u008f\u0001\u0000\u0000\u0000\u00a0\u0093\u0001"+
		"\u0000\u0000\u0000\u00a0\u0096\u0001\u0000\u0000\u0000\u00a0\u009a\u0001"+
		"\u0000\u0000\u0000\u00a1\u001e\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"@\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4\u00a5\u0005n\u0000"+
		"\u0000\u00a5\u00a6\u0005d\u0000\u0000\u00a6\u00a7\u0005u\u0000\u0000\u00a7"+
		"\u00a8\u0005m\u0000\u0000\u00a8\u00a9\u0005l\u0000\u0000\u00a9 \u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005(\u0000\u0000\u00ab\u00ac\u0003)\u0014"+
		"\u0000\u00ac\u00ad\u0005)\u0000\u0000\u00ad\"\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0007\u0001\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005:\u0000\u0000\u00b4$\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005:\u0000\u0000\u00b6&\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005;"+
		"\u0000\u0000\u00b8(\u0001\u0000\u0000\u0000\u00b9\u00bb\u0007\u0002\u0000"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd*\u0001\u0000\u0000\u0000\u00be\u00bf\u0007\u0003\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0006\u0015\u0000\u0000"+
		"\u00c1,\u0001\u0000\u0000\u0000\u0005\u0000\u0084\u00a0\u00b1\u00bc\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}