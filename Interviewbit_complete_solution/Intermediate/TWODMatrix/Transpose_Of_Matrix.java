package TWODMatrix;

public class Transpose_Of_Matrix {
    public static void main(String[] args) {
        int[][] A = {
                {1, 3, 2},
                {3, 1, 1},
                {1, 2, 2}
        };



        for(int i=0;i<A[0].length;i++){
            for(int j=0;j<A.length;j++){
                A[i][j] = A[j][i];
            }
        }

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
}
