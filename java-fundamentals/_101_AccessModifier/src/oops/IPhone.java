package oops;

public class IPhone {
    public int version;
    public int processorNumber;
    public int price;
    public String model;
    public String brand;
    public int displaySize;
    public int ram;
    public int batterySize;

    public IPhone(int version, int processorNumber, int price, String model, String brand, int displaySize, int ram, int batterySize) {
        this.version = version;
        this.processorNumber = processorNumber;
        this.price = price;
        this.model = model;
        this.brand = brand;
        this.displaySize = displaySize;
        this.ram = ram;
        this.batterySize = batterySize;
    }
    //Copy Constructor
    public IPhone (IPhone phone) {
        version = phone.version + 1;
        processorNumber = phone.processorNumber + 1;
        price = phone.price + 5000;
        model = phone.model;
        brand = phone.brand;
        displaySize = phone.displaySize;
        ram = phone.ram + 1;
        batterySize = phone.batterySize + 1000;
    }
}
