package Bit_Manupulation;

public class Single_Number_III {
        public int[] solve(int[] A) {
            int xor =0;
            for(int i=0;i<A.length;i++){
                xor = xor^A[i];
            }
            //rsb is least significant bit here for negative number first we do 1's compliment
            //then we do 2's compliment
            int rsb = (xor & -xor);
            int x = 0;
            int y = 0;
            for(int i = 0;i<A.length;i++)
            {
               // checking if the nth bit of ith element is set or unset
                if((rsb & A[i]) == 0){
                    x = (x ^ A[i]);
                }else{
                    y = (y ^ A[i]);
                }
            }
            int ans[] = new int[2];
            if(x<y){
                ans[0] = x;
                ans[1] = y;
            }
            else if(x>y){
                ans[0] = y;
                ans[1] = x;
            }
            return ans;
        }
}
