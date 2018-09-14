package com.example.userlist.service;

import com.example.userlist.Exeptions.NameExeption;
import com.example.userlist.Exeptions.NoSuchName;
import com.example.userlist.Exeptions.NotAllowedNameException;
import com.example.userlist.Exeptions.SuchNameAlreadyUsedExeption;
import com.example.userlist.model.User;
import com.example.userlist.repository.UserRepository;

import java.util.Collection;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void addUser(String name) throws NotAllowedNameException {
        if ( (name.length() < 2) || (name.length() > 10) ) {
            throw new NotAllowedNameException();
        } else {
            this.userRepository.saveUser(new User(name));
        }
    }

    @Override
    public void removeUser(String name) {
        this.userRepository.removeByName(name);
    }


    public void removeUser(User user) {
        this.userRepository.remove(user);
    }

    @Override
    public User findByName(String name) throws NoSuchName {
        Optional<User> userO = this.userRepository.findByName(name);
        if (userO.isPresent()) {
            return userO.get();
        }else {
            throw new NoSuchName();
        }
        //return null;
    }

    @Override
    public void editUser(String oldName, String newName) {
        Optional<User> userO = this.userRepository.findByName(oldName);
        if (userO.isPresent()) {
            User user = userO.get();
            this.userRepository.remove(user);
            user.setName(newName);
            this.userRepository.saveUser(user);

        }else {
            throw new NoSuchName();
        }

    }

    @Override
    public Collection<User> getAll() {
        return this.userRepository.findAll();
    }
}
