package com.crudsprint.sprint1.Users.repository.arrayList;

import com.crudsprint.sprint1.Users.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface UserRepositoryList {
    ArrayList<User> findAllUser();
    User findUserById(Integer idUser);
    User createUser(User user);
    User updateUser(Integer id, User user);
    User deleteUser(Integer id);
}
