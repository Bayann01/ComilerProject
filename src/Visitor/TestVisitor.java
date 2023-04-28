package Visitor;


import SympolTable.sympolTable;
import antlr.dartParser;
import antlr.dartParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import program.*;

import java.sql.SQLOutput;

public class TestVisitor extends dartParserBaseVisitor {
    sympolTable sympolTable = new sympolTable();

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
        DeclerationVarINT integer = new DeclerationVarINT(id, type, value);
        sympolTable.getDecls().add(integer);
        // this.sympolTable.print();
        return integer;
    }

    @Override
    public decleration visitDecldouble(dartParser.DecldoubleContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String type = ctx.DOUBLETYPE().getText();
        int value = Integer.parseInt(ctx.NUMBER().toString());
        DeclerationVarDouble d = new DeclerationVarDouble(id, type, value);
        return d;
    }

    @Override
    public decleration visitDeclSTRING(dartParser.DeclSTRINGContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String type = ctx.STRINGTYPE().getText();
        String value = ctx.SingleLineString().toString();
        DeclerationVarString s = new DeclerationVarString(id, type, value);
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
        String type = ctx.BOOLTYPE().getText();
        boolean value = Boolean.parseBoolean(ctx.BOOL().toString());
        DeclerationVarBoolean b = new DeclerationVarBoolean(id, type, value);
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
        return a;
    }

    @Override
    public exprission visitFunctionCall(dartParser.FunctionCallContext ctx) {
        functioncall c = new functioncall(ctx.IDENTIFIER().getText());
        for (dartParser.ExprissionContext expression : ctx.exprission()) {
            c.addparameter((exprission) visit(expression));
        }
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
    public widget visitTextField(dartParser.TextFieldContext ctx) {
        textField t = new textField();
        for (int i = 0; i < ctx.textFieldProperties().size(); i++) {
            t.addtextFieldProperties((textFieldProperties) visit(ctx.textFieldProperties(i)));
        }
        return t;
    }

    @Override
    public textFieldProperties visitTextFieldControllerPropertyl(dartParser.TextFieldControllerPropertylContext ctx) {
        String e = ctx.textFieldControllerProperty().IDENTIFIER().getText();
        textFieldControllerProperty t = new textFieldControllerProperty(e);
        return t;
    }


    @Override
    public widget visitImage(dartParser.ImageContext ctx) {
        image t = new image();
        for (int i = 0; i < ctx.imageProperties().size(); i++) {
            t.addimageproperty((imageproperties) visit(ctx.imageProperties(i)));
        }
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
        if(ctx.child() !=null)
            c = (widget) visit(ctx.child());
        else c = null;
        container t = new container(c);
        for (int i = 0; i < ctx.containerproperties().size(); i++) {
            t.addcontainerproperties((containerproperties) visit(ctx.containerproperties(i)));
        }
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
    public containerproperties visitColorl(dartParser.ColorlContext ctx) {
        String c = ctx.color().IDENTIFIER().toString();
        color i = new color(c);
        return i;
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
        columnProperties rp = (columnProperties) visit(ctx.column().columnProperties().get(0));
        column r = new column(rp);
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
        ListViewChildren children =new ListViewChildren();
        ListViewScrolling scrolling = new ListViewScrolling();
        ListViewProperties lp = new ListViewProperties();
        if (ctx.scrollDirection() != null) {
            scrolling = (ListViewScrolling) visitListScrolling((dartParser.ListScrollingContext) ctx.scrollDirection());
        }
        if (ctx.childrenlist() != null) {
            children = (ListViewChildren) visitListChildren((dartParser.ListChildrenContext) ctx.childrenlist());
        }
         lp = new ListViewProperties(children,scrolling);
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
    public Object visitFlutterProgram(dartParser.FlutterProgramContext ctx) {
        Scaffold sc = (Scaffold) visit(ctx.scaffold());
        flutterProgramm fG = new flutterProgramm(sc);
        return fG;
    }

    @Override
    public Object visitScaffold(dartParser.ScaffoldContext ctx) {
        widget w = (widget) visit(ctx.widgets());
        Scaffold sc = new Scaffold(w);
        return sc;
    }
}

