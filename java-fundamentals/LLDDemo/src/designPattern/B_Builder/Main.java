package designPattern.B_Builder;

import java.util.BitSet;

public class Main {
    public static void main (String[] args) {
        Car car = new Car(5, "Neo");

        Student student;
        StudentHelper studentHelper = new StudentHelper(1, "Arjun", 90, 30, "Batch-A", "BITS", 2015, "1232323333");
        boolean isValid = StudentValidator.validate(studentHelper);
        if (isValid) {
            student = new Student(studentHelper);
        }
    }
}
