package Seminar_5.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teacher extends User {

    private List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastName, List<Integer> groups) {
        super(id, name, lastName);
        this.groups = groups;
        this.status = "Teacher";
    }

    public List<Integer> getGroups() {
        return groups;
    }

    @Override
    public String toString(){
        return String.format(getClass().getSimpleName()+": ID=%s, \tИмя: %s, \tФамилия: %s, \tсписок учебных групп:%s\n", id, name, lastName, groups);
    }


}
