// Generated from C:/Users/Personal/Documents/NetBeansProjects/untitled\EBNF.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EBNFParser}.
 */
public interface EBNFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EBNFParser#prules}.
	 * @param ctx the parse tree
	 */
	void enterPrules(EBNFParser.PrulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EBNFParser#prules}.
	 * @param ctx the parse tree
	 */
	void exitPrules(EBNFParser.PrulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EBNFParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EBNFParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EBNFParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EBNFParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EBNFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(EBNFParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link EBNFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(EBNFParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link EBNFParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(EBNFParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EBNFParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(EBNFParser.FactorContext ctx);
}