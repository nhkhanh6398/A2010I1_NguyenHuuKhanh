package test.code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ControlProduct {
    Scanner input = new Scanner(System.in);
    Product product = new Product();
    writeandread writeandread = new writeandread();


    public void add() {
        List<Product> productList = new ArrayList<>();
        System.out.println("Nhap id: ");
        String id = input.nextLine();
        product.setId(id);
        System.out.println("Nhap name: ");
        String name = input.nextLine();
        product.setName(name);
        System.out.println("Nhap day: ");
        String day = input.nextLine();
        product.setDay(day);
        System.out.println("Nhap so luong: ");
        int count = input.nextInt();
        input.nextLine();
        product.setCount(count);
        productList.add(product);
        writeandread.writeProduct(productList,true);

    }

    public void show() {
        ArrayList<Product> arrayList = writeandread.readProduct();
        for (Product pro : arrayList) {
            System.out.println(pro);
        }
    }

    public String getlist() {
        ArrayList<Product> arrayList = writeandread.readProduct();
        String list = " ";
        for (int i = 0; i < arrayList.size(); i++) {
            list += (i + 1 + " Name: " + arrayList.get(i).getName() + "\n ");
        }
        return list;
    }

    public String infor(Product product) {

        String infor = "1.ID: " + product.getId() + "\n"
                + "2.Name: " + product.getName() + "\n"
                + "3.Day: " + product.getDay() + "\n"
                + "4.Count: " + product.getCount();
        return infor;
    }

    public void edit() {
        ArrayList<Product> arrayList = writeandread.readProduct();
        System.out.println("Danh sach: " + "\n" + getlist());
        System.out.println("chon: ");
        int choose = input.nextInt();
        input.nextLine();
        System.out.println("Thong tin: " + "\n" + infor(arrayList.get(choose - 1)));
        System.out.println("Chon cai can sua: ");
        int edit = Integer.parseInt(input.nextLine());
        switch (edit) {
            case 1:
                System.out.println("Sua ID: ");
                arrayList.get(choose - 1).setId(input.nextLine());
                break;
            case 2:
                System.out.println("Sua Name: ");
                arrayList.get(choose - 1).setName(input.nextLine());

                break;
            case 3:
                System.out.println("Sua Day: ");
                arrayList.get(choose - 1).setDay(input.nextLine());

                break;
            case 4:
                System.out.println("Sua Count: ");
                arrayList.get(choose - 1).setCount(input.nextInt());

                break;
            default:
                System.out.println("Error!");
        }
        writeandread.writeProduct(arrayList,false);
        }
        public void delete(){
        List<Product> arrayList = writeandread.readProduct();
            String list = " ";
            for (int i = 0; i < arrayList.size(); i++) {
                list += (i + 1 + " Name: " + arrayList.get(i).getName() + "\n ");
            }
            System.out.println(list);
            System.out.println("chon san pham muon xoa");
            int choose = input.nextInt();
            arrayList.remove(choose-1);
            writeandread.writeProduct(arrayList,false);
        }
public void search(){
        List<Product> productList = writeandread.readProduct();
    System.out.println("Nhap ten can tim");
    String nameSearch = input.nextLine();
    for (Product product: productList){
        if(product.getName().contains(nameSearch)){
            System.out.println(product);
        }
    }
}
    }
