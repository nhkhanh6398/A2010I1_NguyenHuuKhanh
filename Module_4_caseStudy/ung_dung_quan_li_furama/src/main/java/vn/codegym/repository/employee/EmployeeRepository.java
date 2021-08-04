package vn.codegym.repository.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Page<Employee> findAllByNameContaining(String searchEmployee, Pageable pageable);
}
