package manager;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Commons.WriteAndRead.*;

public class BookingManager {
    Customer customer = new Customer();
    Villa villa = new Villa();
    ServiceManager serviceManager = new ServiceManager();
    static List<Customer> customerList = readCustomer();
    Scanner input = new Scanner(System.in);

    public String getList() {
        String list = "";
        for (int i = 0; i < customerList.size(); i++) {
            list += (i + 1 + " Name: " + customerList.get(i).getNameCustomer() + "\n");
        }
        return list;
    }

    public void showList() {
        System.out.println(getList());
    }
    int choose;
    public void showCustomer(){
        showList();
        System.out.println("Choose Customer: ");
        choose = input.nextInt();
        System.out.println("Infomation Customer: "+"\n"+ showInfor(customerList.get(choose-1)));
        bookingService();

    }
    public String showInfor(Customer customer){
        String infor = "1. Name "+ customer.getNameCustomer()+"\n"
                + "2. Birthday: "+ customer.getBirthDayCustomer()+"\n"
                + "3. Cmnd: "+customer.getCmndCustomer()+"\n"
                + "4. Phone: "+customer.getPhoneCustomer()+"\n"
                + "5. Email: "+customer.getEmailCustomer()+"\n"
                + "6. Gender: "+customer.getGenderCustomer()+"\n"
                + "7. Address: "+customer.getAddressCustomer();
        return infor;
    }
    public void bookingService(){

        System.out.println("Choose Serive: ");
        System.out.println("1. Villa"+"\n"+"2. House"+"\n"+"3. Room");
        int chooseBooking = input.nextInt();
        switch (chooseBooking){
            case 1:
                serviceManager.showVilla();
                chooseServiceVilla();
                break;
            case 2:
                serviceManager.showHouse();
                chooseServiceHouse();
                break;
            case 3:
                serviceManager.showRoom();
                chooseServiceRoom();
                break;
            default:
                System.out.println("Not");
        }
    }
    public void chooseServiceVilla(){
        ArrayList<Villa> listVilla = readVilla();
        System.out.println("What you want: ");
        int choose2 = input.nextInt();
        System.out.println(listVilla.get(choose2-1));
        try {
            FileWriter fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Booking.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Name: "+customerList.get(choose-1).getNameCustomer()+", ID Villa: "+readVilla().get(choose2-1).getId());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Add service!");
    }
    public void chooseServiceHouse(){
        ArrayList<House> listHouse = readHouse();
        System.out.println("What you want: ");
        int choose3 = input.nextInt();
        System.out.println(listHouse.get(choose3-1));
        try {
            FileWriter fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Booking.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Name: "+customerList.get(choose-1).getNameCustomer()+", ID House: "+listHouse.get(choose3-1).getId());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Add service!");
    }
    public void chooseServiceRoom(){
        ArrayList<Room> listRoom = readRoom();
        System.out.println("What you want: ");
        int choose4 = input.nextInt();
        System.out.println(listRoom.get(choose4-1));
        try {
            FileWriter fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Booking.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Name: "+customerList.get(choose-1).getNameCustomer()+", ID Room: "+readRoom().get(choose4-1).getId());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Add service!");
    }
}
