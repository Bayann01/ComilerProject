package program;

import java.util.ArrayList;

public class line extends prog {
    public ArrayList<decleration> decl;

    public line() {
        this.decl = new ArrayList<>();
    }

    public void addline(decleration element) {
        this.decl.add(element);
    }

    @Override
    public String toString() {
        return "line{" + "decl=" + decl + '}';
    }
}
