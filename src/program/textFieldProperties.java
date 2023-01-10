package program;

public class textFieldProperties extends textField {
    textFieldControllerProperty textFieldControllerProperty;

    public textFieldProperties(program.textFieldControllerProperty textFieldControllerProperty) {
        this.textFieldControllerProperty = textFieldControllerProperty;
    }

    public textFieldProperties() {
    }

    @Override
    public String toString() {
        return "\ntextFieldProperties{" +
                "\ntextFieldControllerProperty=" + textFieldControllerProperty +
                "\n}";
    }
}
