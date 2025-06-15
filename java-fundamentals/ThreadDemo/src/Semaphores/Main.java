package Semaphores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main (String[] args) {
        Queue<Shirt> store = new LinkedList<>();
        Semaphore semaphoreProducer = new Semaphore(5);
        Semaphore semaphoreConsumer = new Semaphore(0);

        Producer p1 = new Producer(store, "p1", 5, semaphoreProducer, semaphoreConsumer);
        Producer p2 = new Producer(store, "p2", 5, semaphoreProducer, semaphoreConsumer);
        Producer p3 = new Producer(store, "p3", 5, semaphoreProducer, semaphoreConsumer);
        Producer p4 = new Producer(store, "p4", 5, semaphoreProducer, semaphoreConsumer);
        Producer p5 = new Producer(store, "p5", 5, semaphoreProducer, semaphoreConsumer);

        Thread tp1 = new Thread(p1);
        Thread tp2 = new Thread(p2);
        Thread tp3 = new Thread(p3);
        Thread tp4 = new Thread(p4);
        Thread tp5 = new Thread(p5);

        Consumer c1 = new Consumer(store, "c1", semaphoreProducer, semaphoreConsumer);
        Consumer c2 = new Consumer(store, "c2", semaphoreProducer, semaphoreConsumer);
        Consumer c3 = new Consumer(store, "c3", semaphoreProducer, semaphoreConsumer);
        Consumer c4 = new Consumer(store, "c4", semaphoreProducer, semaphoreConsumer);
        Consumer c5 = new Consumer(store, "c5", semaphoreProducer, semaphoreConsumer);

        Thread tc1 = new Thread(c1);
        Thread tc2 = new Thread(c2);
        Thread tc3 = new Thread(c3);
        Thread tc4 = new Thread(c4);
        Thread tc5 = new Thread(c5);

        tp1.start();
        tp2.start();
        tp3.start();
        tp4.start();
        tp5.start();

        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();
    }
}
