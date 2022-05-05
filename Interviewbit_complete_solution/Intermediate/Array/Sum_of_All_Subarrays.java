package Array;

public class Sum_of_All_Subarrays {
    public long subarraySum(int[] A) {

        long result = 0;
        long n = A.length;
        for (int i=0; i<n; i++)
            result += (A[i] * (i+1) * (n-i));

        return result ;
    }
}
