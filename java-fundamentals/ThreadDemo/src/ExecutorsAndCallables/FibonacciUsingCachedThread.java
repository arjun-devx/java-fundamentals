package ExecutorsAndCallables;

import java.util.concurrent.*;

public class FibonacciUsingCachedThread implements Callable<Integer> {

    private int number;
    ExecutorService executorService;

    public FibonacciUsingCachedThread(int number, ExecutorService executorService) {
        this.number = number;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws ExecutionException, InterruptedException {
        System.out.println(number + " from thread: " + Thread.currentThread().getName());
        if (number <= 1) return number;

        Future<Integer> futureAns1 = executorService.submit(new FibonacciUsingCachedThread(number - 1, executorService));
        Future<Integer> futureAns2 = executorService.submit(new FibonacciUsingCachedThread(number - 2, executorService));

        int ans1 = futureAns1.get();
        int ans2 = futureAns2.get();

        return ans1 + ans2;
    }
}
