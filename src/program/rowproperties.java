package program;

import java.util.ArrayList;

public class rowproperties extends row {
    rowChildren rowChildren;
    ArrayList<rowProperty> rowProperty;

    public rowproperties(program.rowChildren rowChildren) {
        this.rowChildren = rowChildren;
        rowProperty =new ArrayList<>();

    }

    public rowproperties() {
        rowProperty =new ArrayList<>();
    }

    public void addprop(rowProperty RP) {
        rowProperty.add(RP);
    }

    @Override
    public String toString() {
        return "\nrowproperties{" +
                "\nrowChildren=" + rowChildren +
                ", \nrowProperty=" + rowProperty +
                "\n}";
    }

    public program.rowChildren getRowChildren() {
        return rowChildren;
    }

    public void setRowChildren(program.rowChildren rowChildren) {
        this.rowChildren = rowChildren;
    }


}
