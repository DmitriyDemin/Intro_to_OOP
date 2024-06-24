package Seminar_5.model;


import Seminar_5.model.DB.DataBase;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

    public List<Student> students = new ArrayList<>();
    public int groupId;
    private Teacher teacher;

    public StudentGroup(List<Student> students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
        this.groupId = DataBase.groupsDB.size()+1;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getGroupId() {
        return groupId;
    }

    @Override
    public String toString(){
        return String.format("ID группы=%s, преподаватель-%s, список студентов-%s\n", groupId, teacher.getLastName(), students);
    }

}

