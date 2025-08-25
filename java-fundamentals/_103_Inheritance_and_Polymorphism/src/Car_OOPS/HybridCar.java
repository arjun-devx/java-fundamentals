package Car_OOPS;

public class HybridCar extends  Car {
    //Inheritance Demo
    //The child class here will call the parent class constructor first and then the child class constructor will be called
    //As soon as the parent class constructor has manual parameterize constructor overriding the default constructor then the
    // child class extending the parent class will start throwing the errors as the parent class now needs the inputs in creating the object
    //using the parameterized constructor, hence we need to add a blank non parameterized constructor in parent which does not need any inputs.

    public HybridCar() {
        System.out.println("HybridCar child class constructor ");
    }

    //the flow is from top to down - first parent class constructor and then child class constructors
    //Super - whatever parent class constructor is expecting - create child class constructors according to it using the super keyword

    public HybridCar(int noOfWheels) {
        super(noOfWheels);
        System.out.println("HybridCar - Child Class Constructor");
        //Super should be the first line of the constructor.
    }
    //Constructor calling constructor
}
