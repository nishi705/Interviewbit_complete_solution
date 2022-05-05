package Hashing;

import java.util.HashSet;

public class Pairs_With_Given_Xor {

    public int solve(int[] A, int B) {
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        for(int i=0;i<A.length;i++){
            if(set.contains(A[i]^B)){
                count++;
            }else{
                set.add(A[i]);
            }
        }
        return count;
    }

}
