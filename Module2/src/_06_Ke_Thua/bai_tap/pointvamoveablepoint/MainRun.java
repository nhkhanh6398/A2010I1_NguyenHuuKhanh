package _06_Ke_Thua.bai_tap.pointvamoveablepoint;

import java.util.Arrays;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point point = new Point();
        System.out.println("Input X: ");
        float x = input.nextFloat();
        System.out.println("Input Y: ");
        float y = input.nextFloat();
        point.setX(x);
        point.setY(y);
        System.out.println(point.toString());
        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setX(point.getX());
        moveablePoint.setY(point.getY());
        System.out.println("Input XSpeed: ");
        float xSpeed = input.nextFloat();
        System.out.println("Input YSpeed: ");
        float ySpeed = input.nextFloat();
        moveablePoint.setxSpeed(xSpeed);
        moveablePoint.setySpeed(ySpeed);
//        System.out.println(moveablePoint.toString());

        System.out.println(moveablePoint.move());
    }
}
