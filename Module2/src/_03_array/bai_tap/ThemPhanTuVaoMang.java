package _03_array.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {

    public static void main(String[] args) {
        int count;
        int [] array;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Nhập số lượng phần tử: ");
            count = input.nextInt();
        }while (count<0);

        array = new int[count];
        for (int i = 0; i<count;i++){
            System.out.println("Nhập phần tử "+(i+1)+": ");
            array[i]=input.nextInt();
        }
        System.out.println("Mảng:");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("Nhập phần tử muốn thêm");
        int number = input.nextInt();
        System.out.println("Nhập vị trí muốn thêm: ");
        int index = input.nextInt();
        int j = array.length;
        int[] array2=new int[array.length+1];
        while (j>index){
            array2[j]=array[j-1];
            j=j-1;
        }
        array2[index]=number;
        for (int i=0; i<index;i++){
            array2[i]=array[i];
        }
        for (int i : array2){
            System.out.println(i);
        }

    }

}
