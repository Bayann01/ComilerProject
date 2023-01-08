// Generated from C:/Users/Bayan/Desktop/CompilerProjectlast/src/antlr\dartParser.g4 by ANTLR 4.10.1
package antlr;
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
	 * Visit a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(dartParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(dartParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(dartParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(dartParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#classConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstructor(dartParser.ClassConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#normalConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalConstructor(dartParser.NormalConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#factoryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoryConstructor(dartParser.FactoryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(dartParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#factoryConstructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoryConstructorBody(dartParser.FactoryConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#optionalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParameters(dartParser.OptionalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#parametersConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersConstructor(dartParser.ParametersConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorName(dartParser.ConstructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#functionMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionMain(dartParser.FunctionMainContext ctx);
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
	 * Visit a parse tree produced by {@link dartParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(dartParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(dartParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(dartParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#datatypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypes(dartParser.DatatypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(dartParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#varplusplus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarplusplus(dartParser.VarplusplusContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#varminusminus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarminusminus(dartParser.VarminusminusContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclINT(dartParser.DeclINTContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#decldouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecldouble(dartParser.DecldoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declSTRING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSTRING(dartParser.DeclSTRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declFLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclFLOAT(dartParser.DeclFLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclbool(dartParser.DeclboolContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVar(dartParser.DeclVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#parametersFUNCTION}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersFUNCTION(dartParser.ParametersFUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#functionVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionVoid(dartParser.FunctionVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(dartParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(dartParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#boolOPERATIONS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOPERATIONS(dartParser.BoolOPERATIONSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExprition}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExprition(dartParser.NotExpritionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprplusexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprplusexpr(dartParser.ExprplusexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(dartParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprminusexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprminusexpr(dartParser.ExprminusexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprboolexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprboolexpr(dartParser.ExprboolexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constatntt}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstatntt(dartParser.ConstatnttContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(dartParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expmulexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpmulexpr(dartParser.ExpmulexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOPCP}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOPCP(dartParser.ExprOPCPContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(dartParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberCosnt}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberCosnt(dartParser.NumberCosntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(dartParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConst(dartParser.StringConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConst(dartParser.IntConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInteger}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInteger(dartParser.ArrayIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDouble}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDouble(dartParser.ArrayDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayString(dartParser.ArrayStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayBool}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBool(dartParser.ArrayBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue(dartParser.QueueContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack(dartParser.StackContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(dartParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#addlist_queue_stack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddlist_queue_stack(dartParser.Addlist_queue_stackContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#queueINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueINT(dartParser.QueueINTContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#queueDOUBLE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueDOUBLE(dartParser.QueueDOUBLEContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#queueSTRING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueSTRING(dartParser.QueueSTRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#queueFLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueFLOAT(dartParser.QueueFLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#queueBOOL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueBOOL(dartParser.QueueBOOLContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#queueVAR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueVAR(dartParser.QueueVARContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stackINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackINT(dartParser.StackINTContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stackDOUBLE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackDOUBLE(dartParser.StackDOUBLEContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stackSTRING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackSTRING(dartParser.StackSTRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stackFLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackFLOAT(dartParser.StackFLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stackBOOL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackBOOL(dartParser.StackBOOLContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stackVAR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackVAR(dartParser.StackVARContext ctx);
}