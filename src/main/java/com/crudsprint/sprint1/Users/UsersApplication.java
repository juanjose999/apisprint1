package com.crudsprint.sprint1.Users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.crudsprint.sprint1.Users.servicio.hashMap")
public class UsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.crudsprint.sprint1.Users.UsersApplication.class, args);
    }

}

