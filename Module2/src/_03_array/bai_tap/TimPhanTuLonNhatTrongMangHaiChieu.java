package _03_array.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int m = input.nextInt();
        System.out.println("Nhập số cột: ");
        int n = input.nextInt();
        int[][] array= new int[m][n];

        System.out.println("Nhập mảng: ");
        for (int i = 0; i<m;i++){
            for (int j = 0; j<n;j++){
                System.out.print("Nhập phần tử thứ ["+i+","+j+"]: ");
                array[i][j]=input.nextInt();
            }
        }
        System.out.println("Mảng sau khi nhập: ");
        for (int i = 0; i<m;i++){
            for (int j = 0; j<n;j++){
                System.out.print("Mảng["+i+","+j+"]: "+array[i][j]+ " " );
            }
        }
        System.out.println(" ");
        int max = array[0][0];
        for (int i = 0; i<m;i++){
            for (int j = 0;j<n;j++){
                if (max<array[i][j]){
                    max=array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng: "+max);
    }
}
