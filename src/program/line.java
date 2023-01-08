package program;

import java.util.ArrayList;

public class line extends prog {
    public ArrayList<statmnet> Statments;
    public ArrayList<ifBlock> ifBlock;
    public line() {
        this.Statments = new ArrayList<>();
        this.ifBlock = new ArrayList<>();
    }

    public void addline(statmnet element) {
        this.Statments.add(element);

    }
    public void addlineInBlock(ifBlock element) {
        this.ifBlock.add(element);

    }

    @Override
    public String toString() {
        return "line{" +
                "Statments=" + Statments +
                ", ifBlock=" + ifBlock +
                '}';
    }
}
