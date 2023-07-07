package program;

public class assignment extends statmnet {
    public String ID;

    public exprission value;
    public assignment(String ID, exprission value) {
        this.ID = ID;

        this.value = value;
    }

    @Override
    public String toString() {
        return "\nassignment{" +
                "\nID='" + ID + '\'' +
                ", \nvalue='" + value + '\'' +
                "\n}";
    }
}

