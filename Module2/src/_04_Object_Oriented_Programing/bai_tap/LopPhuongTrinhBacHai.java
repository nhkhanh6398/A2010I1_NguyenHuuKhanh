package _04_Object_Oriented_Programing.bai_tap;

import java.util.Scanner;

public class LopPhuongTrinhBacHai {
    private float a;
    private float b;
    private float c;
    private float delta;

    public LopPhuongTrinhBacHai(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return delta=b*b-4*a*c;
    }
    public double getRoot1(){

        return ((-b+Math.sqrt(delta))/(2*a));
    }
    public double getRoot2(){
        return ((-b-Math.sqrt(delta))/(2*a));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = input.nextFloat();
        System.out.println("Nhập b: ");
        float b = input.nextFloat();
        System.out.println("Nhập c: ");
        float c = input.nextFloat();
        LopPhuongTrinhBacHai bacHai = new LopPhuongTrinhBacHai(a,b,c);
        bacHai.getDiscriminant();
        if (bacHai.getA()==0){
            if (bacHai.getB()==0){
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình có 1 nghiệm:" + "x= " + (-c/b));
            }
        }
        if (bacHai.getA()!=0&&bacHai.getDiscriminant()>0){
            System.out.println("Phương trình có 2 nghiệm: "+ "x1: "+bacHai.getRoot1()+ " " + "x2: "+bacHai.getRoot2());
        }else if (bacHai.getA()!=0&&bacHai.getDiscriminant()==0){
            System.out.println("Phương trình có nghiệm kép: "+"x1,x2: "+(-b/(2*a)));
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
