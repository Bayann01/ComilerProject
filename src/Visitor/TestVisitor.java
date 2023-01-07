package Visitor;


import antlr.dartParser;
import antlr.dartParserBaseVisitor;
import program.*;

public class TestVisitor extends dartParserBaseVisitor {
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

//    @Override
//    public Object visitConstatntt(dartParser.ConstatnttContext ctx) {
//
//        return super.visitConstatntt(ctx);
//    }

    @Override
    public decleration visitDeclINT(dartParser.DeclINTContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String type = ctx.INTTYPE().getText();
        int value = Integer.parseInt(ctx.INT().toString());
        DeclerationVarINT integer = new DeclerationVarINT(id, type, value);
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

    //   @Override
//    public decleration visitDeclVar(dartParser.DeclVarContext ctx) {
//        String id = ctx.IDENTIFIER().getText();
//        String type = ctx.VARTYPE().getText();
//        ctx.
//
//    }
    @Override
    public Object visitExpr(dartParser.ExprContext ctx) {
        return super.visitExpr(ctx);
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
        String value = ctx.exprission().getText();
        assignment a =new assignment(id,value);

        return a;
    }


}

