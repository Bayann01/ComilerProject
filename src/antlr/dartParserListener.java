// Generated from C:/Users/HP/Desktop/Intellij Projects/finalCompilerProject/src/antlr\dartParser.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link dartParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(dartParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(dartParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(dartParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(dartParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#createObject}.
	 * @param ctx the parse tree
	 */
	void enterCreateObject(dartParser.CreateObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#createObject}.
	 * @param ctx the parse tree
	 */
	void exitCreateObject(dartParser.CreateObjectContext ctx);
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
	 * Enter a parse tree produced by {@link dartParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructor(dartParser.ClassConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructor(dartParser.ClassConstructorContext ctx);
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
	 * Enter a parse tree produced by the {@code notExprition}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterNotExprition(dartParser.NotExpritionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExprition}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitNotExprition(dartParser.NotExpritionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprplusexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExprplusexpr(dartParser.ExprplusexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprplusexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExprplusexpr(dartParser.ExprplusexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(dartParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(dartParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprminusexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExprminusexpr(dartParser.ExprminusexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprminusexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExprminusexpr(dartParser.ExprminusexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprboolexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExprboolexpr(dartParser.ExprboolexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprboolexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExprboolexpr(dartParser.ExprboolexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constatntt}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterConstatntt(dartParser.ConstatnttContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constatntt}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitConstatntt(dartParser.ConstatnttContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(dartParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(dartParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expmulexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExpmulexpr(dartParser.ExpmulexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expmulexpr}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExpmulexpr(dartParser.ExpmulexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOPCP}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void enterExprOPCP(dartParser.ExprOPCPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOPCP}
	 * labeled alternative in {@link dartParser#exprission}.
	 * @param ctx the parse tree
	 */
	void exitExprOPCP(dartParser.ExprOPCPContext ctx);
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
	 * Enter a parse tree produced by {@link dartParser#widgetclass}.
	 * @param ctx the parse tree
	 */
	void enterWidgetclass(dartParser.WidgetclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widgetclass}.
	 * @param ctx the parse tree
	 */
	void exitWidgetclass(dartParser.WidgetclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#flutterProgram}.
	 * @param ctx the parse tree
	 */
	void enterFlutterProgram(dartParser.FlutterProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#flutterProgram}.
	 * @param ctx the parse tree
	 */
	void exitFlutterProgram(dartParser.FlutterProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFieldl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldl(dartParser.TextFieldlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFieldl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldl(dartParser.TextFieldlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imagel}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterImagel(dartParser.ImagelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imagel}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitImagel(dartParser.ImagelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterRowl(dartParser.RowlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitRowl(dartParser.RowlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterColumnl(dartParser.ColumnlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitColumnl(dartParser.ColumnlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterContainerl(dartParser.ContainerlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitContainerl(dartParser.ContainerlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listviewl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterListviewl(dartParser.ListviewlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listviewl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitListviewl(dartParser.ListviewlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scaffoldl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldl(dartParser.ScaffoldlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scaffoldl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldl(dartParser.ScaffoldlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code button}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterButton(dartParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code button}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitButton(dartParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textWidget}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void enterTextWidget(dartParser.TextWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textWidget}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 */
	void exitTextWidget(dartParser.TextWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textField}.
	 * @param ctx the parse tree
	 */
	void enterTextField(dartParser.TextFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textField}.
	 * @param ctx the parse tree
	 */
	void exitTextField(dartParser.TextFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFieldControllerPropertyl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldControllerPropertyl(dartParser.TextFieldControllerPropertylContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFieldControllerPropertyl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldControllerPropertyl(dartParser.TextFieldControllerPropertylContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFieldHintTextl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldHintTextl(dartParser.TextFieldHintTextlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFieldHintTextl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldHintTextl(dartParser.TextFieldHintTextlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFieldBorderRadiusl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldBorderRadiusl(dartParser.TextFieldBorderRadiuslContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFieldBorderRadiusl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldBorderRadiusl(dartParser.TextFieldBorderRadiuslContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFieldonsubmitl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldonsubmitl(dartParser.TextFieldonsubmitlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFieldonsubmitl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldonsubmitl(dartParser.TextFieldonsubmitlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFieldObscureTextl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldObscureTextl(dartParser.TextFieldObscureTextlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFieldObscureTextl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldObscureTextl(dartParser.TextFieldObscureTextlContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textFieldControllerProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldControllerProperty(dartParser.TextFieldControllerPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textFieldControllerProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldControllerProperty(dartParser.TextFieldControllerPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textFieldHintText}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldHintText(dartParser.TextFieldHintTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textFieldHintText}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldHintText(dartParser.TextFieldHintTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textFieldBorderRadius}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldBorderRadius(dartParser.TextFieldBorderRadiusContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textFieldBorderRadius}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldBorderRadius(dartParser.TextFieldBorderRadiusContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textFieldOnsubmit}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldOnsubmit(dartParser.TextFieldOnsubmitContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textFieldOnsubmit}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldOnsubmit(dartParser.TextFieldOnsubmitContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textFieldObscureText}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldObscureText(dartParser.TextFieldObscureTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textFieldObscureText}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldObscureText(dartParser.TextFieldObscureTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(dartParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(dartParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imagepropertyl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterImagepropertyl(dartParser.ImagepropertylContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imagepropertyl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitImagepropertyl(dartParser.ImagepropertylContext ctx);
	/**
	 * Enter a parse tree produced by the {@code heightl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterHeightl(dartParser.HeightlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code heightl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitHeightl(dartParser.HeightlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code widthl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterWidthl(dartParser.WidthlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code widthl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitWidthl(dartParser.WidthlContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#imageproperty}.
	 * @param ctx the parse tree
	 */
	void enterImageproperty(dartParser.ImagepropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#imageproperty}.
	 * @param ctx the parse tree
	 */
	void exitImageproperty(dartParser.ImagepropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(dartParser.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(dartParser.HeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(dartParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(dartParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(dartParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(dartParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boxDecorationl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void enterBoxDecorationl(dartParser.BoxDecorationlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boxDecorationl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void exitBoxDecorationl(dartParser.BoxDecorationlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code heightcontainerl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void enterHeightcontainerl(dartParser.HeightcontainerlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code heightcontainerl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void exitHeightcontainerl(dartParser.HeightcontainerlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code widthcontainerl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void enterWidthcontainerl(dartParser.WidthcontainerlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code widthcontainerl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 */
	void exitWidthcontainerl(dartParser.WidthcontainerlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childl}
	 * labeled alternative in {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void enterChildl(dartParser.ChildlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childl}
	 * labeled alternative in {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void exitChildl(dartParser.ChildlContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(dartParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(dartParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#heightcontainer}.
	 * @param ctx the parse tree
	 */
	void enterHeightcontainer(dartParser.HeightcontainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#heightcontainer}.
	 * @param ctx the parse tree
	 */
	void exitHeightcontainer(dartParser.HeightcontainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widthcontainer}.
	 * @param ctx the parse tree
	 */
	void enterWidthcontainer(dartParser.WidthcontainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widthcontainer}.
	 * @param ctx the parse tree
	 */
	void exitWidthcontainer(dartParser.WidthcontainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#containerBorderRadius}.
	 * @param ctx the parse tree
	 */
	void enterContainerBorderRadius(dartParser.ContainerBorderRadiusContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#containerBorderRadius}.
	 * @param ctx the parse tree
	 */
	void exitContainerBorderRadius(dartParser.ContainerBorderRadiusContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#boxDecoration}.
	 * @param ctx the parse tree
	 */
	void enterBoxDecoration(dartParser.BoxDecorationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#boxDecoration}.
	 * @param ctx the parse tree
	 */
	void exitBoxDecoration(dartParser.BoxDecorationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(dartParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(dartParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#rowProperties}.
	 * @param ctx the parse tree
	 */
	void enterRowProperties(dartParser.RowPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#rowProperties}.
	 * @param ctx the parse tree
	 */
	void exitRowProperties(dartParser.RowPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainaxisRow}
	 * labeled alternative in {@link dartParser#rowproperty}.
	 * @param ctx the parse tree
	 */
	void enterMainaxisRow(dartParser.MainaxisRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainaxisRow}
	 * labeled alternative in {@link dartParser#rowproperty}.
	 * @param ctx the parse tree
	 */
	void exitMainaxisRow(dartParser.MainaxisRowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code crossaxisRow}
	 * labeled alternative in {@link dartParser#rowproperty}.
	 * @param ctx the parse tree
	 */
	void enterCrossaxisRow(dartParser.CrossaxisRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code crossaxisRow}
	 * labeled alternative in {@link dartParser#rowproperty}.
	 * @param ctx the parse tree
	 */
	void exitCrossaxisRow(dartParser.CrossaxisRowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowChildren}
	 * labeled alternative in {@link dartParser#children}.
	 * @param ctx the parse tree
	 */
	void enterRowChildren(dartParser.RowChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowChildren}
	 * labeled alternative in {@link dartParser#children}.
	 * @param ctx the parse tree
	 */
	void exitRowChildren(dartParser.RowChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(dartParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(dartParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void enterColumnProperties(dartParser.ColumnPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#columnProperties}.
	 * @param ctx the parse tree
	 */
	void exitColumnProperties(dartParser.ColumnPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainaxisColumn}
	 * labeled alternative in {@link dartParser#columnproperty}.
	 * @param ctx the parse tree
	 */
	void enterMainaxisColumn(dartParser.MainaxisColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainaxisColumn}
	 * labeled alternative in {@link dartParser#columnproperty}.
	 * @param ctx the parse tree
	 */
	void exitMainaxisColumn(dartParser.MainaxisColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code crossaxisColumn}
	 * labeled alternative in {@link dartParser#columnproperty}.
	 * @param ctx the parse tree
	 */
	void enterCrossaxisColumn(dartParser.CrossaxisColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code crossaxisColumn}
	 * labeled alternative in {@link dartParser#columnproperty}.
	 * @param ctx the parse tree
	 */
	void exitCrossaxisColumn(dartParser.CrossaxisColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnChildren}
	 * labeled alternative in {@link dartParser#childrenc}.
	 * @param ctx the parse tree
	 */
	void enterColumnChildren(dartParser.ColumnChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnChildren}
	 * labeled alternative in {@link dartParser#childrenc}.
	 * @param ctx the parse tree
	 */
	void exitColumnChildren(dartParser.ColumnChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#listView}.
	 * @param ctx the parse tree
	 */
	void enterListView(dartParser.ListViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#listView}.
	 * @param ctx the parse tree
	 */
	void exitListView(dartParser.ListViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#listViewProperties}.
	 * @param ctx the parse tree
	 */
	void enterListViewProperties(dartParser.ListViewPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#listViewProperties}.
	 * @param ctx the parse tree
	 */
	void exitListViewProperties(dartParser.ListViewPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listChildren}
	 * labeled alternative in {@link dartParser#childrenlist}.
	 * @param ctx the parse tree
	 */
	void enterListChildren(dartParser.ListChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listChildren}
	 * labeled alternative in {@link dartParser#childrenlist}.
	 * @param ctx the parse tree
	 */
	void exitListChildren(dartParser.ListChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listScrolling}
	 * labeled alternative in {@link dartParser#scrollDirection}.
	 * @param ctx the parse tree
	 */
	void enterListScrolling(dartParser.ListScrollingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listScrolling}
	 * labeled alternative in {@link dartParser#scrollDirection}.
	 * @param ctx the parse tree
	 */
	void exitListScrolling(dartParser.ListScrollingContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textButtonExpr}.
	 * @param ctx the parse tree
	 */
	void enterTextButtonExpr(dartParser.TextButtonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textButtonExpr}.
	 * @param ctx the parse tree
	 */
	void exitTextButtonExpr(dartParser.TextButtonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#onPressedExpr}.
	 * @param ctx the parse tree
	 */
	void enterOnPressedExpr(dartParser.OnPressedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#onPressedExpr}.
	 * @param ctx the parse tree
	 */
	void exitOnPressedExpr(dartParser.OnPressedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#childExpr}.
	 * @param ctx the parse tree
	 */
	void enterChildExpr(dartParser.ChildExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#childExpr}.
	 * @param ctx the parse tree
	 */
	void exitChildExpr(dartParser.ChildExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(dartParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(dartParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(dartParser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(dartParser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textExpr}.
	 * @param ctx the parse tree
	 */
	void enterTextExpr(dartParser.TextExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textExpr}.
	 * @param ctx the parse tree
	 */
	void exitTextExpr(dartParser.TextExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#alignPos}.
	 * @param ctx the parse tree
	 */
	void enterAlignPos(dartParser.AlignPosContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#alignPos}.
	 * @param ctx the parse tree
	 */
	void exitAlignPos(dartParser.AlignPosContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textAlign}.
	 * @param ctx the parse tree
	 */
	void enterTextAlign(dartParser.TextAlignContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textAlign}.
	 * @param ctx the parse tree
	 */
	void exitTextAlign(dartParser.TextAlignContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textStyle}.
	 * @param ctx the parse tree
	 */
	void enterTextStyle(dartParser.TextStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textStyle}.
	 * @param ctx the parse tree
	 */
	void exitTextStyle(dartParser.TextStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textColor}.
	 * @param ctx the parse tree
	 */
	void enterTextColor(dartParser.TextColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textColor}.
	 * @param ctx the parse tree
	 */
	void exitTextColor(dartParser.TextColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textSize}.
	 * @param ctx the parse tree
	 */
	void enterTextSize(dartParser.TextSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textSize}.
	 * @param ctx the parse tree
	 */
	void exitTextSize(dartParser.TextSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#stringLiteralExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpr(dartParser.StringLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#stringLiteralExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpr(dartParser.StringLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigatorPushExpr}.
	 * @param ctx the parse tree
	 */
	void enterNavigatorPushExpr(dartParser.NavigatorPushExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigatorPushExpr}.
	 * @param ctx the parse tree
	 */
	void exitNavigatorPushExpr(dartParser.NavigatorPushExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#materialPageRouteExpr}.
	 * @param ctx the parse tree
	 */
	void enterMaterialPageRouteExpr(dartParser.MaterialPageRouteExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#materialPageRouteExpr}.
	 * @param ctx the parse tree
	 */
	void exitMaterialPageRouteExpr(dartParser.MaterialPageRouteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#pageBuilderExpr}.
	 * @param ctx the parse tree
	 */
	void enterPageBuilderExpr(dartParser.PageBuilderExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#pageBuilderExpr}.
	 * @param ctx the parse tree
	 */
	void exitPageBuilderExpr(dartParser.PageBuilderExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#pageInstanceExpr}.
	 * @param ctx the parse tree
	 */
	void enterPageInstanceExpr(dartParser.PageInstanceExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#pageInstanceExpr}.
	 * @param ctx the parse tree
	 */
	void exitPageInstanceExpr(dartParser.PageInstanceExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigatorPopExpr}.
	 * @param ctx the parse tree
	 */
	void enterNavigatorPopExpr(dartParser.NavigatorPopExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigatorPopExpr}.
	 * @param ctx the parse tree
	 */
	void exitNavigatorPopExpr(dartParser.NavigatorPopExprContext ctx);
}