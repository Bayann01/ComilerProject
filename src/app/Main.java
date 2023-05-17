package app;

import SemanticCheck.Semantic_Error;
import SympolTable.sympolTable;
import Visitor.TestVisitor;
import antlr.dartLexer;
import antlr.dartParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import program.flutterProgramm;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {
    public static void main(String[] args) throws IOException {
        String source = "files/test6.txt";
        CharStream charStream = fromFileName(source);
        dartLexer lexer = new dartLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        dartParser parser = new dartParser(tokens);
        ParseTree ast = parser.flutterProgram();
        TestVisitor visitor = new TestVisitor();
        flutterProgramm program = (flutterProgramm) visitor.visit(ast);
       // System.out.println(program);
        System.out.println("___________________________");
       // sympolTable.print();
    }
}
