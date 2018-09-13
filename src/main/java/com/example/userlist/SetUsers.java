package com.example.userlist;

import java.util.HashSet;

public class SetUsers implements UserList {
    private HashSet<User> list;
    //тут надо определится, хотим ли мы чтоб пользователи были строго уникальны
    //думаю что хотим, поэтому Set


    public SetUsers() {
        this.list = new HashSet<User>();
    }

    public void addUser(User user){
        list.add(user);
    }

    public User findByName(String s){
        for (User user : list) {
            if (s.equals(user.getName())) {
                return user;
            }
        }
        return null;

    }

    public void removeUser(User user){
        list.remove(user);
    }

    public void editUser(String oldName, String newName){
        User userToEdit = findByName(oldName);
        if (userToEdit != null) {
            removeUser(userToEdit);
            userToEdit.setName(newName);
            addUser(userToEdit);
        }
    }

}
