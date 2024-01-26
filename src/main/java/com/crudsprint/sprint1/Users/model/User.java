package com.crudsprint.sprint1.Users.model;

public class User {
    private Integer idUser;
    private String fullName;
    private String password;
    private String email;

    public User(){

    }

    public User(Integer idUser, String fullName, String password, String email) {
        this.idUser = idUser;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
