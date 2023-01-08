package program;

import java.util.ArrayList;

public class prog {
    ArrayList<line> lines;

    public prog() {
        this.lines = new ArrayList<>();

    }

  public   void addChild(line line) {
        this.lines.add(line);
    }

    @Override
    public String toString() {
        return "prog{" +
                "lines=" + lines +
                '}';
    }

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        for (line line : lines) {
//            builder.append(line);
//            builder.append('\n');
//        }
//        return builder.toString();
//    }

}
