// Generated from C:/Users/Bayan/Desktop/CompilerProject3/src/antlr\dartParser.g4 by ANTLR 4.10.1
package antlr.antlr;
import antlr.dartParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link antlr.dartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(antlr.dartParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STATMENT}
	 * labeled alternative in {@link antlr.dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTATMENT(antlr.dartParser.STATMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFBLOCK}
	 * labeled alternative in {@link antlr.dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFBLOCK(antlr.dartParser.IFBLOCKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WHILEBLOCK}
	 * labeled alternative in {@link antlr.dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWHILEBLOCK(antlr.dartParser.WHILEBLOCKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNNCTION}
	 * labeled alternative in {@link antlr.dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNNCTION(antlr.dartParser.FUNNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTIONVOID}
	 * labeled alternative in {@link antlr.dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTIONVOID(antlr.dartParser.FUNCTIONVOIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORBLOCK}
	 * labeled alternative in {@link antlr.dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORBLOCK(antlr.dartParser.FORBLOCKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DOSTATMENT}
	 * labeled alternative in {@link antlr.dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDOSTATMENT(antlr.dartParser.DOSTATMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAYS}
	 * labeled alternative in {@link antlr.dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAYS(antlr.dartParser.ARRAYSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CLASSDECLERATION}
	 * labeled alternative in {@link antlr.dartParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCLASSDECLERATION(antlr.dartParser.CLASSDECLERATIONContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(antlr.dartParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(antlr.dartParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NORMALCONSTRUCTOR}
	 * labeled alternative in {@link antlr.dartParser#classConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNORMALCONSTRUCTOR(antlr.dartParser.NORMALCONSTRUCTORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FACTORYCONSTRUCTOR}
	 * labeled alternative in {@link antlr.dartParser#classConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFACTORYCONSTRUCTOR(antlr.dartParser.FACTORYCONSTRUCTORContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#normalConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalConstructor(antlr.dartParser.NormalConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#factoryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoryConstructor(antlr.dartParser.FactoryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(antlr.dartParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#factoryConstructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoryConstructorBody(antlr.dartParser.FactoryConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#optionalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParameters(antlr.dartParser.OptionalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#parametersConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersConstructor(antlr.dartParser.ParametersConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#constructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorName(antlr.dartParser.ConstructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#functionMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionMain(antlr.dartParser.FunctionMainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DECRERATION}
	 * labeled alternative in {@link antlr.dartParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDECRERATION(antlr.dartParser.DECRERATIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGNMNET}
	 * labeled alternative in {@link antlr.dartParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGNMNET(antlr.dartParser.ASSIGNMNETContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCALL}
	 * labeled alternative in {@link antlr.dartParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCALL(antlr.dartParser.FUNCALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARPLUSPLUS}
	 * labeled alternative in {@link antlr.dartParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARPLUSPLUS(antlr.dartParser.VARPLUSPLUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARMINUSMINUS}
	 * labeled alternative in {@link antlr.dartParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARMINUSMINUS(antlr.dartParser.VARMINUSMINUSContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(antlr.dartParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#elseifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifblock(antlr.dartParser.ElseifblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(antlr.dartParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(antlr.dartParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(antlr.dartParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#datatypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypes(antlr.dartParser.DatatypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(antlr.dartParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#varplusplus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarplusplus(antlr.dartParser.VarplusplusContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#varminusminus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarminusminus(antlr.dartParser.VarminusminusContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#declINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclINT(antlr.dartParser.DeclINTContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#decldouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecldouble(antlr.dartParser.DecldoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#declSTRING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSTRING(antlr.dartParser.DeclSTRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#declFLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclFLOAT(antlr.dartParser.DeclFLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#declbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclbool(antlr.dartParser.DeclboolContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#declVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVar(antlr.dartParser.DeclVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#parametersFUNCTION}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersFUNCTION(antlr.dartParser.ParametersFUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(antlr.dartParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#functionVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionVoid(antlr.dartParser.FunctionVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(antlr.dartParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(antlr.dartParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#boolOPERATIONS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOPERATIONS(antlr.dartParser.BoolOPERATIONSContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#exprission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprission(antlr.dartParser.ExprissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(antlr.dartParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberCosnt}
	 * labeled alternative in {@link antlr.dartParser#constatnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberCosnt(antlr.dartParser.NumberCosntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link antlr.dartParser#constatnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(antlr.dartParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link antlr.dartParser#constatnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConst(antlr.dartParser.StringConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link antlr.dartParser#constatnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConst(antlr.dartParser.IntConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#arrays}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrays(antlr.dartParser.ArraysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInteger}
	 * labeled alternative in {@link antlr.dartParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInteger(antlr.dartParser.ArrayIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDouble}
	 * labeled alternative in {@link antlr.dartParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDouble(antlr.dartParser.ArrayDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link antlr.dartParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayString(antlr.dartParser.ArrayStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayBool}
	 * labeled alternative in {@link antlr.dartParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBool(antlr.dartParser.ArrayBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue(antlr.dartParser.QueueContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#stack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack(antlr.dartParser.StackContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(antlr.dartParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#addlist_queue_stack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddlist_queue_stack(antlr.dartParser.Addlist_queue_stackContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#queueINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueINT(antlr.dartParser.QueueINTContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#queueDOUBLE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueDOUBLE(antlr.dartParser.QueueDOUBLEContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#queueSTRING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueSTRING(antlr.dartParser.QueueSTRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#queueFLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueFLOAT(antlr.dartParser.QueueFLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#queueBOOL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueBOOL(antlr.dartParser.QueueBOOLContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#queueVAR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueueVAR(antlr.dartParser.QueueVARContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#stackINT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackINT(antlr.dartParser.StackINTContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#stackDOUBLE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackDOUBLE(antlr.dartParser.StackDOUBLEContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#stackSTRING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackSTRING(antlr.dartParser.StackSTRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#stackFLOAT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackFLOAT(antlr.dartParser.StackFLOATContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#stackBOOL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackBOOL(antlr.dartParser.StackBOOLContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlr.dartParser#stackVAR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackVAR(dartParser.StackVARContext ctx);
}