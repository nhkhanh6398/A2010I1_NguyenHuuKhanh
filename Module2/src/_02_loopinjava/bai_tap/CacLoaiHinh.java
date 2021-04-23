package _02_loopinjava.bai_tap;

import java.util.Scanner;

public class CacLoaiHinh {
    public static void main(String[] args) {
        int choice=1;
        int d,r;
        Scanner inputR = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner inputD = new Scanner(System.in);
        while (choice!=0){
        System.out.println("Menu");
        System.out.println("1.Tam Giác Vuông");
        System.out.println("2.Hình Chữ Nhật");
        System.out.println("3.Exit");
        System.out.println("Nhập lựa chọn: ");
        choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Nhập chiều dài: ");
                 d = inputD.nextInt();
                for (int i = 1;i<d;i++){
                    System.out.print("*");
                    for (int j =1;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("Nhập chiều dài: ");
                 d = inputD.nextInt();
                System.out.println("Nhập chiều rộng: ");
                r = inputR.nextInt();
                for (int i = 1; i<d;i++){
                    System.out.print("*");
                    for (int j = 1; j<r;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                break;

        }
    }
    }
}
