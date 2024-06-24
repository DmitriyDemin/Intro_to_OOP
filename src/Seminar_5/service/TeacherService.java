package Seminar_5.service;

import Seminar_5.model.DB.DataBase;
import Seminar_5.model.Student;
import Seminar_5.model.Teacher;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TeacherService {



    public Teacher creatTeacher(String name, String lastName){
        int size =  DataBase.teachersDB.size();
        int id = size+1;
        List<Integer> groups = new ArrayList<>();
        Teacher teacher = new Teacher(id, name, lastName, groups);
        DataBase.teachersDB.add(teacher);
        return teacher;
    }

    public Teacher getById (int id) throws Exception {
        Teacher teacher = DataBase.teachersDB
                .stream()
                .filter(teacher1 -> teacher1.getId() == id)
                .findFirst()
                .orElse(null);
        if (teacher == null) {
            throw new Exception("Teacher is not found");
        }
        return teacher;
    }

    public List<Teacher> getAllTeacher(){
        return DataBase.teachersDB;
    }


    public void addGroupId(int id, int idGroup) throws Exception {
        Teacher teacher = getById (id);
        teacher.getGroups().add(idGroup);
        if (teacher == null) {
            throw new Exception("Teacher is not found");
        }
    }



    }
