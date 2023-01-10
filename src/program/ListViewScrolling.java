package program;

public class ListViewScrolling extends ListViewProperties{
    String Axis ;

    public ListViewScrolling(String axis) {
        Axis = axis;
    }

    public ListViewScrolling() {

    }

    @Override
    public String toString() {
        return "\nListViewScrolling{" +
                "\nAxis='" + Axis + '\'' +
                "\n}";
    }
}
