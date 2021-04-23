package test.code;

import _12_Java_Collection_Framework.thuc_hanh.phan_biet_hashmap_hashset.Main;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ControlProduct controlProduct = new ControlProduct();
        while (true){
        System.out.println("Menu"+"\n"+"1. Add"+"\n"+"2.Show"+"\n"+"3.Edit"+"\n"+"4.Delete"+"\n"+"5.Search");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                controlProduct.add();
                break;
            case 2:
                controlProduct.show();

                break;
            case 3:
                controlProduct.edit();
                break;
            case 4:
                controlProduct.delete();
                break;
            case 5:
                controlProduct.search();
                break;
            default:
                System.out.println("error");
                break;
        }
    }
    }
}
