package designPattern.Singleton;

// in order to handle the multiple threads accessing the if block in parallel which can create multiple objects, 
// placing the synchronised or putting a thread lock is required but if block needs to be repositioned 
// so that threads check the object existence first and only one of the thread enters to create the object if it is not present.
//This is added in SingleTonAdvanced file. 

public class SingletonAdv {
    private static SingletonAdv singletonAdvInstance = null;

    private SingletonAdv() {
    }

    public static SingletonAdv getObject() {
        if (singletonAdvInstance == null) {
            synchronized (SingletonAdv.class) {
                if (singletonAdvInstance == null) singletonAdvInstance = new SingletonAdv();
            }
        }
        return singletonAdvInstance;
    }
}
