import advancedConcepts.Calculator;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //For understanding "Generic" -
        Calculator<Integer, String> calculator = new Calculator<>();
        calculator.print(4, "test");
        Calculator<String, Integer> calculator1 = new Calculator<>();
        calculator1.print("passing string", 5);

        System.out.println("Hello world!");
        HashMap<Integer, String> map = new HashMap();

        Calculator<String, Double> calculator2 = new Calculator<>();
        calculator2.print("Calculator2 String", 1.1);

        HashMap<Calculator<String, Double>, String> map1 = new HashMap<>();
        map1.put(calculator2, "test");

        //Generics
        //ClassName objName = new ClassName();
        //new ClassName(); -- this is supported for generics -- but not recommended
        //new ClassName<>(); -- this is supported for generics -- and it is recommended way of implementing generics.

        //Integer -- int
        //Boolean -- boolean
        //Double -- double --> Double/Integer/Boolean these are wrapper classes
        //Generic only supports - objects -> Object Class
        //Generics dont support primitive variables, it only supports object as it is built on top of object class
        //We  need to use the wrapper classes for the primitive variables, for example:
        Integer i = 10;
        int x = i;

        int y = 10;
        Integer z = y;

        //This is called Auto-boxing -- automatically converts wrapper class object to primitive and vice-versa

    }
}