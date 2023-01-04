package program;

public class StringConst extends Constant{

    String value;

    public StringConst(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
