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
		T__0=1, T__1=2, T__2=3, T__3=4, ELSE=5, ENDIF=6, BRACKET=7, START_UML=8, 
		START=9, FORK_START=10, FORK_END=11, NOTE_START=12, NOTE_END=13, END=14, 
		END_UML=15, BRANCH_VAL=16, ATRIBUTE_KEY=17, ATRIBUTE_START=18, ATRIBUTE_END=19, 
		ATRIBUTE_CONTENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ELSE", "ENDIF", "BRACKET", "START_UML", 
			"START", "FORK_START", "FORK_END", "NOTE_START", "NOTE_END", "END", "END_UML", 
			"BRANCH_VAL", "ATRIBUTE_KEY", "ATRIBUTE_START", "ATRIBUTE_END", "ATRIBUTE_CONTENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if '", "' is '", "' then'", "'title'", "'else'", "'endif'", null, 
			"'@startuml'", "'start'", "'fork'", "'end fork'", null, "'end note'", 
			null, "'@enduml'", null, null, "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ELSE", "ENDIF", "BRACKET", "START_UML", 
			"START", "FORK_START", "FORK_END", "NOTE_START", "NOTE_END", "END", "END_UML", 
			"BRANCH_VAL", "ATRIBUTE_KEY", "ATRIBUTE_START", "ATRIBUTE_END", "ATRIBUTE_CONTENT", 
			"WS"
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
		"\u0004\u0000\u0015\u00b8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b{\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0097\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u00a6\b\u0010"+
		"\u000b\u0010\f\u0010\u00a7\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u00b1\b\u0013\u000b\u0013"+
		"\f\u0013\u00b2\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000"+
		"\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000"+
		"\u0004\u0001\u0000()\u0002\u0000AZ__\t\u0000 \"**,.09>?__a{}}\u0410\u044f"+
		"\u0003\u0000\t\n\r\r  \u00bf\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003/"+
		"\u0001\u0000\u0000\u0000\u00054\u0001\u0000\u0000\u0000\u0007:\u0001\u0000"+
		"\u0000\u0000\t@\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000"+
		"\rK\u0001\u0000\u0000\u0000\u000fM\u0001\u0000\u0000\u0000\u0011W\u0001"+
		"\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015b\u0001\u0000\u0000"+
		"\u0000\u0017k\u0001\u0000\u0000\u0000\u0019|\u0001\u0000\u0000\u0000\u001b"+
		"\u0096\u0001\u0000\u0000\u0000\u001d\u0098\u0001\u0000\u0000\u0000\u001f"+
		"\u00a0\u0001\u0000\u0000\u0000!\u00a5\u0001\u0000\u0000\u0000#\u00ab\u0001"+
		"\u0000\u0000\u0000%\u00ad\u0001\u0000\u0000\u0000\'\u00b0\u0001\u0000"+
		"\u0000\u0000)\u00b4\u0001\u0000\u0000\u0000+,\u0005i\u0000\u0000,-\u0005"+
		"f\u0000\u0000-.\u0005 \u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005"+
		" \u0000\u000001\u0005i\u0000\u000012\u0005s\u0000\u000023\u0005 \u0000"+
		"\u00003\u0004\u0001\u0000\u0000\u000045\u0005 \u0000\u000056\u0005t\u0000"+
		"\u000067\u0005h\u0000\u000078\u0005e\u0000\u000089\u0005n\u0000\u0000"+
		"9\u0006\u0001\u0000\u0000\u0000:;\u0005t\u0000\u0000;<\u0005i\u0000\u0000"+
		"<=\u0005t\u0000\u0000=>\u0005l\u0000\u0000>?\u0005e\u0000\u0000?\b\u0001"+
		"\u0000\u0000\u0000@A\u0005e\u0000\u0000AB\u0005l\u0000\u0000BC\u0005s"+
		"\u0000\u0000CD\u0005e\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0005e"+
		"\u0000\u0000FG\u0005n\u0000\u0000GH\u0005d\u0000\u0000HI\u0005i\u0000"+
		"\u0000IJ\u0005f\u0000\u0000J\f\u0001\u0000\u0000\u0000KL\u0007\u0000\u0000"+
		"\u0000L\u000e\u0001\u0000\u0000\u0000MN\u0005@\u0000\u0000NO\u0005s\u0000"+
		"\u0000OP\u0005t\u0000\u0000PQ\u0005a\u0000\u0000QR\u0005r\u0000\u0000"+
		"RS\u0005t\u0000\u0000ST\u0005u\u0000\u0000TU\u0005m\u0000\u0000UV\u0005"+
		"l\u0000\u0000V\u0010\u0001\u0000\u0000\u0000WX\u0005s\u0000\u0000XY\u0005"+
		"t\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005r\u0000\u0000[\\\u0005t\u0000"+
		"\u0000\\\u0012\u0001\u0000\u0000\u0000]^\u0005f\u0000\u0000^_\u0005o\u0000"+
		"\u0000_`\u0005r\u0000\u0000`a\u0005k\u0000\u0000a\u0014\u0001\u0000\u0000"+
		"\u0000bc\u0005e\u0000\u0000cd\u0005n\u0000\u0000de\u0005d\u0000\u0000"+
		"ef\u0005 \u0000\u0000fg\u0005f\u0000\u0000gh\u0005o\u0000\u0000hi\u0005"+
		"r\u0000\u0000ij\u0005k\u0000\u0000j\u0016\u0001\u0000\u0000\u0000kl\u0005"+
		"n\u0000\u0000lm\u0005o\u0000\u0000mn\u0005t\u0000\u0000no\u0005e\u0000"+
		"\u0000oz\u0001\u0000\u0000\u0000pq\u0005r\u0000\u0000qr\u0005i\u0000\u0000"+
		"rs\u0005g\u0000\u0000st\u0005h\u0000\u0000t{\u0005t\u0000\u0000u{\u0001"+
		"\u0000\u0000\u0000vw\u0005l\u0000\u0000wx\u0005e\u0000\u0000xy\u0005f"+
		"\u0000\u0000y{\u0005t\u0000\u0000zp\u0001\u0000\u0000\u0000zu\u0001\u0000"+
		"\u0000\u0000zv\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0018"+
		"\u0001\u0000\u0000\u0000|}\u0005e\u0000\u0000}~\u0005n\u0000\u0000~\u007f"+
		"\u0005d\u0000\u0000\u007f\u0080\u0005 \u0000\u0000\u0080\u0081\u0005n"+
		"\u0000\u0000\u0081\u0082\u0005o\u0000\u0000\u0082\u0083\u0005t\u0000\u0000"+
		"\u0083\u0084\u0005e\u0000\u0000\u0084\u001a\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005s\u0000\u0000\u0086\u0087\u0005t\u0000\u0000\u0087\u0088\u0005"+
		"o\u0000\u0000\u0088\u0097\u0005p\u0000\u0000\u0089\u008a\u0005e\u0000"+
		"\u0000\u008a\u008b\u0005n\u0000\u0000\u008b\u0097\u0005d\u0000\u0000\u008c"+
		"\u008d\u0005k\u0000\u0000\u008d\u008e\u0005i\u0000\u0000\u008e\u008f\u0005"+
		"l\u0000\u0000\u008f\u0097\u0005l\u0000\u0000\u0090\u0091\u0005d\u0000"+
		"\u0000\u0091\u0092\u0005e\u0000\u0000\u0092\u0093\u0005t\u0000\u0000\u0093"+
		"\u0094\u0005a\u0000\u0000\u0094\u0095\u0005c\u0000\u0000\u0095\u0097\u0005"+
		"h\u0000\u0000\u0096\u0085\u0001\u0000\u0000\u0000\u0096\u0089\u0001\u0000"+
		"\u0000\u0000\u0096\u008c\u0001\u0000\u0000\u0000\u0096\u0090\u0001\u0000"+
		"\u0000\u0000\u0097\u001c\u0001\u0000\u0000\u0000\u0098\u0099\u0005@\u0000"+
		"\u0000\u0099\u009a\u0005e\u0000\u0000\u009a\u009b\u0005n\u0000\u0000\u009b"+
		"\u009c\u0005d\u0000\u0000\u009c\u009d\u0005u\u0000\u0000\u009d\u009e\u0005"+
		"m\u0000\u0000\u009e\u009f\u0005l\u0000\u0000\u009f\u001e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005(\u0000\u0000\u00a1\u00a2\u0003\'\u0013\u0000"+
		"\u00a2\u00a3\u0005)\u0000\u0000\u00a3 \u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0007\u0001\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005:\u0000\u0000\u00aa\"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		":\u0000\u0000\u00ac$\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005;\u0000"+
		"\u0000\u00ae&\u0001\u0000\u0000\u0000\u00af\u00b1\u0007\u0002\u0000\u0000"+
		"\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3(\u0001\u0000\u0000\u0000\u00b4\u00b5\u0007\u0003\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006\u0014\u0000\u0000\u00b7"+
		"*\u0001\u0000\u0000\u0000\u0005\u0000z\u0096\u00a7\u00b2\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}