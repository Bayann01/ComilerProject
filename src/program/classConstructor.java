package program;

import java.util.ArrayList;
import java.util.List;

public class classConstructor extends WidgetClass {
    public String name ;
    public List<parameterFunc> parameters ;
    public Constauctorbody body ;

    public classConstructor(String name, Constauctorbody body) {
        this.name = name;
        this.parameters = new ArrayList<>();
        this.body = body;
    }

    public classConstructor() {
    }
   public void  addParam(parameterFunc para){
        parameters.add(para);
    }

    @Override
    public String toString() {
        return "\nclassConstructor{" +
                "\nname='" + name + '\'' +
                ", \nparameters=" + parameters +
                ", \nbody=" + body +
                "\n}";
    }
}
