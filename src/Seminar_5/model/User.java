package Seminar_5.model;

public abstract class User {
    protected int id;
    protected String name;
    protected String lastName;
    protected String status;

    public User(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
//        return String.format(getClass().getSimpleName() +("id=%s, name=%s, lastName =%s\t \n", id, name, lastName);
        return String.format("%s: \tID= %s \tИмя: %s \t Фамилия: %s\n", status, id, name, lastName);
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }
}
