// Generated from /home/anna/Рабочий стол/my-todo/src/main/resources/antlr4/ActivityPuml.g4 by ANTLR 4.13.1
package ru.sfedu.beanGenerator.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ActivityPumlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ActivityPumlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ActivityPumlParser#activityDiagram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivityDiagram(ActivityPumlParser.ActivityDiagramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityPumlParser#activityWithCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivityWithCondition(ActivityPumlParser.ActivityWithConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityPumlParser#activity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivity(ActivityPumlParser.ActivityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityPumlParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(ActivityPumlParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityPumlParser#elseCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCondition(ActivityPumlParser.ElseConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityPumlParser#atribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribute(ActivityPumlParser.AtributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityPumlParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(ActivityPumlParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ActivityPumlParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(ActivityPumlParser.TitleContext ctx);
}