package SemanticCheck;

import SympolTable.sympolTable;
import Visitor.TestVisitor;
import program.*;

import java.util.List;
import java.util.Map;

public class Semantic_Error {

    private static Semantic_Error single_instance = null;
    public boolean hasSemanticError = false;
    sympolTable sympoltable = sympolTable.getInstance();
    String varNotDecleare;

    String navVarNotDecleare;
    String VarRedul;
    String function;
    String WidgetReduplication;
    private String classType;
    private String navClassType;
    private String functionName;
    private String constructerName;
    String homeWidget;

    List<Map<String , List<String>>> scopes = new TestVisitor().getScopes();

    public Semantic_Error(sympolTable sympoltable) {
        this.sympoltable = sympoltable;
    }

    public Semantic_Error() {
    }

    public static Semantic_Error getInstance() {
        if (single_instance == null)
            single_instance = new Semantic_Error();
        return single_instance;
    }

    public boolean check() {
        if (!checkforwidgetredublication(this.sympoltable)) {
            System.out.println("Exception : Widget " + WidgetReduplication + " is already exist");
            hasSemanticError = true;
        }
//        if (!checkAssignmentbeforeDecleration(this.sympoltable) && varNotDecleare != null) {
//            System.out.println("Exception : Variable " + varNotDecleare + "   dosen't decleare ");
//            hasSemanticError = true;
//        }
//        if (!checkforVariableredublication(this.sympoltable)) {
//            System.out.println("Exception : Variable " + VarRedul + "   Already decleare ");
//            hasSemanticError = true;
//        }
        if (!CheckIfFunctionExsist(this.sympoltable) && function != null) {
            System.out.println("Exception : function " + function + " dosent exist ");
            hasSemanticError = true;
        }
        if (!checkforfunctionredublication(this.sympoltable) && functionName != null) {
            System.out.println("Exception : function " + functionName + " is already exist");
            hasSemanticError = true;
        }
        if (!checkIfClassExists(this.sympoltable) && classType != null) {
            System.out.println("Exception : Class " + classType + " dosent exist ");
            hasSemanticError = true;
        }
        if (!checkIfClassNavExists(this.sympoltable) && navClassType != null) {
            System.out.println("Exception : Class " + navClassType + " dosent exist ");
            hasSemanticError = true;
        }
        if (navVarNotDecleare != null) {
            System.out.println("Exception : Variable " + navVarNotDecleare + "   dosen't decleare ");
            hasSemanticError = true;
        }
        if (!checkConstructorName(this.sympoltable) && constructerName != null) {
            System.out.println("Exception : " + constructerName + " Constructor And his class name Don't match ");
            hasSemanticError = true;
        }
        if (!checkNavClass(this.sympoltable)) {
            hasSemanticError = true;
        }
        if (!checkIfHomeWidgetExists(this.sympoltable)) {
            System.out.println("Exception : Class "+homeWidget+" Does not exists");
            hasSemanticError = true;
        }

        return hasSemanticError;
    }

    public boolean checkforfunctionredublication(sympolTable sympoltable) {

        for (int i = 0; i < sympoltable.getMap().size(); i++) {

            if (sympoltable.getMap().get(i).keySet().toString().equals("[Function]")) {

                for (int j = sympoltable.getMap().size() - 1; j > i; j--) {
                    if (sympoltable.getMap().get(j).keySet().toString().equals("[Function]")) {
                        function hh = (function) sympoltable.getMap().get(j).get("Function");
                        function h = (function) sympoltable.getMap().get(i).get("Function");
                        if (h.name.toString().equals(hh.name.toString()) && this.sympoltable.variableExistsInCurrentScope(hh.name.toString())) {
                            functionName = hh.name.toString();
                            return false;
                        }
                    }
                }

            }
        }
        return true;

    }

    public boolean checkforwidgetredublication(sympolTable sympoltable) {
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[Class]")) {
                for (int j = sympoltable.getMap().size() - 1; j > i; j--) {
                    WidgetClass h = (WidgetClass) sympoltable.getMap().get(j).get("Class");
                    WidgetClass hh = (WidgetClass) sympoltable.getMap().get(i).get("Class");
                    if (h != null && hh != null) {
                        if (h.name.toString().equals(hh.name.toString())) {
                            WidgetReduplication = h.name;
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean CheckIfFunctionExsist(sympolTable sympoltable) {
        String name;
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[Functioncall]")) {
                functioncall fc = (functioncall) sympoltable.getMap().get(i).get("Functioncall");
                name = fc.name;
                this.function = name;
                for (int j = 0; j < sympoltable.getMap().size(); j++) {
                    String s = sympoltable.getMap().get(j).keySet().toString();
                    if (s.equals("[Function]")) {
                        function f = (function) sympoltable.getMap().get(j).get("Function");
                        if (f.name.equals(name)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean checkIfClassExists(sympolTable sympoltable) {
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[CreateObject]")) {
                CreateObject o = (CreateObject) sympoltable.getMap().get(i).get("CreateObject");
                this.classType = o.classType;
                for (int j = 0; j < sympoltable.getMap().size(); j++) {
                    String s = sympoltable.getMap().get(j).keySet().toString();
                    if (s.equals("[Class]")) {
                        WidgetClass c = (WidgetClass) sympoltable.getMap().get(j).get("Class");
                        if (c.name.equals(o.classType)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


    //////////////////////////////////////////////////////////////////////////
    public boolean checkIfClassNavExists(sympolTable sympoltable) {
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[navigatorCallConstructor]")) {
                constructorwithoutbody o = (constructorwithoutbody) sympoltable.getMap().get(i).get("navigatorCallConstructor");
                this.navClassType = o.classname;
                for (int j = 0; j < sympoltable.getMap().size(); j++) {
                    String s = sympoltable.getMap().get(j).keySet().toString();
                    if (s.equals("[Class]")) {
                        WidgetClass c = (WidgetClass) sympoltable.getMap().get(j).get("Class");
                        if (c.name.equals(o.classname)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    String getParameterType(String id){
//        boolean helper = false;
//
//        for(int k=0 ; k<scopes.size() ; k++){
//            if(scopes.get(k).keySet().toString().equals("["+scp+"]")){
//                for(int j=0 ; j<scopes.get(k).get(scp).size() ; j++){
//                    if(id.equals(scopes.get(k).get(scp).get(j))){
//                        helper = true;
//                    }
//                }
//            }
//        }

            for (int i = 0; i < sympoltable.getMap().size(); i++) {
                String type = sympoltable.getMap().get(i).keySet().toString();
                if (type.equals("[INT]")) {
                    decleration h = (DeclerationVarINT) sympoltable.getMap().get(i).get("INT");
                    if(((DeclerationVarINT) h).ID.equals(id) ){
                        return "int";
                    }
                }
                if (type.equals("[Double]")) {
                    decleration h = (DeclerationVarDouble) sympoltable.getMap().get(i).get("Double");
                    if(((DeclerationVarDouble) h).ID.equals(id)){
                        return "double";
                    }
                }
                if (type.equals("[String]")) {
                    decleration h = (DeclerationVarString) sympoltable.getMap().get(i).get("String");
                    if(((DeclerationVarString) h).ID.equals(id)){
                        return "String";
                    }
                }
                if (type.equals("[bool]")) {
                    decleration h = (DeclerationVarBoolean) sympoltable.getMap().get(i).get("bool");
                    if(((DeclerationVarBoolean) h).ID.equals(id)){
                        return "bool";
                    }
                }
            }


        return null;
    }

    public boolean checkNavClass(sympolTable sympoltable) {
        boolean helper = false;
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[navigatorCallConstructor]")) {
                constructorwithoutbody o = (constructorwithoutbody) sympoltable.getMap().get(i).get("navigatorCallConstructor");
//                this.navClassType = o.classname;
                for (int j = 0; j < sympoltable.getMap().size(); j++) {
                    String s = sympoltable.getMap().get(j).keySet().toString();
                    if (s.equals("[Class]")) {
                        WidgetClass c = (WidgetClass) sympoltable.getMap().get(j).get("Class");
                        if (c.name.equals(o.classname)) {
                            if(c.cc.parameters.size() == o.params.size()){
                                for(int z=0 ; z<o.params.size() ; z++){
                                    String sss = getParameterType(o.params.get(z));
                                    if(sss != null){
                                        if(!c.cc.parameters.get(z).type.equals(sss)){
                                            System.out.println("Type "+sss+" is not a subType of "+c.cc.parameters.get(z).type);
                                            return false;
                                        }
                                    }else {
                                        navVarNotDecleare = o.params.get(z);
                                        System.out.println("Exception : Variable " + navVarNotDecleare + " dosen't decleare");
                                        return false;
                                    }
                                }
                                return true;
                            } else{
                                System.out.println("Missing required parameters for "+c.name+" constructor");
                                helper = true;
                            }
                        }
                    }
                    if(helper) break;
                }
            }
        }
        return false;
    }

    //////////////////////////////////////////////////////////////////////////

    public boolean checkConstructorName(sympolTable sympoltable) {
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[Class]")) {
                WidgetClass wc = (WidgetClass) sympoltable.getMap().get(i).get("Class");
                if (!wc.name.equals(wc.cc.name)) {
                    constructerName = wc.cc.name;
                    return false;
                }
            }
        }
        return true;
    }


    public boolean checkIfHomeWidgetExists(sympolTable sympoltable){
        for (int i = 0; i < sympoltable.getMap().size(); i++) {
            if (sympoltable.getMap().get(i).keySet().toString().equals("[HomeName]")) {
                String home = (String) sympoltable.getMap().get(i).get("HomeName");
                this.homeWidget = home;
                for (int j = 0; j < sympoltable.getMap().size(); j++) {
                    String s = sympoltable.getMap().get(j).keySet().toString();
                    if (s.equals("[Class]")) {
                        WidgetClass c = (WidgetClass) sympoltable.getMap().get(j).get("Class");
                        if (home.equals(c.name)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
