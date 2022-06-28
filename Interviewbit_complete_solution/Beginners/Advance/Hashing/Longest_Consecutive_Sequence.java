package Beginners_Batch.Advance.Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
//        int sum;
//        int n = A.length;
//        int total = 1<<n;
//
//        for(int i=0;i<total;i++){
//            sum=0;
//            for(int j=0;j<n;j++){
//                if((i&(1<<j))!=0)
//                {
//                    sum+=A[j];
//                }
//
//            }
//            if(sum==B)
//                return 1;
//
//        }
//        return 0;


        int[] A= {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<A.length;i++){
            set.add(A[i]);
        }

//        Iterator<Integer> itr=set.iterator();
//        while(itr.hasNext()){
//            //System.out.println(itr.next());
//        }



        int ans = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(!set.contains(A[i]-1)){
                int len =0;
                 int x = A[i];

                 while(set.contains(x)){
                     len++;
                     x++;
                 }
                 ans = Math.max(ans,len);

            }
        }
        System.out.println(ans);
    }
}
