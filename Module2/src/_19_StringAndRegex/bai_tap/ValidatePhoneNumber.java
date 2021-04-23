package _19_StringAndRegex.bai_tap;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static boolean checkPhone(String number){
        String numberRegex = "^(84)-0[\\d]{9}$";
        return number.matches(numberRegex);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input phone");
        String num = input.nextLine();
        if (checkPhone(num)){
            System.out.println(num+ " đúng");
        }else {
            System.out.println(num+" sai");
        }
    }
}
