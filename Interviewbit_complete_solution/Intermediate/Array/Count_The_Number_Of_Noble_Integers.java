package Array;

/*
Given an N elements(Distinct elements)
count the number of Noble Integers.
Noble Integer =(count of elements < A[i])
 */

import java.util.Arrays;

public class Count_The_Number_Of_Noble_Integers {

    public static void main(String[] args) {
     int[] A = {1,-5,3,5,-10,4};


     //Optimized approach
        int ans1 =0;
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if(A[i] == i){
                ans1++;
            }
        }
        System.out.println(ans1);

     //BRUTEFORCE approach
        int ans =0;
        int count;
        int N = A.length;
        for(int i=0;i<N;i++){
            count =0;
            for(int j=0;j<A.length;j++){
                if(A[i] > A[j]){
                    count++;
                }

                }
            if(count == A[i]){
                ans++;
            }

        }
        //System.out.println(ans);
    }
}
