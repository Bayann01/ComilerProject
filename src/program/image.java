package program;

import java.util.ArrayList;
import java.util.List;

public class image extends widget {
    public List<imageproperties> ip;

    public image() {
        ip = new ArrayList<>();
    }

    public void addimageproperty(imageproperties i) {
        ip.add(i);
    }

    public String generate() {

        return null;
    }

    @Override
    public String toString() {
        return "\nimage{" +
                "\nimage prpoperty=" + ip +
                "\n}";
    }
}
