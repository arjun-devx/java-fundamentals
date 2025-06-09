package ExecutorsAndCallables;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciUsingFixedThread implements Callable<Integer> {

    private int number;

    public FibonacciUsingFixedThread (int n) {
        this.number = n;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("from thread: " + Thread.currentThread().getName());
        if (number <= 1) return number;

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> futureAns1 = executorService.submit(new FibonacciUsingFixedThread(number-1));
        Future<Integer> futureAns2 = executorService.submit(new FibonacciUsingFixedThread(number - 2));

        int ans1 = futureAns1.get();
        int ans2 = futureAns2.get();
        return ans1 + ans2;
    }
}
