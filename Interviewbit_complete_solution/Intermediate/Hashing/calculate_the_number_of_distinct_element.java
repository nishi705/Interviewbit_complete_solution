package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class calculate_the_number_of_distinct_element {

    public int[] dNums(int[] A, int B) {
        int n = A.length;
        int[] ans = new int[n - B + 1];
        HashMap<Integer, Integer> elementCnt = new HashMap<Integer, Integer>();
        int ansIndx = 0;
        for(int i = 0; i < n; i++) {
            if(i < B) {
                elementCnt.put(A[i], elementCnt.getOrDefault(A[i], 0) + 1);
                if(i == B - 1) {
                    ans[ansIndx++] = elementCnt.size();
                }
            } else {
                if(elementCnt.get(A[i - B]) == 1) {
                    elementCnt.remove(A[i - B]);
                } else {
                    elementCnt.put(A[i - B], elementCnt.get(A[i - B]) - 1);
                }
                elementCnt.put(A[i], elementCnt.getOrDefault(A[i], 0) + 1);
                ans[ansIndx++] = elementCnt.size();
            }

        }
        return ans;
    }
}
