package IntroToThreads;


public class AdderAtomicInteger implements Runnable {
    private Count count;

    public AdderAtomicInteger(Count count) {
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
