package com.example.userlist;

import com.example.userlist.repository.UserRepository;
import com.example.userlist.repository.UserRepositoryImpl;
import com.example.userlist.service.UserService;
import com.example.userlist.service.UserServiceImpl;

public class StartApplication {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();
        UserService userService = new UserServiceImpl(userRepository);

        userService.addUser("Tom");
        userService.addUser("Jerry");


        System.out.println(userService.getAll());

        userService.removeUser("Tom");

        System.out.println(userService.getAll());

        userService.editUser("Jerry", "Tom");

        System.out.println(userService.getAll());


    }
}
