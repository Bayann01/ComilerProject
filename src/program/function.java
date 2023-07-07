package program;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class function extends line {
    String type;
    public String name;

    public Scaffold scaffold ;
    public List<parameterFunc> parameters;
    List<line> body=new  ArrayList<>();
    public function(String type, String name ,Scaffold sc) {
        this.type = type;
        this.name = name;
        this.scaffold=sc;
        this.parameters = new ArrayList<>();
        this.body =new ArrayList<>();
    }
public function(){}

    public function(String type, String funcName) {
        this.type=type;
        this.name=funcName;
    }

    public void AddParameters (parameterFunc expr){
        this.parameters.add(expr);
    }
    public void Addline (line expr){
        this.body.add(expr);
    }
    @Override
    public String toString() {
        return "\nfunction{" +
                "\ntype='" + type + '\'' +
                ", \nname='" + name + '\'' +
                ", \nparameters=" + parameters +
                ", \nbody=" + body +
                ", \nscaffold=" + scaffold +
                             "\n}";
    }
}
