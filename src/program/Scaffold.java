package program;

public class Scaffold extends flutterProgramm{
    widget widget ;
    public Scaffold(program.widget widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "Scaffold{" +
                "widget=" + widget +
                '}';
    }
}
