package _03_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoOMotXacDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cột: ");
        int col = input.nextInt();
        System.out.println("Nhập số dòng: ");
        int row = input.nextInt();
        int [][] array = new int[row][col];
        System.out.println("Nhập mảng: ");
        for (int i = 0; i<row;i++){
            for (int j = 0; j<col;j++){
                System.out.println("Nhập phần tử ["+(i+1)+","+(j+1)+"]: ");
                array[i][j]=input.nextInt();
            }
        }
        System.out.println("Muốn tính tổng ở cột mấy: ");
        int index = input.nextInt();
        int tong=0;
        for (int i = 0; i< array.length;i++){

            for (int j = 0; j< array.length;j++){
                if (index-1==j){
                    tong += array[i][j];
                }

            }
        }System.out.println("Tổng ở cột "+index+ " bằng: "+tong);


    }
}
