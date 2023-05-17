package program;

import java.util.ArrayList;
import java.util.List;

public class WidgetClass {
    public String name ;
    String Type ;
    ArrayList<line> l = new ArrayList<>() ;

    public WidgetClass() {
        l = new ArrayList<>();
    }

    public WidgetClass(String name, String type) {
        this.name = name;
        Type = type;
    }
    public void addline(line ll ){
        l.add(ll);
    }

    @Override
    public String toString() {
        return "\nMainClass{" +
                "\nname='" + name + '\'' +
                ", \nType='" + Type + '\'' +
                ", \nlines=" + l +
                '}';
    }
}

