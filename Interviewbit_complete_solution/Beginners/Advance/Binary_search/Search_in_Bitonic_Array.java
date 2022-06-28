package Beginners_Batch.Advance.Binary_search;

public class Search_in_Bitonic_Array {
    static int searchbitcoinelemet(int[] A){
        int l = 0;
        int r = A.length-1;
        int ans =0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(A[mid]>=A[mid-1] && A[mid]>=A[mid+1]){
                return mid;
            }else if(A[mid]<=A[mid+1] && A[mid]>=A[mid-1]){
                l = mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
        int B = 12;
        int n = A.length;
        int x = searchbitcoinelemet(A);
        //since we got the

    }
}
