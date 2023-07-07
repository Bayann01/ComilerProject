package program;

import java.util.ArrayList;
import java.util.List;

public class constructorwithoutbody {
    public String classname;
    public List<String> params;


    public constructorwithoutbody(String classname) {
        this.classname = classname;
        params = new ArrayList<>();

    }

    public constructorwithoutbody() {
    }

    public void addparam(String param) {
        params.add(param);
    }

    @Override
    public String toString() {
        return "\nconstructorwithoutbody{" +
                "\nclassname='" + classname + '\'' +
                ", \nparams=" + params +
                "\n}";
    }
}
