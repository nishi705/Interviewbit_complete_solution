package Array;

/*
You are given an integer array C of size A.
Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.
 */

public class Maximum_Subarray_Easy {
    public int maxSubarray(int A, int B, int[] C) {

        int max_sum = Integer.MIN_VALUE;
        int sum =0;
        int r =0;
        for(int i=0;i<A;i++){
            while(r<A && sum+C[r]<=B){
                sum+=C[r];
                r++;
            }
            max_sum = Math.max(sum,max_sum);
            if(i<r){
                sum-= C[i];
            }
            else{
                r=i+1;
            }

        }
        return max_sum;

    }
}
