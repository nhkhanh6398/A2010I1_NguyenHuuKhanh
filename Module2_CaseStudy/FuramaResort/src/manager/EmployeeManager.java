package manager;

import Commons.WriteAndReadEmployee;
import Models.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class EmployeeManager {
    WriteAndReadEmployee writeAndReadEmployee = new WriteAndReadEmployee();
    Employee employee = new Employee();
    Scanner input = new Scanner(System.in);
    public void addEmployee(){
        System.out.println("Input 10 Employee");
        for (int i = 0; i< 10;i++){
            System.out.println("Input ID Employee: "+(i+1));
            employee.setIdEmployee(input.nextLine());
            System.out.println("Input Name Employee: "+(i+1));
            employee.setNameEmployee(input.nextLine());
            System.out.println("Input Birthday Employee: "+(i+1));
            employee.setBirthdayEmployee(input.nextLine());
            System.out.println("Input Address Employee: "+(i+1));
            employee.setAddressEmployee(input.nextLine());
            writeAndReadEmployee.WriteEmployee(employee);
        }
    }
    public void addEmployeeMap(){
        ArrayList<Employee> listEmployee= writeAndReadEmployee.readEmployee();
        Map<String,String> map = new TreeMap<>();
        for (int i = 0;i<listEmployee.size();){
            map.put(listEmployee.get(i).getIdEmployee(),listEmployee.get(i).getNameEmployee());
            i++;
        }
        Set<String> set = map.keySet();
        for (String key : set){
            System.out.println(key+" "+map.get(key));
        }
    }
}
