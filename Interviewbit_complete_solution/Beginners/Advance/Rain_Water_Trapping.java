package Beginners_Batch.Advance;

public class Rain_Water_Trapping {
    public static void main(String[] args) {

        int[] A = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int n = A.length;
        Brute_force(A,n);
        Optimised_sol(A,n);


    }

    private static void Optimised_sol(int[] A, int n) {

        int res =0;

        int[] left = new int[n];

        left[0] = A[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],A[i]);
        }

        int[] right = new int[n];
        right[n-1] = A[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],A[i]);
        }

        for(int i=0;i<n;i++){
            res+= Math.min(left[i],right[i])-A[i];

        }
        System.out.println(res);

    }

    private static void Brute_force(int[] A, int n) {
        int res =0;

        for (int i = 1; i < n-1; i++) {

            int left = A[i];
            for(int j=0;j<i;j++){
                left= Math.max(left,A[j]);
            }
            //System.out.println(left);

            int right =  A[i];
            for(int k=i+1;k<n;k++){
                right = Math.max(right,A[k]);
            }
            res = res+(Math.min(left, right)) - A[i];
            // System.out.println(res);


        }
       // System.out.println(res);

    }
}
