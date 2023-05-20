package SympolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class sympolTable {
    public static Stack<Map<String, Object>> map = new Stack<>();
    private static sympolTable single_instance = null;
    public boolean hasSyntaxError;
    public static Stack<Scope> scopeStack;

    public static sympolTable getInstance() {
        if (single_instance == null)
            single_instance = new sympolTable();
        return single_instance;
    }
    public sympolTable() {
        this.scopeStack = new Stack<>();
        enterScope(); // Enter the global scope initially
    }
    public static void print() {
        for (int i = map.size() - 1; i >= 0; i--) {
            if (map.get(i) != null) {
                System.out.println(map.get(i).keySet() + "\t" + map.get(i).values() + "\n______________ ");
            }
        }

    }

    public Stack<Map<String, Object>> getMap() {
        return map;
    }

    public void setMap(Stack<Map<String, Object>> maps) {
        this.map = maps;
    }

    public void write(String text) throws IOException {
        FileWriter syntaxError = new FileWriter("output//SyntaxError.txt");
        syntaxError.write(text);
        syntaxError.close();
    }

    public void enterScope() {
        scopeStack.push(new Scope());
    }
    public void exitScope() {
        scopeStack.pop();
    }

    public boolean variableExistsInCurrentScope(String variableName) {
        Scope currentScope = scopeStack.peek();
        return currentScope.variableExists(variableName);
    }
    public static void addVariableToCurrentScope(String variableName) {
        Scope currentScope = scopeStack.peek();
        currentScope.addVariable(variableName);
    }
    public class Scope {
        public Set<String> variables;
        public Scope() {
            this.variables = new HashSet<>();
        }
        public boolean variableExists(String variableName) {
            return variables.contains(variableName);
        }

        public void addVariable(String variableName) {
            variables.add(variableName);
        }
    }
}
