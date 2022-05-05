package Hashing;

import java.util.HashMap;

public class Get_First_Non_Repeating_Element {
    public static void main(String[] args) {
        int[] A = {1,1,3,2,3,2,6,1,7,};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                //map.put(A[i],map.get(A[i]) +1);
                System.out.println(map.get(A[i]));
            }else{
                map.put(A[i],1);
            }
        }

        for(int i=0;i<A.length;i++){
            if(map.get(A[i])==1){
               // System.out.println(A[i]);
                break;
            }else{
                //System.out.println(-1);
            }
        }
    }
}
