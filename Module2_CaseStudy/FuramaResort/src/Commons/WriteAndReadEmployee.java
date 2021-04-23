package Commons;

import Models.Employee;

import java.io.*;
import java.util.ArrayList;

public class WriteAndReadEmployee {
    public void WriteEmployee(Employee employee){
        try {
            FileWriter fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Employee.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(employee.getIdEmployee()+","+employee.getNameEmployee()+","+employee.getBirthdayEmployee()+","+employee.getAddressEmployee());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public ArrayList<Employee> readEmployee(){
        ArrayList<Employee> listEmployee= new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String [] arrayEmployee = null;
            while ((line=bufferedReader.readLine())!=null){
                arrayEmployee=line.split(",");
                Employee employee = new Employee(arrayEmployee[0],arrayEmployee[1],arrayEmployee[2],arrayEmployee[3]);
                listEmployee.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }return listEmployee;
    }
}
