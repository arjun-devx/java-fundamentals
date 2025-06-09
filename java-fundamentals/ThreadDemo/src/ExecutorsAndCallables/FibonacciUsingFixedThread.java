package ExecutorsAndCallables;

public class FibonacciUsingFixedThread {
    private int number;
    public FibonacciUsingFixedThread (int n) {
        this.number = n;
    }
    public int getSeries(int number) {
        if (number <= 1) return number;
        return getSeries(number-2) + getSeries(number-1);
    }
}
