package Car_OOPS;

public class PetrolCar extends  Car{

    public PetrolCar() {
        super();
    }
    public PetrolCar(int noOfWheels, String headLight, String breakLight) {
        super(noOfWheels, headLight, breakLight);
        System.out.println("Petrol Car Constructor");
    }
}
