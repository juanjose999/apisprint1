package com.crudsprint.sprint1.Users.servicio;

import com.crudsprint.sprint1.Users.model.User;
import com.crudsprint.sprint1.Users.repository.arrayList.UserRepositoryList;
import com.crudsprint.sprint1.Users.servicio.arrayList.UserServiceList;
import com.crudsprint.sprint1.Users.servicio.hashMap.UserServiceHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
@Service
public class UserService{

    private final UserRepositoryList userServiceList;

    private final UserServiceHashMap userServiceHashMap;
    @Autowired
    public UserService(UserRepositoryList userServiceList, UserServiceHashMap userServiceHashMap) {
        this.userServiceList = userServiceList;
        this.userServiceHashMap = userServiceHashMap;
    }


    public ArrayList<User> findAllUserList() {
        return userServiceList.findAllUserList();
    }
    public HashMap<Integer, User> findAllUserMap() {
        return userServiceHashMap.findAllUserMap();
    }

    public User findUserById(Integer idUser) {
        return userServiceHashMap.findUserById(idUser);
    }
    public User createUser(User user) {
        return userServiceList.createUser(user);
    }

    public User updateUser(Integer id, User user) {
        return userServiceHashMap.updateUser(id, user);
    }

    public User deleteUser(Integer id) {
        return userServiceHashMap.deleteUser(id);
    }
}
