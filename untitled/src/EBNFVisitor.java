// Generated from C:/Users/Personal/Documents/NetBeansProjects/untitled\EBNF.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EBNFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EBNFVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EBNFParser#prules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrules(EBNFParser.PrulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EBNFParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EBNFParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EBNFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(EBNFParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link EBNFParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(EBNFParser.FactorContext ctx);
}