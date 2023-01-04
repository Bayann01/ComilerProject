package program;

import java.util.ArrayList;

public class DoubleArray extends Array{
    ArrayList<Double> doubles;

    public DoubleArray() {
        this.doubles = new ArrayList<>();
    }
    public void add(Double d){
        doubles.add(d);
    }

    @Override
    public String toString() {
        return "DoubleArray{" + doubles + '}';
    }
}
