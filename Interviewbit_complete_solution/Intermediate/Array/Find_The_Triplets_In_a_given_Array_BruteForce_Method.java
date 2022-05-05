package Array;

public class Find_The_Triplets_In_a_given_Array_BruteForce_Method {
    public static void main(String[] args) {


        int[] A = {3, 6, 9, 12, 5, 16, 18, 7, 11};

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for(int j=i+1;j<A.length;j++){
                for(int k=j+1;k<A.length;k++){
                    if(A[i] < A[j] && A[j] < A[k]){
                           count++;
                    }
                }
            }

        }
        System.out.println(count);
    }
}
