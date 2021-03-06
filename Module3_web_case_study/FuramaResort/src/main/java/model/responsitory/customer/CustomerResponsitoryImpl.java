package model.responsitory.customer;

import model.bean.Customer;
import model.responsitory.base.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerResponsitoryImpl implements CustomerResponsitory {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Customer> showList() {
        List<Customer> customerList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select* from customer");
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setIdCustomer(resultSet.getInt("customer_id"));
                customer.setTypeCustomer(resultSet.getInt("customer_type_id"));
                customer.setNameCustomer(resultSet.getString("customer_name"));
                customer.setBirthCustomer(resultSet.getString("customer_birthday"));
                customer.setGenderCustomer(resultSet.getString("customer_gender"));
                customer.setCmndCustomer(resultSet.getString("customer_id_card"));
                customer.setPhoneCustomer(resultSet.getString("customer_phone"));
                customer.setEmailCustomer(resultSet.getString("customer_email"));
                customer.setAddressCustomer(resultSet.getString("customer_address"));
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return customerList;
    }

    @Override
    public boolean save(Customer customer) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("INSERT INTO customer (customer_type_id, customer_name, " +
                            "customer_birthday, customer_gender, customer_id_card,customer_phone, customer_email,customer_address)" +
                            " VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, customer.getTypeCustomer());
            preparedStatement.setString(2, customer.getNameCustomer());
            preparedStatement.setString(3, customer.getBirthCustomer());
            preparedStatement.setString(4, customer.getGenderCustomer());
            preparedStatement.setString(5, customer.getCmndCustomer());
            preparedStatement.setString(6, customer.getPhoneCustomer());
            preparedStatement.setString(7, customer.getEmailCustomer());
            preparedStatement.setString(8, customer.getAddressCustomer());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public boolean update(int id, Customer customer) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(
                    " update customer set customer_type_id = ?, customer_name = ?," +
                            " customer_birthday = ?, customer_gender = ?,customer_id_card = ?," +
                            " customer_phone = ?, customer_email = ?, customer_address = ? " +
                            "where customer_id = ?");

            preparedStatement.setInt(1, customer.getTypeCustomer());
            preparedStatement.setString(2, customer.getNameCustomer());
            preparedStatement.setString(3, customer.getBirthCustomer());
            preparedStatement.setString(4, customer.getGenderCustomer());
            preparedStatement.setString(5, customer.getCmndCustomer());
            preparedStatement.setString(6, customer.getPhoneCustomer());
            preparedStatement.setString(7, customer.getEmailCustomer());
            preparedStatement.setString(8, customer.getAddressCustomer());
            preparedStatement.setInt(9, customer.getIdCustomer());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public boolean delete(int customer_id) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("delete\n" +
                    "from customer\n" +
                    "where customer_id = ?");
            preparedStatement.setInt(1, customer_id);
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public List<Customer> seacrhCustomer(String name) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select *\n" +
                    "from customer\n" +
                    "where customer_name like ?;");
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("customer_id");
                int type = rs.getInt("customer_type_id");
                String nameCustomer = rs.getString("customer_name");
                String birthday = rs.getString("customer_birthday");
                String gender = rs.getString("customer_gender");
                String cmnd = rs.getString("customer_id_card");
                String phone = rs.getString("customer_phone");
                String email = rs.getString("customer_email");
                String address = rs.getString("customer_address");
                customer = new Customer(id,type, nameCustomer, birthday, gender, cmnd, phone, email, address);
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }


}
