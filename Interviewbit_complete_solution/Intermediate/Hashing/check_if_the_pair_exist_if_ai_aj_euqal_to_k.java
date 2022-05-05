package Hashing;

import java.util.HashSet;
import java.util.Set;

public class check_if_the_pair_exist_if_ai_aj_euqal_to_k {
    public static void main(String[] args) {
       int[] A = {2,9,11,9,5};
       int k =18;
//
//        for(int i=0;i<N;i++){
//            for(int j=)
//        }


        //2nd approach
//        for(int i=0;i<N;i++){
//            for(int j=i+1;j<N;i++){
//                if(A[i]+A[j] == K)
//                {
//                    return true;
//                }
//            }
//        }

        //Using HashMAP


        Set<Integer> hset = new HashSet<Integer>();
        for(int i=0;i<A.length;i++) {
            if (hset.contains(k - A[i])) {
                System.out.println("true");
            } else {
                hset.add(A[i]);
            }
        }
       // return false;
    }
}
