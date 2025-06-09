package ExecutorsAndCallables;

public class FibonacciUsingFixedThreadMain {
    public static void main(String args[]) {
        FibonacciUsingFixedThread fibonacciUsingFixedThread = new FibonacciUsingFixedThread(5);
        int result = fibonacciUsingFixedThread.getSeries(4);
        System.out.println(result);
    }
}
