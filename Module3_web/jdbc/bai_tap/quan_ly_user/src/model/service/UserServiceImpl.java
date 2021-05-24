package model.service;

import model.bean.User;
import model.responsitory.UserResponsitory;
import model.responsitory.UserResponsitoryImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserResponsitory userResponsitory = new UserResponsitoryImpl();
    @Override
    public List<User> finAll() {
        return this.userResponsitory.finAll();
    }

    @Override
    public boolean save(User user) {
        return this.userResponsitory.save(user);
    }

    @Override
    public User finById(int id) {
        return this.userResponsitory.finById(id);
    }

    @Override
    public boolean update(int id, User user) {
        return this.userResponsitory.update(id,user);
    }

    @Override
    public boolean delete(int id) {
        return this.userResponsitory.delete(id);
    }

    @Override
    public List<User> seachByName(String name) {
        return this.userResponsitory.seachByName(name);
    }
}
