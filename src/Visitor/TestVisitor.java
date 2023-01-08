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
    public Object visitLine(dartParser.LineContext ctx) {
        statmnet dec = (statmnet) visit(ctx.statment());
        line line = new line();
        line.addline(dec);
        return line;
    }

    @Override
    public Object visitProg(dartParser.ProgContext ctx) {
        prog p = new prog();
        for (int i = 0; i < ctx.line().size(); i++) {
            line lines = (line) visit(ctx.line().get(i));
            p.addChild(lines);
        }
        return p;
    }

    public line visitIfBlock(dartParser.IfBlockContext ctx) {
        exprission exp = (exprission) visit(ctx.exprission().getChild(0));
        ifBlock e = new ifBlock(exp);
        for (int i = 0; i < ctx.block().line().size(); i++) {
            line lines = (line) visit(ctx.block().line().get(i));
            e.addline((statmnet) lines);
        }
        return e;
    }

    @Override
    public exprission visitExprminusexpr(dartParser.ExprminusexprContext ctx) {
        exprission expr1=(exprission) visit(  ctx.exprission().get(0));
        exprission expr2=(exprission) visit( ctx.exprission().get(1));
        minusproc e= new minusproc(expr1,expr2);
        return e;
    }

    @Override
    public exprission visitExpmulexpr(dartParser.ExpmulexprContext ctx) {
        exprission expr1=(exprission) visit(  ctx.exprission().get(0));
        exprission expr2=(exprission) visit( ctx.exprission().get(1));
        multiproc e= new multiproc(expr1,expr2);
        return e;
    }

    @Override
    public exprission visitExprboolexpr(dartParser.ExprboolexprContext ctx) {
        exprission expr1=(exprission) visit(  ctx.exprission().get(0));
        exprission expr2=(exprission) visit( ctx.exprission().get(1));
        booloperation e= new booloperation(expr1,expr2);
        return e;}

//    @Override
//    public Object visitBlock(dartParser.BlockContext ctx) {
//        block e = new block();
//        for (int i = 0; i < ctx.; i++) {
//            line lines = (line) visit(ctx.block().line().get(i));
//            e.addline((statmnet) lines);
//        }
//        return super.visitBlock(ctx);
//    }

    @Override
    public Object visitStatment(dartParser.StatmentContext ctx) {
        return super.visitStatment(ctx);
    }
}

