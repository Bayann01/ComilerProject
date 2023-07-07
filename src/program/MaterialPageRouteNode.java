package program;

public class MaterialPageRouteNode extends widget {

    public PageInstanceNode pageInstanceNode;

    public MaterialPageRouteNode(PageInstanceNode pageInstanceNode) {

        this.pageInstanceNode = pageInstanceNode;
    }

    @Override
    public String toString() {
        return "\nMaterialPageRouteNode{" +
                "\npageInstanceNode=" + pageInstanceNode +
                "\n}";
    }
}
