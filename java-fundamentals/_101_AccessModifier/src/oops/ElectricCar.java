package oops;

public class ElectricCar extends Car {
    public int batteryCount;
    public int batteryCapacity;

    public ElectricCar() {
        System.out.println("You are viewing the print statement from the ElectricCar sub class");
    }

    // If a parent class has only a parameterized constructor, then the child class constructor
    // must call it using 'super(...)' to pass required values, because Java does not insert a default call to 'super()' automatically.

    public ElectricCar(int noOfWheels, String headLight, String backLight, int batteryCount, int batteryCapacity) {
        super(noOfWheels, headLight, backLight);
        this.batteryCount = batteryCount;
        this.batteryCapacity = batteryCapacity;
    }

    //using getter to access private attribute
    public void electricWheelsCount() {
        System.out.println(super.getNoOfWheels());
    }

}
