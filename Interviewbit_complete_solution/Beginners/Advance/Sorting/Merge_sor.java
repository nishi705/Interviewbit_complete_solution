package Beginners_Batch.Advance.Sorting;

import java.util.ArrayList;

public class Merge_sor {
    static ArrayList<Integer> al = new ArrayList<>();
   static void mergesort(int[] A,int l,int r) {
       if(l==r) {
           return;
       }
       int mid = (l + r) / 2;
       mergesort(A, l, mid);
       mergesort(A, mid + 1, r);
       merge(A, l, mid, r);


    }
    static void merge(int[] A,int l,int mid,int r){
//        System.out.println("length of l"+l);
//        System.out.println("length of r"+r);
       int[] B = new int[r-l+1];
       int i =l;
       int j = mid+1;
       int k = 0;

       while(i<=mid && j<=r){
           if(A[i]<A[j]){
               B[k] = A[i];
               i++;
               k++;
           }else{
               B[k] = A[j];
               j++;
               k++;
           }
       }

       //if the left array total exaust then put all the
        //right array into new array

          while(j<=r){
              B[k] = A[j];
              j++;
              k++;
          }
      // if the right array totally exaust then put all the
          //left array into new array
          while(i<=mid){
              B[k] = A[i];
              i++;
              k++;

      }

        //System.out.println(A.length);
      //  System.out.println(B.length);
          int idx =l;
      for(int m=0;m<B.length;m++){
         A[l] = B[m];
          l++;
      }
    }


    public static void main(String[] args) {
        int[] A ={3,10,6,8,15,2,12,18,17};
        int l =0;
        int r = A.length-1;

        mergesort(A,l,r);
          for(int i=0;i<A.length;i++){
   System.out.print(A[i]+" ");

}
    }
}
