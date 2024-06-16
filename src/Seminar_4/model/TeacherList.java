package Seminar_4.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherList {

    public  List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public int getSize(){
        return teachers.size();
    }

}
