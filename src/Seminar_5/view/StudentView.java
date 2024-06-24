package Seminar_5.view;

import Seminar_5.controller.StudentController;
import Seminar_5.model.Student;


import java.util.List;
import java.util.Scanner;

public class StudentView {

    private StudentController controller = new StudentController();

    public void start() throws Exception{

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 - занести данные нового студента");
            System.out.println("2 - распечатать данные о студентах");
            System.out.println("3 - найти студента по ID");
            System.out.println("4 - найти студента по фамилии");
            System.out.println("5 - удалить студента из списка");
            System.out.println("0 - возврат в главное меню");

            switch (scanner.nextInt()){
                case 1 -> creatStudent();
                case 2 -> getAllStudent();
                case 3 -> getById();
                case 4 -> findByLastName ();
                case 5 -> removeByLastName ();
                                case 0 -> new View().start();
                default -> System.out.println("операция не поддерживается");
            }
        }
    }

    private Student creatStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя:" );
        String name = scanner.nextLine();
        System.out.println("введите фамилию:" );
        String lastName = scanner.nextLine();
//        System.out.println("введите номер группы:" );
//        int groupId = scanner.nextInt();
        Student student = controller.creatStudent(name, lastName);
        System.out.println(student);
        return student;

    };
    private Student getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите id студента:" );
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;

    };
    private List<Student> getAllStudent(){
        List<Student> students = controller.getAllStudent();
        System.out.println(students);
        return students;
    };

    public Student findByLastName () throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите фамилию студента:" );
        String lastName = scanner.nextLine();
        Student student = controller.findByLastName(lastName);
        System.out.println(student);
        return student;

    }

    public void removeByLastName () throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите фамилию студента:" );
        String lastName = scanner.nextLine();
        controller.removeByLastName(lastName);

    }

}
