package Beginners_Batch.Advance.Subaaray_Subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Distinct_Numbers_in_Window {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=-0;i<B;i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i),map.get(A.get(i))+1);
            }else{
                map.put(A.get(i),1);
            }
        }

        al.add(map.size());
        for(int i=B;i<A.size();i++){
            if (map.get(A.get(i - B)) == 1) {
                map.remove(A.get(i - B));
            } else if (map.get(A.get(i - B)) > 1) {
                map.put(A.get(i-B),map.get(A.get(i-B))-1);
            }
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);

            al.add(map.size());
        }
        return al;
    }
}
