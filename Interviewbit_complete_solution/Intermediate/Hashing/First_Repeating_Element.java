package Hashing;

import java.util.HashMap;

public class First_Repeating_Element {
    public int solve(int[] A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }

        for(int i=0;i<A.length;i++){
            if(map.get(A[i])>1){
                return A[i];
            }
        }
        return -1;
    }
}
