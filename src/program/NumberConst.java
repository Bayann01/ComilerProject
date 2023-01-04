package program;

public class NumberConst extends Constant{

    double num;

    public NumberConst(double num){
        this.num = num;
    }

    @Override
    public String toString() {
        return new Double(num).toString();
    }

}
