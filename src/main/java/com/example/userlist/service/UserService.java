package com.example.userlist.service;

import com.example.userlist.model.User;

import java.util.Collection;

public interface UserService {

    void addUser(String name);

    void removeUser(String name);

    User findByName(String name);

    void editUser(String oldName, String newName);

    Collection<User> getAll();

}
