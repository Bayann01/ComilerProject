package program;

import java.util.ArrayList;
import java.util.List;

public class functioncall extends exprission{
    List<exprission> parameters ;

    public functioncall() {
        this.parameters = new ArrayList<>();
    }
    void addparameter (exprission expr){
      this.parameters.add(expr);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
