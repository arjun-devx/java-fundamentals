package advancedConcepts;

@FunctionalInterface // this annotation is just for readability purpose only, does not make any difference in execution
public interface Validator { // interface which only implements single abstrace method are called functional Interface
     abstract Boolean validate(); // abstract keyword is greyed out - either you can put it there or dont put it - doesnt impact the execution of the code
}
