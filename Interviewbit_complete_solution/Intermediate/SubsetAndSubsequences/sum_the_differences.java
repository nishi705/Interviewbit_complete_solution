package SubsetAndSubsequences;

import java.util.ArrayList;
import java.util.Arrays;

public class sum_the_differences {
    /*
    if unsorted array is given then sort it first(2,3,1)
    Arrays.sort(A);
    A= {1,2,3}
    A.size() = 3 so the total subsequence is 2^n -1 = (2*2*2)-1 = 7
    for outer loop go from  1 to (1<<n) means ( 1 to 7)
    and in inner loop 1 to A.length;
    check the set bit position, using (i & (1<<j))!=0
    suppose we have 101 so set bit is at 0th and 2nd position
    therefore diff = A[2] - A[0];
     */
    public int solve(int[] A) {

        Arrays.sort(A);
        int n = A.length;

        int sum =0;
        for(int i=0;i<(1<<n);i++) {
            ArrayList<Integer> al = new ArrayList<>();
            int j = 0;
            while (j < n) {

                if ((i & (1 << j)) != 0) {
                    al.add(A[j]);
                }
                j++;
            }

            if (al.size() > 1) {
                int a = al.get(al.size() - 1) - al.get(0);
                sum = (sum + a)%1000000007;
            }
        }
        return sum%1000000007;
    }
}
