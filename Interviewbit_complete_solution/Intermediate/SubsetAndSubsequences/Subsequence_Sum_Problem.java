package SubsetAndSubsequences;

public class Subsequence_Sum_Problem {
    /*
    You have to find that there is any subsequence exists or not whose sum is equal to B.

    our approach will be the same as(difference of maximum and minimum of the subsequence and
    get the total sum of the difference)
     */
    public int solve(int[] A, int B) {

        int sum;
        int n = A.length;
        int total = 1 << n;

        for (int i = 0; i < total; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += A[j];
                }

            }
            if (sum == B)
                return 1;

        }
        return 0;

    }

}
