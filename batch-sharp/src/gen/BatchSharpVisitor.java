// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp\BatchSharp.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by {@link BatchSharpParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(@NotNull BatchSharpParser.ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatchSharpParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(@NotNull BatchSharpParser.DirectiveContext ctx);
}