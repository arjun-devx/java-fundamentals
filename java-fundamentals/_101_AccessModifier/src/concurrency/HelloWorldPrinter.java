package concurrency;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello world from different thread other than the main one: " + Thread.currentThread().getName());
    }
}
