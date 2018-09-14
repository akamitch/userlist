package com.example.userlist.repository;

import com.example.userlist.model.User;

import java.util.Collection;
import java.util.Optional;

public interface UserRepository {

    Collection<User> findAll();

    Optional<User> findByName(String name);

    void remove(User user);

    void removeByName(String name);

    User saveUser(User user);
}
