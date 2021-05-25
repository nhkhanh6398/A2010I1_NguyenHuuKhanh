package model.service.employee;

import model.bean.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> showList();
    boolean save (Employee employee);
    boolean update (int id, Employee employee);
    boolean delete(int id);
    Employee showByIdEmployee(int id);
    List<Employee> seacrhCustomer(String name);
}
