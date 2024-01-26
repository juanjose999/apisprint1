package com.crudsprint.sprint1.Users.repository.arrayList;

import com.crudsprint.sprint1.Users.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryListImpl implements UserRepositoryList {
    private ArrayList<User> userRepository = new ArrayList<>();
    @Override
    public ArrayList<User> findAllUser() {
        return userRepository;
    }

    @Override
    public User findUserById(Integer idUser) {
        return userRepository.get(idUser);
    }

    @Override
    public User createUser(User user) {
        userRepository.add(user);
        return user;
    }

    @Override
    public User updateUser(Integer id, User user) {
        return userRepository.set(id,user);
    }

    @Override
    public User deleteUser(Integer id) {
        User userDelete = null;
        for(User u: userRepository){
            if(u.getIdUser().equals(id)){
                userDelete = u;
                break;
            }
        }
        userRepository.remove(userDelete);
        return userDelete;
    }
}
