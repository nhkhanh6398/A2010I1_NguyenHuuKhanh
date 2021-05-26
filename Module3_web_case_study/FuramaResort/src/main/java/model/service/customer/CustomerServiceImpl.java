package model.service.customer;

import model.bean.Customer;
import model.responsitory.base.BaseRepository;
import model.responsitory.customer.CustomerResponsitory;
import model.responsitory.customer.CustomerResponsitoryImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private BaseRepository baseRepository = new BaseRepository();
    CustomerResponsitory customerResponsitory = new CustomerResponsitoryImpl();
    @Override
    public List<Customer> showList() {
        return this.customerResponsitory.showList();
    }

    @Override
    public boolean save(Customer customer) {
        return this.customerResponsitory.save(customer);
    }

    @Override
    public boolean update(int id, Customer customer) {
        return this.customerResponsitory.update(id, customer);
    }

    @Override
    public boolean delete(int id) {
        return this.customerResponsitory.delete(id);
    }

    @Override
    public List<Customer> seacrhCustomer(String name) {
        return this.customerResponsitory.seacrhCustomer(name);
    }

    @Override
    public Customer showById(int customer_id) {
        Customer customer = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(
                    "select * from customer where customer_id = ?");
            preparedStatement.setInt(1,customer_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){

                int type = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                int cmnd = resultSet.getInt("customer_id_card");
                int phone = resultSet.getInt("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customer = new Customer(type,name,birthday,gender,cmnd,phone,email,address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }


}
