package Semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Shirt> store;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(Queue<Shirt> store, String name, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.name = name;
        this.consumerSemaphore = consumerSemaphore;
        this.producerSemaphore = producerSemaphore;
    }

    @Override
    public void run() {

        while (true) {
            try {
                consumerSemaphore.acquire();
                    System.out.println("Current size : " + store.size() + ", removed by Consumer : " + name);
                    store.remove();
                producerSemaphore.release();
            }
            catch (InterruptedException exception) {
                throw  new RuntimeException(exception);
            }
        }
    }

}
