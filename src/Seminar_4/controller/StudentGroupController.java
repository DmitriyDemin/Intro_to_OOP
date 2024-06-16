package Seminar_4.controller;

import Seminar_4.model.Student;
import Seminar_4.model.StudentGroup;
import Seminar_4.model.User;
import Seminar_4.service.StudentGroupService;
import Seminar_4.view.StudentView;
import Seminar_4.view.UserView;

import java.util.List;


public class StudentGroupController {

    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }

    private UserView<Student> view = new StudentView();

    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);
    }

    public StudentGroupService getService() {
        return service;
    }
}
