package Array;
/*
Given an integer array A containing N distinct integers, you have to find all the leaders in the array A.

An element is leader if it is strictly greater than all the elements to its right side.

NOTE:The rightmost element is always a leader.
 */

import java.util.ArrayList;

public class LeadersInAnArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = A.size();
        al.add(A.get(n-1));
        int max=A.get(n-1);
        for(int i=n-2;i>=0;i--){
            if(A.get(i) > max){
                max=A.get(i);
                al.add(max);
            }
        }
        return al;
    }
}
