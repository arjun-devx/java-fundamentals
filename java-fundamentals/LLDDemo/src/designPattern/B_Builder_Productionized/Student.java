package designPattern.B_Builder_Productionized;

public class Student {
    private int id;
    private String name;
    private double psp;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;
    private int phoneNumber;


    public Student(int id, String name, double psp, int age, String batch, String universityName, int gradYear, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.age = age;
        this.batch = batch;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                ", age=" + age +
                ", batch='" + batch + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    public static StudentHelper builder() {
        return  new StudentHelper();
    }

    public static class StudentHelper {
        private int id;
        private String name;
        private double psp;
        private int age;
        private String batch;
        private String universityName;
        private int gradYear;
        private int phoneNumber;

        public StudentHelper setId(int id) {
            this.id = id;
            return this;
        }

        public StudentHelper setName(String name) {
            this.name = name;
            return this;
        }

        public StudentHelper setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public StudentHelper setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentHelper setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentHelper setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public StudentHelper setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public StudentHelper setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }


        public Student build() {
            validate();
            return new Student(
                    this.id,
                    this.name,
                    this.psp,
                    this.age,
                    this.batch,
                    this.universityName,
                    this.gradYear,
                    this.phoneNumber);
        }

        public void validate() {
            if (this.age < 18) throw new InvalidAgeException("Age must be atleast 18");
            if (this.gradYear > 2025) throw new InvalidateGradYearException("Grad Year must be 2025 of earlier");
            if (this.name == null || this.name.isBlank() || this.name.isEmpty()) throw new InvalideNameException("Name cannot be empty");
        }

    }

}
