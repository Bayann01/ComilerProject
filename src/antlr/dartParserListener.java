// Generated from C:/Users/Bayan/Desktop/CompilerProjectgitlast/src/antlr\dartParser.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dartParser}.
 */
public interface dartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(dartParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(dartParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STATMENT}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterSTATMENT(dartParser.STATMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STATMENT}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitSTATMENT(dartParser.STATMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFBLOCK}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterIFBLOCK(dartParser.IFBLOCKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFBLOCK}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitIFBLOCK(dartParser.IFBLOCKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WHILEBLOCK}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterWHILEBLOCK(dartParser.WHILEBLOCKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WHILEBLOCK}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitWHILEBLOCK(dartParser.WHILEBLOCKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNNCTION}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterFUNNCTION(dartParser.FUNNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNNCTION}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitFUNNCTION(dartParser.FUNNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTIONVOID}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTIONVOID(dartParser.FUNCTIONVOIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTIONVOID}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTIONVOID(dartParser.FUNCTIONVOIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORBLOCK}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterFORBLOCK(dartParser.FORBLOCKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORBLOCK}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitFORBLOCK(dartParser.FORBLOCKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DOSTATMENT}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterDOSTATMENT(dartParser.DOSTATMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DOSTATMENT}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitDOSTATMENT(dartParser.DOSTATMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAYS}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterARRAYS(dartParser.ARRAYSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAYS}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitARRAYS(dartParser.ARRAYSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CLASSDECLERATION}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void enterCLASSDECLERATION(dartParser.CLASSDECLERATIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CLASSDECLERATION}
	 * labeled alternative in {@link dartParser#line}.
	 * @param ctx the parse tree
	 */
	void exitCLASSDECLERATION(dartParser.CLASSDECLERATIONContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(dartParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(dartParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(dartParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(dartParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NORMALCONSTRUCTOR}
	 * labeled alternative in {@link dartParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void enterNORMALCONSTRUCTOR(dartParser.NORMALCONSTRUCTORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NORMALCONSTRUCTOR}
	 * labeled alternative in {@link dartParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void exitNORMALCONSTRUCTOR(dartParser.NORMALCONSTRUCTORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FACTORYCONSTRUCTOR}
	 * labeled alternative in {@link dartParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void enterFACTORYCONSTRUCTOR(dartParser.FACTORYCONSTRUCTORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FACTORYCONSTRUCTOR}
	 * labeled alternative in {@link dartParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void exitFACTORYCONSTRUCTOR(dartParser.FACTORYCONSTRUCTORContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#normalConstructor}.
	 * @param ctx the parse tree
	 */
	void enterNormalConstructor(dartParser.NormalConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#normalConstructor}.
	 * @param ctx the parse tree
	 */
	void exitNormalConstructor(dartParser.NormalConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#factoryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterFactoryConstructor(dartParser.FactoryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#factoryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitFactoryConstructor(dartParser.FactoryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(dartParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(dartParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#factoryConstructorBody}.
	 * @param ctx the parse tree
	 */
	void enterFactoryConstructorBody(dartParser.FactoryConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#factoryConstructorBody}.
	 * @param ctx the parse tree
	 */
	void exitFactoryConstructorBody(dartParser.FactoryConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#optionalParameters}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParameters(dartParser.OptionalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#optionalParameters}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParameters(dartParser.OptionalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#parametersConstructor}.
	 * @param ctx the parse tree
	 */
	void enterParametersConstructor(dartParser.ParametersConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#parametersConstructor}.
	 * @param ctx the parse tree
	 */
	void exitParametersConstructor(dartParser.ParametersConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructorName}.
	 * @param ctx the parse tree
	 */
	void enterConstructorName(dartParser.ConstructorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructorName}.
	 * @param ctx the parse tree
	 */
	void exitConstructorName(dartParser.ConstructorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#functionMain}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMain(dartParser.FunctionMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#functionMain}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMain(dartParser.FunctionMainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DECRERATION}
	 * labeled alternative in {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterDECRERATION(dartParser.DECRERATIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DECRERATION}
	 * labeled alternative in {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitDECRERATION(dartParser.DECRERATIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGNMNET}
	 * labeled alternative in {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterASSIGNMNET(dartParser.ASSIGNMNETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGNMNET}
	 * labeled alternative in {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitASSIGNMNET(dartParser.ASSIGNMNETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCALL}
	 * labeled alternative in {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterFUNCALL(dartParser.FUNCALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCALL}
	 * labeled alternative in {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitFUNCALL(dartParser.FUNCALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARPLUSPLUS}
	 * labeled alternative in {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterVARPLUSPLUS(dartParser.VARPLUSPLUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARPLUSPLUS}
	 * labeled alternative in {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitVARPLUSPLUS(dartParser.VARPLUSPLUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARMINUSMINUS}
	 * labeled alternative in {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterVARMINUSMINUS(dartParser.VARMINUSMINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARMINUSMINUS}
	 * labeled alternative in {@link dartParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitVARMINUSMINUS(dartParser.VARMINUSMINUSContext ctx);
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
	 * Enter a parse tree produced by {@link dartParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(dartParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(dartParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(dartParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(dartParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(dartParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(dartParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#datatypes}.
	 * @param ctx the parse tree
	 */
	void enterDatatypes(dartParser.DatatypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#datatypes}.
	 * @param ctx the parse tree
	 */
	void exitDatatypes(dartParser.DatatypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(dartParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(dartParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#varplusplus}.
	 * @param ctx the parse tree
	 */
	void enterVarplusplus(dartParser.VarplusplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#varplusplus}.
	 * @param ctx the parse tree
	 */
	void exitVarplusplus(dartParser.VarplusplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#varminusminus}.
	 * @param ctx the parse tree
	 */
	void enterVarminusminus(dartParser.VarminusminusContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#varminusminus}.
	 * @param ctx the parse tree
	 */
	void exitVarminusminus(dartParser.VarminusminusContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declINT}.
	 * @param ctx the parse tree
	 */
	void enterDeclINT(dartParser.DeclINTContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declINT}.
	 * @param ctx the parse tree
	 */
	void exitDeclINT(dartParser.DeclINTContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#decldouble}.
	 * @param ctx the parse tree
	 */
	void enterDecldouble(dartParser.DecldoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#decldouble}.
	 * @param ctx the parse tree
	 */
	void exitDecldouble(dartParser.DecldoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declSTRING}.
	 * @param ctx the parse tree
	 */
	void enterDeclSTRING(dartParser.DeclSTRINGContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declSTRING}.
	 * @param ctx the parse tree
	 */
	void exitDeclSTRING(dartParser.DeclSTRINGContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declFLOAT}.
	 * @param ctx the parse tree
	 */
	void enterDeclFLOAT(dartParser.DeclFLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declFLOAT}.
	 * @param ctx the parse tree
	 */
	void exitDeclFLOAT(dartParser.DeclFLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declbool}.
	 * @param ctx the parse tree
	 */
	void enterDeclbool(dartParser.DeclboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declbool}.
	 * @param ctx the parse tree
	 */
	void exitDeclbool(dartParser.DeclboolContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclVar(dartParser.DeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclVar(dartParser.DeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#parametersFUNCTION}.
	 * @param ctx the parse tree
	 */
	void enterParametersFUNCTION(dartParser.ParametersFUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#parametersFUNCTION}.
	 * @param ctx the parse tree
	 */
	void exitParametersFUNCTION(dartParser.ParametersFUNCTIONContext ctx);
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
	 * Enter a parse tree produced by {@link dartParser#functionVoid}.
	 * @param ctx the parse tree
	 */
	void enterFunctionVoid(dartParser.FunctionVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#functionVoid}.
	 * @param ctx the parse tree
	 */
	void exitFunctionVoid(dartParser.FunctionVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(dartParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(dartParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link dartParser#boolOPERATIONS}.
	 * @param ctx the parse tree
	 */
	void enterBoolOPERATIONS(dartParser.BoolOPERATIONSContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#boolOPERATIONS}.
	 * @param ctx the parse tree
	 */
	void exitBoolOPERATIONS(dartParser.BoolOPERATIONSContext ctx);
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
	 * Enter a parse tree produced by the {@code numberCosnt}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void enterNumberCosnt(dartParser.NumberCosntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberCosnt}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void exitNumberCosnt(dartParser.NumberCosntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(dartParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(dartParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void enterStringConst(dartParser.StringConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void exitStringConst(dartParser.StringConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void enterIntConst(dartParser.IntConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link dartParser#constatnt}.
	 * @param ctx the parse tree
	 */
	void exitIntConst(dartParser.IntConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#arrays}.
	 * @param ctx the parse tree
	 */
	void enterArrays(dartParser.ArraysContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#arrays}.
	 * @param ctx the parse tree
	 */
	void exitArrays(dartParser.ArraysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInteger}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayInteger(dartParser.ArrayIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInteger}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayInteger(dartParser.ArrayIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDouble}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayDouble(dartParser.ArrayDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDouble}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayDouble(dartParser.ArrayDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayString(dartParser.ArrayStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayString(dartParser.ArrayStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayBool}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayBool(dartParser.ArrayBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayBool}
	 * labeled alternative in {@link dartParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayBool(dartParser.ArrayBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#queue}.
	 * @param ctx the parse tree
	 */
	void enterQueue(dartParser.QueueContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#queue}.
	 * @param ctx the parse tree
	 */
	void exitQueue(dartParser.QueueContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(dartParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(dartParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(dartParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(dartParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#addlist_queue_stack}.
	 * @param ctx the parse tree
	 */
	void enterAddlist_queue_stack(dartParser.Addlist_queue_stackContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#addlist_queue_stack}.
	 * @param ctx the parse tree
	 */
	void exitAddlist_queue_stack(dartParser.Addlist_queue_stackContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#queueINT}.
	 * @param ctx the parse tree
	 */
	void enterQueueINT(dartParser.QueueINTContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#queueINT}.
	 * @param ctx the parse tree
	 */
	void exitQueueINT(dartParser.QueueINTContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#queueDOUBLE}.
	 * @param ctx the parse tree
	 */
	void enterQueueDOUBLE(dartParser.QueueDOUBLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#queueDOUBLE}.
	 * @param ctx the parse tree
	 */
	void exitQueueDOUBLE(dartParser.QueueDOUBLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#queueSTRING}.
	 * @param ctx the parse tree
	 */
	void enterQueueSTRING(dartParser.QueueSTRINGContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#queueSTRING}.
	 * @param ctx the parse tree
	 */
	void exitQueueSTRING(dartParser.QueueSTRINGContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#queueFLOAT}.
	 * @param ctx the parse tree
	 */
	void enterQueueFLOAT(dartParser.QueueFLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#queueFLOAT}.
	 * @param ctx the parse tree
	 */
	void exitQueueFLOAT(dartParser.QueueFLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#queueBOOL}.
	 * @param ctx the parse tree
	 */
	void enterQueueBOOL(dartParser.QueueBOOLContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#queueBOOL}.
	 * @param ctx the parse tree
	 */
	void exitQueueBOOL(dartParser.QueueBOOLContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#queueVAR}.
	 * @param ctx the parse tree
	 */
	void enterQueueVAR(dartParser.QueueVARContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#queueVAR}.
	 * @param ctx the parse tree
	 */
	void exitQueueVAR(dartParser.QueueVARContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stackINT}.
	 * @param ctx the parse tree
	 */
	void enterStackINT(dartParser.StackINTContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stackINT}.
	 * @param ctx the parse tree
	 */
	void exitStackINT(dartParser.StackINTContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stackDOUBLE}.
	 * @param ctx the parse tree
	 */
	void enterStackDOUBLE(dartParser.StackDOUBLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stackDOUBLE}.
	 * @param ctx the parse tree
	 */
	void exitStackDOUBLE(dartParser.StackDOUBLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stackSTRING}.
	 * @param ctx the parse tree
	 */
	void enterStackSTRING(dartParser.StackSTRINGContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stackSTRING}.
	 * @param ctx the parse tree
	 */
	void exitStackSTRING(dartParser.StackSTRINGContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stackFLOAT}.
	 * @param ctx the parse tree
	 */
	void enterStackFLOAT(dartParser.StackFLOATContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stackFLOAT}.
	 * @param ctx the parse tree
	 */
	void exitStackFLOAT(dartParser.StackFLOATContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stackBOOL}.
	 * @param ctx the parse tree
	 */
	void enterStackBOOL(dartParser.StackBOOLContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stackBOOL}.
	 * @param ctx the parse tree
	 */
	void exitStackBOOL(dartParser.StackBOOLContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stackVAR}.
	 * @param ctx the parse tree
	 */
	void enterStackVAR(dartParser.StackVARContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stackVAR}.
	 * @param ctx the parse tree
	 */
	void exitStackVAR(dartParser.StackVARContext ctx);
}