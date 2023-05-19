package SemanticCheck;

import SympolTable.sympolTable;
import program.DeclerationVarINT;
import program.WidgetClass;
import program.assignment;

import java.util.HashMap;
import java.util.Map;

public class Semantic_Error {
    sympolTable sympoltable = new sympolTable();
    String varNotDecleare ;
    String WidgetnameRedublication ;

    public Semantic_Error(sympolTable sympoltable) {
        this.sympoltable = sympoltable;
    }

    public Semantic_Error() {
    }

    public boolean check() {
       // boolean check[] = {true,true};
        if (!checkforwidgetredublication(this.sympoltable)) {
            System.out.println("Exception : Widget " + WidgetnameRedublication+ " is already exist");
        //    return false;
        }
        if(!checkDecleration(this.sympoltable)){
            System.out.println("Exception : Variable "+ varNotDecleare+"   dosen't decleare ");
          //  check[1] = false;
        }
        return true;

    }

    public boolean checkforwidgetredublication(sympolTable sympoltable) {

        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[Class]")) {
                for (int j = sympoltable.getMap().size() - 1; j > i; j--) {
                    WidgetClass h = (WidgetClass) sympoltable.getMap().get(j).get("Class");
                    WidgetClass hh = (WidgetClass) sympoltable.getMap().get(i).get("Class");
                    if (h.name.toString().equals(hh.name.toString())) {
                        WidgetnameRedublication = h.name;
                        return false;
                    }
                }
            }
        }
        return true;

    }

    public boolean checkDecleration(sympolTable sympoltable) {
        String name;
        boolean result = false ;
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[assignment]")) {
                assignment d = (assignment) sympoltable.getMap().get(i).get("assignment");
                name=d.ID;
                for (int j =0 ; j< sympoltable.getMap().size();j++) {
                    if (sympoltable.getMap().get(j).keySet().toString().equals("[INT]")){
                        DeclerationVarINT h = (DeclerationVarINT) sympoltable.getMap().get(j).get("INT");
                        if (h.ID.equals(name)){
                            return true;
                        }
                        else  {
                            varNotDecleare = name;
                        }
                    }
                   else return false;
                }
            }



       }
        return true;


    }



}
