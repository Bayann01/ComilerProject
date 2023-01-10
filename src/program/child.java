package program;

public class child {
    widget w;

    public child(widget w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "child{" +
                "w=" + w +
                '}';
    }
}
