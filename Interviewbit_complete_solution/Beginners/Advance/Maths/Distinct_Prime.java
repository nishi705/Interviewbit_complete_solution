package Beginners_Batch.Advance.Maths;

import java.util.HashMap;
import java.util.HashSet;

public class Distinct_Prime {
    public static void main(String[] args) {
       int[] A={5,7,8,19,20,22,25};
        int g=0;
        int mod=1000000007;
        for(int i=0;i<A.length;i++){
            g = Math.max(g,A[i]);
        }
        int[] spf =new int[g+1];

        for(int i=0;i<spf.length;i++){
            spf[i] =i;

        }

        for(int i=2;i*i<=g;i++){
                for (int j = i * i; j <= g; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;

                    }
                }
        }

        for(int i=2;i<spf.length;i++){
            System.out.println(spf[i]);
        }

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<A.length;i++){
            if(A[i] <2) continue;
            int element = A[i];
            while(element>1){
                set.add(spf[element]);
                //System.out.println(spf[element]);
                element= element/spf[element];

            }
        }

       // System.out.print(set.size());
        //return set.size();

    }
}
