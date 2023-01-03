package program;

public class multiproc extends  exprission{
    exprission left ;
    exprission right;

    public multiproc(exprission left,exprission right) {
        this.left = left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString() +"*"+right.toString();
    }
}
