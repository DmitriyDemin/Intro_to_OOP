package Seminar_6.homework;

public class Reporter implements ReporterInt<User> {

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
