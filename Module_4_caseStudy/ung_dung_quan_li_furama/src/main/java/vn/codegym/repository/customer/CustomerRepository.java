package vn.codegym.repository.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
