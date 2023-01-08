package program;

import java.util.ArrayList;

public class line extends prog {

    public ArrayList<statmnet> Statments;
    public line() {
        this.Statments = new ArrayList<>();
    }

    public void addline(statmnet element) {
        this.Statments.add(element);

    }

    @Override
    public String toString() {
        return "line{" +
                "Statments=" + Statments +
                '}';
    }
}
