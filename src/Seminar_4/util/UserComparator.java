package Seminar_4.util;

import Seminar_4.model.User;

import java.util.Comparator;

public class UserComparator <T extends User> implements Comparator<T> {


    @Override
    public int compare(User o1, User o2) {
        return o1.getId() - o2.getId();
    }
}
