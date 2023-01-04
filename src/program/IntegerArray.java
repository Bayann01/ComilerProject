package program;

import java.util.ArrayList;

public class IntegerArray extends Array{
    ArrayList<Integer> integers;

    public IntegerArray() {
        this.integers = new ArrayList<>();
    }
    public void add(int i){
        integers.add(i);
    }

    @Override
    public String toString() {
        return "IntegerArray{" + integers + '}';
    }
}
