package vn.codegym.service.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import vn.codegym.model.Employee;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    void save(Employee employee);
    void delete(Employee employee);
    void update(Employee employee);
    Employee findById(Integer id);
}
