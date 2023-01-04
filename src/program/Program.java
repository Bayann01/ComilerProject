package program;

import java.util.ArrayList;

public class Program {
    ArrayList<Array> arrays;

    public Program() {
        this.arrays = new ArrayList<>();
    }
    public void add(Array arr){
        arrays.add(arr);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Array arr : arrays){
            stringBuilder.append(arr);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
