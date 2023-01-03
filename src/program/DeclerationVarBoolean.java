package program;

public class DeclerationVarBoolean extends decleration{
    public String ID ;
    public String type;
    public Boolean value ;

    public DeclerationVarBoolean(String ID, String type, Boolean value) {
        this.ID = ID;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
