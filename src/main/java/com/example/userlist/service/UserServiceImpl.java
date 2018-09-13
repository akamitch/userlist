package com.example.userlist.service;

import com.example.userlist.model.User;
import com.example.userlist.repository.UserRepository;

import java.util.Collection;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void addUser(String name) {

    }

    @Override
    public void removeUser(User user) {

    }

    @Override
    public void removeUser(String name) {

    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public void editUser(String oldName, String newName) {

    }

    @Override
    public Collection<User> getAll() {
        return null;
    }
}
