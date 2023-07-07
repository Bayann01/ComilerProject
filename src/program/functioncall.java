package program;

import java.util.ArrayList;
import java.util.List;

public class functioncall extends exprission{
    public String name ;
    public List<exprission> parameters ;


    public functioncall(String name) {
        this.parameters = new ArrayList<>();
        this.name = name;
    }
   public void addparameter (exprission expr){
      this.parameters.add(expr);
    }

    @Override
    public String toString() {
        return "functioncall{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                '}';
    }

}
