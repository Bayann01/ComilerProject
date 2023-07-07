package program;

public class textFieldControllerProperty extends textFieldProperties{
   String ControllerName ;

    public textFieldControllerProperty(String controllerName) {
        ControllerName = controllerName;
    }

    @Override
    public String toString() {
        return "\ntextFieldControllerProperty{" +
                "\nControllerName='" + ControllerName + '\'' +
                "\n}";
    }
}



