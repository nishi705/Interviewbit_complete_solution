package Hashing;

import java.util.HashMap;

public class K_occurence {
    public int getSum(int A, int B, int[] C) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int mod = 1000000007;
        for(int i=0;i<A;i++){
            if(map.containsKey(C[i]))
            {
                map.put(C[i],map.get(C[i])+1);
            }else{
                map.put(C[i],1);
            }

        }
        boolean found = false;
        for(int i=0;i<A;i++){
            if(map.get(C[i])==B){
                found = true;
                sum= (sum+C[i])%mod;
                map.put(C[i],0);
            }
        }

        return found ? sum : -1;

    }
}
