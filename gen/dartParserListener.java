// Generated from C:/Users/Bayan/Desktop/ComilerProject/src\dartParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dartParser}.
 */
public interface dartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dartParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dartParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(dartParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(dartParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(dartParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(dartParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(dartParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(dartParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#elseifblock}.
	 * @param ctx the parse tree
	 */
	void enterElseifblock(dartParser.ElseifblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#elseifblock}.
	 * @param ctx the parse tree
	 */
	void exitElseifblock(dartParser.ElseifblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#wileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWileBlock(dartParser.WileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#wileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWileBlock(dartParser.WileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(dartParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(dartParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExprission(dartParser.ExprissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExprission(dartParser.ExprissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(dartParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(dartParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void enterConstatnt(dartParser.ConstatntContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void exitConstatnt(dartParser.ConstatntContext ctx);
}