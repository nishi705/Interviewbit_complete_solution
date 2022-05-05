package Beginners_Batch.Advance;

public class calculate_sum_of_all_the_submatrix_sum {
    public int solve(int[][] A) {
        int n = A.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int TL = (i + 1) * (j + 1);
                int BR = (n - i) * (n - j);
                sum += (TL * BR * A[i][j]);
            }
        }
        return sum;
    }
}