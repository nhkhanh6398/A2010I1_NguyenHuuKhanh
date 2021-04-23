package Bai_Tap.control;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MainControler mainControler = new MainControler();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN--");
        while (check) {
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1.Thêm mới" + "\n" + "2.Xóa" + "\n" + "3.Xem danh sách các bệnh án" + "\n" + "4.Thoát");
            System.out.println("Chọn chức năng:");
            int choose = input.nextInt();
            input.nextLine();
            switch (choose) {
                case 1:
                    mainControler.themBenhAn();
                    break;
                case 2:
                    mainControler.delete();
                case 3:
                    mainControler.showBenhAn();
                    break;
                case 4:
                    check = false;
            }
        }
    }
}
