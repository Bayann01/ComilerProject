package program;

public class CreateObject extends  line{
    public String classType;
    public String objectName;
    public  constructorwithoutbody constructor;


    public CreateObject(String c, String o,constructorwithoutbody constructor){
        this.classType = c;
        this.objectName = o;
        this.constructor = constructor;
    }

    @Override
    public String toString() {
        return "\nCreateObject{" +
                "\nclassType='" + classType + '\'' +
                ", \nobjectName='" + objectName + '\'' +
                ", \nconstructor=" + constructor +
                "\n}";
    }
}
