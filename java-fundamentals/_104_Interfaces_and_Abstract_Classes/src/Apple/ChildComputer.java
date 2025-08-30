package Apple;

public class ChildComputer extends Computer {

    public static String staticMethod(String x) {
        System.out.println("overriding the static Method");
        return x;
    }

    public static int staticMethod(int x) {
        System.out.println("overriding the static Method");
        return x;
    }
    //static method cannot be overrided, this is method hiding - if child method has the same signature as the parent.
}