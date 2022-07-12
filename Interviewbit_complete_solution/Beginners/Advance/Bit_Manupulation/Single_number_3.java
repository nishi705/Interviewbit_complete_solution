package Beginners_Batch.Advance.Bit_Manupulation;

public class Single_number_3 {

    public static void main(String[] args) {
        int val = 7;
        /*
        7 int bianry = 111;
        1's compliment of 7 is : 000
        2,s compliment of 7 is : 000+1= 001
        :-> 111 & 001 = 1;
         */
        int[] A={1, 2, 3, 1, 2, 4};
        int xor =0;
   for(int i=0;i<A.length;i++){
      xor = xor^A[i];
   }
        int msb = xor & -xor;
   int x =0;
   int y = 0;

   for(int i=0;i<A.length;i++){

       if((A[i]&msb)==0){
           x=x^A[i];
       }else{
           y=y^A[i];
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
        System.out.println(ans[0]);
        System.out.println(ans[1]);

    }
}
