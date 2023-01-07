package program;

import java.util.ArrayList;

public class prog {
  ArrayList<line> lines ;

 public prog() {
  this.lines = new ArrayList<>();

 }
 void addChild(line line){
  this.lines.add(line);
 }

 @Override
 public String toString() {
  System.out.println("lineeeeeeeeee");
  StringBuilder builder =new StringBuilder();
  for (line line : lines)
  {
   builder.append(line);
   builder.append('\n');
  }
  return builder.toString();
 }

}
