package program;

public class columnMainAxis extends columnProperty{
    String Axis ;

    public columnMainAxis(String axis) {
        Axis = axis;
    }

    @Override
    public String toString() {
        return "columnMainAxis{" +
                "Axis='" + Axis + '\'' +
                '}';
    }
}
