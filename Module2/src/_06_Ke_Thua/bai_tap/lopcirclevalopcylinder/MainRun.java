package _06_Ke_Thua.bai_tap.lopcirclevalopcylinder;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        LopCircle circle = new LopCircle();
        circle.setBanKinh(5);
        System.out.println("Bán kính: "+circle.getArea());
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều cao");
        double a = input.nextDouble();
        Cylinder cylinder = new Cylinder(circle.getBanKinh(),"blue",a);
        System.out.println("Màu: "+cylinder.getColor());
        System.out.println("thể tích: "+ cylinder.getTheTich());
    }
}
