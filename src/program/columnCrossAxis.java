package program;

public class columnCrossAxis extends columnProperty{
    String Axis ;

    public columnCrossAxis(String axis) {
        Axis = axis;
    }

    @Override
    public String toString() {
        return "columnCrossAxis{" +
                "Axis='" + Axis + '\'' +
                '}';
    }
}
