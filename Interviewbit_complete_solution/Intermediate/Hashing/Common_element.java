package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Common_element {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<Integer> N = new ArrayList<>();
        Map<Integer,Integer> map1 = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if(map1.containsKey(A.get(i))){
                map1.put(A.get(i),map1.get(A.get(i))+1);
            }else{
                map1.put(A.get(i),1);
            }
        }

        for (int i = 0; i < B.size(); i++) {
            if (map1.containsKey(B.get(i))) {
                map1.put(B.get(i),map1.get(B.get(i))-1);
                if(map1.get(B.get(i))==0){
                    map1.remove(B.get(i));
                }
                N.add(B.get(i));

            }
        }
        return N;
    }
}
