package advancedConcepts;

@FunctionalInterface // this annotation is just for readability purpose only, does not make any difference in execution
public interface Validator { // interface which only implements single method are called functional Interface
     Boolean validate();
}
