package program;

public class minusproc extends  exprission{
    exprission left ;
    exprission right;

    public minusproc(exprission left,exprission right) {
        this.left = left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString() +"-"+right.toString();
    }
}
