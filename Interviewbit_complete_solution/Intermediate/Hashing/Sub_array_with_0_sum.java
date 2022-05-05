package Hashing;

import java.util.HashSet;
import java.util.Set;

public class Sub_array_with_0_sum {
    public int solve(int[] A) {

        long [] ps = new long[A.length];

        ps[0] = A[0];
        for(int i=1;i<A.length;i++){
            ps[i] = A[i] + ps[i-1];
        }
        Set<Long> hs = new HashSet<Long>();
        for(int i=0;i<ps.length;i++){
            if (A[i] == 0
                    || ps[i] == 0
                    || hs.contains(ps[i]))
                return 1;
            hs.add(ps[i]);
        }
        return 0;

    }
}
