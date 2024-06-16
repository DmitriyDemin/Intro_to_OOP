package Seminar_4.service;

import Seminar_4.model.Student;

public class StudentService {

    public Student student;

    public Student creatStudent(int id, String firstName, String lastName){
        return new Student(id, firstName, lastName);
    }


}
