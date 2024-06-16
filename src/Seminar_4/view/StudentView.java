package Seminar_4.view;

import Seminar_4.model.Student;

import java.util.List;

public class StudentView implements UserView<Student>{


    @Override
    public void sendOnConsole(List<Student> students) {
        System.out.println(students);

    }
}


