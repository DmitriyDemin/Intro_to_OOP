package Seminar_4;


import Seminar_4.controller.StudentController;
import Seminar_4.controller.StudentGroupController;
import Seminar_4.controller.TeacherListController;
import Seminar_4.model.Student;
import Seminar_4.model.StudentGroup;
import Seminar_4.model.Teacher;
import Seminar_4.model.TeacherList;
import Seminar_4.service.StudentGroupService;
import Seminar_4.service.StudentService;
import Seminar_4.service.TeacherListService;



import java.util.List;


public class Main {
    public static void main(String[] args) {
        StudentService stSrv = new StudentService();
        Student st1 = new Student(1, "Sergey", "Petrov");
        Student st2 = new Student(2, "Mihail", "Ivanov");
        Student st3 = new Student(3, "Alex", "Sidorov");
        Student st4 = new Student(4, "Maria", "Popova");
        Student st5 = new Student(5, "Alexey", "Maximov");
        Student st6 = new Student(6, "Robert", "Danilovsky");
        Student st7 = new Student(7, "Vram", "Bagdosariyn");
        Student st8 = new Student(8, "Sergey", "Petrov");
        Student st9 = stSrv.creatStudent(9, "Serg", "Pavlov");

        Teacher th1 = new Teacher(1, "Elena", "Ushakova");
        Teacher th2 = new Teacher(2, "Marina", "Danilova");

        TeacherList tl1 = new TeacherList();

        StudentGroupController stGctr = new StudentGroupController(new StudentGroupService(new StudentGroup()));
        stGctr.addStudent(st1);
        stGctr.addStudent(st3);
        stGctr.addStudent(st2);
        stGctr.addStudent(st5);
        stGctr.sendOnConsole(stGctr.getService().getStudentGroup().getStudents());

        TeacherListController thLctr = new TeacherListController(new TeacherListService(new TeacherList()));
        thLctr.addTeacherToList(th1);
        thLctr.addTeacherToList(th2);
        thLctr.sendOnConsole(thLctr.getService().sort());

        th1.setFirstName("Irina");
        thLctr.sendOnConsole(thLctr.getService().sort());

    }
}
