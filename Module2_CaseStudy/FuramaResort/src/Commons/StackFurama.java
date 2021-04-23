package Commons;

import Models.Employee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackFurama {
    static WriteAndReadEmployee writeAndReadEmployee = new WriteAndReadEmployee();

    public static void stack(){
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> listEmployee= writeAndReadEmployee.readEmployee();
        Stack<String> stringStack = new Stack<>();
        for (Employee e : listEmployee){
            stringStack.add(e.getNameEmployee());
        }
        for (String q : stringStack){
            System.out.println(q);
        }
        System.out.println("Input key search: ");
        String inputt = input.nextLine();
        int i = stringStack.search(inputt);
        System.out.println(inputt +" index " +i);
    }

    public static void main(String[] args) {
        stack();
    }
}
