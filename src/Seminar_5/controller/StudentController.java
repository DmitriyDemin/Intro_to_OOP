package Seminar_5.controller;

import Seminar_5.model.DB.DataBase;
import Seminar_5.service.StudentService;
import Seminar_5.model.Student;

import java.util.List;

public class StudentController {

    private StudentService sSrv = new StudentService();

    public Student creatStudent(String name, String lastName){
        return sSrv.creatStudent(name, lastName);
    }

    public Student getById (int id){
        Student student = null;
        try {
            student = sSrv.getById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllStudent(){
        return sSrv.getAllStudent();
    }

    public Student findByLastName (String lastName) {
        Student student = null;
        try {
            student = sSrv.findByLastName(lastName);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return student;
    }

    public void removeByLastName (String lastName) {
        Student student = null;
        try {
            sSrv.removeByLastName(lastName);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
