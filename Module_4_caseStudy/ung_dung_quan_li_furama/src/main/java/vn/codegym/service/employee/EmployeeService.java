package vn.codegym.service.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import vn.codegym.model.Employee;

import java.util.List;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);
    List<Employee> findAll();
    void save(Employee employee);
    void delete(Integer id);
    void update(Employee employee);
    Employee findById(Integer id);

    Page<Employee> findAllByNameConaining(String searchEmployee, Pageable pageable);
}
