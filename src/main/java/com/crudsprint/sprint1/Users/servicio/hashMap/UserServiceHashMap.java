package com.crudsprint.sprint1.Users.servicio.hashMap;

import com.crudsprint.sprint1.Users.model.User;

import java.util.HashMap;

public interface UserServiceHashMap {
    HashMap<Integer, User> findAllUserMap();
    User findUserById(Integer idUser);
    User createUser(User user);
    User updateUser(Integer id, User user);
    User deleteUser(Integer id);
}
