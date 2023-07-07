package program;

public class PageInstanceNode extends widget {
   public constructorwithoutbody constructorwithoutbody;

    public PageInstanceNode() {
    }

//    public PageInstanceNode(String typeName) {
//        this.typeName = typeName;
//    }
//    public PageInstanceNode(String typeName,String data) {
//        this.typeName = typeName;
//        this.Data = data;
//    }

    public PageInstanceNode(constructorwithoutbody c) {
        this.constructorwithoutbody = c;
    }

    @Override
    public String toString() {
        return "\nPageInstanceNode{" +
                "\nconstructorwithoutbody=" + constructorwithoutbody +
                "\n}";
    }
}
