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
	 * Enter a parse tree produced by {@link BatchSharpParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(BatchSharpParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(BatchSharpParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#singleDirective}.
	 * @param ctx the parse tree
	 */
	void enterSingleDirective(BatchSharpParser.SingleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#singleDirective}.
	 * @param ctx the parse tree
	 */
	void exitSingleDirective(BatchSharpParser.SingleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#doubleDirective}.
	 * @param ctx the parse tree
	 */
	void enterDoubleDirective(BatchSharpParser.DoubleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#doubleDirective}.
	 * @param ctx the parse tree
	 */
	void exitDoubleDirective(BatchSharpParser.DoubleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#directive_value}.
	 * @param ctx the parse tree
	 */
	void enterDirective_value(BatchSharpParser.Directive_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#directive_value}.
	 * @param ctx the parse tree
	 */
	void exitDirective_value(BatchSharpParser.Directive_valueContext ctx);
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
	 * Enter a parse tree produced by {@link BatchSharpParser#array_assignmentstmt}.
	 * @param ctx the parse tree
	 */
	void enterArray_assignmentstmt(BatchSharpParser.Array_assignmentstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#array_assignmentstmt}.
	 * @param ctx the parse tree
	 */
	void exitArray_assignmentstmt(BatchSharpParser.Array_assignmentstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#assignmentstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentstmt(BatchSharpParser.AssignmentstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#assignmentstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentstmt(BatchSharpParser.AssignmentstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(BatchSharpParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(BatchSharpParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#foreachstmt}.
	 * @param ctx the parse tree
	 */
	void enterForeachstmt(BatchSharpParser.ForeachstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#foreachstmt}.
	 * @param ctx the parse tree
	 */
	void exitForeachstmt(BatchSharpParser.ForeachstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#forstmt_file}.
	 * @param ctx the parse tree
	 */
	void enterForstmt_file(BatchSharpParser.Forstmt_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#forstmt_file}.
	 * @param ctx the parse tree
	 */
	void exitForstmt_file(BatchSharpParser.Forstmt_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#foreachstmt_file}.
	 * @param ctx the parse tree
	 */
	void enterForeachstmt_file(BatchSharpParser.Foreachstmt_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#foreachstmt_file}.
	 * @param ctx the parse tree
	 */
	void exitForeachstmt_file(BatchSharpParser.Foreachstmt_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#foreachstmt_file_in_dir}.
	 * @param ctx the parse tree
	 */
	void enterForeachstmt_file_in_dir(BatchSharpParser.Foreachstmt_file_in_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#foreachstmt_file_in_dir}.
	 * @param ctx the parse tree
	 */
	void exitForeachstmt_file_in_dir(BatchSharpParser.Foreachstmt_file_in_dirContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#forstmt_dir}.
	 * @param ctx the parse tree
	 */
	void enterForstmt_dir(BatchSharpParser.Forstmt_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#forstmt_dir}.
	 * @param ctx the parse tree
	 */
	void exitForstmt_dir(BatchSharpParser.Forstmt_dirContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#foreachstmt_dir}.
	 * @param ctx the parse tree
	 */
	void enterForeachstmt_dir(BatchSharpParser.Foreachstmt_dirContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#foreachstmt_dir}.
	 * @param ctx the parse tree
	 */
	void exitForeachstmt_dir(BatchSharpParser.Foreachstmt_dirContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#funcdeclstmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncdeclstmt(BatchSharpParser.FuncdeclstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#funcdeclstmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncdeclstmt(BatchSharpParser.FuncdeclstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#ifseries}.
	 * @param ctx the parse tree
	 */
	void enterIfseries(BatchSharpParser.IfseriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#ifseries}.
	 * @param ctx the parse tree
	 */
	void exitIfseries(BatchSharpParser.IfseriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(BatchSharpParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(BatchSharpParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#elseifstmt}.
	 * @param ctx the parse tree
	 */
	void enterElseifstmt(BatchSharpParser.ElseifstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#elseifstmt}.
	 * @param ctx the parse tree
	 */
	void exitElseifstmt(BatchSharpParser.ElseifstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void enterElsestmt(BatchSharpParser.ElsestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void exitElsestmt(BatchSharpParser.ElsestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#inlinestmt}.
	 * @param ctx the parse tree
	 */
	void enterInlinestmt(BatchSharpParser.InlinestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#inlinestmt}.
	 * @param ctx the parse tree
	 */
	void exitInlinestmt(BatchSharpParser.InlinestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#inplacearithmeticstmt}.
	 * @param ctx the parse tree
	 */
	void enterInplacearithmeticstmt(BatchSharpParser.InplacearithmeticstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#inplacearithmeticstmt}.
	 * @param ctx the parse tree
	 */
	void exitInplacearithmeticstmt(BatchSharpParser.InplacearithmeticstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#incrementstmt}.
	 * @param ctx the parse tree
	 */
	void enterIncrementstmt(BatchSharpParser.IncrementstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#incrementstmt}.
	 * @param ctx the parse tree
	 */
	void exitIncrementstmt(BatchSharpParser.IncrementstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(BatchSharpParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(BatchSharpParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#tryseries}.
	 * @param ctx the parse tree
	 */
	void enterTryseries(BatchSharpParser.TryseriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#tryseries}.
	 * @param ctx the parse tree
	 */
	void exitTryseries(BatchSharpParser.TryseriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#trystmt}.
	 * @param ctx the parse tree
	 */
	void enterTrystmt(BatchSharpParser.TrystmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#trystmt}.
	 * @param ctx the parse tree
	 */
	void exitTrystmt(BatchSharpParser.TrystmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#catchstmt}.
	 * @param ctx the parse tree
	 */
	void enterCatchstmt(BatchSharpParser.CatchstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#catchstmt}.
	 * @param ctx the parse tree
	 */
	void exitCatchstmt(BatchSharpParser.CatchstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#typedvardeclstmt}.
	 * @param ctx the parse tree
	 */
	void enterTypedvardeclstmt(BatchSharpParser.TypedvardeclstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#typedvardeclstmt}.
	 * @param ctx the parse tree
	 */
	void exitTypedvardeclstmt(BatchSharpParser.TypedvardeclstmtContext ctx);
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
	 * Enter a parse tree produced by {@link BatchSharpParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(BatchSharpParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(BatchSharpParser.ArrayContext ctx);
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
	 * Enter a parse tree produced by {@link BatchSharpParser#array_elem}.
	 * @param ctx the parse tree
	 */
	void enterArray_elem(BatchSharpParser.Array_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#array_elem}.
	 * @param ctx the parse tree
	 */
	void exitArray_elem(BatchSharpParser.Array_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#arithmeticexpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticexpr(BatchSharpParser.ArithmeticexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#arithmeticexpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticexpr(BatchSharpParser.ArithmeticexprContext ctx);
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
	 * Enter a parse tree produced by {@link BatchSharpParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(BatchSharpParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(BatchSharpParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#interpolated_string}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_string(BatchSharpParser.Interpolated_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#interpolated_string}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_string(BatchSharpParser.Interpolated_stringContext ctx);
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
	 * Enter a parse tree produced by {@link BatchSharpParser#inlineexpr}.
	 * @param ctx the parse tree
	 */
	void enterInlineexpr(BatchSharpParser.InlineexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#inlineexpr}.
	 * @param ctx the parse tree
	 */
	void exitInlineexpr(BatchSharpParser.InlineexprContext ctx);
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
	 * Enter a parse tree produced by {@link BatchSharpParser#boolean_operator}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_operator(BatchSharpParser.Boolean_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#boolean_operator}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_operator(BatchSharpParser.Boolean_operatorContext ctx);
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
	 * Enter a parse tree produced by {@link BatchSharpParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(BatchSharpParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(BatchSharpParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(BatchSharpParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(BatchSharpParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#typedparameter}.
	 * @param ctx the parse tree
	 */
	void enterTypedparameter(BatchSharpParser.TypedparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#typedparameter}.
	 * @param ctx the parse tree
	 */
	void exitTypedparameter(BatchSharpParser.TypedparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifier(BatchSharpParser.TypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifier(BatchSharpParser.TypespecifierContext ctx);
}