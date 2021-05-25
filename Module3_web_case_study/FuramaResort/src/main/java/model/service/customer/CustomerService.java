package model.service.customer;

import model.bean.Customer;
import model.bean.TypeCustomer;

import java.util.List;

public interface CustomerService {
    List<Customer> showList();
    boolean save (Customer customer);
    boolean update (int id, Customer customer);
    boolean delete(int id);
    List<Customer> seacrhCustomer(String name);
    Customer showById(int id);
}
