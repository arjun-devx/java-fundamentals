package advancedConcepts;

public class Calculator <X, Y> {
    private X x;
    private Y y;

    public Calculator(X x,  Y y) {
        this.x = x;
        this.y = y;
    }

    public Calculator() {
    }

    public void chooseOperation(int operationType, int a, int b) {
        if(operationType == 1) {
            divide(a, b);
        } else {
            add(a, b);
        }
    }
    public void divide(int a, int b) {
        System.out.println("Entered Divide Method");
        try {
            System.out.println(a / b);
            String str = "str";
            str.length();
            int[] arr = new int[3];
            arr[3] = 2; //ArrayIndexOutOfBoundsException
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
