package model.service;

import model.bean.User;

import java.util.List;

public interface UserService {
    List<User> finAll();

    boolean save(User user);

    User finById(int id);

    boolean update(int id, User user);

    boolean delete(int id);

    List<User> seachByName(String name);

}
