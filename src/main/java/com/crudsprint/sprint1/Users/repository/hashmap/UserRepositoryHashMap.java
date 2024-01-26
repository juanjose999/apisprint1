package com.crudsprint.sprint1.Users.repository.hashmap;

import com.crudsprint.sprint1.Users.model.User;

import java.util.HashMap;

public interface UserRepositoryHashMap {
    HashMap<Integer , User> findAllUserMap();
    User findUserById(Integer idUser);
    User createUser(User user);
    User updateUser(Integer id, User user);
    User deleteUser(Integer id);
}
