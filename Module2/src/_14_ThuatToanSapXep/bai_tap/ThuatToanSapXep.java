package _14_ThuatToanSapXep.bai_tap;

import java.util.Arrays;

public class ThuatToanSapXep {
    public static void main(String[] args) {
        int[] a = {3,5,9,2,1,6,4,8};
        for (int i = 1;i<a.length;i++){
            int sort = a[i];
            int j;
            for (j = i-1; j>=0; j--){
                if (sort<a[j]){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1]=sort;
        }
        System.out.println(Arrays.toString(a));
    }
}
