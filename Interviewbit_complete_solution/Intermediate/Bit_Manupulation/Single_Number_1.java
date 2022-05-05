package Bit_Manupulation;
/*
Given an array of integers A, every element appears twice
 except for one. Find that integer that occurs once
 */

public class Single_Number_1 {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 1};
        int ans =0;
        for(int i=0;i<A.length;i++){
            ans= ans^A[i];
        }
        System.out.println(ans);
    }
}
