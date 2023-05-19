package SemanticCheck;

import SympolTable.sympolTable;
import program.*;

public class Semantic_Error {
    sympolTable sympoltable = new sympolTable();
    String varNotDecleare;
    String WidgetnameRedublication;

    public Semantic_Error(sympolTable sympoltable) {
        this.sympoltable = sympoltable;
    }

    public Semantic_Error() {
    }

    public boolean check() {
        if (!checkforwidgetredublication(this.sympoltable)) {
            System.out.println("Exception : Widget " + WidgetnameRedublication + " is already exist");
        }
        if (!checkDecleration(this.sympoltable)) {
            System.out.println("Exception : Variable " + varNotDecleare + "   dosen't decleare ");
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
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[assignment]")) {
                assignment d = (assignment) sympoltable.getMap().get(i).get("assignment");
                name = d.ID;
                for (int j = 0; j < sympoltable.getMap().size(); j++) {
                    String type = sympoltable.getMap().get(j).keySet().toString();
                    if (type.equals("[INT]")) {
                        decleration h = (DeclerationVarINT) sympoltable.getMap().get(j).get("INT");
                        if (((DeclerationVarINT) h).ID.equals(name)) {
                            return true;
                        } else {
                            varNotDecleare = name;
                        }
                    } else if (type.equals("[Double]")) {
                        decleration h = (DeclerationVarDouble) sympoltable.getMap().get(j).get("Double");
                        if (((DeclerationVarDouble) h).ID.equals(name)) {
                            return true;
                        } else {
                            varNotDecleare = name;
                        }
                    } else if (type.equals("[String]")) {
                        decleration h = (DeclerationVarString) sympoltable.getMap().get(j).get("String");
                        if (((DeclerationVarString) h).ID.equals(name)) {
                            return true;
                        } else {
                            varNotDecleare = name;
                        }
                    } else if (type.equals("[bool]")) {
                        decleration h = (DeclerationVarINT) sympoltable.getMap().get(j).get("bool");
                        if (((DeclerationVarBoolean) h).ID.equals(name)) {
                            return true;
                        } else {
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
