import Apple.IPhone;
import Calculator.CalculatorImplementation;

public class Main {
    public static void main(String[] args) {

        //testing interface implementation
        CalculatorImplementation calculatorImplementation = new CalculatorImplementation();
        calculatorImplementation.add(5, 10);


        //testing Static keyword usages
        IPhone iPhone1 = new IPhone();
        iPhone1.setRam(4);
        IPhone iPhone2 = new IPhone();
        iPhone2.setRam(6);
        IPhone iPhone3 = new IPhone();
        iPhone3.setRam(8);
        System.out.println(iPhone1.getRam() + " " + iPhone2.getRam() + " " + iPhone3.getRam());
        iPhone1.setCpuArch("ARM");
        System.out.println(iPhone1.getCpuArch() + " " + iPhone2.getCpuArch() + " " + iPhone3.getCpuArch());
        //setting static attribute which is class level attribute - setting the static attribute value from iPhone1 object sets the value for other objects as well.
        //It is because we are setting the value at the class level and not at the object level.
    }
}