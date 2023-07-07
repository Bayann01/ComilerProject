package program;

import java.util.ArrayList;
import java.util.List;

public class flutterProgramm {
    List<WidgetClass> widget;
    String home ;

    List<line> lines;

    public flutterProgramm() {
    }

    public flutterProgramm(String ho) {
        this.widget=new ArrayList<>();
        this.lines=new ArrayList<>();
        this.home = ho;

    }

    public void addWidget(WidgetClass widgetClass){
        widget.add(widgetClass);
    }
    public void addline(line l){
        lines.add(l);
    }


    @Override
    public String toString() {
        return "\nflutterProgramm{" +
                "\nwidget=" + widget +
                ", \nhome='" + home + '\'' +
                ", \nlines=" + lines +
                "\n}";
    }
}
