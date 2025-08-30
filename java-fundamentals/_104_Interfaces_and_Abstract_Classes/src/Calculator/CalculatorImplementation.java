package Calculator;

import Calculator.Calculator;

public class CalculatorImplementation implements Calculator {

    @Override
    public void add(int x, int y) {
        System.out.println(x + y);
    }
    @Override
    public void subtract(int x, int y) {
        System.out.println(x + y);
    }
    @Override
    public void multiply(int x, int y) {
        System.out.println(x + y);
    }
    @Override
    public void divide(int x, int y) {
        System.out.println(x + y);
    }
}

//Interfaces - forces the child class to implement the methods written in the interface
