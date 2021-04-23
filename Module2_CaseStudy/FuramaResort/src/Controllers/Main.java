package Controllers;


import Commons.ExceptionTypeCustomer;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExceptionTypeCustomer {
        Scanner input = new Scanner(System.in);
        MainController mainController = new MainController();
        while (true) {
            System.out.println("1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            System.out.println("Please choose: ");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    mainController.addNewServies();
                    break;
                case 2:
                    mainController.showServies();
                    break;
                case 3:
                    mainController.addNewCustomer();
                    break;
                case 4:
                    mainController.showCus();
                    break;
                case 5:
                    mainController.addBooking();
                    break;
                case 6:
                    mainController.showInforEmployee();
                    break;
            }

        }
    }
}
