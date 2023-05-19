// Generated from C:/Users/Bayan/Desktop/CompilerProject1/src/antlr\dartParser.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link dartParser#widgetclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetclass(dartParser.WidgetclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#flutterProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlutterProgram(dartParser.FlutterProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textFieldl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldl(dartParser.TextFieldlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imagel}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImagel(dartParser.ImagelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowl(dartParser.RowlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnl(dartParser.ColumnlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerl(dartParser.ContainerlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listviewl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListviewl(dartParser.ListviewlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scaffoldl}
	 * labeled alternative in {@link dartParser#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldl(dartParser.ScaffoldlContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#textField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextField(dartParser.TextFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textFieldControllerPropertyl}
	 * labeled alternative in {@link dartParser#textFieldProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldControllerPropertyl(dartParser.TextFieldControllerPropertylContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#textFieldControllerProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldControllerProperty(dartParser.TextFieldControllerPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(dartParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imagepropertyl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImagepropertyl(dartParser.ImagepropertylContext ctx);
	/**
	 * Visit a parse tree produced by the {@code heightl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeightl(dartParser.HeightlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code widthl}
	 * labeled alternative in {@link dartParser#imageProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthl(dartParser.WidthlContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#imageproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageproperty(dartParser.ImagepropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(dartParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(dartParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(dartParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colorl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorl(dartParser.ColorlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code heightcontainerl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeightcontainerl(dartParser.HeightcontainerlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code widthcontainerl}
	 * labeled alternative in {@link dartParser#containerproperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthcontainerl(dartParser.WidthcontainerlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childl}
	 * labeled alternative in {@link dartParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildl(dartParser.ChildlContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(dartParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#heightcontainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeightcontainer(dartParser.HeightcontainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widthcontainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthcontainer(dartParser.WidthcontainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(dartParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#rowProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowProperties(dartParser.RowPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainaxisRow}
	 * labeled alternative in {@link dartParser#rowproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainaxisRow(dartParser.MainaxisRowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code crossaxisRow}
	 * labeled alternative in {@link dartParser#rowproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossaxisRow(dartParser.CrossaxisRowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowChildren}
	 * labeled alternative in {@link dartParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowChildren(dartParser.RowChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(dartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#columnProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnProperties(dartParser.ColumnPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainaxisColumn}
	 * labeled alternative in {@link dartParser#columnproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainaxisColumn(dartParser.MainaxisColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code crossaxisColumn}
	 * labeled alternative in {@link dartParser#columnproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossaxisColumn(dartParser.CrossaxisColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnChildren}
	 * labeled alternative in {@link dartParser#childrenc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnChildren(dartParser.ColumnChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#listView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListView(dartParser.ListViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#listViewProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListViewProperties(dartParser.ListViewPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listChildren}
	 * labeled alternative in {@link dartParser#childrenlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListChildren(dartParser.ListChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listScrolling}
	 * labeled alternative in {@link dartParser#scrollDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListScrolling(dartParser.ListScrollingContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigatorPushExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigatorPushExpr(dartParser.NavigatorPushExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#materialPageRouteExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialPageRouteExpr(dartParser.MaterialPageRouteExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#pageBuilderExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageBuilderExpr(dartParser.PageBuilderExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#pageInstanceExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageInstanceExpr(dartParser.PageInstanceExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(dartParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigatorPopExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigatorPopExpr(dartParser.NavigatorPopExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#textButtonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextButtonExpr(dartParser.TextButtonExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#onPressedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPressedExpr(dartParser.OnPressedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#childExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildExpr(dartParser.ChildExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#functionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(dartParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#blockExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpr(dartParser.BlockExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#textExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextExpr(dartParser.TextExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#stringLiteralExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpr(dartParser.StringLiteralExprContext ctx);
}