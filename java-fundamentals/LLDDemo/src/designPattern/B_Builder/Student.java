package designPattern.B_Builder;

public class Student {
    private int id;
    private String name;
    private double psp;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;
    private String phoneNumber;

    public Student(StudentHelper studentHelper) {
        this(studentHelper.getId(),
                studentHelper.getName(),
                studentHelper.getPsp(),
                studentHelper.getAge(),
                studentHelper.getBatch(),
                studentHelper.getUniversityName(),
                studentHelper.getGradYear(),
                studentHelper.getPhoneNumber());
    }

    public Student(int id, String name, double psp, int age, String batch, String universityName, int gradYear, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.age = age;
        this.batch = batch;
        this.universityName = universityName;
        this.gradYear = gradYear;
        this.phoneNumber = phoneNumber;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
