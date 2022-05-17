package Beginners_Batch.Advance.Arrays;

public class Maximum_Absolute_difference {
    //Optimised approach
    public int maxArr(int[] A) {
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;

        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0;i<A.length;i++){
            max1 = Math.max(max1,A[i]+i);
            min1 = Math.min(min1,A[i]+i);

            max2 = Math.max(max2,A[i]-i);
            min2 = Math.min(min2,A[i]-i);
        }

        return Math.max(max1-min1, max2-min2);
    }

    public static void main(String[] args) {

        int[] A = {-98, -5, 37, -97, 38, 22, 70, 42, 61, 84};
        int Max = Integer.MIN_VALUE;
        for (int i = 1; i <= A.length; i++) {
            for (int j = i; j <= A.length; j++) {
                if (i == j) {
                    continue;
                }
                int ans = Math.abs(A[i - 1] - A[j - 1]) + (j - i);
                Max = Math.max(ans,Max);

            }

        }
        System.out.print(Max);
    }

}
