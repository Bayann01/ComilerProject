package program;

import java.util.ArrayList;
import java.util.List;

public class container extends widget {
    public widget c;
    public List<containerproperties> containerproperties;
    public static int  id ;

    public container(widget c) {
        this.c = c;
        containerproperties = new ArrayList<>();

    }

    public container() {
        containerproperties = new ArrayList<>();
    }

    public void addcontainerproperties(containerproperties c) {
        containerproperties.add(c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\ncontainer{");
        if (c != null) {
            sb.append("\nchild=").append(c);
        }
        if(containerproperties.size() >0 )
        sb.append(",\ncontainer properties=").append(containerproperties);
        sb.append("\n}");
        return sb.toString();
    }
}
