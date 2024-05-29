// Generated from /home/anna/Рабочий стол/my-todo/src/main/resources/antlr4/ActivityPuml.g4 by ANTLR 4.13.1
package ru.sfedu.beanGenerator.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ActivityPumlParser}.
 */
public interface ActivityPumlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#activityDiagram}.
	 * @param ctx the parse tree
	 */
	void enterActivityDiagram(ActivityPumlParser.ActivityDiagramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#activityDiagram}.
	 * @param ctx the parse tree
	 */
	void exitActivityDiagram(ActivityPumlParser.ActivityDiagramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#activityBase}.
	 * @param ctx the parse tree
	 */
	void enterActivityBase(ActivityPumlParser.ActivityBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#activityBase}.
	 * @param ctx the parse tree
	 */
	void exitActivityBase(ActivityPumlParser.ActivityBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#activityWithCondition}.
	 * @param ctx the parse tree
	 */
	void enterActivityWithCondition(ActivityPumlParser.ActivityWithConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#activityWithCondition}.
	 * @param ctx the parse tree
	 */
	void exitActivityWithCondition(ActivityPumlParser.ActivityWithConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(ActivityPumlParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(ActivityPumlParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void enterElseCondition(ActivityPumlParser.ElseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void exitElseCondition(ActivityPumlParser.ElseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#activityBody}.
	 * @param ctx the parse tree
	 */
	void enterActivityBody(ActivityPumlParser.ActivityBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#activityBody}.
	 * @param ctx the parse tree
	 */
	void exitActivityBody(ActivityPumlParser.ActivityBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(ActivityPumlParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(ActivityPumlParser.NoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ActivityPumlParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(ActivityPumlParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ActivityPumlParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(ActivityPumlParser.TitleContext ctx);
}