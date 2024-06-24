package Seminar_5.controller;


import Seminar_5.model.DB.DataBase;
import Seminar_5.model.Student;
import Seminar_5.model.Teacher;
import Seminar_5.service.StudentGroupService;
import Seminar_5.service.TeacherService;

import java.util.List;

public class TeacherController {

    private TeacherService thSrv = new TeacherService();
    private StudentGroupService stGsrv = new StudentGroupService();

    public Teacher creatTeacher(String name, String lastName){
        return thSrv.creatTeacher(name, lastName);
    }

    public List<Teacher> getAllTeacher() {
        return thSrv.getAllTeacher();
    }

    public Teacher getById (int id)  {
        Teacher teacher = null;
        try {
            thSrv.getById(id);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public void addGroupId(int id, int idGroup) throws Exception {
        stGsrv.addTeacherToGroup(id, idGroup);
    }

    }








