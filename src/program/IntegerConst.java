package program;

public class IntegerConst extends Constant{

    int num;

    public IntegerConst(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "IntegerConst{" +
                "num=" + num +
                '}';
    }
}
