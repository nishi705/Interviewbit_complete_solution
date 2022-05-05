package Array;

public class Least_Avg_with_given_sum_k_Sliding_window_technique {
    public int solve(int[] A, int B) {

        int curr_sum = 0;
        for (int i = 0; i < B; i++) {
            curr_sum += A[i];
        }
        int min_sum = curr_sum;
        int index = 0;
        for (int i = B; i < A.length; i++) {
            curr_sum += A[i] - A[i - B];
            if (curr_sum < min_sum) {
                min_sum = curr_sum;
                index = i - B + 1;
            }
        }
        return index;
    }
}
