package com.example.userlist;

public class Main {
    public static void main(String[] args) {
        User user1 = new SimpleUser("Petr");
        User user2 = new SimpleUser("Bazil");
        UserList list = new SetUsers();
        list.addUser(user1);
        list.addUser(user2);

        User user3 = list.findByName("Petr");
        System.out.println(user3);

        list.editUser("Bazil", "Vasiliiy");

        User user4 = list.findByName("Vasiliiy");
        System.out.println(user4);

        list.removeUser(user1);

    }
}
