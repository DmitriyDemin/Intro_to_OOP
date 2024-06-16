package Seminar_4.model;

import Seminar_4.util.UserComparator;

public abstract class User extends UserComparator<User> implements Comparable<User> {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int compareTo(User o) {
        return compare(this, o);
    }

    @Override
    public String toString() {

//        return status +':'+'\t' + lastName + '\t' + firstName + '\t';
        return String.format("%s [id=%d, firstName=%s, lastName=%s]",status, id, firstName, lastName);
    }
}
