package program;
public class varPlusPlus extends statmnet {
    String ID ;
    public varPlusPlus(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return ID.toString()  + "++";
    }
}
