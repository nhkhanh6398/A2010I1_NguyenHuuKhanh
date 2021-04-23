package test.bt_them.main;

import test.bt_them.control.PhuongTienManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhuongTienManager phuongTienManager = new PhuongTienManager();
        Scanner input = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
        System.out.println("Chọn chức năng: ");
        boolean check = true;
        while (check){
        System.out.println("1.Thêm mới phương tiện"+"\n"+"2.Hiển thị phương tiện"+"\n"+"3.Xóa phương tiện"+"\n"+
                "4.Thoát");
        int choose = input.nextInt();
        input.nextLine();
        switch (choose){
            case 1:
                phuongTienManager.mainAdd();
                break;
            case 2:
                phuongTienManager.mainShow();
                break;
            case 3:
                phuongTienManager.mainDelete();
                break;
            case 4:
                check =false;
        }
    }
    }
}
