package Seminar_4.view;

import Seminar_4.model.User;

import java.util.List;

public interface UserView<T extends User> {

    void sendOnConsole(List<T> users);
}
