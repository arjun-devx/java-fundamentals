package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SumOfNumberExecutorMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 100; i++) {
            executorService.execute(new NumberPrinter(i));
        }
    }
}
