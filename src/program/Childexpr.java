package program;

public class Childexpr extends widget {
   public StringLiteralExpr S;

    public Childexpr(StringLiteralExpr  s) {

        this.S  = s;
    }

    @Override
    public String toString() {
        return "\nChildexpr{" +
                "\nSingleLineString='" + S + '\'' +
                "\n}";
    }
}
