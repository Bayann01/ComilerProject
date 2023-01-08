package program;

import java.util.ArrayList;

public class prog {
    public ArrayList<line> lines;
    public  mainFunction main ;

    public prog() {
        this.lines = new ArrayList<>();

    }

    public prog(mainFunction main) {
        this.main = main;
    }

    public void addChild(line l) {
        this.lines.add(l);
    }


    @Override
    public String toString() {
        return "prog{" +
                "lines=" + lines +
               ", main=" + main +
                '}';
    }

    //    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        for (line line : lines) {
//            builder.append(line);
//            builder.append('\n');
//        }
//        return builder.toString();
//    }

}
