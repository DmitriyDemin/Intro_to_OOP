package Seminar_5.model;

public class Student extends User {

    int groupId;

    public Student(int id, String name, String lastName) {
        super(id, name, lastName);
        this.status = "Student";
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }

    @Override
    public String toString(){
//        return String.format(getClass().getSimpleName() +("id=%s, name=%s, lastName =%s\t \n", id, name, lastName);
        return String.format("%s: \tID= %s \tИмя: %s \t\t\tФамилия: %s \t\tучебная группа: %s\t\n", status, id, name, lastName, groupId);
    }
}
