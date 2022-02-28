package Array;
/*
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
 */

public class Equilibriumindexofanarray {
    public int solve(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int suml = 0;
        int sumr = sum;

        for (int i = 0; i < nums.length; i++) {
            sumr = suml - nums[i];
            if (suml == sumr) {
                return i;
            }
            suml = suml + nums[i];

        }
        return -1;
    }
}
