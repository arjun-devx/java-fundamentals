package oops;

public class Computer {
    private int ram;
    private static String cpuArch; //stored at class level, i can call this using the class as well

    public Computer() {
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public static String getCpuArch() {
        return cpuArch;
    }

    public static void setCpuArch(String cpuArch) {
        Computer.cpuArch = cpuArch;
    }
}
