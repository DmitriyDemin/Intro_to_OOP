package Seminar_4.model;

public class Student extends User {

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = "Student";
    }

    public Student(int id, String lastName) {
        this.id = id;
        this.firstName = null;
        this.lastName = lastName;
        this.status = "Student";
    }



}
