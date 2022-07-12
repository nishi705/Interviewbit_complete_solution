package Beginners_Batch.Advance.Matrix;

public class Sum_Of_the_all_submatrix_sum {
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
