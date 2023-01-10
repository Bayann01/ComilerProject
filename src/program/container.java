package program;

import java.util.ArrayList;
import java.util.List;

public class container extends widget{
    child c;
    List<containerproperties> cp;

    public container(child c) {
        this.c = c;
        cp =new ArrayList<>();
    }
    public void addcontainerproperties (containerproperties c)
    {
        cp.add(c);
    }

}
