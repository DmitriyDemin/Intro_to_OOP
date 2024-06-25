package Seminar_6.homework;

public class Persister implements PersisterInt<User> {

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
