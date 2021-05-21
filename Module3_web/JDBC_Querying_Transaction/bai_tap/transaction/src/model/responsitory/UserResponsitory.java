package model.responsitory;

import model.bean.User;

import java.util.List;

public interface UserResponsitory {
    List<User> finAll();

    boolean saveUserTransaction(User user);

    User finById(int id);

    boolean update(int id, User user);

    boolean delete(int id);

    List<User> seachByName(String name);

}
