package program;

public class textFieldHintTextProperty extends textFieldProperties{
    public String hintText ;

    public textFieldHintTextProperty(String hintText) {
        this.hintText = hintText;
    }

    @Override
    public String toString() {
        return "\ntextFieldHintTextProperty{" +
                "\nhintText='" + hintText + '\'' +
                "\n}";
    }
}
