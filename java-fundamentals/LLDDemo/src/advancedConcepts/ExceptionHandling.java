package advancedConcepts;

public class ExceptionHandling {

    public static void divide(int a , int b) {
        System.out.println(a / b);
    }

    public static void main (String[] args) {
        divide(5,1);
        divide(10, 0);


        /*
        ArithmeticException - this pop at the run time and not at the compile time || RuntimeException || CheckedException

        /usr/lib/jvm/java-1.21.0-openjdk-arm64/bin/java -javaagent:/opt/intellij-idea-community/lib/idea_rt.jar=43351:/opt/intellij-idea-community/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/devx/Documents/java-fundamentals/LLDDemo/out/production/LLDDemo advancedConcepts.ExceptionHandling
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at advancedConcepts.ExceptionHandling.divide(ExceptionHandling.java:6)
	    at advancedConcepts.ExceptionHandling.main(ExceptionHandling.java:11)
        */
    }
}