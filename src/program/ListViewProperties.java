package program;

public class ListViewProperties extends ListView {
    ListViewChildren children;
    ListViewScrolling scrolling;

    public ListViewProperties( ListViewChildren children) {

        this.children = children;
    }

    public ListViewProperties( ListViewScrolling scrolling) {
        this.scrolling = scrolling;
    }

    public ListViewProperties(ListViewChildren children, ListViewScrolling scrolling) {
        this.children = children;
        this.scrolling = scrolling;
    }
    public  ListViewProperties(){}

    @Override
    public String toString() {
        return "\nListViewProperties{" +
                "\nchildren=" + children +
                ",\nscrolling=" + scrolling +
                "\n}";
    }
}
