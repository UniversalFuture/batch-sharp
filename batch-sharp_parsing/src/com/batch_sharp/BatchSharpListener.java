// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp_parsing/src/com/batch_sharp\BatchSharp.g4 by ANTLR 4.5.1
package com.batch_sharp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BatchSharpParser}.
 */
public interface BatchSharpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(BatchSharpParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(BatchSharpParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#codeline}.
	 * @param ctx the parse tree
	 */
	void enterCodeline(BatchSharpParser.CodelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#codeline}.
	 * @param ctx the parse tree
	 */
	void exitCodeline(BatchSharpParser.CodelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(BatchSharpParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(BatchSharpParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(BatchSharpParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(BatchSharpParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#vardeclstmt}.
	 * @param ctx the parse tree
	 */
	void enterVardeclstmt(BatchSharpParser.VardeclstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#vardeclstmt}.
	 * @param ctx the parse tree
	 */
	void exitVardeclstmt(BatchSharpParser.VardeclstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BatchSharpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BatchSharpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BatchSharpParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BatchSharpParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(BatchSharpParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(BatchSharpParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(BatchSharpParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(BatchSharpParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(BatchSharpParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(BatchSharpParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#variable_dollar}.
	 * @param ctx the parse tree
	 */
	void enterVariable_dollar(BatchSharpParser.Variable_dollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#variable_dollar}.
	 * @param ctx the parse tree
	 */
	void exitVariable_dollar(BatchSharpParser.Variable_dollarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(BatchSharpParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(BatchSharpParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(BatchSharpParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(BatchSharpParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(BatchSharpParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(BatchSharpParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(BatchSharpParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(BatchSharpParser.DirectiveContext ctx);
}