package Beginners_Batch.Advance.Binary_search;

public class Matrix_Median {
    public static void main(String[] args) {
        int[][] A= {
        {4},
        {2},
        {5}
    };
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        int n = A.length;
        int m = A[0].length;

        for (int i=0;i<n;i++){

            if (A[i][0]< low){
                low = A[i][0];
            }
            if (A[i][m-1]>high){
                high = A[i][m-1];
            }
        }

        System.out.println(low);
        System.out.println(high);


}
}
