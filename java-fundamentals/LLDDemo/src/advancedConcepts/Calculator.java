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
