package IntroToThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //ReentrantLock reentrantLock = new ReentrantLock();

        Count count = new Count(0);
        AdderAtomicInteger adder = new AdderAtomicInteger(count);
        SubtractorAtomicInteger subtractor = new SubtractorAtomicInteger(count);

        Thread threadAdder = new Thread(adder);
        Thread threadSubtractor = new Thread(subtractor);

        threadAdder.start(); //thread.run() will use the main thread only. but the thread.start() will create a new thread and then run it.
        threadSubtractor.start();

        threadAdder.join(); //join makes the main thread wait until the thread does not complete execution
        threadSubtractor.join();

        System.out.println("Count - " + count.value);
    }
}