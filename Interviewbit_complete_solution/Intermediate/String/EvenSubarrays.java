package String;
/*
You are given an integer array A.

Decide whether it is possible to divide the array into one or more subarrays of even length such that first and last element of all subarrays will be even.

Return "YES" if it is possible otherwise return "NO" (without quotes).
 */

public class EvenSubarrays {
    public String solve(int[] A) {
        int n = A.length;

        for(int i=0;i<A.length;i++)
        {
            if(A.length%2==0 && A[0]%2==0 && A[A.length-1]%2==0)
                return "YES";
        }
        return "NO";
    }
}
