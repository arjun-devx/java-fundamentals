import oops.*;

public class Main {
    public static void main(String[] args) {

        //Constructor Demo -
        /*
        This section is for the Constructor demo
        //Creating Object using the default constructor
        Student student;
        student = new Student();
        student.id = 1;
        student.name = "Arjun";
        student.display();

        //Creating Object using the parameterized constructor
        Student student1 = new Student(1, "Arjun");
        Student student2 = new Student(2, "Agastya");
        student1.display();
        student2.display();

        //Creating Object using the Copy Constructor
        IPhone iPhone15 = new IPhone(15, 15, 50000, "Iphone", "Apple", 6, 4, 3500);
        IPhone iPhone16 = new IPhone(iPhone15);
        IPhone iPhone17 = new IPhone(iPhone16);

        //shallow copy and deep copy
        Student std = new Student(3, "John");
        Student std1 = std;
        Student std2 = new Student(std);
        */

        //Inheritance Demo -
        /*
        ElectricCar electricCar = new ElectricCar(5, "Xeon LED", "Matrix LED", 10, 50000);
        electricCar.displayCar();
        System.out.println("Attribute from the Child Class ElectricCar - 'batteryCount': " + electricCar.batteryCount);
         */

        //Polymorphism demo
        Calculator calculator = new Calculator();
        calculator.add(5, 6);
        calculator.add(4.5, 5.6);
        calculator.add(1.2, 9999);
        calculator.add(100000, 1.11111);

        Car car = new Car();
        car.startEngine();

        ElectricCar electricCar = new ElectricCar();
        electricCar.startEngine();
    }
}