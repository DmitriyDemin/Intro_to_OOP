package Seminar_5.service;


import Seminar_5.model.DB.DataBase;
import Seminar_5.model.Student;
import Seminar_5.model.StudentGroup;
import Seminar_5.model.Teacher;

import java.util.List;


public class StudentGroupService {



    StudentService serv = new StudentService();
    TeacherService thServ = new TeacherService();


    public StudentGroup createStudentGroup(List<Student> students, Teacher teacher){
        int groupId;
        int size = DataBase.groupsDB.size();
        StudentGroup studentsGr = new StudentGroup(students, teacher);
        DataBase.groupsDB.add(studentsGr);
        return studentsGr;
    }

    public void removeStudentGroup(int groupId) {
        for (StudentGroup group : DataBase.groupsDB) {
            if (group.getGroupId() == groupId) {
                DataBase.groupsDB.remove(groupId);
            }
        }
    }

    public void addStudentToGroup(int studentId, int groupId) throws Exception{

        Student stud = serv.getById(studentId);

        for (StudentGroup group: DataBase.groupsDB){
            if (group.getGroupId() == groupId){
                group.getStudents().add(stud);
                stud.setGroupId(groupId);//при добавлении студента в группу, меняем Id группы для студента
            }
        }
    }
    public void removeStudentFromGroup(int id, int groupId) throws Exception{

        Student stud = serv.getById(id);

        for (StudentGroup group: DataBase.groupsDB){
            if (group.getGroupId()==groupId) {
                group.getStudents().remove(stud);
            }
            }

    }

    public void addTeacherToGroup (int teacherId, int groupId) throws Exception{
        for (StudentGroup group: DataBase.groupsDB){
            if (group.getGroupId()==groupId){
                group.setTeacher(thServ.getById(teacherId));
                thServ.getById(teacherId).getGroups().add(groupId);
            }
        }

    }

    public void transferStudent(int studentId, int newGroupId)throws Exception{
        Student student = serv.getById(studentId);
        int oldGroupId = student.getGroupId();
        removeStudentFromGroup(studentId, oldGroupId);
        addStudentToGroup(studentId, newGroupId);

    }

}
