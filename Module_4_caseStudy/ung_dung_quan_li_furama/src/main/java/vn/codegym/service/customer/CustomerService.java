package vn.codegym.service.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    Customer findById(String id);

}
