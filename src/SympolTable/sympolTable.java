package SympolTable;

import program.decleration;

import java.util.ArrayList;
import java.util.List;

public class sympolTable {
    List<decleration> decls = new ArrayList<>();

    public List<decleration> getDecls() {
        return decls;
    }

    public void setDecls(List<decleration> decls) {
        this.decls = decls;
    }

    public void print() {
        for (int i = 0; i < decls.size(); i++) {
            if (decls.get(i) != null) {
                System.out.println("declearation Sympol Table : "  + decls.get(i));
            }
        }
    }
}
