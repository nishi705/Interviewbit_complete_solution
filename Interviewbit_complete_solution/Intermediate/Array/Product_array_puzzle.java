package Array;

public class Product_array_puzzle {
    public int[] solve(int[] A) {
        int n = A.length;

        int left[] = new int[n];
        int right[] = new int[n];
        int prod[] = new int[n];

        int i, j;
        left[0] = 1;
        right[n - 1] = 1;

        for (i = 1; i < n; i++){
            left[i] = A[i - 1] * left[i - 1];
        }

        for (j = n - 2; j >= 0; j--){
            right[j] = A[j + 1] * right[j + 1];
        }

        for (i = 0; i < n; i++){
            prod[i] = left[i] * right[i];
        }

        return prod;

    }
}
