interface UserList {
    void addUser(User user);
    void removeUser(User user);
    User findByName(String name);
    void editUser(String oldName, String newName);
}
