package com.example.userlist.repository;

import com.example.userlist.model.User;

import java.util.Collection;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {


    @Override
    public Collection<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public void remove(User user) {

    }

    @Override
    public void removeByName(String name) {

    }

    @Override
    public User saveUser() {
        return null;
    }
}
