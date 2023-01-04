package program;

public class parameterFunc {
String type;
String ID ;

    public parameterFunc(String type, String ID) {
        this.type = type;
        this.ID = ID;
    }
    @Override
    public String toString() {
        return "parameterFunc{" +
                "type='" + type + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
