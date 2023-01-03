package program;

public class addproc extends  exprission{
    exprission left ;
    exprission right;
    public addproc(exprission left,exprission right) {
        this.left = left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString() +"+"+right.toString();
    }
}
