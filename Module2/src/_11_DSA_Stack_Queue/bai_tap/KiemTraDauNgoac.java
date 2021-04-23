package _11_DSA_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    Stack<Character> characterStack = new Stack<>();
    public boolean checksym(String check){
        for (int i = 0; i< check.length();i++){
            if (check.charAt(i)=='('){
                characterStack.push(check.charAt(i));
            }else if (check.charAt(i)==')'){
                if (characterStack.isEmpty()){
                    return false;
                }else {
                    characterStack.pop();
                }
            }
        }
        return characterStack.isEmpty();

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String check = input.nextLine();
        KiemTraDauNgoac kiemtra = new KiemTraDauNgoac();
        System.out.println(kiemtra.checksym(check));

    }
}
