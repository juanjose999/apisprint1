package com.crudsprint.sprint1.Users.servicio.arrayList;

import com.crudsprint.sprint1.Users.model.User;
import com.crudsprint.sprint1.Users.repository.arrayList.UserRepositoryList;
import com.crudsprint.sprint1.Users.repository.hashmap.UserRepositoryHashMap;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;

public class UserServiceListImpl implements UserServiceList {
    @Autowired
    private UserRepositoryList userRepositoryList;
    @Override
    public ArrayList<User> findAllUser() {
        return userRepositoryList.findAllUser();
    }

    @Override
    public User findUserById(Integer idUser) {
        return userRepositoryList.findUserById(idUser);
    }

    @Override
    public User createUser(User user) {
        return userRepositoryList.createUser(user);
    }

    @Override
    public User updateUser(Integer id, User user) {
        return userRepositoryList.updateUser(id, user);
    }

    @Override
    public User deleteUser(Integer id) {
        return userRepositoryList.deleteUser(id);
    }
}
