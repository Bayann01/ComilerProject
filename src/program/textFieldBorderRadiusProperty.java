package program;

public class textFieldBorderRadiusProperty extends textFieldProperties{

    public double borderRadius ;

    public textFieldBorderRadiusProperty(double borderRadius) {
        this.borderRadius = borderRadius;
    }

    @Override
    public String toString() {
        return "\ntextFieldBorderRadiusProperty{" +
                "\nborderRadius='" + borderRadius + '\'' +
                "\n}";
    }
}
