package SympolTable;

import program.decleration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class sympolTable {
   static Stack<Map<String, Object>> map = new Stack<>();

    public Stack<Map<String, Object>> getMap() {
        return map;
    }

    public void setMap(Stack<Map<String, Object>> maps) {
        this.map = maps;
    }

    public static void print() {
        for (int i = map.size()-1; i >= 0  ; i--) {
            if (map.get(i) != null) {
                System.out.println( map.get(i).keySet() + "\t" + map.get(i).values() + "\n______________ ");
            }
        }
    }
}
