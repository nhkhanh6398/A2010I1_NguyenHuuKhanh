package model.responsitory.employee;

import model.bean.Employee;
import model.responsitory.base.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeResponsitoryImpl implements EmployeeResponsitory {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Employee> showList(){
        List<Employee> employees = new ArrayList<>();
        Statement statement = null;
        try {
            statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee");
            Employee employee = null;
            while (resultSet.next()){
                employee = new Employee();
                employee.setIdEmployee(resultSet.getInt("employee_id"));
                employee.setNameEmployee(resultSet.getString("employee_name"));
                employee.setBirthEmployee(resultSet.getString("employee_birthday"));
                employee.setCmndEmployee(resultSet.getInt("employee_id_card"));
                employee.setSalaryEmployee(resultSet.getDouble("employee_salary"));
                employee.setPhoneEmployee(resultSet.getInt("employee_phone"));
                employee.setEmailEmployee(resultSet.getString("employee_email"));
                employee.setAddressEmployee(resultSet.getString("employee_address"));
                employee.setPositionIdEmployee(resultSet.getInt("position_id"));
                employee.setEducationIdEmployee(resultSet.getInt("education_degree_id"));
                employee.setDivisionIdEmployee(resultSet.getInt("division_id"));
                employee.setUsernameEmployee(resultSet.getString("username"));
                employees.add(employee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return employees;
    }

    @Override
    public boolean save(Employee employee) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("INSERT INTO employee (`employee_name`, `employee_birthday`, `employee_id_card`," +
                            " `employee_salary`, `employee_phone`, `employee_email`, `employee_address`, `position_id`, " +
                            "`education_degree_id`, `division_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)\n");
            preparedStatement.setString(1,employee.getNameEmployee());
            preparedStatement.setString(2,employee.getBirthEmployee());
            preparedStatement.setInt(3,employee.getCmndEmployee());
            preparedStatement.setDouble(4,employee.getSalaryEmployee());
            preparedStatement.setInt(5,employee.getPhoneEmployee());
            preparedStatement.setString(6,employee.getEmailEmployee());
            preparedStatement.setString(7,employee.getAddressEmployee());
            preparedStatement.setInt(8,employee.getPositionIdEmployee());
            preparedStatement.setInt(9,employee.getEducationIdEmployee());
            preparedStatement.setInt(10,employee.getDivisionIdEmployee());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row>0;
    }

    @Override
    public boolean update(int id, Employee employee) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Employee> seacrhCustomer(String name) {
        return null;
    }
}
