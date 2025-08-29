package Car_OOPS;

public class ElectricCar extends  Car{
    //Inheritance Demo
    //The child class here will call the parent class constructor first and then the child class constructor will be called
    //As soon as the parent class constructor has manual parameterize constructor overriding the default constructor then the
    // child class extending the parent class will start throwing the errors as the parent class now needs the inputs in creating the object
    //using the parameterized constructor, hence we need to add a blank non parameterized constructor in parent which does not need any inputs.

    public ElectricCar() {
        System.out.println("ElectricCar Constructor - Child Class of the parent class Car");
        //this requires default constructor in parent class
    }
    public void display() {
        System.out.println(protectedTechnology);
        showMessage();
    }
    public void printElectricCar() {
        super.setLaunchDate("28/08/2025");
        System.out.println("NoOfWheels : " + super.getLaunchDate());
    } //calling private attribute using the getter and setter method

    @Override
    public void startEngine() {
        System.out.println("Starting Electric motor from battery in ElectricCar");
    }
}
