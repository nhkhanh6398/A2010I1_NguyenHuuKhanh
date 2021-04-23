package _03_array.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
     int count;
     int[] array;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Nhập số lượng phần tử: ");
            count = input.nextInt();
        } while (count < 0);


        array = new int[count];
        for(int i = 0; i<count;i++){
            System.out.println("Nhập phần tử "+(i+1)+ ": ");
            array[i]=input.nextInt();
        }
        System.out.println("Mảng: ");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("Nhập phần tử muốn xóa!");
        int number = input.nextInt();
        int index,i;
        for (index = i = 0;i<count;i++){
            if (array[i]!=number){
                array[index]=array[i];
                index++;
            }
        }
        count=index;
        System.out.println("Mảng sau khi xóa là: ");
        for (i=0;i<count;i++){
            System.out.print(+array[i]+",");
        }
    }
}
