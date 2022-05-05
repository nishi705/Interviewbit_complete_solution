package Array;
/*
Given an array of size N. you can remove a single element fromthe array at a time
cost of the removal of element =sum of the element in array just before the removal
find the minimum cost of removal of all the elements.

 ARRAYS: day:16
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Find_the_minimum_cost_of_removal_of_all_the_element {
    //     static int[] reverse(int A[])
// {
//     int i, n = A.length;
//     int t;

    //     for(i = 0; i < n / 2; i++)
//     {
//         t = A[i];
//         A[i] = A[n - i - 1];
//         A[n - i - 1] = t;
//     }
//     return A;
// }
//    public int solve(int[] A) {
//
//
//        Arrays.sort(A);
//        int cost =0;
//        // A  = reverse(A);
//        //  Arrays.sort(A, Collections.reverseOrder());
//
//        for(int i=A.length-1;i>=0;i--){
//            //i+1 is for the coefficient
//            cost += (A[i] * (A.length-i));
//        }
//        return cost;
//    }


    public static void main(String[] args) {

        Integer[] A = {3,5,1,-3};
        int cost =0;
        Arrays.sort(A, Collections.reverseOrder());

        for(int i=0;i<A.length;i++){
            //i+1 is for the coefficient
            cost += (A[i] * (i+1));
        }
        System.out.println(cost);

}

        //In ArrayList:
        public class Solution {
            public int solve(ArrayList<Integer> A) {

                int cost =0;
                Collections.sort(A, Collections.reverseOrder());

                for(int i=0;i<A.size();i++){
                    //i+1 is for the coefficient
                    cost += (A.get(i) * (i+1));
                }
                return cost;
            }
        }



        //Using Arrays

    public int solve(int[] A) {


        Arrays.sort(A);
        int cost =0;
        for(int i=A.length-1;i>=0;i--){
            //i+1 is for the coefficient
            cost += (A[i] * (A.length-i));
        }
        return cost;
    }


}
