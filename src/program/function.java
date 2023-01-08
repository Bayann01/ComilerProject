package program;

import java.util.ArrayList;
import java.util.List;

public class function extends line {
    String type;
    String name;
    List<parameterFunc> parameters;
    List<line> body;
    public function(String type, String name) {
        this.type = type;
        this.name = name;
        this.parameters = new ArrayList<>();
        this.body =new ArrayList<>();
    }

    void AddLineToBody (line l){
        this.body.add(l);
    }
    void AddParameters (parameterFunc expr){
        this.parameters.add(expr);
    }

}
