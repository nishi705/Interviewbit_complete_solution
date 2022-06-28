package Beginners_Batch.Advance.Subaaray_Subsequence;

import java.util.ArrayList;
import java.util.HashMap;

public class Largest_Continuous_Sequence_Zero_Sum {
    //long value
    /*
     public int[] lszero(int[] A) {
       long []ps =new long[A.length];
       HashMap <Long, Integer> hm = new HashMap<Long, Integer>();
       ps[0]=(long)A[0];
       int start=0;
       int firstindex=0;
       int diff=0;
       int ans=0;
        int count=0;
        for(int i=1;i<A.length;i++)  // prefix sum
        {
          ps[i]=ps[i-1]+(long)A[i];
          //System.out.print(ps[i]);
        }
        // for edge case when prefix sum has 0 init
        hm.put(0L, -1);
         for (int i=0;i<A.length;i++)
         {
                if (hm.containsKey(ps[i]))
                {
                    firstindex =hm.get(ps[i]);  //getting 1 st index
                    diff=i-firstindex;
                        if(diff>ans)
                        {
                         start=  firstindex;   // cal diff and find max
                        ans=diff;
                        }
                }
                else
                {
                    hm.put(ps[i],i);    // adding index first time
                }
         }
                if (ans==0)
                {
                    return new int[]{ };
                }                            // for no subarray sum with zero

                 int res[]=new int[ans];

         for (int i=0;i<ans;i++)   //start+1 till ans
         {
             ++start;
            res[i]=A[start ];
         }
         return res;
    }
     */
    public int[] lszero(int[] A) {
        int[] ps = new int[A.length];
        ps[0] = A[0];
        int sum =0;
        for(int i=1;i<A.length;i++){
            ps[i] = A[i]+ps[i-1];
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        int start_inx =0;
        int diff =0;
        int ans =0;
        int start =0;

        map.put(0,-1);

        for(int i=0;i<A.length;i++){
            if(map.containsKey(ps[i])){
                start_inx =map.get(ps[i]);
                diff = i-start_inx;

                if(diff>ans){
                    start =start_inx;
                    ans = diff;
                }
            }else{
                map.put(ps[i],i);
            }
        }

        if(ans ==0)return new int[]{};

        int[] res= new int[ans];

        for(int i=0;i<ans;i++){
            ++start;
            res[i] = A[start];
        }

        return res;
    }
}
