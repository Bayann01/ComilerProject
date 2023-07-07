package program;

import java.util.ArrayList;

public class columnChildren extends columnProperties{
    public ArrayList<widget> W ;

    public columnChildren() {
        W = new ArrayList<>();
    }
    public void addChild(widget w) {
        W.add(w);
    }

    @Override
    public String toString() {
        return "\ncolumnChildren{" +
                "\nwidget=" + W +
                "\n}";
    }
}
