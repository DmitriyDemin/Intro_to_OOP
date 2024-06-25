package Seminar_6.homework;
/*
* Для соблюдения принципа SRP из класса User исключил методы report и save.
* Для реализации принципа DIP создал интерфейсы PersisterInt и ReportInt, которые в соответствии с ISP отвечают
* за узкоспециализированные задачи.
*/
public class Main {

    public static void main(String[] args) {
        User user = new User("Bob");
        Reporter reporter = new Reporter();
        Persister persister = new Persister();
        reporter.report(user);
        persister.save(user);
    }
}
