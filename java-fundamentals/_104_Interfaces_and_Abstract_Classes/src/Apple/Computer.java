package Apple;

public class Computer {
    public static int ram;
    public static String cpu;
    public static String display;

    public static int staticMethod(int i) {
        System.out.println(ram + cpu + display);
        return i * i;
    }
    public static double staticMethod(double i) {
        System.out.println(ram + cpu + display);
        return i * i;
    }

}