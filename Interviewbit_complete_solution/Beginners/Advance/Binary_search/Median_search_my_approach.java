package Beginners_Batch.Advance.Binary_search;

public class Median_search_my_approach {
   static int findcount(int[] A,int mid){

        int l=0;
        int h = A.length-1;

        while(l<=h){
            int m = (l+h)/2;

            if(A[m] <= A[mid])
            l= mid+1;
            else
                h = mid-1;
        }
        return l;

    }
    public static void main(String[] args) {
        int[][] A=  {{1, 3, 5},
                     {2, 6, 9},
                     {3, 6, 9}};
        int n = A.length;
        int m = A[0].length;

        int l=0;
        int r = (n*m)-1;


        while(l<r){
            int mid = (l+r)/2;
             int row = mid/r;
             int col = mid%r;

             int x = A[row][col];
            System.out.println(x);

             int count =0;

             for(int i=0;i<n;i++){
                 count = findcount(A[i],mid);
             }

             if(count<=(n*m)/2)
                 l = mid+1;
             else
                 r=mid-1;
        }
        System.out.println(l);
    }
}
