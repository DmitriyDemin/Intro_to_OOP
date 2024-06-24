package Seminar_5.controller;

import Seminar_5.model.DB.DataBase;
import Seminar_5.model.Student;
import Seminar_5.model.StudentGroup;
import Seminar_5.model.Teacher;
import Seminar_5.service.StudentGroupService;
import Seminar_5.service.TeacherService;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupController {

    private StudentGroupService sGsrv = new StudentGroupService();
    private TeacherService thSrv = new TeacherService();


    public StudentGroup createStudentGroup(int teacherId){
        Teacher teacher = null;
        try{
            teacher = thSrv.getById(teacherId);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        List<Student> students = new ArrayList<>();
        return sGsrv.createStudentGroup(students, teacher);
    }




    public List<StudentGroup> getStudGroup(){
        return DataBase.groupsDB;
    }

    public void removeStudentGroup(int groupId) {
        sGsrv.removeStudentGroup(groupId);
    }

    public void addStudentToGroup(int studentId, int groupId) throws Exception {
        sGsrv.addStudentToGroup(studentId, groupId);
    }
    public void removeStudentFromGroup(int id, int groupId) throws Exception{
        sGsrv.removeStudentFromGroup(id, groupId);
    }

    public void addTeacherToGroup (int teacherId, int groupId)throws Exception{
        sGsrv.addTeacherToGroup(teacherId, groupId);
    }

    public void transferStudent(int studentId, int newGroupId)throws Exception{
        sGsrv.transferStudent(studentId, newGroupId);

    }



}

