package Beginners_Batch.Advance.Binary_search;

public class Special_Integer {
    static boolean check(int[] A,int k,int B){

        int sum=0;
        for(int i=0;i<k;i++){
            sum+=A[i];
        }

        if(sum>=B)return false;
        for(int j=k;j<A.length;j++){
            sum= sum+A[j];
            sum=sum-A[j-k];

            if(sum>=B)return false;
        }
        return true;
    }
    static int solve(int[] A,int B){
        int l=0;
        int r=A.length;
        int ans =0;

        while(l<=r){
            int mid=(l+r)/2;
              boolean x = check(A,mid,B);
              if(x==true){
                ans =mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] A={1,1};
                int B = 10;

        int a = solve(A,B);
        System.out.println(a);
    }
}
