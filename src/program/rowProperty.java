package program;

public class rowProperty extends rowproperties  {
   mainAxisRow mainAxisRow ;
   crossAxisRow crossAxisRow ;
   public rowProperty(mainAxisRow mainAxisRow){
      this.mainAxisRow = mainAxisRow;
   }

   public rowProperty(crossAxisRow crossAxisRow){
      this.crossAxisRow = crossAxisRow;
   }

   public rowProperty(program.mainAxisRow mainAxisRow, program.crossAxisRow crossAxisRow) {
      this.mainAxisRow = mainAxisRow;
      this.crossAxisRow = crossAxisRow;
   }
public rowProperty(){

}
   @Override
   public String toString() {
      return "\nrowProperty{" +
              "\nmainAxisRow=" + mainAxisRow +
              ", \ncrossAxisRow=" + crossAxisRow +
              '}';
   }
}
