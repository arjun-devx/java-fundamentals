package Car_OOPS;

public class Main {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.breakLight = "Xeon LED";
        electricCar.headLight = "Matrix LED";
        electricCar.noOfWheels = 5;
        electricCar.printCar(); //this method is inherited from the parent class Car
        electricCar.showMessage();

        System.out.println("================");

    }
}