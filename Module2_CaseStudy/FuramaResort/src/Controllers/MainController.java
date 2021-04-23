package Controllers;

import Commons.ExceptionTypeCustomer;
import manager.BookingManager;
import manager.CustomerManager;
import manager.EmployeeManager;
import manager.ServiceManager;


import java.util.Scanner;

public class MainController {

    ServiceManager serviceManager = new ServiceManager();
    CustomerManager customerManager = new CustomerManager();
    BookingManager addBooking = new BookingManager();
    EmployeeManager employeeManager = new EmployeeManager();
    Scanner input = new Scanner(System.in);

    public void addNewServies() {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        System.out.println("Please choose: ");
        int choose2 = input.nextInt();
        input.nextLine();
        switch (choose2){
            case 1:
                serviceManager.addVilla();
                break;
            case 2:
                serviceManager.addHouse();
                break;
            case 3:
                serviceManager.addRoom();
                break;
            case 4:
                Main main = new Main();
                break;
            default:
                System.out.println("Exit!");
        }
    }
    public void showServies(){
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Room Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        System.out.println("Input choose: ");
        int chooseShow = input.nextInt();
        input.nextLine();
        switch (chooseShow){
            case 1:
                serviceManager.showVilla();
                break;
            case 2:
                serviceManager.showHouse();
                break;
            case 3:
                serviceManager.showRoom();
                break;
            case 4:
                serviceManager.collectionVilla();
                break;
            case 5:
                serviceManager.collectionHouse();
                break;
            case 6:
                serviceManager.collectionRoom();
                break;
        }
    }
    public void showCus(){
        CustomerManager customerManager = new CustomerManager();
        customerManager.showCustomer();
    }
    public void addNewCustomer() throws ExceptionTypeCustomer {
        customerManager.addCustomer();
    }
    public void addBooking(){
        addBooking.showCustomer();
    }
    public void showInforEmployee(){
        System.out.println("1. Add Employee"+"\n"+"2. Show Information Employee");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                employeeManager.addEmployee();
                break;
            case 2:
                employeeManager.addEmployeeMap();
        }

    }
}
