package _19_StringAndRegex.bai_tap;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

public class ValidateNameClass {
    public static boolean checkName(String name){
        String nameRegex = "^[CAP]+[0-9]{4}(G|H|I|K|L|M)$";
        return name.matches(nameRegex);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = input.nextLine();
        if (checkName(name)){
            System.out.println(name + " đúng");
        }else {
            System.out.println(name+ " sai");
        }
    }
}
