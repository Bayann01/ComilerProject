package program;

import java.nio.file.Watchable;
import java.util.ArrayList;

public class rowChildren extends rowproperties {
    public ArrayList<widget> W ;

    public rowChildren() {
        W = new ArrayList<>();
    }
    public void addChild(widget w) {
        W.add(w);
    }

    @Override
    public String toString() {
        return "\nrowChildren{" +
                "\nwidget=" + W +
                "\n}";
    }
}
