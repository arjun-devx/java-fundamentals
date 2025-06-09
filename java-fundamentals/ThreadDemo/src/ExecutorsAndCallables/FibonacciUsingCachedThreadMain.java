package ExecutorsAndCallables;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciUsingCachedThreadMain  {
    public static void main (String args[]) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> futureResult = executorService.submit(new FibonacciUsingCachedThread(10, executorService));
        int result = futureResult.get();
        System.out.println(result);
    }
}
