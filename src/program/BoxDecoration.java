package program;

public class BoxDecoration extends containerproperties{
    public color c;
    public ContainerBorderRadius cb;

    public BoxDecoration(color c , ContainerBorderRadius cb){
        this.c = c;
        this.cb = cb;
    }

    @Override
    public String toString() {
        return "\nBoxDecoration{" +
                "\ncolor=" + c +
                ", borderRadius=" + cb +
                "\n}";
    }
}
