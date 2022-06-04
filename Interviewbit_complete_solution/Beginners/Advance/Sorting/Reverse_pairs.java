package Beginners_Batch.Advance.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_pairs {

    public static void main(String[] args) {
//        Integer[] A = {1, 3, 2, 3, 1};
//       // List<Integer> al = Arrays.asList(A);
//        Arrays.sort(A,Collections.reverseOrder());
//        System.out.println(Arrays.toString(A));
//
//
//        int count =0;
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int i=0;i<A.length;i++){
//
//            for(int j=i+1;j<A.length;j++){
//
//                if(i<j){
//                    if(A[i]>(2*A[j])){
//                        list.add(A[i]);
//                        list.add(A[j]);
//                    }
//                }
//            }
//        }
//
//       // System.out.print(count);
//
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i));
//        }

        Integer[] al= {3,10,6,8,15,2,12,18,17};
        List<Integer> A = Arrays.asList(al);
        reversePairs(A,0,A.size()-1);
    }
    public static int reversePairs(List<Integer> A,int start,int end){
        //Base Case
        if(start == end) return 0;
        int mid = (start+end)>>1;
        int leftReversePairs  = reversePairs(A,start,mid);
        int rightReversePairs = reversePairs(A,mid+1,end);
        int mergeReversePairs = merge(A,start,mid,end);
        return leftReversePairs + rightReversePairs + mergeReversePairs;
    }
    public static int merge(List<Integer>A,int start,int mid,int end){
        ArrayList<Integer>helper = new ArrayList<>(); //helper array for merging
        int p1 = start,p2 = mid+1;
        int ans = 0;
        while(p1<=mid && p2 <= end){
            if((long)A.get(p1) > 2 *(long)A.get(p2)){
                ans += mid-p1+1;
                p2++;
            }
            else{
                p1++;
            }
        }
        p1 = start;p2=mid+1;
        while(p1<=mid && p2<=end){
            if(A.get(p1)<=A.get(p2)) helper.add(A.get(p1++));
            else helper.add(A.get(p2++));
        }
        while(p1<=mid) helper.add(A.get(p1++));
        while(p2<=mid) helper.add(A.get(p2++));
        for(int i = 0 ; i < helper.size() ;++i) A.set(start+i,helper.get(i));
        return ans;
    }
}
