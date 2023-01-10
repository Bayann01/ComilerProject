package program;

public class flutterProgramm {
    Scaffold scaffold;

    public flutterProgramm() {
    }

    @Override
    public String toString() {
        return "flutterProgramm{" +
                "scaffold=" + scaffold +
                '}';
    }

    public flutterProgramm(Scaffold scaffold) {
        this.scaffold = scaffold;
    }
}
