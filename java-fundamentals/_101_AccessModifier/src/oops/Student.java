package oops;

import java.security.PrivateKey;

public class Student {
    //Attributes
    public int id;
    public String name;
    private String contactNo; //making contactNo private - data Hiding in Encapsulation, allow access only through getter and setter 

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

    public Student (Student student) {
        id = student.id;
        name = student.name;
    }

    public void display() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
    }

    //getter and setter - here you can implement any auth check or match criteria to allow accessing the private contactNo attribute
    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}