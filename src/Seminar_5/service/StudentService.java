package Seminar_5.service;


import Seminar_5.model.Student;
import Seminar_5.model.DB.DataBase;


import java.util.List;

public class StudentService {

    public Student creatStudent(String name, String lastName){
        int id;
        int size =  DataBase.studentsDB.size();
        id = size+1;
        Student student = new Student(id, name, lastName);
        DataBase.studentsDB.add(student);
        return student;
    }

    public Student getById (int id) throws Exception{
        Student student = DataBase.studentsDB
                .stream()
                .filter(stud -> stud.getId() == id)
                .findFirst()
                .orElse(null);
        if (student == null){
            throw new Exception("Student is not found");
        }
        return student;
    }

    public List<Student> getAllStudent(){
        return DataBase.studentsDB;
    }


/*поиск, удаление - самостоятельно*/
    public Student findByLastName (String lastName) throws Exception{
        Student student = DataBase.studentsDB
                .stream()
                .filter(stud -> stud.getLastName().toUpperCase().contains(lastName.toUpperCase()))
                .findFirst()
                .orElse(null);
        if (student == null){
            throw new Exception("Student is not found");
        }
        return student;
    }

    public void removeByLastName (String lastName) throws Exception {
        Student student = findByLastName(lastName);
        DataBase.studentsDB.remove(student);
        if (student == null){
            throw new Exception("Student is not found");
        }
    }

}
