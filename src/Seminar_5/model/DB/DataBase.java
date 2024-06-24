package Seminar_5.model.DB;

import Seminar_5.model.StudentGroup;
import Seminar_5.model.Teacher;
import Seminar_5.model.Student;


import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static final List<Student> studentsDB = new ArrayList<>();

    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static final List<StudentGroup> groupsDB = new ArrayList<>();

    public static void fillDB(){

        Teacher teacher1 = new Teacher(1, "Ivan", "Ivanov",new ArrayList<>() );
        Teacher teacher2 = new Teacher(2, "Irina", "Utkina", new ArrayList<>() );
        Teacher teacher3 = new Teacher(3, "Alex", "Popov" , new ArrayList<>());
        Teacher teacher4 = new Teacher(4, "Vram", "Bagdasoryn" , new ArrayList<>());
        teachersDB.add(teacher1);
        teachersDB.add(teacher2);
        teachersDB.add(teacher3);
        teachersDB.add(teacher4);

        Student student1 = new Student(1, "Petr", "Petrov");
        Student student2 = new Student(2, "Max", "Sidorov");
        Student student3 = new Student(3, "Maxim", "Ushakov");
        Student student4 = new Student(4, "Roman", "Ivanov");
        Student student5 = new Student(5, "Sergey", "Ivonin");
        Student student6 = new Student(6, "Ivan", "Russkih");
        Student student7 = new Student(7, "Nikolay", "Ushakov");
        Student student8 = new Student(8, "Alexey", "Semakin");
        Student student9 = new Student(9, "Mihail", "Danilov");
        studentsDB.add(student1);
        studentsDB.add(student2);
        studentsDB.add(student3);
        studentsDB.add(student4);
        studentsDB.add(student5);
        studentsDB.add(student6);
        studentsDB.add(student7);
        studentsDB.add(student8);
        studentsDB.add(student9);

        StudentGroup group1 = new StudentGroup(new ArrayList<>(),teacher1);
        group1.getStudents().add(student1);
        student1.setGroupId(group1.getGroupId());
        group1.getStudents().add(student2);
        student2.setGroupId(group1.getGroupId());
        group1.getStudents().add(student3);
        student3.setGroupId(group1.getGroupId());
        groupsDB.add(group1);
        StudentGroup group2 = new StudentGroup(new ArrayList<>(), teacher2);
        group2.getStudents().add(student5);
        student5.setGroupId(group2.getGroupId());
        group2.getStudents().add(student4);
        student4.setGroupId(group2.getGroupId());
        group2.getStudents().add(student9);
        student9.setGroupId(group2.getGroupId());
        groupsDB.add(group2);

    }

}
