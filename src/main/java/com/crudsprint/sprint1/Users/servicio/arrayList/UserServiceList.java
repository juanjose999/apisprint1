package com.crudsprint.sprint1.Users.servicio.arrayList;

import com.crudsprint.sprint1.Users.model.User;

import java.util.ArrayList;

public interface UserServiceList {
    ArrayList<User> findAllUser();
    User findUserById(Integer idUser);
    User createUser(User user);
    User updateUser(Integer id, User user);
    User deleteUser(Integer id);
}
