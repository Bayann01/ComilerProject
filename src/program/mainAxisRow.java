package program;

public class mainAxisRow extends  rowProperty{
    String Axis ;

    public mainAxisRow(String axis) {
        Axis = axis;
    }
    

    @Override
    public String toString() {
        return "mainAxisRow{" +
                "Axis='" + Axis + '\'' +
                '}';
    }
}
