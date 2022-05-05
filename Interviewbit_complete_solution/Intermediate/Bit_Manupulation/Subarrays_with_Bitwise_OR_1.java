package Bit_Manupulation;

public class Subarrays_with_Bitwise_OR_1 {
    public static void main(String[] args) {
        //Bitwise OR means :- will try to find out the
        //bitwise OR for each and every element:
        //eg: {1,2,3,4,5}
        /*
        subarray  bitwise OR
        1           1
        1,2         3
        1,2,3       3
        1,2,3,4     7
        1,2,3,4,5   7
        2           2
        2,3         3
        .           .                    .
        .           .
        .           .
         */
        //Lets do  Bruteforce solution
        int[] A = {1,2,3,4,5};
//        int sum =0;
//        for(int i=0;i<A.length;i++){
//            int curr_or = 0;
//            for(int j=i;j<A.length;j++){
//                curr_or = curr_or | A[j];
//                sum = sum+curr_or;
//            }
//        }
//        System.out.println(sum);



        /*In above question we can observe that
        we can find out the PREFIX OR
         */
        int[] PO =new int[A.length];
        PO[0] = A[0];
                for(int i=1;i<A.length;i++){
                    PO[i] = PO[i-1] | A[i];
                }
        for(int i=0;i<A.length;i++){
            System.out.println(PO[i]);
        }








        //2.Lets try with bitwise operation
        int[] B = {1,0,1};
        int sum =0;
        int ans =0;
        for(int i=0;i<B.length;i++){
                if(B[i]== 1) {
                    sum = i+1;
                }
               ans = ans+sum;
        }
        System.out.println(ans);
     }
}
