package Beginners_Batch.Advance.Sorting;

public class Inversion_count_in_an_array {
    int callmerge(int[] A,int l,int r){
        int mod = 1000000007;
        if(l==r)return 0;

        int mid = (l+r)/2;
        int x = callmerge(A,l,mid)%mod;
        int y =callmerge(A,mid+1,r)%mod;
        int z = getCount(A,l,mid,r)%mod;
        return (x+y+z)%mod;
    }
    int getCount(int[] A,int l,int mid,int r){
        int[] C = new int[r-l+1];
        int i=l;
        int j = mid+1;
        int k=0;
        int count =0;
        int mod = 1000000007;
        while(i<=mid && j<=r){
            if(A[i]>A[j]){
                count+= (mid-i+1)%mod;
                C[k] = A[j];
                k++;
                j++;
            }else{
                C[k] = A[i];
                i++;
                k++;
            }
        }
        while(i<=mid){
            C[k] = A[i];
            k++;
            i++;
        }
        while(j<=r){
            C[k] = A[j];
            k++;
            j++;
        }

        k = 0;
        for(int m = l; m <= r; m++){
            A[m] = C[k];
            k++;
        }
        return count%mod;
    }
    public int solve(int[] A) {

        int l = 0;
        int r = A.length-1;
        int x = callmerge(A,l,r);
        return x;
    }

}
