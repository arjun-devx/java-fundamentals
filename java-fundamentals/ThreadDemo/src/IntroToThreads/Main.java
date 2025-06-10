package IntroToThreads;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();

        Count count = new Count(0);
        AdderMutex adder = new AdderMutex(count, reentrantLock);
        SubtractorMutex subtractor = new SubtractorMutex(count, reentrantLock);

        Thread threadAdder = new Thread(adder);
        Thread threadSubtractor = new Thread(subtractor);

        threadAdder.start(); //thread.run() will use the main thread only. but the thread.start() will create a new thread and then run it.
        threadSubtractor.start();

        threadAdder.join(); //join makes the main thread wait until the thread does not complete execution
        threadSubtractor.join();

        System.out.println("Count - " + count.value);
    }
}