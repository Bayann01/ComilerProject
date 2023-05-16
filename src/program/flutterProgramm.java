package program;

import java.util.ArrayList;
import java.util.List;

public class flutterProgramm {
    List<WidgetClass> widget;
    String home ;

    public flutterProgramm() {
    }

    public flutterProgramm(String ho) {
        this.widget=new ArrayList<>();
        this.home = ho;

    }
    public void addWidget(WidgetClass widgetClass){
        widget.add(widgetClass);
    }

    @Override
    public String toString() {
        return "flutterProgramm{" +
                "widget=" + widget +
                ", home='" + home + '\'' +
                '}';
    }
}
