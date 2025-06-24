package advancedConcepts;

public class StatusNodeValidator implements Validator{


    @Override
    public Boolean validate() {
        System.out.println("Validating Status Node");
        return true;
    }
}
