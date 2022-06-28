package Beginners_Batch.Advance.Hashing;

import java.util.HashMap;

public class Minimum_Distance {
    public int solve(int[] A) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int dis =0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                int x = map.get(A[i]);
                int y = i;
                dis = Math.abs(x-y);
                if(dis<ans){
                    ans = dis;
                }
                map.put(map.get(A[i]),i);

            }else{
                map.put(A[i],i);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
