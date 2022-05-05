package Hashing;

import java.util.HashMap;

public class Shaggy_and_distances {
    public int solve(int[] A) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int min_dist = Integer.MAX_VALUE;
        int start = A.length;
        int end = -1;

        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                start = map.get(A[i]);
                end = i;

                min_dist
                        = Math.min(
                        (end - start),
                        min_dist);

                //    int val= Math.abs(start-end);
                //    if(val < min_dist){
                //        min_dist = val;

                //    }

            }else{
                map.put(A[i],i);
            }

        }
        return (
                min_dist == Integer.MAX_VALUE
                        ? -1
                        : min_dist);
    }
}
