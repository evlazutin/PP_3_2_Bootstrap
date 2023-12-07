package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDAO {

    User getUserByEmail(String email);

    List<User> getAllUsers();

    User getUser(Long id);

    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(Long id, User newUser);

}
