package TWODMatrix;

public class Row_wise_sum {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4},
                {5,6,7,8},
                {9,2,3,4}};
        int sum;
        int[] result = new int[A[0].length];
        int k=0;
        for(int i=0;i<A.length;i++){
            sum =0;
            for(int j=0;j<A[0].length;j++){
                sum+=A[i][j];
            }
          result[k++] = sum;
        }
        for(int i=0;i<A.length;i++){
            System.out.println(result[i]);
        }
    }
}
