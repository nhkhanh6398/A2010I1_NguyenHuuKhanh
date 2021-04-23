package Commons;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;

import java.io.*;
import java.util.ArrayList;

public class WriteAndRead {

    public static void writeCustomer(Customer customer){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Customer.csv",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(customer.getNameCustomer()+","+customer.getBirthDayCustomer()+","+customer.getCmndCustomer()
                    +","+customer.getPhoneCustomer()+","+customer.getEmailCustomer()+","+customer.getGenderCustomer()+","
                    +customer.getAddressCustomer());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void writeVilla(Villa villa){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter= new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Villa.csv",true);
            bufferedWriter =new BufferedWriter(fileWriter);
            bufferedWriter.write(villa.getId()+","+villa.getNameServices()+","+villa.getAreaUse()+
                    ","+ villa.getCost()+ ","+villa.getAmount()+","+villa
                    .getRentType()+","+villa.getTypeRoom()+","+ villa.getOtherService()+","+ villa.getAreaLake()+","+villa.getNumberFloor());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeHouse(House house){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter= new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\House.csv",true);
            bufferedWriter =new BufferedWriter(fileWriter);
            bufferedWriter.write(house.getId()+","+house.getNameServices()+
                    ","+ house.getAreaUse()+ ","+house.getCost()+","+house
                    .getAmount()+","+ house.getRentType()+","+ house.getTypeRoom()+","+
                    house.getOtherService()+","+house.getNumberFloor());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeRoom(Room room){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter= new FileWriter("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Room.csv",true);
            bufferedWriter =new BufferedWriter(fileWriter);
            bufferedWriter.write(room.getId()+","+room.getNameServices()+
                    ","+ room.getAreaUse()+ ","+room.getCost()+","+room
                    .getAmount()+","+ room.getRentType()+","+room.getFreeServices());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Customer> readCustomer(){
        ArrayList<Customer> listCustomer = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Customer.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line="";
            String[] arrayCustomer = null;
            while ((line=bufferedReader.readLine())!=null){
                arrayCustomer=line.split(",");
                Customer customer = new Customer(arrayCustomer[0],arrayCustomer[1],arrayCustomer[2],
                        Integer.parseInt(arrayCustomer[3]),arrayCustomer[4],arrayCustomer[5],arrayCustomer[6]);
                listCustomer.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }return listCustomer;

    }
    public static ArrayList<Villa> readVilla(){
        ArrayList<Villa>  listVilla = new ArrayList<>();
        FileReader fileReader =null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Villa.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line="";
            String[] array =null;
            while ((line=bufferedReader.readLine())!=null){
                array=line.split(",");
                Villa villa = new Villa(array[0],array[1],Double.parseDouble(array[2]),Integer.parseInt(array[3]),
                        Integer.parseInt(array[4]),Integer.parseInt(array[5]),array[6],array[7],
                        Double.parseDouble(array[8]),Integer.parseInt(array[9]));
                listVilla.add(villa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listVilla;
    }
    public static ArrayList<House> readHouse(){
        ArrayList<House> listHouse = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\House.csv");
            bufferedReader = new BufferedReader(fileReader);
            String lineHoue = "";
            String[] arrayHouse = null;
            while ((lineHoue=bufferedReader.readLine())!=null){
                arrayHouse=lineHoue.split(",");
                House house = new House(arrayHouse[0],arrayHouse[1],Double.parseDouble(arrayHouse[2]),Integer.parseInt(arrayHouse[3]),
                        Integer.parseInt(arrayHouse[4]),Integer.parseInt(arrayHouse[5]),arrayHouse[6],arrayHouse[7],
                        Integer.parseInt(arrayHouse[8]));
                listHouse.add(house);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listHouse;
    }
    public static ArrayList<Room> readRoom(){
        ArrayList<Room> listRoom = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("E:\\A2010I1_NguyenHuuKhanh\\Module2_CaseStudy\\FuramaResort\\src\\Data\\Room.csv");
            bufferedReader = new BufferedReader(fileReader);
            String lineRoom = " ";
            String[] arrayRoom = null;
            while ((lineRoom=bufferedReader.readLine())!=null){
                arrayRoom=lineRoom.split(",");
                Room room = new Room(arrayRoom[0],arrayRoom[1],Integer.parseInt(arrayRoom[2]),Integer.parseInt(arrayRoom[3]),
                        Integer.parseInt(arrayRoom[4]),Integer.parseInt(arrayRoom[5]), arrayRoom[6]);
                listRoom.add(room);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listRoom;
    }

}


