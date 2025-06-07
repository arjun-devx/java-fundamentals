package concurrency;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World from the thread name : " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinterObj = new HelloWorldPrinter();
        Thread threadPrint =  new Thread(helloWorldPrinterObj);
        threadPrint.start();

        for (int i = 0; i < 100; i++) {
            NumberPrinter numberPrinterObj = new NumberPrinter(i);
            Thread threadNumber = new Thread(numberPrinterObj);
            threadNumber.start();
        }
    }
}

//Follow below steps:
//Java by default is single threaded - main thread

//print Hello world from different thread other than the main thread.
//Setup Steps:
    //Create a class for the task
    //Implement runnable interface in the class
    //Implement your task inside the run() method
//Execution Steps:
    //Create an object of the task class
    //using the task class object you create a thread
    //start the thread