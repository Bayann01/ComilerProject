package program;

public class heightcontaineer extends containerproperties{
    double h;

    public heightcontaineer(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "heightcontainer{" +
                "h=" + h +
                '}';
    }
}
