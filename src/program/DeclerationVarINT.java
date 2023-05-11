package program;

public class DeclerationVarINT extends decleration {
    public String ID ;
    public String type;
    public int value ;


    public DeclerationVarINT(String ID, String type, int value) {
        this.ID = ID;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nDeclerationVarINT{" +
                "\nname='" + ID + '\'' +
                "\n, \ntype='" + type + '\'' +
                "\n, \nvalue=" + value +
                "\n}";
    }
}
