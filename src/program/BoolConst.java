package program;

public class BoolConst extends Constant{
    boolean value;

    public BoolConst(boolean value){
        this.value = value;
    }

    @Override
    public String toString() {
        return new Boolean(value).toString();
    }

}
