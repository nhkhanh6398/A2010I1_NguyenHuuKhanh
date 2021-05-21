package model.service;

import model.bean.Customer;
import model.responsitory.customer.CustomerResponsitory;
import model.responsitory.customer.CustomerResponsitoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
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
}
