package program;

public class booloperation extends  exprission{
    exprission left ;
    exprission right;

    public booloperation(exprission left,exprission right) {
        this.left = left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString() +' '+right.toString();
    }
}
