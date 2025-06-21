package advancedConcepts;

public class  SmartTV extends TV {

    @Override
    public void volume() {
        System.out.println("Change Volume Smartly");
    }

    public void brightness() {
        System.out.println("Change the brightness of the TV");
    }

}
