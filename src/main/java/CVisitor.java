// Generated from C:/Users/damia/Desktop/kompilator/src/main/java\C.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(CParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#functionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionname(CParser.FunctionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#inside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInside(CParser.InsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#returnf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnf(CParser.ReturnfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(CParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(CParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(CParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#compsign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompsign(CParser.CompsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#acc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcc(CParser.AccContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(CParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#iff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIff(CParser.IffContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CParser.TypeContext ctx);
}