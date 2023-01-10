package program;

import java.util.ArrayList;
import java.util.List;

public class textField extends widget{
    List <textFieldProperties> t;

    public textField() {
        t = new ArrayList<>();
    }
    public  void addtextFieldProperties (textFieldProperties t1){
        t.add(t1);
    }

    @Override
    public String toString() {
        return "textField{" +
                "textfieldprop" + t +
                '}';
    }
}
