package model.responsitory.customer;

import model.bean.Customer;
import model.responsitory.base.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerResponsitoryImpl  implements CustomerResponsitory{
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Customer> showList() {
        List<Customer> customerList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select* from customer");
        Customer customer = null;
        while (resultSet.next()){
            customer = new Customer();
            customer.setIdCustomer(resultSet.getInt("customer_id"));
            customer.setTypeCustomer(resultSet.getString("customer_type_id"));
            customer.setNameCustomer(resultSet.getString("customer_name"));
            customer.setBirthCustomer(resultSet.getString("customer_birthday"));
            customer.setGenderCustomer(resultSet.getString("customer_gender"));
            customer.setCmndCustomer(resultSet.getInt("customer_id_card"));
            customer.setPhoneCustomer(resultSet.getInt("customer_phone"));
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
                            " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1,customer.getTypeCustomer());
            preparedStatement.setString(2,customer.getNameCustomer());
            preparedStatement.setString(3,customer.getBirthCustomer());
            preparedStatement.setString(4,customer.getGenderCustomer());
            preparedStatement.setString(5, String.valueOf(customer.getCmndCustomer()));
            preparedStatement.setString(5, String.valueOf(customer.getPhoneCustomer()));
            preparedStatement.setString(4,customer.getEmailCustomer());
            preparedStatement.setString(4,customer.getAddressCustomer());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row>0;
    }

    @Override
    public boolean update(int id, Customer customer) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Customer> seacrhCustomer(String name) {
        return null;
    }


}
