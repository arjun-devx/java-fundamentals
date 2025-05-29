package oops;

public class Student {
    //Attributes
    public int id;
    public String name;

    //constructor overload
    //manual constructor overwriting the default constructor
    public Student () {

    }
    public Student (int sid) {
        this.id = sid;
    }
    public Student (String name) {
        this.name = name;
    }
    public Student(int sid, String sname) {
        this.id = sid;
        this.name = sname;
    }

    public void display() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
    }
}