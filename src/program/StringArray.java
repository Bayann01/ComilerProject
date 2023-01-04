package program;

import java.util.ArrayList;

public class StringArray extends Array{
    ArrayList<String> strings;

    public StringArray() {
        this.strings = new ArrayList<>();
    }

    public void add(String s){
        strings.add(s);
    }

    @Override
    public String toString() {
        return ("String Array {" + strings + '}');
    }
}
