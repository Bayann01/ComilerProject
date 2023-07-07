package program;

public class heightcontaineer extends containerproperties{
    public double h;

    public heightcontaineer(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "\nheightcontainer{" +
                "\nh=" + h +
                "\n}";
    }
}
