// Generated from C:/Users/damia/Desktop/kompilator/src/main/java\C.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(CParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(CParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#functionname}.
	 * @param ctx the parse tree
	 */
	void enterFunctionname(CParser.FunctionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#functionname}.
	 * @param ctx the parse tree
	 */
	void exitFunctionname(CParser.FunctionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#inside}.
	 * @param ctx the parse tree
	 */
	void enterInside(CParser.InsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#inside}.
	 * @param ctx the parse tree
	 */
	void exitInside(CParser.InsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#returnf}.
	 * @param ctx the parse tree
	 */
	void enterReturnf(CParser.ReturnfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#returnf}.
	 * @param ctx the parse tree
	 */
	void exitReturnf(CParser.ReturnfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(CParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(CParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(CParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(CParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(CParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(CParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#compsign}.
	 * @param ctx the parse tree
	 */
	void enterCompsign(CParser.CompsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#compsign}.
	 * @param ctx the parse tree
	 */
	void exitCompsign(CParser.CompsignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#acc}.
	 * @param ctx the parse tree
	 */
	void enterAcc(CParser.AccContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#acc}.
	 * @param ctx the parse tree
	 */
	void exitAcc(CParser.AccContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(CParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(CParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#iff}.
	 * @param ctx the parse tree
	 */
	void enterIff(CParser.IffContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#iff}.
	 * @param ctx the parse tree
	 */
	void exitIff(CParser.IffContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CParser.TypeContext ctx);
}