package Beginners_Batch.Advance.Arrays;

import java.util.Arrays;

public class Beggars_Outside_Temple {
    public int[] solve(int A, int[][] B) {
       int[] res = new int[A+1];
        for(int i=0;i<B.length;i++){
            int amt = B[i][2];
            res[B[i][0]-1]+= amt;
            res[B[i][1]]-=amt;
        }
        for(int i=1;i<A;i++){
             res[i]+=res[i-1];
        }
        res = Arrays.copyOf(res, res.length-1);//so that unwanted result it will delete
        return res;
    }
}
