package program;
public class divideproc extends exprission{
    exprission left ;
    exprission right;
    public divideproc(exprission left,exprission right) {
        this.left = left;
        this.right=right;
    }
    @Override
    public String toString() {
        return left.toString() +"/"+right.toString();
    }
}
