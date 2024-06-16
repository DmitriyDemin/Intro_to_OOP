package Seminar_4.controller;

import Seminar_4.model.Student;
import Seminar_4.model.User;
import Seminar_4.view.StudentView;
import Seminar_4.view.UserView;

import java.util.List;

public class StudentController implements UserController{

    private UserView<Student> view = new StudentView();

    @Override
    public <T extends User> User create(T user) {
        return user ;
    }

    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);
    }
}
