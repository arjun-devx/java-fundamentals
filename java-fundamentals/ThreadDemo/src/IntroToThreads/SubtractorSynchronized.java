package IntroToThreads;

public class SubtractorSynchronized implements Runnable {
    private Count count;

    public SubtractorSynchronized(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            synchronized (count) {
                count.value--;
            }
        }
    }
}
