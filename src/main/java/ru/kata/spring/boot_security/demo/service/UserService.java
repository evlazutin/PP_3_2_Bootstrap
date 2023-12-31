package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    User getUserByEmail(String email);

    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(Long id, User newUser);

}
