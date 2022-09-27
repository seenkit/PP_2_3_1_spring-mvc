package ru.seenkit.service;

import ru.seenkit.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    void edit(User user, int id);

    void delete(int id);
}
