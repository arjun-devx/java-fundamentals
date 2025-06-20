package IntroToThreads;

public class SubtractorAtomicInteger implements Runnable {
    private Count count;

    public SubtractorAtomicInteger(Count count) {
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
