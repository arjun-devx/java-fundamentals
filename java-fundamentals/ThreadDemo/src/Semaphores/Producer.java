package Semaphores;

import java.util.Queue;

public class Producer implements Runnable {
    private Queue<Shirt> store;
    private String name;
    private int maxSize;

    public Producer(Queue<Shirt> store, String name, int maxSize) {
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {

        while (true) {
            System.out.println("Current size : " + store.size() + ", added by Producer : " + name);
            store.add(new Shirt());
        }
    }

}
