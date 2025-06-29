package advancedConcepts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionHandling {

    public static void divide(int a , int b) {
        System.out.println(a / b);
    }

    public static void readFile() {

        //FileReader fileReader1 = new FileReader("FileDoesNotExist.txt");
        //If I call FileReader for a path that does not exist - I will get CompileTimeException error below:
        // Unhandled exception: java.io.FileNotFoundException  || CheckedException || CompileException
        // I will need to use try and catch block and handle the exception

        try {
            FileReader fileReader = new FileReader("FileDoesNotExist.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File is not present");
            ex.getMessage();
        }
    }


    public static void takeInput() {
        Scanner input = null;
        try {
             input = new Scanner(System.in);
            String string = input.next();
            string = null;
            System.out.println(string.length());
        }
        catch (NullPointerException ne) {
            ne.printStackTrace();
            System.out.println("String was null");
        }
        finally {
            System.out.println("Final block Entered ");
            input.close();
            System.out.println("Final block Closed");
        }
    }

    public static void main (String[] args) throws FileNotFoundException, InterruptedException {

        //readFile();

        //divide(5,1);
        //divide(10, 0);
        /*
        ArithmeticException - this pop at the run time and not at the compile time || RuntimeException || UnCheckedException
        /usr/lib/jvm/java-1.21.0-openjdk-arm64/bin/java -javaagent:/opt/intellij-idea-community/lib/idea_rt.jar=43351:/opt/intellij-idea-community/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/devx/Documents/java-fundamentals/LLDDemo/out/production/LLDDemo advancedConcepts.ExceptionHandling
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	        at advancedConcepts.ExceptionHandling.divide(ExceptionHandling.java:6)
	        at advancedConcepts.ExceptionHandling.main(ExceptionHandling.java:11)
        */

/*        Calculator<Integer, Integer> calculator = new Calculator<>();
        calculator.chooseOperation(2,10, 1);
        calculator.divideMethod(1, 10);

 */
        takeInput();
    }
}