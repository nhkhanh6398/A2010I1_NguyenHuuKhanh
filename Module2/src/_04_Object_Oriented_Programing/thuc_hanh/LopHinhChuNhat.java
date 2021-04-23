package _04_Object_Oriented_Programing.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    double width,height;

    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
   public double getArea(){
        return this.width*this.height;
   }
   public double getPerimeter(){
        return (this.width+this.height)*2;
   }
   public String display(){

        return "{"+"width="+ width+", height="+height+"}";
   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input width: ");
        double rong = input.nextDouble();
        System.out.println("Input height: ");
        double dai = input.nextDouble();
        LopHinhChuNhat hcn = new LopHinhChuNhat(rong,dai);

        System.out.println("HCN "+hcn.display());
        System.out.println("Chu Vi "+hcn.getPerimeter());
        System.out.println("Diện Tích "+hcn.getArea());
    }

}
