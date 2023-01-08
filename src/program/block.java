package program;

import java.util.ArrayList;

public class block {
    ArrayList<line> line;

    public block() {
        this.line = new ArrayList<>();
    }
    public  void addline(line l){
        this.line.add(l);
    }

    @Override
    public String toString() {
        return "block{" +
                "line=" + line +
                '}';
    }
}
