package _03_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int [] array1 = new int[5];
        int [] array2 = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử mảng 1: ");
        for (int i = 0; i<array1.length;i++){

            array1[i] = input.nextInt();
        }
        System.out.println("Nhập phần tử mảng 2: ");
        for (int i = 0; i<array2.length;i++){

            array2[i] = input.nextInt();
        }
        int [] array3 = new int[array1.length+array2.length];
        for (int i = 0; i<array1.length;i++){
            array3[i]=array1[i];
        }
        int index =0;
        for (int j = array1.length;j<array3.length;j++){
            array3[j]=array2[index];
            index++;
        }
        System.out.println("Mảng sau khi gộp: ");
        System.out.println(Arrays.toString(array3));

    }
}
