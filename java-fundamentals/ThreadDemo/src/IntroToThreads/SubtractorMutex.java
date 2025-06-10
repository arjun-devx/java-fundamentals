package IntroToThreads;

import java.util.concurrent.locks.ReentrantLock;

public class SubtractorMutex implements Runnable {
    private Count count;
    private ReentrantLock mutex;

    public SubtractorMutex(Count count, ReentrantLock mutex) {

        this.count = count;
        this.mutex = mutex;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            mutex.lock();
            count.value--;
            mutex.unlock();
        }
    }
}
