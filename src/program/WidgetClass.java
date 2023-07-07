package program;

import java.util.ArrayList;
import java.util.List;

public class WidgetClass {
    public String name ;
    public String Type ;

    public ArrayList<line> l = new ArrayList<>() ;
    public classConstructor cc;

    public WidgetClass() {
        l = new ArrayList<>();
    }

    public WidgetClass(String name, String type,classConstructor c) {
        this.name = name;
        Type = type;
        this.cc = c;
    }
    public void addline(line ll ){
        l.add(ll);
    }

    @Override
    public String toString() {
        return "\nWidgetClass{" +
                "\nname='" + name + '\'' +
                ", \nType='" + Type + '\'' +
                ", \nlines=" + l +
                ", \nconstructor=" + cc +
                "\n}";
    }
}

