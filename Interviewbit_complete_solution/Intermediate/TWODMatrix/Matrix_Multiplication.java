package TWODMatrix;

public class Matrix_Multiplication {
    public static void main(String[] args) {

        int[][] A = {
                {1, 3, 2},
                {3, 1, 1},
                {1, 2, 2}
        };

        //Initialize matrix b
        int B[][] = {
                {2, 1, 1},
                {1, 0, 1},
                {1, 3, 1}
        };


        if(A[0].length != B.length){
            System.out.println("matrix multiplication is not possible");
        }
        else {

            int[][] result = new int[A.length][B[0].length];

            for(int i=0;i<A.length;i++){
                for(int j=0;j<B[0].length;j++){
                    for(int k=0;k<B.length;k++){
                        result[i][j] += A[i][k]*B[k][j];
                    }
                }
            }
            for(int i=0;i<result.length;i++){
                for(int j=0;j<result[0].length;j++){
                    System.out.println(result[i][j]);
                }
            }
        }


    }
}
