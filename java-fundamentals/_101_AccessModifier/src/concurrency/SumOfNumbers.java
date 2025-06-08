package concurrency;

public class SumOfNumbers implements  Runnable {
    private int number;
    private int sum;

    public SumOfNumbers (int number) {
        this.number = number;
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("printing the total sum:" + sum);
        System.out.println("Printing the current thread from SumOfNumber: "  + Thread.currentThread().getName() );
    }
}
