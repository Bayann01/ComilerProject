package Visitor;

import SemanticCheck.Semantic_Error;
import SympolTable.sympolTable;
import antlr.dartParser;
import antlr.dartParserBaseVisitor;
import codegeneration.CodeGeneration;
import org.antlr.v4.runtime.tree.ParseTree;
import program.*;


import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class TestVisitor extends dartParserBaseVisitor {

    static int helper=0;
    public static sympolTable sympolTable = new sympolTable();

    public static List<Map<String , List<String>>> scopes = new ArrayList<>();


    public List<Map<String , List<String>>> getScopes(){
        return this.scopes;
    }

    boolean checkIfVariableExists(String s, List<String> l){
        for(int i=0 ; i<l.size() ; i++){
            if(s.equals(l.get(i))){
                return true;
            }
        }
        return false;
    }
    CodeGeneration codeGeneration = CodeGeneration.getInstance();

    @Override
    public Constant visitNumberCosnt(dartParser.NumberCosntContext ctx) {
        double value = Double.parseDouble(ctx.NUMBER().toString());
        NumberConst n = new NumberConst(value);
        return n;
    }

    @Override
    public Constant visitBoolConst(dartParser.BoolConstContext ctx) {
        boolean value = Boolean.parseBoolean(ctx.BOOL().toString());
        BoolConst b = new BoolConst(value);
        return b;
    }

    @Override
    public Constant visitStringConst(dartParser.StringConstContext ctx) {
        String value = ctx.SingleLineString().toString();
        StringConst s = new StringConst(value);
        return s;
    }

    @Override
    public Constant visitIntConst(dartParser.IntConstContext ctx) {
        int value = Integer.parseInt(ctx.INT().toString());
        IntegerConst i = new IntegerConst(value);
        return i;
    }

    @Override
    public decleration visitDeclINT(dartParser.DeclINTContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String type = ctx.INTTYPE().getText();
        int value = Integer.parseInt(ctx.INT().toString());
//        if (sympolTable.variableExistsInCurrentScope(id)) {
//            System.err.println("Variable '" + id + "' is already declared in the current scope.");
//        } else {
//            sympolTable.addVariableToCurrentScope(id);
//        }

        DeclerationVarINT integer = new DeclerationVarINT(id, type, value);
        Map<String, Object> m = new HashMap<>();
        m.put("INT", integer);
        sympolTable.getMap().add(m);
        return integer;
    }

    @Override
    public decleration visitDecldouble(dartParser.DecldoubleContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String type = ctx.DOUBLETYPE().getText();
        double value = Double.parseDouble(ctx.NUMBER().toString());
//        if (sympolTable.variableExistsInCurrentScope(id)) {
//            System.err.println("Variable '" + id + "' is already declared in the current scope.");
//        } else {
//            sympolTable.addVariableToCurrentScope(id);
//        }
        DeclerationVarDouble d = new DeclerationVarDouble(id, type, value);
        Map<String, Object> m = new HashMap<>();
        m.put("Double", d);
        sympolTable.getMap().add(m);
        return d;
    }

    @Override
    public decleration visitDeclSTRING(dartParser.DeclSTRINGContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String type = ctx.STRINGTYPE().getText();
        String value = ctx.SingleLineString().toString();
//        if (sympolTable.variableExistsInCurrentScope(id)) {
//            System.err.println("Variable '" + id + "' is already declared in the current scope.");
//        } else {
//            sympolTable.addVariableToCurrentScope(id);
//        }
        DeclerationVarString s = new DeclerationVarString(id, type, value);
        Map<String, Object> m = new HashMap<>();
        m.put("String", s);
        sympolTable.getMap().add(m);
        return s;
    }

    @Override
    public decleration visitDeclFLOAT(dartParser.DeclFLOATContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String type = ctx.FLOATTYPE().getText();
        int value = Integer.parseInt(ctx.NUMBER().toString());
        DeclerationVarDouble d = new DeclerationVarDouble(id, type, value);
        return d;
    }

    @Override
    public decleration visitDeclbool(dartParser.DeclboolContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String type = ctx.BoolTYPE().getText();
        boolean value = Boolean.parseBoolean(ctx.BOOL().toString());
//        if (sympolTable.variableExistsInCurrentScope(id)) {
//            System.err.println("Variable '" + id + "' is already declared in the current scope.");
//        } else {
//            sympolTable.addVariableToCurrentScope(id);
//        }
        DeclerationVarBoolean b = new DeclerationVarBoolean(id, type, value);
        Map<String, Object> m = new HashMap<>();
        m.put("bool", b);
        sympolTable.getMap().add(m);
        return b;
    }

    @Override
    public exprission visitExprOPCP(dartParser.ExprOPCPContext ctx) {
        return (exprission) super.visitExprOPCP(ctx);
    }

    @Override

    public Array visitArrayInteger(dartParser.ArrayIntegerContext ctx) {
        IntegerArray integers = new IntegerArray();
        for (int i = 0; i < ctx.INT().size(); i++) {
            integers.add(Integer.parseInt(ctx.INT(i).toString()));
        }
        return integers;
    }

    @Override
    public Array visitArrayDouble(dartParser.ArrayDoubleContext ctx) {
        DoubleArray doubles = new DoubleArray();
        for (int i = 0; i < ctx.NUMBER().size(); i++) {
            doubles.add(Double.parseDouble(ctx.NUMBER(i).toString()));
        }
        return doubles;
    }

    @Override
    public Array visitArrayString(dartParser.ArrayStringContext ctx) {
        StringArray strings = new StringArray();
        for (int i = 0; i < ctx.SingleLineString().size(); i++) {
            strings.add(ctx.SingleLineString(i).toString());
        }
        return strings;
    }

    @Override
    public Array visitArrayBool(dartParser.ArrayBoolContext ctx) {
        BoolArray booleans = new BoolArray();
        for (int i = 0; i < ctx.BOOL().size(); i++) {
            booleans.add(Boolean.parseBoolean(ctx.BOOL(i).toString()));
        }
        return booleans;
    }

    @Override
    public statmnet visitAssignment(dartParser.AssignmentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        exprission value = (exprission) visit(ctx.exprission());
        assignment a = new assignment(id, value);
        Map<String, Object> m = new HashMap<>();
        m.put("assignment", a);
        sympolTable.getMap().add(m);
        return a;
    }

    @Override
    public exprission visitFunctionCall(dartParser.FunctionCallContext ctx) {
        functioncall c = new functioncall(ctx.IDENTIFIER().getText());
        for (dartParser.ExprissionContext expression : ctx.exprission()) {
            c.addparameter((exprission) visit(expression));
        }
        Map<String, Object> m = new HashMap<>();
        m.put("Functioncall", c);
        sympolTable.getMap().add(m);
        return c;
    }

    @Override
    public exprission visitExprplusexpr(dartParser.ExprplusexprContext ctx) {
        exprission ex1 = (exprission) visit(ctx.exprission().get(0));
        exprission ex2 = (exprission) visit(ctx.exprission().get(1));
        addproc addproc = new addproc(ex1, ex2);
        return addproc;
    }

    @Override
    public Object visitIdentifier(dartParser.IdentifierContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        identifier ID = new identifier(id);
        return ID;
    }

    @Override
    public Object visitProg(dartParser.ProgContext ctx) {
        prog p = new prog((mainFunction) visit(ctx.functionMain()));
        for (int i = 0; i < ctx.line().size(); i++) {
            line lines = (line) visit(ctx.getChild(i));

            p.addChild(lines);
        }
        return p;
    }

    public line visitIfBlock(dartParser.IfBlockContext ctx) {
        exprission exp = (exprission) visit(ctx.exprission().getChild(1));
        ifBlock e = new ifBlock(exp);
        for (int i = 0; i < ctx.block().line().size(); i++) {
            line lines = (line) visit(ctx.block().line().get(i));
            e.addline(lines);
        }
        return e;
    }

    @Override
    public exprission visitExprminusexpr(dartParser.ExprminusexprContext ctx) {
        exprission expr1 = (exprission) visit(ctx.exprission().get(0));
        exprission expr2 = (exprission) visit(ctx.exprission().get(1));
        minusproc e = new minusproc(expr1, expr2);
        return e;
    }

    @Override
    public exprission visitExpmulexpr(dartParser.ExpmulexprContext ctx) {
        exprission expr1 = (exprission) visit(ctx.exprission().get(0));
        exprission expr2 = (exprission) visit(ctx.exprission().get(1));
        multiproc e = new multiproc(expr1, expr2);
        return e;
    }

    @Override
    public exprission visitExprboolexpr(dartParser.ExprboolexprContext ctx) {
        exprission expr1 = (exprission) visit(ctx.exprission().get(0));
        exprission expr2 = (exprission) visit(ctx.exprission().get(1));
        booloperation e = new booloperation(expr1, expr2);
        return e;
    }

    @Override
    public Object visitFunctionMain(dartParser.FunctionMainContext ctx) {
        mainFunction m = new mainFunction();

        for (dartParser.ExprissionContext expr : ctx.exprission()) {
            m.addExpr((exprission) visit(expr));
        }

        for (dartParser.LineContext line : ctx.line()) {
            m.addLine((line) visit(line));
        }


        return m;

    }


    @Override
    public Object visitParametersFUNCTION(dartParser.ParametersFUNCTIONContext ctx) {
        String datatype = ctx.getChild(0).getText();
        String name = ctx.getChild(1).getText();
        parameterFunc pc = new parameterFunc(datatype, name);

        return pc;
    }
    @Override
    public widget visitTextField(dartParser.TextFieldContext ctx) {
        textField t = new textField();
        for (int i = 0; i < ctx.textFieldProperties().size(); i++) {
            t.addtextFieldProperties((textFieldProperties) visit(ctx.textFieldProperties(i)));
        }
        codeGeneration.GenerateFormField(t);
        codeGeneration.GenerateFormFieldBorderRadius(t);
        return t;
    }

    @Override
    public textFieldProperties visitTextFieldControllerPropertyl(dartParser.TextFieldControllerPropertylContext ctx) {
        String e = ctx.textFieldControllerProperty().IDENTIFIER().getText();
        textFieldControllerProperty t = new textFieldControllerProperty(e);
        return t;
    }



    @Override
    public Object visitTextFieldonsubmitl(dartParser.TextFieldonsubmitlContext ctx) {
        String value=ctx.textFieldOnsubmit().IDENTIFIER().getText();
        assignment assignment= (program.assignment) visit(ctx.textFieldOnsubmit().assignment());
        textFieldOnsubmitProperty textFieldOnsubmitProperty=new textFieldOnsubmitProperty(value,assignment);
        return textFieldOnsubmitProperty;

    }

    @Override
    public Object visitTextFieldBorderRadiusl(dartParser.TextFieldBorderRadiuslContext ctx) {
        double h = Double.parseDouble(ctx.textFieldBorderRadius().NUMBER().getText());
        textFieldBorderRadiusProperty t = new textFieldBorderRadiusProperty(h);
        return t;
    }

    @Override
    public Object visitTextFieldObscureTextl(dartParser.TextFieldObscureTextlContext ctx) {
        boolean obscureText = Boolean.parseBoolean(ctx.textFieldObscureText().getChild(2).getText());
        textFieldObscureTextProperty t = new textFieldObscureTextProperty(obscureText);
        return t;
    }

    @Override
    public Object visitTextFieldHintTextl(dartParser.TextFieldHintTextlContext ctx) {
        String h = ctx.textFieldHintText().SingleLineString().getText();
        textFieldHintTextProperty t = new textFieldHintTextProperty(h);
        return t;
    }

    @Override
    public widget visitImage(dartParser.ImageContext ctx) {
        image t = new image();

        for (int i = 0; i < ctx.imageProperties().size(); i++) {
            t.addimageproperty((imageproperties) visit(ctx.imageProperties(i)));

        }
        codeGeneration.GenerateImage(t);
        return t;
    }

    @Override
    public imageproperties visitImagepropertyl(dartParser.ImagepropertylContext ctx) {
        String url = ctx.imageproperty().SingleLineString().toString();
        imageproperty i = new imageproperty(url);
        return i;

    }

    @Override
    public imageproperties visitHeightl(dartParser.HeightlContext ctx) {
        double h = Double.parseDouble(ctx.height().NUMBER().getText());
        height e = new height(h);
        return e;
    }

    @Override
    public imageproperties visitWidthl(dartParser.WidthlContext ctx) {
        double h = Double.parseDouble(ctx.width().NUMBER().getText());
        width e = new width(h);
        return e;
    }

    @Override
    public Object visitContainer(dartParser.ContainerContext ctx) {
            widget c = new widget();
            if (ctx.child() != null) {
                c = (widget) visit(ctx.child());
            } else c = null;
            container t = new container(c);
            for (int i = 0; i < ctx.containerproperties().size(); i++) {
                t.addcontainerproperties((containerproperties) visit(ctx.containerproperties(i)));
            }

        //codeGeneration.GenerateContainer(t);

            return t;

    }

    @Override
    public containerproperties visitHeightcontainerl(dartParser.HeightcontainerlContext ctx) {
        double h = Double.parseDouble(ctx.heightcontainer().NUMBER().getText());
        heightcontaineer e = new heightcontaineer(h);
        return e;
    }

    @Override
    public containerproperties visitWidthcontainerl(dartParser.WidthcontainerlContext ctx) {
        double h = Double.parseDouble(ctx.widthcontainer().NUMBER().getText());
        widthcontainer e = new widthcontainer(h);
        return e;
    }

    @Override
    public containerproperties visitBoxDecorationl(dartParser.BoxDecorationlContext ctx) {
        color c = null;
        if(ctx.boxDecoration().color() != null){
            c = new color(ctx.boxDecoration().color().IDENTIFIER().getText());
        }
        ContainerBorderRadius cb = null;
        if(ctx.boxDecoration().containerBorderRadius() != null){
            cb = new ContainerBorderRadius(Double.parseDouble(ctx.boxDecoration().containerBorderRadius().NUMBER().getText()));
        }
        BoxDecoration boxDecoration = new BoxDecoration(c,cb);
        return boxDecoration;
    }

    @Override
    public Object visitColor(dartParser.ColorContext ctx) {
        String c = ctx.IDENTIFIER().toString();
        color i = new color(c);
        return i;
    }

    @Override
    public Object visitContainerBorderRadius(dartParser.ContainerBorderRadiusContext ctx) {
        double b = Double.parseDouble(ctx.NUMBER().getText());
        ContainerBorderRadius cb = new ContainerBorderRadius(b);
        return cb;
    }

    @Override
    public Object visitMainaxisRow(dartParser.MainaxisRowContext ctx) {
        String axis;
        if (ctx.START() != null) axis = ctx.START().getText();
        else if (ctx.END() != null) axis = ctx.END().getText();
        else axis = ctx.CENTER().getText();
        mainAxisRow r = new mainAxisRow(axis);
        return r;
    }


    @Override
    public Object visitCrossaxisRow(dartParser.CrossaxisRowContext ctx) {
        String axis;
        if (ctx.START() != null) axis = ctx.START().getText();
        else if (ctx.END() != null) axis = ctx.END().getText();
        else axis = ctx.CENTER().getText();
        crossAxisRow r = new crossAxisRow(axis);
        return r;

    }

    @Override
    public Object visitRow(dartParser.RowContext ctx) {
        rowproperties rp = (rowproperties) visit(ctx.rowProperties().get(0));
        row r = new row(rp);
        codeGeneration.GenerateRowWidget(r);
        return r;
    }

    @Override
    public Object visitRowProperties(dartParser.RowPropertiesContext ctx) {
        rowProperty RP = (rowProperty) visit(ctx.rowproperty().get(0));
        rowChildren RC = (rowChildren) visitRowChildren((dartParser.RowChildrenContext) ctx.children());
        rowproperties prop = new rowproperties(RC);

        if (RP != null) {
            for (int i = 0; i < ctx.rowproperty().size(); i++) {
                RP = (rowProperty) visit(ctx.rowproperty().get(i));
                prop.addprop(RP);
            }
        }
        return prop;
    }

    @Override
    public Object visitRowChildren(dartParser.RowChildrenContext ctx) {
        rowChildren widgets = new rowChildren();
        for (int i = 0; i < ctx.widgets().size(); i++) {
            widgets.addChild((widget) visit(ctx.widgets(i)));
        }
        return widgets;
    }

    @Override
    public Object visitColumnl(dartParser.ColumnlContext ctx) {
//        this.helper++;
        columnProperties rp = (columnProperties) visit(ctx.column().columnProperties().get(0));
        column r = new column(rp);
//        if(this.helper == 1){
//            codeGeneration.GenerateColumnWidget(r);
//        }
        codeGeneration.GenerateColumnWidget(r);
        return r;
    }

    @Override
    public Object visitColumnProperties(dartParser.ColumnPropertiesContext ctx) {
        columnProperty RP;
        columnChildren CC = (columnChildren) visitColumnChildren((dartParser.ColumnChildrenContext) ctx.childrenc());
        columnProperties prop = new columnProperties(CC);
        for (int i = 0; i < ctx.columnproperty().size(); i++) {
            RP = (columnProperty) visit(ctx.columnproperty().get(i));
            prop.addprop(RP);
        }
        return prop;
    }

    @Override
    public Object visitColumnChildren(dartParser.ColumnChildrenContext ctx) {
        columnChildren widgets = new columnChildren();
        for (int i = 0; i < ctx.widgets().size(); i++) {
            widgets.addChild((widget) visit(ctx.widgets(i)));
        }
        return widgets;
    }

    @Override
    public Object visitMainaxisColumn(dartParser.MainaxisColumnContext ctx) {
        String axis;
        if (ctx.START() != null) axis = ctx.START().getText();
        else if (ctx.END() != null) axis = ctx.END().getText();
        else axis = ctx.CENTER().getText();
        columnMainAxis r = new columnMainAxis(axis);
        return r;
    }

    @Override
    public Object visitCrossaxisColumn(dartParser.CrossaxisColumnContext ctx) {
        String axis;
        if (ctx.START() != null) axis = ctx.START().getText();
        else if (ctx.END() != null) axis = ctx.END().getText();
        else axis = ctx.CENTER().getText();
        columnCrossAxis r = new columnCrossAxis(axis);
        return r;

    }


    @Override
    public Object visitListviewl(dartParser.ListviewlContext ctx) {
        ListViewProperties ListProperties = (ListViewProperties) visit(ctx.listView().listViewProperties().get(0));
        ListView l = new ListView(ListProperties);
        return l;

    }

    @Override
    public Object visitListViewProperties(dartParser.ListViewPropertiesContext ctx) {
        ListViewChildren children = new ListViewChildren();
        ListViewScrolling scrolling = new ListViewScrolling();
        ListViewProperties lp = new ListViewProperties();
        if (ctx.scrollDirection() != null) {
            scrolling = (ListViewScrolling) visitListScrolling((dartParser.ListScrollingContext) ctx.scrollDirection());
        }
        if (ctx.childrenlist() != null) {
            children = (ListViewChildren) visitListChildren((dartParser.ListChildrenContext) ctx.childrenlist());
        }
        lp = new ListViewProperties(children, scrolling);
        return lp;
    }

    @Override
    public Object visitListChildren(dartParser.ListChildrenContext ctx) {
        ListViewChildren widgets = new ListViewChildren();
        for (int i = 0; i < ctx.widgets().size(); i++) {
            widgets.addChild((widget) visit(ctx.widgets(i)));
        }
        return widgets;
    }

    @Override
    public Object visitListScrolling(dartParser.ListScrollingContext ctx) {
        String axis;
        if (ctx.HORIZONTAL() != null) axis = ctx.HORIZONTAL().getText();
        else axis = ctx.VERTICAL().getText();
        ListViewScrolling r = new ListViewScrolling(axis);
        return r;
    }

    @Override
    public Object visitWidgetclass(dartParser.WidgetclassContext ctx) {
        sympolTable.enterScope();
        String Name = ctx.IDENTIFIER().getText();
        String Type = ctx.TYPEWIDGET().getText();
        classConstructor cc = (classConstructor) visit(ctx.classConstructor());
        WidgetClass WC = new WidgetClass(Name, Type, cc);

        Map<String , List<String>> m1 = new HashMap<>();
        m1.put(WC.name , new ArrayList<String>());
        scopes.add(m1);
        for (int i = 0; i < ctx.line().size(); i++) {
            WC.addline((line) visit(ctx.line(i)));

            line dec = (line) visit(ctx.line(i));

//            if(dec instanceof function){
//                (function) dec.scaffold.
//                System.out.println("FFFFFFFFFunction xxxxxxxxxxx "+((function) dec).name);
//            }

            if(dec instanceof assignment){
                for(int k=0 ; k<scopes.size() ; k++){
                    if(scopes.get(k).keySet().toString().equals("["+WC.name+"]")){
                        if(!checkIfVariableExists(((assignment) dec).ID , scopes.get(k).get(WC.name))){
                            System.out.println("Exception : Variable "+((assignment) dec).ID+" is not declared in class "+WC.name);
                        }
                    }
                }
            }

            if(dec instanceof DeclerationVarINT){
                if(!checkIfVariableExists(((DeclerationVarINT) dec).ID , m1.get(WC.name))){
                    m1.get(WC.name).add(((DeclerationVarINT) dec).ID);
                }
                else{
                    System.out.println("Exception : Variable "+((DeclerationVarINT) dec).ID+" is already defined in class "+WC.name);
                }
            }
            else if(dec instanceof DeclerationVarDouble){
                if(!checkIfVariableExists(((DeclerationVarDouble) dec).ID , m1.get(WC.name))){
                    m1.get(WC.name).add(((DeclerationVarDouble) dec).ID);
                }
                else{
                    System.out.println("Exception : Variable "+((DeclerationVarDouble) dec).ID+" is already defined in class "+WC.name);
                }
            }
            else if(dec instanceof DeclerationVarString){
                if(!checkIfVariableExists(((DeclerationVarString) dec).ID , m1.get(WC.name))){
                    m1.get(WC.name).add(((DeclerationVarString) dec).ID);
                }
                else{
                    System.out.println("Exception : Variable "+((DeclerationVarString) dec).ID+" is already defined in class "+WC.name);
                }
            }
            else if(dec instanceof DeclerationVarBoolean){
                if(!checkIfVariableExists(((DeclerationVarBoolean) dec).ID , m1.get(WC.name))){
                    m1.get(WC.name).add(((DeclerationVarBoolean) dec).ID);
                }
                else{
                    System.out.println("Exception : Variable "+((DeclerationVarBoolean) dec).ID+" is already defined in class "+WC.name);
                }
            }
        }
        Map<String, Object> m = new HashMap<>();
        m.put("Class", WC);
        sympolTable.getMap().add(m);
        codeGeneration.generateHtmlCode(WC);
        return WC;
    }
    @Override
    public Object visitFlutterProgram(dartParser.FlutterProgramContext ctx) {
        WidgetClass sc;
        String home = ctx.IDENTIFIER().getText();
        flutterProgramm fG = new flutterProgramm(home);
        Map<String, Object> m = new HashMap<>();
        m.put("HomeName", home);
        sympolTable.getMap().add(m);
        for (int i = 0; i < ctx.widgetclass().size(); i++) {
            sc = (WidgetClass) visit((ParseTree) ctx.widgetclass().get(i));
            fG.addWidget(sc);
        }
        Map<String , List<String>> map = new HashMap<>();
        map.put("Main" , new ArrayList<String>());
        scopes.add(map);
        for (int i = 0; i < ctx.line().size(); i++) {
            fG.addline((line) visit(ctx.line(i)));

            line l1 = (line) visit(ctx.line(i));

            if(l1 instanceof assignment){
                for(int k=0 ; k<scopes.size() ; k++){
                    if(scopes.get(k).keySet().toString().equals("[Main]")){
                        if(!checkIfVariableExists(((assignment) l1).ID , scopes.get(k).get("Main"))){
                            System.out.println("Exception : Variable "+((assignment) l1).ID+" is not declared in main function");
                        }
                    }
                }
            }

            if(l1 instanceof DeclerationVarINT){
                if(!checkIfVariableExists(((DeclerationVarINT) l1).ID , map.get("Main"))){
                    map.get("Main").add(((DeclerationVarINT) l1).ID);
                }
                else{
                    System.out.println("Exception : Variable "+((DeclerationVarINT) l1).ID+" is already defined in main function");
                }
            }
            else if(l1 instanceof DeclerationVarDouble){
                if(!checkIfVariableExists(((DeclerationVarDouble) l1).ID , map.get("Main"))){
                    map.get("Main").add(((DeclerationVarDouble) l1).ID);
                }
                else{
                    System.out.println("Exception : Variable "+((DeclerationVarDouble) l1).ID+" is already defined in main function");
                }
            }
            else if(l1 instanceof DeclerationVarString){
                if(!checkIfVariableExists(((DeclerationVarString) l1).ID , map.get("Main"))){
                    map.get("Main").add(((DeclerationVarString) l1).ID);
                }
                else{
                    System.out.println("Exception : Variable "+((DeclerationVarString) l1).ID+" is already defined in main function");
                }
            }
            else if(l1 instanceof DeclerationVarBoolean){
                if(!checkIfVariableExists(((DeclerationVarBoolean) l1).ID , map.get("Main"))){
                    map.get("Main").add(((DeclerationVarBoolean) l1).ID);
                }
                else{
                    System.out.println("Exception : Variable "+((DeclerationVarBoolean) l1).ID+" is already defined in main function");
                }
            }
        }
        Semantic_Error semantic = new Semantic_Error(sympolTable.getInstance());
        semantic.check();
        return fG;
    }

    @Override
    public Object visitScaffold(dartParser.ScaffoldContext ctx) {
        widget w = (widget) visit(ctx.widgets());
        Scaffold sc = new Scaffold(w);
        return sc;
    }

    @Override
    public Object visitFunction(dartParser.FunctionContext ctx) {

        String type = ctx.datatypes().getText();
        String name = ctx.IDENTIFIER().get(0).toString();
        function f = new function();

        if (ctx.scaffold() == null) {
            f = new function(type, name);
        } else f = new function(type, name, (Scaffold) visit(ctx.scaffold()));

        for (dartParser.ParametersFUNCTIONContext expr : ctx.parametersFUNCTION()) {
            f.AddParameters((parameterFunc) visit(expr));
        }
        for (int i = 0; i < ctx.line().size(); i++) {
            f.Addline((line) visit(ctx.line(i)));
        }
        Map<String, Object> m = new HashMap<>();
        m.put("Function", f);
        sympolTable.getMap().add(m);

        return f;
    }

    @Override
    public Object visitFunctionVoid(dartParser.FunctionVoidContext ctx) {
        return super.visitFunctionVoid(ctx);
    }

    @Override
    public Object visitParametersConstructor(dartParser.ParametersConstructorContext ctx) {

        return super.visitParametersConstructor(ctx);
    }

    @Override
    public Object visitConstructorBody(dartParser.ConstructorBodyContext ctx) {
        Constauctorbody constauctorbody = new Constauctorbody();
        for (int i = 0; i < ctx.assignment().size(); i++) {
            constauctorbody.addAssignment((assignment) visit(ctx.assignment(i)));
        }
        return constauctorbody;
    }

    @Override
    public Object visitClassConstructor(dartParser.ClassConstructorContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Constauctorbody constauctorbody = (Constauctorbody) visit(ctx.constructorBody());

        classConstructor cc = new classConstructor(name, constauctorbody);
        Map<String, Object> m = new HashMap<>();
        m.put("ClassConstructorName", cc);
        sympolTable.getMap().add(m);
        for (dartParser.ParametersFUNCTIONContext expr : ctx.parametersFUNCTION()) {
            cc.addParam((parameterFunc) visit(expr));
        }
        return cc;
    }

    @Override
    public Object visitTextButtonExpr(dartParser.TextButtonExprContext ctx) {
        Childexpr c = (Childexpr) visit(ctx.childExpr());
        OnPressedexpr onPressedexpr = (OnPressedexpr) visit(ctx.onPressedExpr());
        TextButtonexpr textButtonexpr = new TextButtonexpr(onPressedexpr, c);
        codeGeneration.GenerateButton(textButtonexpr);
        return textButtonexpr;
    }

    @Override
    public Object visitChildExpr(dartParser.ChildExprContext ctx) {
        StringLiteralExpr s = (StringLiteralExpr) visit(ctx.textExpr().stringLiteralExpr());
        Childexpr childexpr = new Childexpr(s);
        return childexpr;
    }

    @Override
    public Object visitStringLiteralExpr(dartParser.StringLiteralExprContext ctx) {
        String s = ctx.SingleLineString().toString();
        StringLiteralExpr Sl;
//        if (ctx.IDENTIFIER()!=null){
//            String id = ctx.IDENTIFIER().toString() ;
//            Sl=new StringLiteralExpr(s,id);
//        }
         Sl = new StringLiteralExpr(s);
        return Sl;
    }

    @Override
    public Object visitOnPressedExpr(dartParser.OnPressedExprContext ctx) {
        NavigatorPushNode navigatorPushNode = (NavigatorPushNode) visit(ctx.functionExpr().blockExpr().navigatorPushExpr());
        OnPressedexpr onPressedexpr = new OnPressedexpr(navigatorPushNode);
        return onPressedexpr;
    }

    @Override
    public Object visitNavigatorPushExpr(dartParser.NavigatorPushExprContext ctx) {
        MaterialPageRouteNode materialPageRouteNode = (MaterialPageRouteNode) visit(ctx.materialPageRouteExpr());
        NavigatorPushNode navigatorPushNode = new NavigatorPushNode(materialPageRouteNode);
        constructorwithoutbody c = materialPageRouteNode.pageInstanceNode.constructorwithoutbody;
        Map<String, Object> m = new HashMap<>();
        m.put("navigatorCallConstructor", c);
        sympolTable.getMap().add(m);
        return navigatorPushNode;
    }

    @Override
    public Object visitMaterialPageRouteExpr(dartParser.MaterialPageRouteExprContext ctx) {
        PageInstanceNode pageInstanceNode = (PageInstanceNode) visit(ctx.pageBuilderExpr().pageInstanceExpr());
        MaterialPageRouteNode materialPageRouteNode = new MaterialPageRouteNode(pageInstanceNode);
        return materialPageRouteNode;
    }

    @Override
    public Object visitPageInstanceExpr(dartParser.PageInstanceExprContext ctx) {
//        String name = String.valueOf(ctx.constructor().className());

        constructorwithoutbody c = (constructorwithoutbody) visit(ctx.constructor());
        PageInstanceNode pageInstanceNode = new PageInstanceNode(c);
//        if (ctx.IDENTIFIER() != null) {
//            String data = ctx.IDENTIFIER().getText();
//            pageInstanceNode = new PageInstanceNode(name, data);
//        } else pageInstanceNode = new PageInstanceNode(name);
        return pageInstanceNode;
    }

    @Override
    public Object visitCreateObject(dartParser.CreateObjectContext ctx) {
        String objectName = ctx.IDENTIFIER().getText();
        String classType = ctx.getChild(0).getText();
        constructorwithoutbody constructor = (constructorwithoutbody) visit(ctx.constructor());
        CreateObject c = new CreateObject(classType, objectName, constructor);
        Map<String, Object> m = new HashMap<>();
        m.put("CreateObject", c);
        sympolTable.getMap().add(m);
        return c;
    }

    @Override
    public Object visitConstructor(dartParser.ConstructorContext ctx) {
        String name = ctx.className().getText();
        constructorwithoutbody cc = new constructorwithoutbody(name);
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            cc.addparam(String.valueOf(ctx.IDENTIFIER(i)));
        }
        return cc;
    }

    @Override
    public Object visitTextExpr(dartParser.TextExprContext ctx) {
        TextWidget t;

        TextStyle ts = null;
        String textAlign = null;
        String text = ctx.getChild(2).getText();

        if(ctx.textAlign() != null){
            textAlign = (String) visit(ctx.textAlign());
        }
        if(ctx.textStyle() != null){
            ts = (TextStyle) visit(ctx.textStyle());
        }
        t = new TextWidget(text,textAlign,ts);
        codeGeneration.GenerateTextWidget(t);
        return t;
    }

    @Override
    public String visitTextAlign(dartParser.TextAlignContext ctx) {
        String textAlign = (String) visit(ctx.alignPos());
        return textAlign;
    }

    @Override
    public String visitAlignPos(dartParser.AlignPosContext ctx) {
        String alignPos = ctx.getText();
        return alignPos;
    }

    @Override
    public Object visitTextStyle(dartParser.TextStyleContext ctx) {
        if(ctx.textColor() != null){
            String color = (String) visit(ctx.textColor());
            if(ctx.textSize() != null){
                double fontSize = Double.parseDouble((String) visit(ctx.textSize()));
                return new TextStyle(color,fontSize);
            }
            return new TextStyle(color);
        }
        if(ctx.textSize() != null){
            double fontSize = Double.parseDouble((String) visit(ctx.textSize()));
            return new TextStyle(fontSize);
        }
        return null;
    }

    @Override
    public String visitTextColor(dartParser.TextColorContext ctx) {
        String color = ctx.IDENTIFIER().getText();
        return color;
    }

    @Override
    public String visitTextSize(dartParser.TextSizeContext ctx) {
        String fontSize = ctx.NUMBER().getText();
        return fontSize;
    }


}

