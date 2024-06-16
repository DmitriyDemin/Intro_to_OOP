package Seminar_4.controller;

import Seminar_4.model.Teacher;
import Seminar_4.service.TeacherListService;
import Seminar_4.view.TeacherView;
import Seminar_4.view.UserView;

import java.util.List;

public class TeacherListController {
    private TeacherListService service;
    private UserView<Teacher> view = new TeacherView();

    public TeacherListController(TeacherListService service) {
        this.service = service;
    }

    public void addTeacherToList(Teacher teacher) {
        service.addTeacherToList(teacher);
    }

    public void sendOnConsole(List<Teacher> teachers) {
    view.sendOnConsole(teachers);
    }

    public TeacherListService getService() {
        return service;
    }
}

