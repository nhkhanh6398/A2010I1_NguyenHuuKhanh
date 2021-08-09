package vn.codegym.service.users;

import vn.codegym.model.User;

public interface UserService {
    User findByUserName(String name);
    void save(User user);
}
