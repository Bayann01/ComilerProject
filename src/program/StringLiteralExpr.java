package program;

public class StringLiteralExpr extends widget{
    public String h;

    public StringLiteralExpr(String h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "\nStringLiteralExpr{" +
                "\nSingleLineString='" + h + '\'' +
                "\n}";
    }
}
