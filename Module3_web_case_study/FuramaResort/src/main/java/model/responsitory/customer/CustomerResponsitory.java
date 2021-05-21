package model.responsitory.customer;

import model.bean.Customer;

import java.util.List;

public interface CustomerResponsitory {
    List<Customer> showList();
    boolean save (Customer customer);
    boolean update (int id, Customer customer);
    boolean delete(int id);
    List<Customer> seacrhCustomer(String name);
}
