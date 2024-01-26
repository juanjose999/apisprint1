package com.crudsprint.sprint1.Users.repository;

import com.crudsprint.sprint1.Users.model.User;
import com.crudsprint.sprint1.Users.repository.arrayList.UserRepositoryList;
import com.crudsprint.sprint1.Users.repository.hashmap.UserRepositoryHashMap;
import com.crudsprint.sprint1.beer.model.Beer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
@Repository
public class UserRepositoryImpl implements UserRepositoryList, UserRepositoryHashMap {
    private ArrayList<User> userArrayList = new ArrayList<>();
    private HashMap<Integer, User> userHashMap = new HashMap<>();
    @Override
    public ArrayList<User> findAllUserList() {
        return new ArrayList<>(userArrayList);
    }

    @Override
    public HashMap<Integer, User> findAllUserMap() {
        return new HashMap<>(userHashMap);
    }

    @Override
    public User findUserById(Integer idUser) {
        return userHashMap.get(idUser);
    }

    @Override
    public User createUser(User user) {
        Integer userId = user.getIdUser();
        userHashMap.put(userId, user);
        return user;
    }

    @Override
    public User updateUser(Integer id, User user) {
        return userHashMap.put(id, user);
    }

    @Override
    public User deleteUser(Integer id) {
        return userHashMap.remove(id);
    }
}
