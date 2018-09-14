package com.example.userlist.repository;

import com.example.userlist.Exeptions.SuchNameAlreadyUsedExeption;
import com.example.userlist.model.User;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    private HashSet<User> list;

    public UserRepositoryImpl() {
        this.list = new HashSet<>();
    }

    @Override
    public Collection<User> findAll() {
        return list;
    }

    @Override
    public Optional<User> findByName(String name) {
        User foundUser = null;
        for (User user : list) {
            if (user.getName().equals(name)){
                foundUser = user;
                break;
            }
        }

        return Optional.ofNullable(foundUser);
    }

    @Override
    public void remove(User user) {
        list.remove(user);
    }

    @Override
    public void removeByName(String name) {
        Optional<User> found = findByName(name);
        
        if (found.isPresent()) {
            list.remove(found.get());
        }
    }

    @Override
    public User saveUser(User user) throws SuchNameAlreadyUsedExeption {
        if (findByName(user.getName()).isPresent()){
            throw new SuchNameAlreadyUsedExeption();
        }
        else {
            list.add(user);
        }
        return user;
    }
}
