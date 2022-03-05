package Array;
/*
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */
public class RangeSumArray {
    public long[] rangeSum(int[] A, int[][] B) {
        
        int n = A.length;
        int m = B.length;
        long[] pref = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + A[i - 1];
        }

        long[] ans = new long[m];
        for (int i = 0; i < m; i++) {
            ans[i] = pref[B[i][1]] - pref[B[i][0] - 1];
        }
return ans;

    }

}
