package program;

public class TextStyle {
    public String color;
    public double fontSize;

    public TextStyle(String color , double fontSize){
        this.fontSize = fontSize;
        this.color = color;
    }

    public TextStyle(String color){
        this.color = color;
    }

    public TextStyle(double fontSize){
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "\nTextStyle{" +
                "\ncolor='" + color + '\'' +
                ", \nfontSize=" + fontSize +
                "\n}";
    }
}
