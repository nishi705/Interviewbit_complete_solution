package Beginners_Batch.Advance.Maths;

public class Pubg {
    static int GCD(int a,int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
    public int solve(int[] A) {

        if(A.length == 1){
            return A[0];
        }

        int x = A[0];
        int min= Integer.MAX_VALUE;
        for(int i=1;i<A.length;i++)
        {
            x = GCD(x,A[i]);
            min = Math.min(x,min);
        }

        return min;
    }
}
