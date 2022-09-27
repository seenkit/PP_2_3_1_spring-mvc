package ru.seenkit.dao;

import org.springframework.stereotype.Component;
import ru.seenkit.model.User;

import java.util.List;

@Component
public interface UserDao {

    void add(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    void edit(User user, int id);

    void delete(int id);
}
