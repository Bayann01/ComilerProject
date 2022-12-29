// Generated from C:/Users/Bayan/Desktop/ComilerProject/src\dartParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(dartParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(dartParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(dartParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(dartParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#elseifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifblock(dartParser.ElseifblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#wileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWileBlock(dartParser.WileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(dartParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprission(dartParser.ExprissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(dartParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstatnt(dartParser.ConstatntContext ctx);
}