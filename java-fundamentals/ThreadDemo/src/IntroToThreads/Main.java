package IntroToThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Count count = new Count(0);
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread threadAdder = new Thread(adder);
        Thread threadSubtractor = new Thread(subtractor);

        threadAdder.start();
        threadSubtractor.start();

        threadAdder.join(); //join makes the main thread wait until the thread does not complete execution
        threadSubtractor.join();

        System.out.println("Count - " + count.value);
    }
}