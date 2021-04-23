package _02_loopinjava.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    static boolean isSoNguyenTo(int number){
        int count = 0;
        for (int i = 1;i<=number;i++){
            if (number%i ==0){
                count++;
            }
        }
        if (count == 2){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập số lượng:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=1;
        int count=0;
        while (true){
            if (isSoNguyenTo(i)){
                System.out.println(i);
                count++;
            }
            if (count==n){
                break;
            }
            i++;
        }
    }
}
