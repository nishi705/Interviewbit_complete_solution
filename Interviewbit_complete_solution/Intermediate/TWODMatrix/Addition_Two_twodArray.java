package TWODMatrix;

public class Addition_Two_twodArray {
    public static void main(String[] args) {
        int A[][] = {
                {6},
                {2},
                {3},
                {10},
                {1},
                {3}
        };
        int B[][] = {
                {6},
                {7},
                {3},
                {8},
                {1},
                {2},
        };


        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.println(C[i][j]);
            }
        }
    }
}
