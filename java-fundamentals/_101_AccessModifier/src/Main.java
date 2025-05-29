import oops.Student;

public class Main {
    public static void main(String[] args) {

        //Creating object using the default constructor
        /*
        Student student;
        student = new Student();
        student.id = 1;
        student.name = "Arjun";
        student.display();
         */

        //Creating Object using the parameterized constructor
        Student student1 = new Student(1, "Arjun");
        Student student2 = new Student(2, "Agastya");
        student1.display();
        student2.display();
    }
}