package Hashing;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] A = {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
        int T = -3;

        int[] N = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<A.length;i++){
            int val = T- A[i];
            if(map.containsKey(val)){
                N[0] = map.get(val);
                N[1] = i;
                break;
            }else{
                map.put(A[i],i);
            }
        }
        for(int i=0;i<2;i++){
            System.out.println(N[i]);
        }
    }
}
