package TWODMatrix;

public class RotationOfAMatrixByNintyDegree {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        //Transpose of a matrix
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        //reverse of matrix
        for(int i=0;i<A.length;i++){
            int low = 0;
            int high = A.length-1;
            while(low<high){
                int temp = A[i][low];
                A[i][low] = A[i][high];
                A[i][high] = temp;
            }
        }

    }
}
