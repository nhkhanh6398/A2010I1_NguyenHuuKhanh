package model.service.employee;

import model.bean.Employee;
import model.responsitory.base.BaseRepository;
import model.responsitory.employee.EmployeeResponsitory;
import model.responsitory.employee.EmployeeResponsitoryImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private BaseRepository baseRepository = new BaseRepository();
    private EmployeeResponsitory employeeResponsitory = new EmployeeResponsitoryImpl();
    @Override
    public List<Employee> showList() {
        return this.employeeResponsitory.showList();
    }

    @Override
    public boolean save(Employee employee) {
        return this.employeeResponsitory.save(employee);
    }

    @Override
    public boolean update(int id, Employee employee) {
        return this.employeeResponsitory.update(id,employee);
    }

    @Override
    public boolean delete(int id) {
        return this.employeeResponsitory.delete(id);
    }

    @Override
    public Employee showByIdEmployee(int employee_id) {
        Employee employee = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from employee where employee_id = ?");
            preparedStatement.setInt(1,employee_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                int cmnd = resultSet.getInt("employee_id_card");
                double salary = resultSet.getDouble("employee_salary");
                int phone = resultSet.getInt("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int position = resultSet.getInt("position_id");
                int education = resultSet.getInt("education_degree_id");
                int division = resultSet.getInt("division_id");
                employee = new Employee(name,birthday,cmnd,salary,phone,email,address,position,education,division);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }

    @Override
    public List<Employee> seacrhCustomer(String name) {
        return this.employeeResponsitory.seacrhCustomer(name);
    }
}
