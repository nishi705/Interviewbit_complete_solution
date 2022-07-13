package Beginners_Batch.Advance.Arrays;

public class Equilibrium_index_of_an_array {

    public int solve(int[] A) {
        int sum =0;
        for(int i=0;i<A.length;i++){
            sum = sum+A[i];
        }
        int lsum =0;
        int rsum = sum;

        for(int i=0;i<A.length;i++){
            rsum = rsum-A[i];
            if(lsum==rsum)return i;
            lsum=lsum+A[i];
        }
        return -1;
    }
}
