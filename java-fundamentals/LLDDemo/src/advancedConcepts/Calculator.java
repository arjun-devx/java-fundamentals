package advancedConcepts;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Calculator <X, Y> {
    private X x;
    private Y y;

    public Calculator(X x,  Y y) {
        this.x = x;
        this.y = y;
    }

    public Calculator() {
    }

    public void chooseOperation(int operationType, int a, int b) throws  FileNotFoundException, InterruptedException{
        if(operationType == 1) {
            divide(a, b);
        } else if (operationType == 2) {
            add(a, b);
        } else {
            throw new CalculatorException("Invalid Operation Type");
        }

    }
    public void divide(int a, int b) {
        System.out.println("Entered Divide Method");
        try {
            System.out.println(a / b);
            String str = "str";
            str.length();
            int[] arr = new int[3];
            arr[2] = 2; //ArrayIndexOutOfBoundsException
        } catch (ArithmeticException ae) {
            System.out.println("Divide By Zero - ArithmeticException");
            ae.printStackTrace();
            System.out.println(ae.getMessage());
        } catch (NullPointerException ne) {
            System.out.println("String was null - NullPointerException");
            ne.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something Went Wrong - general Exception executed");
        }
        System.out.println("Exit Divide Method");
    }

    public void divideMethod(int a , int b) throws FileNotFoundException, InterruptedException {
        System.out.println(a/b);
        FileReader fileReader = new FileReader("SomeFileName");
    }
    //RunTimeException - exception propagated upwards automatically - Implicit
    //CompileException - Either handle with try/catch or propagate upwards using "throws" - Explicit

    public void add(int a, int b) {
        System.out.println(a + b);
    }


    public X print(X x, Y y) {
        System.out.println(x);
        System.out.println(y);
        return x;
    }

    public void printX(X x) {
        System.out.println(x);
    }

    public void printY (Y y) {
        System.out.println(y);
    }
}
