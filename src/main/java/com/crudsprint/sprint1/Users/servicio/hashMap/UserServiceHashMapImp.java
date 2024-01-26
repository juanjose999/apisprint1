package com.crudsprint.sprint1.Users.servicio.hashMap;

import com.crudsprint.sprint1.Users.model.User;
import com.crudsprint.sprint1.Users.repository.hashmap.UserRepositoryHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class UserServiceHashMapImp implements UserServiceHashMap {
    @Autowired
    private UserRepositoryHashMap userRepositoryHashMap;
    @Override
    public HashMap<Integer, User> findAllUser() {
        return userRepositoryHashMap.findAllUser();
    }

    @Override
    public User findUserById(Integer idUser) {
        return userRepositoryHashMap.findUserById(idUser);
    }

    @Override
    public User createUser(User user) {
        return userRepositoryHashMap.createUser(user);
    }

    @Override
    public User updateUser(Integer id, User user) {
        return userRepositoryHashMap.updateUser(id, user);
    }

    @Override
    public User deleteUser(Integer id) {
        return userRepositoryHashMap.deleteUser(id);
    }
}
