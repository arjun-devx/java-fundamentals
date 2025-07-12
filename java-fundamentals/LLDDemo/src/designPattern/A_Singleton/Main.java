package designPattern.A_Singleton;

public class Main {
    public static void main (String[] args) {
        Singleton getsingletonObj1 = Singleton.getObject();
        Singleton getSingletonObj2 = Singleton.getObject();
        Singleton getSingletonObj3 = Singleton.getObject();
        SingletonAdv getSingleTonAdvObj1 = SingletonAdv.getObject();
    }
}
