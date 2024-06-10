package Seminar_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", 6);
        Student student2 = new Student("Mihail","Petrov", 3);
        Student student3 = new Student("Alex","Sidorov", 2);
        Student student4 = new Student("Maria", "Popova", 5);
        Student student5 = new Student("Alexey","Maximov", 1);
        Student student6 = new Student("Robert","Danilovsky", 4);
        Student student7 = new Student("Vram","Bagdosariyn", 7);
        Student student8 = new Student("Nikola","Ivonin", 8);
        StudentGroup studentGroup1 = new StudentGroup("Builders");
        StudentGroup studentGroup2 = new StudentGroup("Electricians");
        StudentGroup studentGroup3 = new StudentGroup("Economists");
        Stream stream2023 = new Stream("Stream - 2023");
        Stream stream2024 = new Stream("Srteam - 2024");

        studentGroup1.addStudent(student1);
        studentGroup1.addStudent(student2);
        studentGroup1.addStudent(student3);
        studentGroup2.addStudent(student4);
        studentGroup2.addStudent(student5);
        studentGroup3.addStudent(student6);
        studentGroup2.addStudent(student7);
        studentGroup1.addStudent(student8);

        stream2023.addStudentGroup(studentGroup1);
        stream2024.addStudentGroup(studentGroup3);
        stream2024.addStudentGroup(studentGroup2);

        StudentGroupService service = new StudentGroupService(studentGroup1);
        System.out.println(Arrays.toString(service.getStudents()));
        System.out.println("поиск студента по фамилии(возвращает место в списке):");
        System.out.println(service.findLastName("Petrov"));
        System.out.println("метод удаления студента из группы по фамилии:");
        service.remove("Sidorov");
        System.out.println(Arrays.toString(service.getStudents()));

        for (Student st:studentGroup2){
            System.out.println("student: " + st);
        }
        System.out.println("сортировака списка студентов по id ");
        ArrayList<Student> arrayList =  new ArrayList<Student>(List.of(student1,student2,student3,student4,student5));
        System.out.println(arrayList);
        Collections.sort(arrayList, (s1,s2) ->s1.id -s2.id);
        System.out.println(arrayList);


        ArrayList<Stream> streamList =  new ArrayList<Stream>(List.of(stream2024,stream2023));
        System.out.println(streamList);
        System.out.println("сортировка потоков по количеству групп в потоке");
        StreamService sS = new StreamService(streamList);

        sS.streamSort();
        System.out.println(sS.getStreams());

        Controller controller = new Controller(studentGroup2);

        System.out.println(controller.findLastName("Vram"));



    }
}
