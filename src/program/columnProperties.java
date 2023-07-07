package program;

import java.util.ArrayList;

public class columnProperties extends column{
    public columnChildren columnChildren;
    ArrayList<columnProperty> columnProperty;

    public columnProperties(program.columnChildren columnChildren) {
        this.columnChildren = columnChildren;
        columnProperty =new ArrayList<>();

    }

    public columnProperties() {
        columnProperty =new ArrayList<>();
    }

    public void addprop(columnProperty RP) {
        columnProperty.add(RP);
    }

    @Override
    public String toString() {
        return "columnProperties{" +
                "columnChildren=" + columnChildren +
                ", columnProperty=" + columnProperty +
                '}';
    }



}
