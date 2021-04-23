package _01_IntroductionToJava.thuc_hanh;

import java.util.Scanner;

public class TinhCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Can Nang (kg): ");
        weight = scanner.nextDouble();
        System.out.println("Chieu Cao (m): ");
        height = scanner.nextDouble();
        bmi=weight/Math.pow(height,2); //Math.pow bình phương 1 số
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
