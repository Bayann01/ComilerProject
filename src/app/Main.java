package app;

import Visitor.TestVisitor;
import antlr.dartLexer;
import antlr.dartParser;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import program.assignment;
import program.exprission;
import program.line;
import program.prog;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "files/test1.txt";
        CharStream charStream = fromFileName(source);
        dartLexer lexer = new dartLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        dartParser parser = new dartParser(tokens);
        dartParser.ProgContext ast = parser.prog();
        TestVisitor visitor = new TestVisitor();
        prog program = (prog) visitor.visit(ast);
        System.out.println(program);
    }
}
