package manager;

import Commons.*;
import Models.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static Commons.WriteAndRead.readCustomer;


public class CustomerManager {
    public void addCustomer() {
//        ExceptionTypeCustomer exceptionTypeCustomer = new ExceptionTypeCustomer();
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        boolean check = true;
        System.out.println("Input Name Customer: ");
        String name;
        do {
            name = input.nextLine();
            try {
                if (ValidateCustomer.checkName(name)) {
                    customer.setNameCustomer(name);
                    break;
                } else {
                    throw new ExceptionNameCustomer();
                }
            } catch (ExceptionNameCustomer exceptionNameCustomer) {
                exceptionNameCustomer.printStackTrace();
                System.out.println("Please Input Again: ");

            }
        } while (true);
        System.out.println("Input BirthDay Customer:  ");
        String day = input.nextLine();
        do {
            try {
                if (ValidateCustomer.checkDay(day)) {
                    customer.setBirthDayCustomer(day);
                    break;
                }
            } catch (ExceptionBirthDay exceptionBirthDay) {
                exceptionBirthDay.printStackTrace();
                System.out.println("Please Input Again: ");
                day = input.nextLine();
            }
        } while (true);

        System.out.println("Input CMND Customer: ");

        String cmnd= input.nextLine();
        do {

            try {
            if (ValidateCustomer.checkCmndCustomer(cmnd)){
                customer.setCmndCustomer(cmnd);
                break;
            } else {
                    throw new ExceptionCmnd();
            }
            } catch (ExceptionCmnd exceptionCmnd) {
                exceptionCmnd.printStackTrace();
                System.out.println("Input Cmnd Again: ");
                cmnd=input.nextLine();
            }
        }while (true);
        System.out.println("Input Phone Customer: ");
        customer.setPhoneCustomer(Integer.parseInt(input.nextLine()));
        System.out.println("Input Email Customer: ");
        String email = input.nextLine();
        do {
            try {
                if (ValidateCustomer.checkMail(email)) {
                    customer.setEmailCustomer(email);
                } else {
                    throw new ExceptionEmail();

                }
            } catch (ExceptionEmail exceptionEmail) {
                exceptionEmail.printStackTrace();
                System.out.println("Input Email Again: ");
                email = input.nextLine();

            }
        } while (!ValidateCustomer.checkMail(email));
        customer.setEmailCustomer(email);
        System.out.println("Input Type Customer: Male/Female/Unknow ");
        String type = input.nextLine();
        do {
            try {
                if (ValidateCustomer.checkGender(type)) {
                    customer.setGenderCustomer(type);
                } else {
                    throw new ExceptionTypeCustomer();
                }
            } catch (ExceptionTypeCustomer e) {
                e.printStackTrace();
                System.out.println("Please Input Again: ");
                type = input.nextLine();

            }
        } while (!ValidateCustomer.checkGender(type));
        customer.setGenderCustomer(type);
        System.out.println("Input Address Customer: ");
        customer.setAddressCustomer(input.nextLine());
        WriteAndRead.writeCustomer(customer);
    }

    public void showCustomer() {
        ArrayList<Customer> listCustomer = readCustomer();
        Collections.sort(listCustomer, new SortCustomer());
        for (Customer customer : listCustomer){
            System.out.println(customer);
        }
    }
}

