package Seminar_5.view;

import Seminar_5.controller.StudentGroupController;
import Seminar_5.model.DB.DataBase;
import Seminar_5.model.Student;
import Seminar_5.model.StudentGroup;
import Seminar_5.model.Teacher;
import Seminar_5.service.TeacherService;

import java.util.List;
import java.util.Scanner;

public class StudentGroupView {

    private StudentGroupController groupController = new StudentGroupController();

    public void start() throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - сформировать учебную группу");
            System.out.println("2 - показать список учебных групп");
            System.out.println("3 - добавить студента в учебную группу(по ID)");
            System.out.println("4 - добавить преподавателя в учебную группу(по ID)");
            System.out.println("5 - удалить студента ");
            System.out.println("6 - перевести студента в другую группу");
            System.out.println("0 - возврат в главное меню");

            switch (scanner.nextInt()) {
                case 1 -> createStudentGroup();
                case 2 -> getStudGroup();
                case 3 -> addStudentToGroup();
                case 4 -> addTeacherToGroup();
                case 5 -> removeStudentFromGroup();
                case 6 -> transferStudent();
                case 0 -> new View().start();
                default -> System.out.println("операция не поддерживается");
            }
        }
    }

    private StudentGroup createStudentGroup() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите iD преподавателя:");
        int teacherid = scanner.nextInt();
        StudentGroup group = groupController.createStudentGroup(teacherid);
        return group;
    }


    private void getStudGroup() {
        System.out.println(groupController.getStudGroup());
    }

    public void addStudentToGroup() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите ID группы:");
        int groupId = scanner.nextInt();
        System.out.println("введите ID студента:");
        int studentId = scanner.nextInt();
        groupController.addStudentToGroup(studentId, groupId);
    }

    public void addTeacherToGroup() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите ID преподавателя:");
        int teacherId = scanner.nextInt();
        System.out.println("введите ID учебной группы:");
        int groupId = scanner.nextInt();
        groupController.addTeacherToGroup(teacherId, groupId);
    }


    public void removeStudentFromGroup()throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите ID студента:");
        int studentId = scanner.nextInt();
        System.out.println("введите ID учебной группы:");
        int groupId = scanner.nextInt();
        groupController.removeStudentFromGroup(studentId, groupId);

    }

    public void transferStudent() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите ID студента :");
        int studentId = scanner.nextInt();
        System.out.println("введите ID новой учебной группы:");
        int newGroupId = scanner.nextInt();
        groupController.transferStudent(studentId,newGroupId);

        }
    }





