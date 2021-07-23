package vn.codegym.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
