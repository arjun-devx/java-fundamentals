package IntroToThreads;


public class AdderSynchronized implements Runnable {
    private Count count;

    public AdderSynchronized(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            synchronized (count) {
                count.value++;
            }            //Synchronized block added instead of ReentrantLock/mutex
        }
    }
}
