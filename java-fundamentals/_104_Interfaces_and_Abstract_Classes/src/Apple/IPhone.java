package Apple;

public class IPhone {
    private int ram;
    private static String cpuArch; //class level attributes

    public int getRam() {
        return this.ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public static String getCpuArch() {
        return cpuArch;
    }
    public static void setCpuArch(String cpuArch) {
        IPhone.cpuArch = cpuArch;
    }
}
