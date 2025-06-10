package IntroToThreads;


import java.util.concurrent.locks.ReentrantLock;

public class AdderMutex implements Runnable {
    private Count count;
    private ReentrantLock mutex;

    public AdderMutex(Count count, ReentrantLock reentrantLock) {
        this.count = count;
        this.mutex = reentrantLock;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            mutex.lock();
            count.value++;
            mutex.unlock();
        }
    }
}
