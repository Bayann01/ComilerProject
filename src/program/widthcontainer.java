package program;

public class widthcontainer extends containerproperties {
    double w;

    public widthcontainer(double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "\nwidthcontainer{" +
                "\nw=" + w +
                "\n}";
    }
}
