// Generated from C:/Users/Bayan/Desktop/CompilerProject3/src\flutterParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link flutterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface flutterParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link flutterParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(flutterParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgets(flutterParser.WidgetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#textField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextField(flutterParser.TextFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#textFieldProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldProperties(flutterParser.TextFieldPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#textFieldTextProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldTextProperty(flutterParser.TextFieldTextPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#textFieldControllerProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldControllerProperty(flutterParser.TextFieldControllerPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#textFieldDecorationProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldDecorationProperty(flutterParser.TextFieldDecorationPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#inputDecorationProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationProperties(flutterParser.InputDecorationPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#inputDecorationLabelTextProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationLabelTextProperty(flutterParser.InputDecorationLabelTextPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#inputDecorationHintTextProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationHintTextProperty(flutterParser.InputDecorationHintTextPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#inputDecorationHelperTextProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationHelperTextProperty(flutterParser.InputDecorationHelperTextPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#inputDecorationIconProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationIconProperty(flutterParser.InputDecorationIconPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#textFieldOnChangedProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldOnChangedProperty(flutterParser.TextFieldOnChangedPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(flutterParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#imageProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageProperties(flutterParser.ImagePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#imageproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageproperty(flutterParser.ImagepropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(flutterParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(flutterParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(flutterParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#containerproperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerproperties(flutterParser.ContainerpropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(flutterParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(flutterParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#decoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoration(flutterParser.DecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape(flutterParser.ShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(flutterParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#rowProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowProperties(flutterParser.RowPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#rowproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowproperty(flutterParser.RowpropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(flutterParser.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(flutterParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#columnProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnProperties(flutterParser.ColumnPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link flutterParser#columnproperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnproperty(flutterParser.ColumnpropertyContext ctx);
}