package model.responsitory.employee;

import model.bean.Customer;
import model.bean.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeResponsitory {
    List<Employee> showList();
    boolean save (Employee employee);
    boolean update (int id, Employee employee);
    boolean delete(int id);
    List<Employee> seacrhCustomer(String name);
}
