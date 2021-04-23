package manager;

import Commons.ValidateService;
import Commons.WriteAndRead;
import Models.House;
import Models.Room;
import Models.Villa;

import java.util.*;

import static Commons.WriteAndRead.*;

public class ServiceManager {
    Scanner input = new Scanner(System.in);

    public void addVilla() {
        Villa villa = new Villa();
        System.out.println("Input Id Viila: SVVL-YYYY (YYYY is 0-9) ");
        String id;
        do {
            id = input.nextLine();
            if (ValidateService.checkIdVilla(id)) {
                villa.setId(id);

            } else {
                System.out.println("Error! Please Input ID Villa: ");
            }
        } while (!ValidateService.checkIdVilla(id));
        System.out.println("Input Name Services: ");
        String name;
        do {
            name  =input.nextLine();
            if (ValidateService.checkName(name)){
                villa.setNameServices(name);
                break;
            }else {
                System.out.println("Error! Input Name Again: ");
            }
        }while (true);
        System.out.println("Input Area Use: >30m ");
        double areUse;
        do {
             areUse = input.nextDouble();
            if (ValidateService.checkAreaUse(areUse)){
                villa.setAreaUse(areUse);
                break;
            }else {
                System.out.println("Error! Input AreaUse Again: ");
            }
        }while (true);
        System.out.println("Input Cost: >0 ");
        int cost;
        do {
            cost = input.nextInt();
            if (ValidateService.checkCost(cost)){
                villa.setCost(cost);
                break;
            }else {
                System.out.println("Error! Input Cost Again: ");
            }
        }while (true);
        System.out.println("Input Amount People: ");
        int amount;
        do {
            amount = input.nextInt();
            if (ValidateService.checkAmount(amount)){
                villa.setAmount(amount);
                break;
            }else {
                System.out.println("Error! Input Amount People Again: ");
            }
        }while (true);
        input.nextLine();
        System.out.println("Input Rent Type: ");
        villa.setRentType(Integer.parseInt(input.nextLine()));
        System.out.println("Input Type Room Villa: ");
        String type;
        do {
            type=input.nextLine();
            if (ValidateService.checkTypeRoom(type)){
                villa.setTypeRoom(type);
                break;
            }else {
                System.out.println("Error! Input Type Room Villa Again: ");
            }
        }while (true);
        System.out.println("Input Other Villa:  ");
        villa.setOtherService(input.nextLine());
        System.out.println("Input Area Lake Villa: ");
        double areLake;
        do {
            areLake = input.nextDouble();
            if (ValidateService.checkAreaUse(areLake)){
                villa.setAreaUse(areLake);
                break;
            }else {
                System.out.println("Error! Input AreaLake Again: ");
            }
        }while (true);
        System.out.println("Input Number Floor Villa: ");
        villa.setNumberFloor(input.nextInt());
        input.nextLine();
        WriteAndRead.writeVilla(villa);
    }

    public void showVilla() {
        ArrayList<Villa> listVilla = readVilla();
        for (Villa v : listVilla) {
            System.out.println(v.showInfor());
        }
    }

    public void addHouse() {
        House house = new House();
        System.out.println("Input Id House: SVHO-YYYY (YYYY is 0-9) ");
        String id;
        do {
            id = input.nextLine();
            if (ValidateService.checkIDHouse(id)) {
                house.setId(input.nextLine());
                break;
            } else {
                System.out.println("Error! Please Input ID House: ");
            }
        } while (true);
        System.out.println("Input Name Services: ");
        String name;
        do {
            name  =input.nextLine();
            if (ValidateService.checkName(name)){
                house.setNameServices(name);
                break;
            }else {
                System.out.println("Error! Input Name Again: ");
            }
        }while (true);
        System.out.println("Input Area Use: >30m ");

        double areUse;
        do {
            areUse = input.nextDouble();
            if (ValidateService.checkAreaUse(areUse)){
                house.setAreaUse(areUse);
                break;
            }else {
                System.out.println("Error! Input AreaUse Again: ");
            }
        }while (true);

        System.out.println("Input Cost: >0 ");
        int cost;
        do {
            cost = input.nextInt();
            if (ValidateService.checkCost(cost)){
                house.setCost(cost);
                break;
            }else {
                System.out.println("Error! Input Cost Again: ");
            }
        }while (true);
        System.out.println("Input Amount People: ");
        int amount;
        do {
            amount = input.nextInt();
            if (ValidateService.checkAmount(amount)){
                house.setAmount(amount);
                break;
            }else {
                System.out.println("Error! Input Amount People Again: ");
            }
        }while (true);
        System.out.println("Input Rent Type: ");
        house.setRentType(input.nextInt());
        input.nextLine();
        System.out.println("Input Type Room House: ");
        String type;
        do {
            type=input.nextLine();
            if (ValidateService.checkTypeRoom(type)){
                house.setTypeRoom(type);
                break;
            }else {
                System.out.println("Error! Input Type Room House Again: ");
            }
        }while (true);
        System.out.println("Input Other House: ");
        house.setOtherService(input.nextLine());
        System.out.println("Input Number Floor House: ");
        int number;
        do {
            number = input.nextInt();
            if (ValidateService.checkNumberFloor(number)){
                house.setNumberFloor(number);
                break;
            }else {
                System.out.println("Error! Input Number Floor Again: ");
            }
        }while (true);
        WriteAndRead.writeHouse(house);

    }

    public void showHouse() {

        ArrayList<House> listHouse = readHouse();
        for (House v : listHouse) {
            System.out.println(v.showInfor());
        }
    }

    public void addRoom() {
        Room room = new Room();
        System.out.println("Input Id Room: SVRO-YYYY (YYYY is 0-9) ");
        String id;
        do {
            id = input.nextLine();
            if (ValidateService.checkIDRoom(id)) {
                room.setId(input.nextLine());
                break;
            } else {
                System.out.println("Error! Please Input ID Room: ");
            }
        } while (true);
        System.out.println("Input Name Services: ");
        String name;
        do {
            name  =input.nextLine();
            if (ValidateService.checkName(name)){
                room.setNameServices(name);
                break;
            }else {
                System.out.println("Error! Input Name Again: ");
            }
        }while (true);
        System.out.println("Input Area Use: ");
        double areUse;
        do {
            areUse = input.nextDouble();
            if (ValidateService.checkAreaUse(areUse)){
                room.setAreaUse(areUse);
                break;
            }else {
                System.out.println("Error! Input AreaUse Again: ");
            }
        }while (true);
        System.out.println("Input Cost: >0 ");
        int cost;
        do {
            cost = input.nextInt();
            if (ValidateService.checkCost(cost)){
                room.setCost(cost);
                break;
            }else {
                System.out.println("Error! Input Cost Again: ");
            }
        }while (true);
        System.out.println("Input Amount People: ");
        int amount;
        do {
            amount = input.nextInt();
            if (ValidateService.checkAmount(amount)){
                room.setAmount(amount);
                break;
            }else {
                System.out.println("Error! Input Amount People Again: ");
            }
        }while (true);
        input.nextLine();
        System.out.println("Input Rent Type: ");
        room.setRentType(input.nextInt());
        input.nextLine();
        System.out.println("Input Free Services Room: ");
        String free;
        do {
            free = input.nextLine();
            if (ValidateService.checkFreeService(free)){
                room.setFreeServices(free);
                break;
            }else {
                System.out.println("Error! Input Free Service Again: ");
            }
        }while (true);
        WriteAndRead.writeRoom(room);
    }

    public void showRoom() {
        ArrayList<Room> listRoom = readRoom();
        for (Room v : listRoom) {
            System.out.println(v.showInfor());
        }
    }
    public  void collectionVilla(){
        List<Villa> list = readVilla();
        Set<Villa> villaTreeSet = new TreeSet<>(list);
        for (Villa v:villaTreeSet){
            System.out.println(v);
        }
    }
    public void collectionHouse(){
        List<House> houseList = readHouse();
        Set<House> houseSet = new TreeSet<>(houseList);
        for (House h: houseSet){
            System.out.println(h);
        }
    }public void collectionRoom(){
        List<Room> roomList = readRoom();
        Set<Room> roomSet = new TreeSet<>(roomList);
        for (Room r: roomSet){
            System.out.println(r);
        }
    }
}
