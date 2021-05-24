package model.service;

import model.bean.Customer;
import model.bean.TypeCustomer;
import model.responsitory.base.BaseRepository;
import model.responsitory.customer.CustomerResponsitory;
import model.responsitory.customer.CustomerResponsitoryImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
    public List<TypeCustomer> showTypeCustomer() {
        List<TypeCustomer> typeCustomerList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select *" +
                    "from customer_type;");
            TypeCustomer typeCustomer = null;
            while (resultSet.next()){
                typeCustomer = new TypeCustomer();
                typeCustomer.setIdType(resultSet.getInt("customer_type_id"));
                typeCustomer.setNameType(resultSet.getString("customer_type_name"));
                typeCustomerList.add(typeCustomer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return typeCustomerList;
    }
}
