package Beginners_Batch.Advance.Bit_Manupulation;

public class Replace_A_i_with_A_A_i {
    public static void main(String[] args) {
        int[] A = {3,2,4,1,0};

        for(int i=0;i<A.length;i++) {
            A[i] = A[A[i]];
        }


        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
