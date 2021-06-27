package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;
import vn.codegym.model.Province;

import java.util.List;
@Service
public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
    Iterable<Customer> findAllByProvince(Province province);
}
