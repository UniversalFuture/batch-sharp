// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp_parsing/src/com/batch_sharp\BatchSharpPreProcessor.g4 by ANTLR 4.5
package com.batch_sharp;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BatchSharpPreProcessorParser}.
 */
public interface BatchSharpPreProcessorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BatchSharpPreProcessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(@NotNull BatchSharpPreProcessorParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpPreProcessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(@NotNull BatchSharpPreProcessorParser.DirectiveContext ctx);
}