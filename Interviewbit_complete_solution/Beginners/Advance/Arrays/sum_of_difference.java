package Beginners_Batch.Advance.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class sum_of_difference {

    public static void main(String[] args) {
        int[] A ={1,2};
        Arrays.sort(A);
        int n = A.length;

        int sum =0;
        for(int i=0;i<(1<<n);i++) {
            ArrayList<Integer> al = new ArrayList<>();
            int j = 0;
            while (j < n) {

                if ((i & (1 << j)) != 0) {
                    al.add(A[j]);
                }
                j++;
            }
           System.out.println(al);
            if (al.size() > 1) {
                int a = al.get(al.size() - 1) - al.get(0);
                sum = sum + a;
            }
        }
        System.out.print(sum);
    }
}
