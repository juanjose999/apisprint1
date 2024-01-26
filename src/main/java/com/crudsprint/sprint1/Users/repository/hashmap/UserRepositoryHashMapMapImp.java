package com.crudsprint.sprint1.Users.repository.hashmap;

import com.crudsprint.sprint1.Users.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class UserRepositoryHashMapMapImp implements UserRepositoryHashMap {
    private HashMap<Integer, User> userHashMap = new HashMap<>();
    @Override
    public HashMap<Integer, User> findAllUser() {
        return userHashMap;
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
