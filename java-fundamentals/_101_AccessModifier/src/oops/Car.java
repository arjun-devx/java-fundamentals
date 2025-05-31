package oops;
public class Car {

    public int noOfWheels;
    public String headLight;
    public String backLight;

    //when I extended this super class CAR to other child as per the concept of the OOPS - inheritance with default constructor in this class -
    // the child class were able to inherit the attributes provided from the super class without any error.
    //But as soon as I added manual parameterized constructor - the child class started throwing errors. "There is no default constructor available in 'oops.Car'"
    //parameterized constructor below

    //Default Constructor
    public Car() {
        System.out.println("You are viewing print statement from the parent or super class constructor");
    }

    public  Car(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public Car(int noOfWheels, String headLight, String backLight) {
        this.noOfWheels = noOfWheels;
        this.headLight = headLight;
        this.backLight = backLight;
    }


    public void displayCar() {
        System.out.println("Attribute from the Super Class Car - 'No. Of Wheels in the Car noOfWheels': " + noOfWheels);
        System.out.println("Attribute from the Super Class Car - 'headLight of the Car headLight': " + headLight);
        System.out.println("Attribute from the Super Class Car - 'backLight of the Car backLight': " + backLight);
    }
}
