package program;

import java.util.ArrayList;

public class row extends widget{
    rowproperties rowproperties;

    public program.rowproperties getRowproperties() {
        return rowproperties;
    }

    public row(program.rowproperties rowproperties) {
        this.rowproperties = rowproperties;
    }
public row(){

}

    @Override
    public String toString() {
        return "\nrow{" +
                "\nrowproperties=" + rowproperties +
                "\n}";
    }

    public void setRowproperties(program.rowproperties rowproperties) {
        this.rowproperties = rowproperties;
    }
}
