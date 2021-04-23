package _11_DSA_Stack_Queue.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class DaoNguocPhanTuStack {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        int[] array = {1,2,3,4,5,6};
        for(int i=0; i <array.length;i++){
            intStack.push(array[i]);
        }
        System.out.println("Kí tự: "+intStack);
        for (int i = 0; !intStack.empty();i++){
            array[i]=intStack.pop();
        }
        System.out.println(Arrays.toString(array));

        Stack<String> stringStack = new Stack<>();
        String[] array2 = {"trung","hieu","smile"};
        for(int i = 0; i<array2.length;i++){
            stringStack.push(array2[i]);
        }
        System.out.println("Chuỗi: "+stringStack);
        for(int i = 0; !stringStack.empty();i++){
            array2[i]=stringStack.pop();
        }
        System.out.println(Arrays.toString(array2));
    }
}