package _15_XuLyNgoaiLe_Debug.bai_tap;

import java.util.Scanner;

public class UseIllegalTriangleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 3 canh cua tam giac: ");

        System.out.println("Cạnh A: ");
        int a = input.nextInt();
        System.out.println("Cạnh B: ");
        int b =input.nextInt();
        System.out.println("Cạnh C: ");
        int c = input.nextInt();

        try {
            if (check(a,b,c)){
                System.out.println("Đúng!");
            }else{
                System.out.println("Sai");
            }
        }catch (IllegalTriangleException e){
            e.printStackTrace();
        }


    }
    public static boolean check(int a, int b, int c) throws IllegalTriangleException {
        if (a<0||b<0||c<0){
            throw new IllegalTriangleException("Cạnh bạn nhập vào nhỏ hơn 0");
        }else if (a+b<c||a+c<b||b+c<a){
            throw new IllegalTriangleException("Tổng hai cạnh bé hơn cạnh còn lại");
        }
        return true;
    }
}
