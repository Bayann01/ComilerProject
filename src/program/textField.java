package program;

import java.util.ArrayList;
import java.util.List;

public class textField extends widget{
    public List <textFieldProperties> tp;

    public textField() {
        tp = new ArrayList<>();
    }
    public  void addtextFieldProperties (textFieldProperties t1){
        tp.add(t1);
    }

    @Override
    public String toString() {
        return "\ntextField{" +
                "\ntextfieldprop" + tp +
                "\n}";
    }
}
