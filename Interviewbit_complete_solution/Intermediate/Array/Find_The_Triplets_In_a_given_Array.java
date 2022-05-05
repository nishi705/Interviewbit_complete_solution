package Array;

/*
find the triplet of a given array such that: (having i,j,k indices)
where i<j<k and A[i]<A[j]<A[k]:
 */

public class Find_The_Triplets_In_a_given_Array {
    public static void main(String[] args) {
        int[] A = {3,6,9,12,5,16,18,7,11};

        int lc =0;
        int rc =0;
        int ans =0;
        for(int i=0;i<A.length-1;i++){
            lc =0;
            for(int j=i-1;j>=0;j--){
                if(A[i]>A[j]){
                    lc++;
                }
            }

            rc =0;
            for(int k=i+1;k<A.length;k++){
                if(A[i]<A[k]){
                    rc++;
                }
            }
            ans += lc*rc;
        }
        System.out.println(ans);
    }

}
