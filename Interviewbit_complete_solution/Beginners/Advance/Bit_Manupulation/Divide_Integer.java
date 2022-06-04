package Beginners_Batch.Advance.Bit_Manupulation;

public class Divide_Integer {

        public int divide(int A, int B) {
            if(A==-1)return -1;

            if(A==Integer.MIN_VALUE && B== -1)return Integer.MAX_VALUE;
            A = Math.abs(A);
            B = Math.abs(B);

            int ans =0;

            while((A-B)>=0){
                int x = 0;
                while((A-(B<<1<<x))>=0){
                    x++;
                }
                ans+= 1<<x;
                A= A-(B<<x);
            }

            return ans;
        }
}
