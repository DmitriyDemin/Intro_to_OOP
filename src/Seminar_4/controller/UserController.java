package Seminar_4.controller;

import Seminar_4.model.User;

public interface UserController {

    <T extends User> User  create(T user);
}
