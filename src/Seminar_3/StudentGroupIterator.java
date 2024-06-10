package Seminar_3;


import java.util.Arrays;
import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

    private StudentGroup studentGroup;
    private int index = 0;

    public StudentGroupIterator(StudentGroup group) {
        this.studentGroup = group;
    }
//********* вариант 1
    public Student[] getStudents(){
        String[] names = studentGroup.students.toString().split(" ");
        Student[] students = new Student[names.length/2];
        int count = 0;
        for (int i =0; i< names.length-1; i=i+2){
            students[count] = new Student(names[i], names[i+1], count);
            count++;
        }
        return students;
    }

    @Override
    public boolean hasNext() {
        int lengthStudents = getStudents().length;
        return index < lengthStudents;
    }

    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];
    }

    @Override
    public void remove() { //удалить последнего студента в группе
        String[] names = studentGroup.students.toString().split(" ");
        StringBuilder studentsStrBlr = new StringBuilder();
        for (int i = 0; i < names.length - 2; i++) {
            studentsStrBlr.append(names[i]).append(" ");
        }
        this.studentGroup.students = studentsStrBlr;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
}
