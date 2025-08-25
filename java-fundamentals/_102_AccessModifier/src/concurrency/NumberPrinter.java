package concurrency;

public class NumberPrinter implements  Runnable {
    private int i;

    public NumberPrinter(int i) {
        this.i = i;
    }

    public void run() {
        System.out.println("number is : " + i + " and Thread is : " + Thread.currentThread().getName());
    }
}
