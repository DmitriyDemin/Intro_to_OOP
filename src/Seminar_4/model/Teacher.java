package Seminar_4.model;

import java.time.LocalDate;

public class Teacher extends User {

    public Teacher(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = "Teacher";

    }



}
