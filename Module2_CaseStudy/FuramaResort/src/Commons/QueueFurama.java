package Commons;

import Models.Customer;
import Models.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static Commons.WriteAndRead.readCustomer;

public class QueueFurama {
     static WriteAndReadEmployee writeAndReadEmployee = new WriteAndReadEmployee();
    public static void displayQueue(){

        ArrayList<Employee> listEmployee= writeAndReadEmployee.readEmployee();

        Queue<String> employees = new LinkedList<>();
        for (Employee e : listEmployee){
        employees.offer(e.getNameEmployee());
        }
        for (String q : employees){
            System.out.println(q);
        }
    }

    public static void main(String[] args) {
        displayQueue();
    }
}
