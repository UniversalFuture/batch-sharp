// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp_parsing/src/com/batch_sharp\BatchSharpPreProcessor.g4 by ANTLR 4.5.1
package com.batch_sharp;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link BatchSharpPreProcessorVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class BatchSharpPreProcessorBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements BatchSharpPreProcessorVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDirective(BatchSharpPreProcessorParser.DirectiveContext ctx) { return visitChildren(ctx); }
}