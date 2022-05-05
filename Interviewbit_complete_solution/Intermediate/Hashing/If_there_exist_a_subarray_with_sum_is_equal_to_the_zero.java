package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Given An subarray, check if there exist a subarray with sum =0
 */
public class If_there_exist_a_subarray_with_sum_is_equal_to_the_zero {
    public int solve(int[] A) {
        long [] ps = new long[A.length];
        ps[0] = A[0];
        for(int i=1;i<A.length;i++){
            ps[i] = A[i] + ps[i-1];
        }
        Set<Long> hs = new HashSet<Long>();
        for(int i=0;i<ps.length;i++){
            if (A[i] == 0
                    || ps[i] == 0
                    || hs.contains(ps[i]))
                return 1;
            hs.add(ps[i]);
        }
        return 0;
    }
//    public int solve(int[] A) {
//        long [] ps = new long[A.length];
//        ps[0] = A[0];
//        for(int i=1;i<A.length;i++){
//            ps[i] = A[i] + ps[i-1];
//        }
//        long sum=0;
//        for(int i=0;i<A.length;i++){
//            for(int j=i;j<A.length;j++){
//                sum= ps[j] -ps[i-1];
//                if(sum==0){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//


//Brute force N*N*N TC complexity
//public int solve(int[] A) {
//        int sum;
//        for(int i=0;i<A.length;i++){
//            for(int j=i;j<A.length;j++){
//                sum=0;
//                for(int k=i;k<=j;k++){
//                    sum+=A[k];
//                }
//                if(sum==0){
//                    return true;
//                }
//            }
//}
//        return false;
//}
//
}
