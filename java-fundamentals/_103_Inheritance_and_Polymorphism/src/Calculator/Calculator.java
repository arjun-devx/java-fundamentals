package Calculator;

public class Calculator {

    //method overloading
    //Java identifies that method by method signature , not by the method name
    //method signature -> name + corresponding args with data types
    public void add (int x, int y) { //add(int, int)
        System.out.println(x + y);
    }
    public void add (double x, int y) {//add(double, int)
        System.out.println(x + y);
    }
    public void add (double x, double y) { //add(double, double)
        System.out.println(x + y);
    }
    //Java allows duplicate methods(method overloading) but won't allow same name + same type of argument types
}
