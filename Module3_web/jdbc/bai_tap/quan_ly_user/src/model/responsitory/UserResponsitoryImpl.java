package model.responsitory;

import model.bean.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserResponsitoryImpl implements UserResponsitory {
    private BaseRepository baseRepository = new BaseRepository();


    @Override
    public List<User> finAll() {
        List<User> userList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select *\n" +
                    "from users\n" +
                    "order by `name`");

            User user = null;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setAddress(resultSet.getString("country"));

                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public boolean save(User user) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement
                    ("insert into users(name, email, country) values(?,?,?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getAddress());

            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public User finById(int id) {
        User user = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select *\n" +
                    "from users\n" +
                    "where id = ?");
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("country");
                user = new User(id, name, email, address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean update(int id, User user) {
        int rowUpdate = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("update users\n" +
                    "set `name`= ?, email = ?, country = ?" +
                    "where id = ?");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getAddress());
            preparedStatement.setInt(4, user.getId());

            rowUpdate = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdate > 0;
    }

    @Override
    public boolean delete(int id) {
        int rowDelete = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("delete\n" +
                    "from users\n" +
                    "where id = ?");
            preparedStatement.setInt(1, id);
            rowDelete = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDelete > 0;
    }

    @Override
    public List<User> seachByName(String name) {
        List<User> userList = new ArrayList<>();
        User user = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select *\n" +
                    "from users\n" +
                    "where `name` like ?");
            preparedStatement.setString(1,"%" + name + "%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name1 = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("country");
                user = new User(id,name1,email,address);
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

}
