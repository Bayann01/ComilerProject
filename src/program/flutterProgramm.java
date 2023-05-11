package program;

public class flutterProgramm {
    WidgetClass scaffold;
    String home ;

    public flutterProgramm() {
    }

    public flutterProgramm(WidgetClass sc,String ho) {
        this.scaffold=sc;
        this.home = ho;

    }

    @Override
    public String toString() {
        return "flutterProgramm{" +
                "Class=" + scaffold +
                " , Home=" + home +
                '}';
    }


}
