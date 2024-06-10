//Задача 2 - Iterable
//        � Модифицировать класс УчебнаяГруппа, заставив его реализовать
//        интерфейс Iterable
//        � Реализовать метод iterator() возвращающий экземпляр созданного нами
//        итератора
//        � Создать класс УчебнаяГруппаСервис, добавив в него метод удаления
//        студента по ФИО
//        � Создать класс Контроллер, добавив в него метод удаления студента и
//        вызывать в нем созданный метод из УчебнаяГруппаСервис

package Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {

    public String nameGroup;
    public StringBuilder students = new StringBuilder();

    public StudentGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void addStudent(Student student){
        students.append(student).append(" ");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString(){
        return nameGroup ;
    }
}
