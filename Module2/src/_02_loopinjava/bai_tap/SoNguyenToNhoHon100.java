package _02_loopinjava.bai_tap;

public class SoNguyenToNhoHon100 {
    static boolean isSoNguyenTo(int number){
        int count = 0;
        for (int i = 1;i<=number;i++){
            if (number%i ==0){
                count++;
            }
        }
        if (count == 2){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int i=1;
        while (i<100){
            if (isSoNguyenTo(i)){
                System.out.println(i);
            }
            i++;
        }

    }
}
