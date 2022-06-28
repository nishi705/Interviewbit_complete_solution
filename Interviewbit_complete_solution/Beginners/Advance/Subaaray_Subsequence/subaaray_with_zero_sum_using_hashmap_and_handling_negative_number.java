package Beginners_Batch.Advance.Subaaray_Subsequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class subaaray_with_zero_sum_using_hashmap_and_handling_negative_number {
    public int solve(ArrayList<Integer> A) {

        ArrayList<Long> al = new ArrayList<>();

        int n = A.size();

        al.add((long)A.get(0));
        for(int i=1;i<n;i++){
            long sum = A.get(i)+al.get(i-1);
            al.add(sum);
        }

        HashSet<Long> set = new HashSet<>();

        for(int i=0;i<al.size();i++){
            if(al.get(i)==0)return 1;
            if(set.contains(al.get(i)))return 1;
            else{
                set.add(al.get(i));
            }
        }
        return 0;
    }
}
