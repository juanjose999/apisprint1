package com.crudsprint.sprint1.Users.controller;

import com.crudsprint.sprint1.Users.model.User;
import com.crudsprint.sprint1.Users.servicio.hashMap.UserServiceHashMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
@RestController
@RequestMapping("/user")
public class UserController {
    private UserServiceHashMap userServiceHashMap;

    public UserController(UserServiceHashMap userServiceHashMap){
        this.userServiceHashMap = userServiceHashMap;
    }

    @GetMapping
    public HashMap<Integer, User> findAllUser(){
        return userServiceHashMap.findAllUser();
    }
    @GetMapping("/{id}")
    public User findUserId(@PathVariable("id") Integer idUser){
        return userServiceHashMap.findUserById(idUser);
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userServiceHashMap.createUser(user);
    }

    @PutMapping("/{idUser}")
    public User updateUser(@PathVariable Integer idUser, @RequestBody User user){
        return userServiceHashMap.updateUser(idUser, user);
    }

    @DeleteMapping("/{idUser}")
    public User deleteUserById(@PathVariable Integer idUser){
        return userServiceHashMap.deleteUser(idUser);
    }
}
