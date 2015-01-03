// Generated from Rows.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RowsParser}.
 */
public interface RowsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RowsParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull RowsParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link RowsParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull RowsParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link RowsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull RowsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RowsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull RowsParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link RowsParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(@NotNull RowsParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link RowsParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(@NotNull RowsParser.RowContext ctx);
}