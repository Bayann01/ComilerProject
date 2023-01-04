package program;

import java.util.ArrayList;

public class BoolArray extends Array{
    ArrayList<Boolean> booleans;

    public BoolArray() {
        this.booleans = new ArrayList<>();
    }
    public void add(boolean b){
        booleans.add(b);
    }

    @Override
    public String toString() {
        return ("BoolArray {" + booleans + '}');
    }
}
