package SemanticCheck;

import SympolTable.sympolTable;
import program.*;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Semantic_Error {

     sympolTable sympoltable =  sympolTable.getInstance() ;

    String varNotDecleare;
    String VarRedul;
    String WidgetnameRedublication;

    public Semantic_Error(sympolTable sympoltable) {
       this.sympoltable = sympoltable ;
    }

    public Semantic_Error() {
    }

    public boolean check() {
        if (!checkforwidgetredublication(this.sympoltable)) {
            System.out.println("Exception : Widget " + WidgetnameRedublication + " is already exist");
        }
        if (!checkAssignmentbeforeDecleration(this.sympoltable) && varNotDecleare != null) {
            System.out.println("Exception : Variable " + varNotDecleare + "   dosen't decleare ");
        }
        if (!checkforVariableredublication(this.sympoltable)) {
            System.out.println("Exception : Variable " + VarRedul + "   Already decleare ");
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

    public boolean checkforVariableredublication(sympolTable sympoltable) {
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            String type = sympoltable.getMap().get(i).keySet().toString();
            if (sympoltable.getMap().get(i).keySet().toString().equals("[INT]") || sympoltable.getMap().get(i).keySet().toString().equals("[Double]") || sympoltable.getMap().get(i).keySet().toString().equals("[bool]") || sympoltable.getMap().get(i).keySet().toString().equals("[String]")) {
                for (int j = sympoltable.getMap().size() - 1; j > i; j--) {

                    if (sympoltable.getMap().get(j).keySet().toString().equals("[INT]") || sympoltable.getMap().get(j).keySet().toString().equals("[Double]") || sympoltable.getMap().get(j).keySet().toString().equals("[bool]") || sympoltable.getMap().get(j).keySet().toString().equals("[String]")) {
                          if (sympoltable.getMap().get(i).keySet().toString().equals("[INT]") && sympoltable.getMap().get(i).get("INT") != null && sympoltable.getMap().get(j).get("INT") != null) {
                            DeclerationVarINT h = (DeclerationVarINT) sympoltable.getMap().get(j).get("INT");
                            DeclerationVarINT hh = (DeclerationVarINT) sympoltable.getMap().get(i).get("INT");
                            if (h.ID.equals(hh.ID) ) {
                                VarRedul = h.ID;
                                return false;
                            }
                        } else if (sympoltable.getMap().get(i).keySet().toString().equals("[Double]") && sympoltable.getMap().get(i) != null && sympoltable.getMap().get(j) != null) {
                              DeclerationVarDouble h = (DeclerationVarDouble) sympoltable.getMap().get(j).get("Double");
                              DeclerationVarDouble hh = (DeclerationVarDouble) sympoltable.getMap().get(i).get("Double");
                            if (h.ID.equals(hh.ID) && this.sympoltable.variableExistsInCurrentScope(h.ID)) {
                                VarRedul = h.ID;
                                return false;
                            }

                        } else if (sympoltable.getMap().get(i).keySet().toString().equals("[String]") && sympoltable.getMap().get(i).get("String") != null && sympoltable.getMap().get(j).get("String") != null) {
                            decleration h = (DeclerationVarString) sympoltable.getMap().get(j).get("String");
                            decleration hh = (DeclerationVarString) sympoltable.getMap().get(i).get("String");
                            if (((DeclerationVarString) h).ID.equals(((DeclerationVarString) hh).ID)) {
                                VarRedul = ((DeclerationVarString) h).ID;
                                return false;
                            }
                        } else if (sympoltable.getMap().get(i).keySet().toString().equals("[bool]") && sympoltable.getMap().get(i).get("bool") != null && sympoltable.getMap().get(j).get("bool") != null) {
                            decleration h = (DeclerationVarBoolean) sympoltable.getMap().get(j).get("bool");
                            decleration hh = (DeclerationVarBoolean) sympoltable.getMap().get(i).get("bool");
                            if (((DeclerationVarBoolean) h).ID.equals(((DeclerationVarBoolean) hh).ID) && sympoltable.variableExistsInCurrentScope(((DeclerationVarBoolean) h).ID)) {
                                VarRedul = ((DeclerationVarBoolean) h).ID;
                                return false;
                            }
                        } else return true;
                    }
                }
            }
        }

        return true;

    }

    public boolean checkAssignmentbeforeDecleration(sympolTable sympoltable) {
        String name;
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[assignment]")) {
                assignment d = (assignment) sympoltable.getMap().get(i).get("assignment");
                name = d.ID;
                for (int j = 0; j < sympoltable.getMap().size(); j++) {
                    String type = sympoltable.getMap().get(j).keySet().toString();
                    if (type.equals("[INT]")) {
                        decleration h = (DeclerationVarINT) sympoltable.getMap().get(j).get("INT");

                        if (((DeclerationVarINT) h).ID.equals(name) && this.sympoltable.variableExistsInCurrentScope(name)) {
//                            System.out.println(sympoltable.variableExistsInCurrentScope(((DeclerationVarINT) h).ID) );
//                            System.out.println(((DeclerationVarINT) h).ID + name);
                            return true;
                        } else {
                            varNotDecleare = name;
                           // this.sympoltable.addVariableToCurrentScope(name);
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
                    //else return false;
                }
            }
        }
        return false;
    }
}
