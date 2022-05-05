package Array;

public class Multiple_left_rotations_of_the_array {
    public static void main(String[] args) {


        int[] A = {1, 2, 3, 4, 5};
        //int n = A.length;
        int[] B = {2, 3};

        //Right Rotation
//       reversearr(A,0,n-1);
//       reversearr(A,0,B-1);
//       reversearr(A,B,n-1);
//        printarr(A);

        int[][] arr = new int[B.length][A.length];

        int[] temp = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            temp[i] = A[i];
        }

        int l = 0;
        for (int i = 0; i < B.length; i++) {
            int n = A.length;
            int k = B[i] % n;

            //Left Rotation
            reversearr(A, 0, k - 1);
            reversearr(A, k, n - 1);
            reversearr(A, 0, n - 1);

            for (int j = 0; j < arr[0].length; j++) {
                arr[l][j] = A[j];
            }

            l++;

            for (int m = 0; m < A.length; m++) {
                A[m] = temp[m];

            }

        }
        printarr(arr);
    }
    static void reversearr(int[] A,int i,int j){
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }


    }

    private static void printarr(int[][] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
