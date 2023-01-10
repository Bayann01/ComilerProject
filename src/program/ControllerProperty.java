package program;

public class ControllerProperty extends textFieldProperties {
String controll;

    public ControllerProperty(String controll) {
        this.controll = controll;
    }

    @Override
    public String toString() {
        return "ControllerProperty{" +
                "controll=" + controll +
                '}';
    }
}
