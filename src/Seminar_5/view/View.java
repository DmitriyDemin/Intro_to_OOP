package Seminar_5.view;

import Seminar_5.model.DB.DataBase;

import java.util.Scanner;

public class View {

    StudentView stView = new StudentView();
    StudentGroupView grView = new StudentGroupView();
    TeacherView thView = new TeacherView();


    public void start() throws Exception{
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 - работа с данными студентов");
            System.out.println("2 - работа с данными групп студентов");
            System.out.println("3 - работа с данными преподавателей");
            System.out.println("4 - завершение работы");

            switch (scanner.nextInt()){
                case 1 -> stView.start();
                case 2 -> grView.start();
                case 3 -> thView.start();
                case 4 -> System.exit(0);
                default -> System.out.println("операция не поддерживается");
            }
        }
    }

}
