// Generated from C:/Users/tobe/Source/Repos/batch-sharp/batch-sharp/src\BatchSharp.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BatchSharpParser}.
 */
public interface BatchSharpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(@NotNull BatchSharpParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(@NotNull BatchSharpParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#codeline}.
	 * @param ctx the parse tree
	 */
	void enterCodeline(@NotNull BatchSharpParser.CodelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#codeline}.
	 * @param ctx the parse tree
	 */
	void exitCodeline(@NotNull BatchSharpParser.CodelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(@NotNull BatchSharpParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(@NotNull BatchSharpParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatchSharpParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(@NotNull BatchSharpParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatchSharpParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(@NotNull BatchSharpParser.DirectiveContext ctx);
}