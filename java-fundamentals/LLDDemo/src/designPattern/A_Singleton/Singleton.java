package designPattern.A_Singleton;
public class Singleton {
    private static Singleton singletonInstance = null;

    private Singleton() {
    }

    public static Singleton getObject() {
        if (singletonInstance == null)
            singletonInstance = new Singleton();
        return singletonInstance;
    }
}