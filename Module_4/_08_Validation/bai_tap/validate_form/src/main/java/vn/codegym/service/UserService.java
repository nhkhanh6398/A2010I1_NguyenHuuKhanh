package vn.codegym.service;

import vn.codegym.model.User;

import java.util.List;

public interface UserService {
    List<User> finAll();
    User findById(int id);
    void save(User user);

    void update(User user);

    void delete(int id);
}
