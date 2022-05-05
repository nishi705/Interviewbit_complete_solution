package Array;

public class Max_contigous_subarray {
    public int maxSubArray(final int[] A) {

        int max_sum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum = sum+A[i];
            max_sum = Math.max(max_sum,sum);
            if(sum<0) {
                sum =0;
            }

        }
        return max_sum;


    }
}
