package Beginners_Batch.Advance.Bit_Manupulation;

public class given_the_number_from_one_to_n_plus_two_find_the_two_missing_number_from_the_array {

    public static void main(String[] args) {
        int[] A={1,3,6,4};
     int n = A.length+2;
       int xor =0;
       for(int i=0;i<n-2;i++){
           xor^= A[i];
       }

       for(int i=1;i<=n;i++){
           xor^=i;
       }

        int msb = xor & -xor;


       int x =0;
       int y=0;
       for(int i=0;i<n-2;i++){
           if((msb&A[i])>0){
               x=x^A[i];
           }else{
               y=y^A[i];
           }
       }

        for (int i = 1; i <= n; i++)
        {
            if ((i & msb)>0)

                /* XOR of first set in arr[] and
                   {1, 2, ...n }*/
                x = x ^ i;
            else
                /* XOR of second set in arr[] and
                    {1, 2, ...n } */
                y = y ^ i;
        }
        System.out.println(x);
        System.out.println(y);

    }
}
