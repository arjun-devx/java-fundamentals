package Semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Shirt> store;
    private String name;
    private int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Queue<Shirt> store, String name, int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                producerSemaphore.acquire();
                    System.out.println("Current size : " + store.size() + ", added by Producer : " + name);
                    store.add(new Shirt());
                consumerSemaphore.release();
            } catch (InterruptedException exception) {
                throw new RuntimeException(exception);
            }
        }
    }

}
