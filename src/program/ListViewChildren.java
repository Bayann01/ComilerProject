package program;

import java.util.ArrayList;

public class ListViewChildren extends ListViewProperties{

    ArrayList<widget> W ;

    public ListViewChildren() {
        W = new ArrayList<>();
    }
    public void addChild(widget w) {
        W.add(w);
    }

    @Override
    public String toString() {
        return "\nListViewChildren{" +
                "\nW=" + W +
                "\n}";
    }
}
