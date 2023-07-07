package program;

import java.util.ArrayList;

public class mainFunction extends prog {
    public ArrayList<exprission> exeprs;
    public ArrayList<line> lines;

    public mainFunction() {
        this.exeprs = new ArrayList<>();
        this.lines = new ArrayList<>();
    }

    public void addExpr(exprission ex) {
        this.exeprs.add(ex);
    }

    public void addLine(line li) {
        this.lines.add(li);
    }

    @Override
    public String toString() {
        return "main{" +
                "exeprs=" + exeprs +
                ", lines=" + lines +
                '}';
    }
}
