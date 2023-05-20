package SemanticCheck;


import SympolTable.sympolTable;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.IOException;
public class syntaxError extends BaseErrorListener {
    sympolTable symbolTable = sympolTable.getInstance();
    public static syntaxError INSTANCE = new syntaxError();
    public boolean hasError = false;
    public static boolean REPORT_SYNTAX_ERRORS = true;

    public syntaxError() {
    }

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if (REPORT_SYNTAX_ERRORS) {
            String sourceName = recognizer.getInputStream().getSourceName();
            if (!sourceName.isEmpty()) {
                this.symbolTable.hasSyntaxError = true;
            }
            try {
                this.symbolTable.write("Error in line " + line + ":" + charPositionInLine + " " + msg);
            } catch (IOException var9) {
                throw new RuntimeException(var9);
            }
        }
    }
}
