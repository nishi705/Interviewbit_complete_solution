package Array;

public class Rotate_Matrix {
    public static void main(String[] args) {
        int[][] A= {{1, 2},
                    {3, 4}};

        //Transpose of a matrix
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }


        for(int i=0;i<A.length;i++){
            int low =0;
            int high = A.length-1;
            while(low<high){
                int temp = A[i][low];
                A[i][low] = A[high][i];
                A[high][i] = temp;
                low++;
                high--;
            }
        }

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                System.out.print(A[i][j]);
            }
            //System.out.println();
        }
    }
}
