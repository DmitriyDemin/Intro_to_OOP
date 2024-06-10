package Seminar_3;

public class StudentGroupService extends StudentGroupIterator {

    public StudentGroupService(StudentGroup group) {
        super(group);
    }

    public int findLastName (String lastName) {
        Student[] students = getStudents();
        for (int i = 0; i < students.length; i ++) {
           if (String.valueOf(students[i]).indexOf(lastName) >= 0){
                return i;
            }
        }
       return -1;
    }

public void remove (String lastName){
    int indexOut = findLastName(lastName);
    if (indexOut > 0) {
        Student[] students = getStudents();
        Student StudentOut = students[indexOut];
        students[indexOut] = students[students.length - 1];
        students[students.length - 1] = StudentOut;
        StudentGroup studentsStrBld = new StudentGroup("g");
        for (int i = 0; i < students.length - 1; i++) {
            studentsStrBld.addStudent(students[i]);
        }
        setStudentGroup(studentsStrBld);
    } else {
        System.out.println("Студента по фамилии: " + lastName + " в группе нет");
    }

}
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Student next() {
        return null;
    }

}
