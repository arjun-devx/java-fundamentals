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
    }
}