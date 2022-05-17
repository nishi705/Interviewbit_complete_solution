package Beginners_Batch.Advance.Bit_Manupulation;

import java.util.Arrays;

public class Min_xor {
    public int findMinXor(int[] A) {
        Arrays.parallelSort(A);
        int min = Integer.MAX_VALUE;
        int val =0;
        for(int i=0;i<A.length-1;i++){
            val = A[i]^A[i+1];
            min = Math.min(min,val);
        }
        return min;

    }
}
