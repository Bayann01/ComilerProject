package program;

public class textFieldObscureTextProperty extends textFieldProperties{

    public boolean obscureText ;

    public textFieldObscureTextProperty(boolean obscureText) {
        this.obscureText = obscureText;
    }

    @Override
    public String toString() {
        return "textFieldObscureTextProperty{" +
                "obscureText=" + obscureText +
                '}';
    }
}
