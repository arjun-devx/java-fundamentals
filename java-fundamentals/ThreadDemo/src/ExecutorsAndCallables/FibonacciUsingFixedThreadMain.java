package ExecutorsAndCallables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciUsingFixedThreadMain {
    public static void main(String args[]) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> resultFuture = executorService.submit(new FibonacciUsingFixedThread(3));
        int result = resultFuture.get();
        System.out.println(result);
    }
}