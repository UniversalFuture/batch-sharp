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
	 * Visit a parse tree produced by {@link BatchSharpParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(BatchSharpParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#singleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDirective(BatchSharpParser.SingleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#doubleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleDirective(BatchSharpParser.DoubleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#directive_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_value(BatchSharpParser.Directive_valueContext ctx);
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
	 * Visit a parse tree produced by {@link BatchSharpParser#array_assignmentstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_assignmentstmt(BatchSharpParser.Array_assignmentstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#assignmentstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentstmt(BatchSharpParser.AssignmentstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#forstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(BatchSharpParser.ForstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#foreachstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachstmt(BatchSharpParser.ForeachstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#forstmt_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt_file(BatchSharpParser.Forstmt_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#foreachstmt_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachstmt_file(BatchSharpParser.Foreachstmt_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#foreachstmt_file_in_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachstmt_file_in_dir(BatchSharpParser.Foreachstmt_file_in_dirContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#forstmt_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt_dir(BatchSharpParser.Forstmt_dirContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#foreachstmt_dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachstmt_dir(BatchSharpParser.Foreachstmt_dirContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#funcdeclstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdeclstmt(BatchSharpParser.FuncdeclstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#ifseries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfseries(BatchSharpParser.IfseriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(BatchSharpParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#elseifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifstmt(BatchSharpParser.ElseifstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#elsestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsestmt(BatchSharpParser.ElsestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#inlinestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlinestmt(BatchSharpParser.InlinestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#inplacearithmeticstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInplacearithmeticstmt(BatchSharpParser.InplacearithmeticstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#incrementstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementstmt(BatchSharpParser.IncrementstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(BatchSharpParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#tryseries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryseries(BatchSharpParser.TryseriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#trystmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrystmt(BatchSharpParser.TrystmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#catchstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchstmt(BatchSharpParser.CatchstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#typedvardeclstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedvardeclstmt(BatchSharpParser.TypedvardeclstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BatchSharpParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(BatchSharpParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BatchSharpParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#array_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_elem(BatchSharpParser.Array_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#arithmeticexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticexpr(BatchSharpParser.ArithmeticexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(BatchSharpParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(BatchSharpParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#interpolated_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolated_string(BatchSharpParser.Interpolated_stringContext ctx);
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
	 * Visit a parse tree produced by {@link BatchSharpParser#inlineexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineexpr(BatchSharpParser.InlineexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(BatchSharpParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#boolean_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_operator(BatchSharpParser.Boolean_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(BatchSharpParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(BatchSharpParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(BatchSharpParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#typedparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedparameter(BatchSharpParser.TypedparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#typespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypespecifier(BatchSharpParser.TypespecifierContext ctx);
}