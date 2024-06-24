package Seminar_5.view;


import Seminar_5.controller.TeacherController;
import Seminar_5.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {

    TeacherController teacherController = new TeacherController();


    public void start() throws Exception{

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 - занести данные нового преподавателя");
            System.out.println("2 - распечатать данные о преподавателях");
            System.out.println("3 - добавить учебную группу преподавателю");
            System.out.println("0 - возврат в главное меню");

            switch (scanner.nextInt()){
                case 1 -> creatTeacher();
                case 2 -> getAllTeacher();
                case 3 -> addTeacherToGroup ();
                case 0 -> new View().start();
                default -> System.out.println("операция не поддерживается");
            }
        }

    }
    private Teacher creatTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя преподавателя:");
        String name = scanner.nextLine();
        System.out.println("введите фамилию преподавателя:");
        String lastName = scanner.nextLine();
        Teacher teacher = teacherController.creatTeacher(name, lastName);
        System.out.println(teacher);
        return teacher;
    }

    private List<Teacher> getAllTeacher() {
        List<Teacher> teachers = teacherController.getAllTeacher();
        System.out.println(teachers);
        return teachers;
    }

    private void addTeacherToGroup () throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите ID преподавателя:");
        int teacherId = scanner.nextInt();
        System.out.println("введите ID учебной группы:");
        int groupId = scanner.nextInt();
        teacherController.addGroupId(teacherId, groupId);
    }

}




