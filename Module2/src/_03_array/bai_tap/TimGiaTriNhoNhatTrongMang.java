package _03_array.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int [] array;
        int count;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        count = input.nextInt();
        array = new int[count];

        for (int i = 0; i<count; i++){
            System.out.print("Nhập phần tử "+(i+1)+": ");
            array[i]=input.nextInt();
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j<array.length;j++){
            if (array[j]<min){
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng: "+min+ " tại vị trí: "+index);
    }
}
