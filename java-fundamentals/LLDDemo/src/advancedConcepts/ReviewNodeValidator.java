package advancedConcepts;

public class ReviewNodeValidator implements  Validator {

    @Override
    public Boolean validate() {
        System.out.println("Validating Review Node");
        return true;
    }
}
