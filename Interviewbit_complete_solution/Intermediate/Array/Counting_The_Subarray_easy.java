package Array;
/*
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.
 */

public class Counting_The_Subarray_easy {
    public int solve(int[] A, int B) {
        // int count =0;
        // for(int i=0;i<A.length;i++){
        //     int sum =0;
        //     for(int j=i;j<A.length;j++){
        //         sum+=A[j];
        //         if(sum < B){
        //             count++;
        //         }
        //     }
        // }
        // return count;


        int n = A.length;
        int start = 0;
        int end = 0;
        int sum = A[0];
        int count = 0;
        while (start < n && end < n) {
            if (sum < B) {
                end++;
                if (end >= start) {
                    count += end - start;
                    if (end < n) {
                        sum += A[end];
                    }
                }
            } else {
                sum -= A[start];
                start++;
            }
        }
        return count;
    }
    }
