package Seminar_6.homework;

public class User{

    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public static class Main{
        public static void main(String[] args){
            User user = new User("Bob");
            Reporter reporter = new Reporter();
            Persister persister = new Persister();
            reporter.report(user);
            persister.save(user);
        }
    }
}
