package Beginners_Batch.Advance;

public class Max_Sum_Contiguous_Subarray {
    public int maxSubArray(final int[] A) {
        int max = Integer.MIN_VALUE;
        int end = 0;

        for(int i=0;i<A.length;i++){
            end = end+A[i];
            if(max<end){
                max= end;
            }
            if(end<0){
                end = 0;
            }
        }
        return max;
    }
}
