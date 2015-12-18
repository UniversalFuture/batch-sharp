// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp_parsing/src/com/batch_sharp\BatchSharp.g4 by ANTLR 4.5.1
package com.batch_sharp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BatchSharpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BatchSharpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(BatchSharpParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#codeline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeline(BatchSharpParser.CodelineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(BatchSharpParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(BatchSharpParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#vardeclstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclstmt(BatchSharpParser.VardeclstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BatchSharpParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BatchSharpParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(BatchSharpParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(BatchSharpParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(BatchSharpParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#variable_dollar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_dollar(BatchSharpParser.Variable_dollarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(BatchSharpParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(BatchSharpParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(BatchSharpParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(BatchSharpParser.DirectiveContext ctx);
}