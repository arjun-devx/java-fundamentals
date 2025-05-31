package oops;
public class Car {

    public int noOfWheels;
    public String headLight;
    public String backLight;

    public void displayCar() {
        System.out.println("Attribute from the Super Class Car - 'No. Of Wheels in the Car noOfWheels': " + noOfWheels);
        System.out.println("Attribute from the Super Class Car - 'headLight of the Car headLight': " + headLight);
        System.out.println("Attribute from the Super Class Car - 'backLight of the Car backLight': " + backLight);
    }
}
