package oops;

//method overloading - same method names but parameter types are different, based on the parameter types the signature of the class is decided
//method signature = name of the method + corresponding arguments with their data types

public class Calculator {
    public int add (int x, int y) {
        return x + y;
    }
    public double add (double x, double y) {
        return x + y;
    }
    public double add (int x, double y) {
        return x + y;
    }
    public double add (double x, int y) {
        return x + y;
    }
    public long add (long x, long y) {
        return x + y;
    }
}