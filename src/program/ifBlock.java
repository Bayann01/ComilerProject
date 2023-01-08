package program;

import java.util.ArrayList;
import java.util.List;

public class ifBlock extends line{
    List<line> line ;
    exprission exprission;

    public ifBlock(exprission exprission) {
        this.exprission=exprission;
        line=new  ArrayList<>();
    }
    public void addline (line line){
        this.line.add(line);
    }
    @Override
    public String toString() {
        return "ifBlock{" +
                "exprission=" + exprission +
                ", line=" + line +
                '}';
    }
}
