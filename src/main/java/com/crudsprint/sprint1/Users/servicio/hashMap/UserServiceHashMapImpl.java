package com.crudsprint.sprint1.Users.servicio.hashMap;

import com.crudsprint.sprint1.Users.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceHashMapImpl implements UserServiceHashMap {
    private final Map<Integer, User> userMap = new HashMap<>();


    @Override
    public HashMap<Integer , User> findAllUserMap() {
        return new HashMap<>(userMap);
    }

    @Override
    public User findUserById(Integer idUser) {
        return userMap.get(idUser);
    }

    @Override
    public User createUser(User user) {
        return userMap.get(user);
    }

    @Override
    public User updateUser(Integer id, User user) {
        return userMap.put(id,user);
    }

    @Override
    public User deleteUser(Integer id) {
        return userMap.remove(id);
    }
}
