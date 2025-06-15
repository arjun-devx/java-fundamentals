package Semaphores;

import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Shirt> store;
    private String name;

    public Consumer(Queue<Shirt> store, String name) {
        this.store = store;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Current size : " + store.size() + ", removed by Consumer : " + name);
            store.remove();
        }
    }

}
