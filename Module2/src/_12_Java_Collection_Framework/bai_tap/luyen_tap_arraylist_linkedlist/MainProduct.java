package _12_Java_Collection_Framework.bai_tap.luyen_tap_arraylist_linkedlist;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add product" + "\n"
                    + "2. Edit product" + "\n"
                    + "3. Delete product"+"\n"
                    + "4. Display product"+"\n"
                    + "5. Search product"+"\n"
                    + "6. Sort product");
            System.out.println("Choose: ");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.del();
                    break;
                case 4:
                    productManager.showProduct();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.sort();
                    break;
            }
        }
    }
}
