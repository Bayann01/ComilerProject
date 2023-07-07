package program;

public class TextProperty extends textFieldProperties{
String text;

    public TextProperty(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "\nTextProperty{" +
                "\ntext='" + text + '\'' +
                "\n}";
    }
}
