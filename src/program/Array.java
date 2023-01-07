package program;

import java.util.ArrayList;

public class Array {
    ArrayList<Array> arrays;

    public Array() {
        this.arrays = new ArrayList<>();
    }
void addChild(Array a){
        this.arrays.add(a);

}

    @Override
    public String toString() {

        StringBuilder builder =new StringBuilder();
        for (Array line : arrays)
        {
            builder.append(line);
            builder.append('\n');
        }
        return builder.toString();
    }
}
