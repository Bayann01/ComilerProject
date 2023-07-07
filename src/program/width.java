package program;

public class width extends imageproperties{
    public double w;

    public width(double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "\nwidth{" +
                "\nw=" + w +
                "\n}";
    }
}
