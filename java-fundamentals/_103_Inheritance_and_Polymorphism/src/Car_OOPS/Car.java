package Car_OOPS;

public class Car {
    public int noOfWheels;
    public String headLight;
    public String breakLight;
    protected String protectedTechnology = "This is protected technology";

    //constructor

    public Car() {
        System.out.println("Car Constructor - parent class Constructor");
    }

    public Car(int noOfWheels) {
        this.noOfWheels = noOfWheels;
        System.out.println("Parent Class Car - Prints from the Car Constructor");
    }
    public Car(int noOfWheels, String headLight, String breakLight) {
        this.noOfWheels = noOfWheels;
        this.headLight = headLight;
        this.breakLight = breakLight;
        System.out.println("Car Constructor with three parameters");
    }

    public void printCar() {
        System.out.println("No. of Wheels " + noOfWheels);
        System.out.println("Head Light: " + headLight);
        System.out.println("Brake Light: " + breakLight);
    }

    protected void showMessage() {
        System.out.println(protectedTechnology);
    }
}