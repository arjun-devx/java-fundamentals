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
            mutex.lock(); //one thread at a time will enter this mutex/reentrance marked critical section with a key
            count.value++;
            mutex.unlock();
            //follows the - 1. no busy waiting 2. no bounded time 3. one thread at a time 4. progressive (only Critical section)
        }
    }
}
