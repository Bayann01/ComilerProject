package program;

import antlr.dartParser;

public class assignment extends statmnet {
    public String ID;

    public String value;


    public assignment(String ID, String value) {
        this.ID = ID;

        this.value = value;
    }

    @Override
    public String toString() {
        return "assignment{" +
                "ID='" + ID + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

