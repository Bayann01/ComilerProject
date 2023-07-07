package program;

import java.util.ArrayList;
import java.util.List;

public class Constauctorbody {
    List<assignment> assignment ;

    public Constauctorbody() {
        this.assignment = new ArrayList<>();

    }
    public void  addAssignment(assignment a ){
        assignment.add(a);
    }

    @Override
    public String toString() {
        return "\nClassbody{" +
                "\nassignment=" + assignment +
                "\n}";
    }
}
