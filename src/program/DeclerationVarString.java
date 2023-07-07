package program;

public class DeclerationVarString extends decleration{
    public String ID ;
    public String type;
    public String value ;


    public DeclerationVarString(String ID, String type, String value) {
        this.ID = ID;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nDeclerationVarString{" +
                "\nname='" + ID + '\'' +
                ", \ntype='" + type + '\'' +
                ", \nvalue=" + value +
                "\n}";
    }
}
