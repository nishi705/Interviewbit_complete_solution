package Beginners_Batch.Advance.Binary_search;

public class Ath_Magical_Number {
    static int gcd(int x, int y){
        if(x==0){
            return y;
        }

        return gcd(y%x,x);
    }
    public int solve(int A, int B, int C) {

        long lcm=(long) B*C/gcd(B,C);
        //here l can be long low=Math.min(B,C)
        long l=1, r=(long) Math.min(B,C)*A, ans=2;

        while(l<=r){
            long mid=l+((r-l)/2);
            long cntb=mid/B;
            long cntc=mid/C;
            long cntbc=mid/lcm;

            if(cntb + cntc - cntbc >= A){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return (int)(ans%1000000007);
    }
}
