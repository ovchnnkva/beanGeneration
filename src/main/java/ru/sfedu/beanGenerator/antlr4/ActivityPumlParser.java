// Generated from /home/anna/Рабочий стол/my-todo/src/main/resources/antlr4/ActivityPuml.g4 by ANTLR 4.13.1
package ru.sfedu.beanGenerator.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ActivityPumlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TITLE=2, ELSE=3, IF=4, IS=5, THEN=6, ENDIF=7, BRACKET=8, START_UML=9, 
		START=10, FORK_START=11, FORK_END=12, NOTE_START=13, NOTE_END=14, END=15, 
		END_UML=16, BRANCH_VAL=17, ATRIBUTE_KEY=18, ATRIBUTE_START=19, ATRIBUTE_END=20, 
		ATRIBUTE_CONTENT=21, WS=22;
	public static final int
		RULE_activityDiagram = 0, RULE_activityBase = 1, RULE_activityWithCondition = 2, 
		RULE_ifCondition = 3, RULE_elseCondition = 4, RULE_activityBody = 5, RULE_note = 6, 
		RULE_title = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"activityDiagram", "activityBase", "activityWithCondition", "ifCondition", 
			"elseCondition", "activityBody", "note", "title"
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

	@Override
	public String getGrammarFileName() { return "ActivityPuml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ActivityPumlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActivityDiagramContext extends ParserRuleContext {
		public TerminalNode START_UML() { return getToken(ActivityPumlParser.START_UML, 0); }
		public TerminalNode END_UML() { return getToken(ActivityPumlParser.END_UML, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode START() { return getToken(ActivityPumlParser.START, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<ActivityWithConditionContext> activityWithCondition() {
			return getRuleContexts(ActivityWithConditionContext.class);
		}
		public ActivityWithConditionContext activityWithCondition(int i) {
			return getRuleContext(ActivityWithConditionContext.class,i);
		}
		public List<ActivityBaseContext> activityBase() {
			return getRuleContexts(ActivityBaseContext.class);
		}
		public ActivityBaseContext activityBase(int i) {
			return getRuleContext(ActivityBaseContext.class,i);
		}
		public TerminalNode END() { return getToken(ActivityPumlParser.END, 0); }
		public ActivityDiagramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activityDiagram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterActivityDiagram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitActivityDiagram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitActivityDiagram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActivityDiagramContext activityDiagram() throws RecognitionException {
		ActivityDiagramContext _localctx = new ActivityDiagramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_activityDiagram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TITLE) {
				{
				setState(16);
				title();
				}
			}

			setState(19);
			match(START_UML);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START) {
				{
				setState(20);
				match(START);
				}
			}

			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOTE_START) {
				{
				{
				setState(23);
				note();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(29);
				activityWithCondition();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FORK_START || _la==ATRIBUTE_START) {
				{
				{
				setState(35);
				activityBase();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END) {
				{
				setState(41);
				match(END);
				}
			}

			setState(44);
			match(END_UML);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActivityBaseContext extends ParserRuleContext {
		public ActivityBodyContext activityBody() {
			return getRuleContext(ActivityBodyContext.class,0);
		}
		public TerminalNode FORK_START() { return getToken(ActivityPumlParser.FORK_START, 0); }
		public TerminalNode FORK_END() { return getToken(ActivityPumlParser.FORK_END, 0); }
		public ActivityBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activityBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterActivityBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitActivityBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitActivityBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActivityBaseContext activityBase() throws RecognitionException {
		ActivityBaseContext _localctx = new ActivityBaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_activityBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORK_START) {
				{
				setState(46);
				match(FORK_START);
				}
			}

			setState(49);
			activityBody();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORK_END) {
				{
				setState(50);
				match(FORK_END);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ActivityWithConditionContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(ActivityPumlParser.ENDIF, 0); }
		public List<ElseConditionContext> elseCondition() {
			return getRuleContexts(ElseConditionContext.class);
		}
		public ElseConditionContext elseCondition(int i) {
			return getRuleContext(ElseConditionContext.class,i);
		}
		public ActivityWithConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activityWithCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterActivityWithCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitActivityWithCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitActivityWithCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActivityWithConditionContext activityWithCondition() throws RecognitionException {
		ActivityWithConditionContext _localctx = new ActivityWithConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_activityWithCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			ifCondition();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(54);
				elseCondition();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(ENDIF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ActivityPumlParser.IF, 0); }
		public List<TerminalNode> BRANCH_VAL() { return getTokens(ActivityPumlParser.BRANCH_VAL); }
		public TerminalNode BRANCH_VAL(int i) {
			return getToken(ActivityPumlParser.BRANCH_VAL, i);
		}
		public ActivityBodyContext activityBody() {
			return getRuleContext(ActivityBodyContext.class,0);
		}
		public TerminalNode IS() { return getToken(ActivityPumlParser.IS, 0); }
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IF);
			setState(63);
			match(BRANCH_VAL);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(64);
				match(IS);
				setState(65);
				match(BRANCH_VAL);
				}
			}

			setState(68);
			match(T__0);
			setState(69);
			activityBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseConditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ActivityPumlParser.ELSE, 0); }
		public ActivityBodyContext activityBody() {
			return getRuleContext(ActivityBodyContext.class,0);
		}
		public TerminalNode BRANCH_VAL() { return getToken(ActivityPumlParser.BRANCH_VAL, 0); }
		public ElseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterElseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitElseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitElseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseConditionContext elseCondition() throws RecognitionException {
		ElseConditionContext _localctx = new ElseConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ELSE);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRANCH_VAL) {
				{
				setState(72);
				match(BRANCH_VAL);
				}
			}

			setState(75);
			activityBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActivityBodyContext extends ParserRuleContext {
		public TerminalNode ATRIBUTE_START() { return getToken(ActivityPumlParser.ATRIBUTE_START, 0); }
		public TerminalNode ATRIBUTE_END() { return getToken(ActivityPumlParser.ATRIBUTE_END, 0); }
		public List<TerminalNode> ATRIBUTE_CONTENT() { return getTokens(ActivityPumlParser.ATRIBUTE_CONTENT); }
		public TerminalNode ATRIBUTE_CONTENT(int i) {
			return getToken(ActivityPumlParser.ATRIBUTE_CONTENT, i);
		}
		public List<TerminalNode> ATRIBUTE_KEY() { return getTokens(ActivityPumlParser.ATRIBUTE_KEY); }
		public TerminalNode ATRIBUTE_KEY(int i) {
			return getToken(ActivityPumlParser.ATRIBUTE_KEY, i);
		}
		public ActivityBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activityBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterActivityBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitActivityBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitActivityBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActivityBodyContext activityBody() throws RecognitionException {
		ActivityBodyContext _localctx = new ActivityBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_activityBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ATRIBUTE_START);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATRIBUTE_KEY) {
					{
					setState(78);
					match(ATRIBUTE_KEY);
					}
				}

				setState(81);
				match(ATRIBUTE_CONTENT);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATRIBUTE_KEY || _la==ATRIBUTE_CONTENT );
			setState(86);
			match(ATRIBUTE_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NOTE_START() { return getToken(ActivityPumlParser.NOTE_START, 0); }
		public TerminalNode ATRIBUTE_CONTENT() { return getToken(ActivityPumlParser.ATRIBUTE_CONTENT, 0); }
		public TerminalNode NOTE_END() { return getToken(ActivityPumlParser.NOTE_END, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(NOTE_START);
			setState(89);
			match(ATRIBUTE_CONTENT);
			setState(90);
			match(NOTE_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(ActivityPumlParser.TITLE, 0); }
		public TerminalNode ATRIBUTE_CONTENT() { return getToken(ActivityPumlParser.ATRIBUTE_CONTENT, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityPumlListener ) ((ActivityPumlListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityPumlVisitor ) return ((ActivityPumlVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(TITLE);
			setState(93);
			match(ATRIBUTE_CONTENT);
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
		"\u0004\u0001\u0016`\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0003\u0000\u0012\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0016"+
		"\b\u0000\u0001\u0000\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t"+
		"\u0000\u0001\u0000\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000"+
		"\u0001\u0000\u0005\u0000%\b\u0000\n\u0000\f\u0000(\t\u0000\u0001\u0000"+
		"\u0003\u0000+\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001"+
		"0\b\u0001\u0001\u0001\u0001\u0001\u0003\u00014\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u00028\b\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004J\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005P\b\u0005\u0001\u0005\u0004\u0005S\b\u0005\u000b\u0005\f\u0005T"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0000\u0000d\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0002/\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006>"+
		"\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000"+
		"\u0000\fX\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010"+
		"\u0012\u0003\u000e\u0007\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u0015\u0005\t\u0000\u0000\u0014\u0016\u0005\n\u0000\u0000\u0015\u0014"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u001a"+
		"\u0001\u0000\u0000\u0000\u0017\u0019\u0003\f\u0006\u0000\u0018\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b \u0001\u0000"+
		"\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001f\u0003\u0004"+
		"\u0002\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000"+
		"\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!&\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#%\u0003\u0002\u0001\u0000"+
		"$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)+\u0005\u000f\u0000\u0000*)\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0005\u0010\u0000\u0000"+
		"-\u0001\u0001\u0000\u0000\u0000.0\u0005\u000b\u0000\u0000/.\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0003"+
		"\n\u0005\u000024\u0005\f\u0000\u000032\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u000059\u0003\u0006\u0003"+
		"\u000068\u0003\b\u0004\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0007\u0000\u0000=\u0005"+
		"\u0001\u0000\u0000\u0000>?\u0005\u0004\u0000\u0000?B\u0005\u0011\u0000"+
		"\u0000@A\u0005\u0005\u0000\u0000AC\u0005\u0011\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005"+
		"\u0001\u0000\u0000EF\u0003\n\u0005\u0000F\u0007\u0001\u0000\u0000\u0000"+
		"GI\u0005\u0003\u0000\u0000HJ\u0005\u0011\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0003\n\u0005"+
		"\u0000L\t\u0001\u0000\u0000\u0000MR\u0005\u0013\u0000\u0000NP\u0005\u0012"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QS\u0005\u0015\u0000\u0000RO\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VW\u0005\u0014\u0000\u0000W\u000b\u0001"+
		"\u0000\u0000\u0000XY\u0005\r\u0000\u0000YZ\u0005\u0015\u0000\u0000Z[\u0005"+
		"\u000e\u0000\u0000[\r\u0001\u0000\u0000\u0000\\]\u0005\u0002\u0000\u0000"+
		"]^\u0005\u0015\u0000\u0000^\u000f\u0001\u0000\u0000\u0000\r\u0011\u0015"+
		"\u001a &*/39BIOT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}