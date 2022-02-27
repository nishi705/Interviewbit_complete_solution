package Array;
/*
Given an array A. Find the size of the smallest subarray such that it contains atleast one occurrence of the maximum value of the array

and atleast one occurrence of the minimum value of the array.
 */
public class ClosestMinMax {
    public int solve(int[] A) {
        int min_Index = -1, max_Index = -1;
        int min_ele = Integer.MAX_VALUE, max_ele = Integer.MIN_VALUE;

        int ans = Integer.MAX_VALUE;
        for (int x : A) {
            min_ele = Math.min(min_ele, x);
            max_ele = Math.max(max_ele, x);
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == min_ele) min_Index = Math.max(min_Index, i);
            if (A[i] == max_ele) max_Index = Math.max(max_Index, i);

            if (min_Index != -1 && max_Index != -1) {
                int len = Math.abs(max_Index - min_Index) + 1;
                ans = Math.min(ans, len);
            }

        }

        return ans;
    }
}
