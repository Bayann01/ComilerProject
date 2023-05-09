package SympolTable;

import program.decleration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class sympolTable {
    List<Map<String, Object>> map = new ArrayList<>();

        public List<Map<String, Object>> getMap() {
        return map;
    }

    public void setMap(List<Map<String, Object>> maps) {
        this.map = maps;
    }

    public void print() {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) != null) {
                System.out.println("Sympol Table : "  + map.get(i).toString() + "\n______________ ");
            }
        }
    }
}
