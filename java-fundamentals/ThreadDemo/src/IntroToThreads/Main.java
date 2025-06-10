package IntroToThreads;

public class Main {
    public static void main(String[] args) {

        Count count = new Count(0);
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread threadAdder = new Thread(adder);
        Thread threadSubtractor = new Thread(subtractor);

        threadAdder.start();
        threadSubtractor.start();

        System.out.println("Count - " + count.value);
    }
}