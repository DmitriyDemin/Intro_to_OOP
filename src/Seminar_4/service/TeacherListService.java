package Seminar_4.service;

import Seminar_4.model.*;
import Seminar_4.view.StudentView;
import Seminar_4.view.TeacherView;
import Seminar_4.view.UserView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherListService {

    private TeacherList teachersList;

    public TeacherListService(TeacherList teachers) {
        this.teachersList = teachers;
    }

    public void addTeacherToList(Teacher teacher) {
        teachersList.teachers.add(teacher);
    }

    public List<Teacher> sort() {
        Collections.sort(teachersList.teachers);
        return teachersList.teachers;
    }

    private UserView<Teacher> view = new TeacherView();

    public void sendOnConsole(List<Teacher> teachers) {
        view.sendOnConsole(teachers);

    }

    public int getSize(){
        return teachersList.teachers.size();
    }

    public TeacherList getTeachersList() {
        return teachersList;
    }
}