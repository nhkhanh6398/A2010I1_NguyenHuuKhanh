package _11_DSA_Stack_Queue.bai_tap;

import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public void convertBinary(int num){
        Stack<Integer> stack = new Stack<>();
        while(num != 0){
            int d = num%2;
            stack.push(d);
            num/=2;
        }
        while(!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }
    public static void main(String[] args) {
        int a = 123456789;
        System.out.print("Hệ nhị phân của " + a +" là :");
        new ThapPhanSangNhiPhan().convertBinary(a);
    }
}
