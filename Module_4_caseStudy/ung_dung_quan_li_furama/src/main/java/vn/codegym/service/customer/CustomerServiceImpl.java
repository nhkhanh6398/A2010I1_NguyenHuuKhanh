package vn.codegym.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;
import vn.codegym.repository.customer.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
    customerRepository.delete(customer);
    }

    @Override
    public void update(Customer customer) {
    customerRepository.save(customer);
    }

    @Override
    public Customer findById(String id) {
    return customerRepository.findById(id).orElse(null);
    }
}
