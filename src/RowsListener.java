// Generated from Rows.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RowsParser}.
 */
public interface RowsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RowsParser#Minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull RowsParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link RowsParser#Minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull RowsParser.MinusContext ctx);

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
	 * Enter a parse tree produced by {@link RowsParser#Paren}.
	 * @param ctx the parse tree
	 */
	void enterParen(@NotNull RowsParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RowsParser#Paren}.
	 * @param ctx the parse tree
	 */
	void exitParen(@NotNull RowsParser.ParenContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link RowsParser#Single}.
	 * @param ctx the parse tree
	 */
	void enterSingle(@NotNull RowsParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RowsParser#Single}.
	 * @param ctx the parse tree
	 */
	void exitSingle(@NotNull RowsParser.SingleContext ctx);

	/**
	 * Enter a parse tree produced by {@link RowsParser#MulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull RowsParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link RowsParser#MulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull RowsParser.MulDivContext ctx);
}