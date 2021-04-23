package _01_IntroductionToJava.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        System.out.println("Nhập số tiền USA: ");
        Scanner scanner = new Scanner(System.in);
        int monney = scanner.nextInt();
        int change = monney*rate;
        System.out.println("Tiền Việt Là: "+change);
    }
}
