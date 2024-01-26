package com.crudsprint.sprint1.Users.controller;

import com.crudsprint.sprint1.Users.model.User;
import com.crudsprint.sprint1.Users.servicio.UserService;
import com.crudsprint.sprint1.Users.servicio.hashMap.UserServiceHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    @Lazy
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/list")
    public ArrayList<User> findAllUserList(){
        return userService.findAllUserList();
    }

    @GetMapping("/map")
    public HashMap<Integer, User> findAllUserMap(){
        return userService.findAllUserMap();
    }
    @GetMapping("/{id}")
    public User findUserId(@PathVariable("id") Integer idUser){
        return userService.findUserById(idUser);
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/{idUser}")
    public User updateUser(@PathVariable Integer idUser, @RequestBody User user){
        return userService.updateUser(idUser, user);
    }

    @DeleteMapping("/{idUser}")
    public User deleteUserById(@PathVariable Integer idUser){
        return userService.deleteUser(idUser);
    }
}
