package app;
import SemanticCheck.Semantic_Error;
import SemanticCheck.syntaxError;
import SympolTable.sympolTable;
import Visitor.TestVisitor;
import antlr.dartLexer;
import antlr.dartParser;
import codegeneration.CodeGeneration;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import program.flutterProgramm;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        syntaxError syntaxError = new syntaxError();
        String source = "files/register_test.txt";
        CharStream charStream = fromFileName(source);
        dartLexer lexer = new dartLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(syntaxError.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        dartParser parser = new dartParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(syntaxError.INSTANCE);
        ParseTree ast = parser.flutterProgram();
        TestVisitor visitor = new TestVisitor();
        flutterProgramm program = (flutterProgramm) visitor.visit(ast);

        System.out.println("\n\n\n"+"******* AST *******"+"\n");
//        System.out.println(program);
        System.out.println("**************************");

        //System.out.println(semantic_error.hasSemanticError);
       // if (!semantic_error.hasSemanticError)
       //     codeGeneration.generateHtmlCode();
//        sympolTable.print();


//        List<Map<String , List<String>>> s = visitor.getScopes();
//        for(int i=0 ; i<s.size() ; i++){
//            System.out.println(s.get(i));
//        }
    }
}
