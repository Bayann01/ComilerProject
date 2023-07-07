package program;

 public class NavigatorPushNode extends widget  {

public MaterialPageRouteNode materialPageRouteNode;

     public NavigatorPushNode(MaterialPageRouteNode materialPageRouteNode) {
         this.materialPageRouteNode = materialPageRouteNode;
     }

     @Override
     public String toString() {
         return "\nNavigatorPushNode{" +
                 "\nmaterialPageRouteNode=" + materialPageRouteNode +
                 "\n}";
     }
 }

