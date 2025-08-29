import Car_OOPS.ElectricCar;
import Car_OOPS.HybridCar;
import Car_OOPS.PetrolCar;

public class Main {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.breakLight = "Xeon LED";
        electricCar.headLight = "Matrix LED";
        electricCar.noOfWheels = 5;
        electricCar.printCar(); //this method is inherited from the parent class Car
        electricCar.setLaunchDate("1232");
        System.out.println(electricCar.getLaunchDate());
        electricCar.printElectricCar();
        electricCar.display();

        System.out.println("================");

        HybridCar hybridCar = new HybridCar();
        hybridCar.breakLight = "Halogen";
        hybridCar.headLight = "LED";
        hybridCar.noOfWheels = 5;
        hybridCar.printCar();

        System.out.println("================");

        HybridCar hybridCar1 = new HybridCar(6);
        hybridCar1.printCar();

        PetrolCar petrolCar = new PetrolCar();
        petrolCar.printCar();

        PetrolCar petrolCar1 = new PetrolCar(5, "Halogen", "LED");
        petrolCar1.printCar();
    }
}