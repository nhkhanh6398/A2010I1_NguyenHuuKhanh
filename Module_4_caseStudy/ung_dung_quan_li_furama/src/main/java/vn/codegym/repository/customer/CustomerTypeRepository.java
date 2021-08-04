package vn.codegym.repository.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.CustomerType;

import java.util.List;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
    List<CustomerType> findAll();
}
