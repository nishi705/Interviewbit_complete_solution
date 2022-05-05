package TWODMatrix;

public class Column_wise_sum {
    public int[] solve(int[][] A) {
        int sum;
        int[] result = new int[A[0].length];
        int k = 0;
        for (int j = 0; j < A[0].length; j++) {
            sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum += A[i][j];
            }
            result[k++] = sum;
        }
        return result;
    }
}
