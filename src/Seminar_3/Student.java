//Задача 1 - Iterator
    //� Создать класс Студент
    //� Создать класс УчебнаяГруппа
    //� Создать класс УчебнаяГруппаИтератор, заставив его реализовать
    //интерфейс Iterator
    //� Реализовать его контракты (включая удаление)

package Seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    public String firstName;
    public String lastName;
    public int id;

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

    }

    public Student(String name, int id) {
        this.firstName = name;
        this.id = id;
    }
//
    public Student(String name) {
        this.firstName = name;
    }


    @Override
    public String toString(){
        return (lastName + " " + firstName);
    }

    @Override
    public int compareTo(Student o) {
        if (o.firstName.length() > this.firstName.length()) return -1;
        else if (o.firstName.length() < this.firstName.length()) return 1;
        return 0;

//        return o.name.length()-this.name.length(): //
    }

}
