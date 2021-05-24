package model.service;

import model.bean.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserService userService = new UserServiceImpl();
    @Override
    public List<User> finAll() {
        return userService.finAll();
    }

    @Override
    public boolean save(User user) {
        return this.userService.save(user);
    }

    @Override
    public User finById(int id) {
        return this.userService.finById(id);
    }

    @Override
    public boolean update(int id, User user) {
        return this.userService.update(id,user);
    }

    @Override
    public boolean delete(int id) {
        return this.userService.delete(id);
    }

    @Override
    public List<User> seachByName(String name) {
        return this.userService.seachByName(name);
    }
}
