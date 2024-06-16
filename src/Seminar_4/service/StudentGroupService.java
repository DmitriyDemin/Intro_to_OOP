package Seminar_4.service;

import Seminar_4.model.Student;
import Seminar_4.model.StudentGroup;

import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.students.add(student);
    }

    public List<Student> sort(){
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }

    public int findByLastName (String lastName) {
        List<Student> students = studentGroup.getStudents();

        for (Student student: students){
            if (student.getLastName().startsWith(lastName)){
                return student.getId();
            }
            }
        return -1;
    }

    public int getSize(){
        return studentGroup.students.size();
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}
