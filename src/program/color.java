package program;

public class color extends  containerproperties{
    String c ;

    public color(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "color{" +
                "c='" + c + '\'' +
                '}';
    }
}
