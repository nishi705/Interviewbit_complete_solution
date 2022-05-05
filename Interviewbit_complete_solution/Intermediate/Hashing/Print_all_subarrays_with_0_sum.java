package Hashing;

import java.util.HashMap;
public class Print_all_subarrays_with_0_sum {
    public int[] lszero(int[] A) {
        long [] ps = new long[A.length];
        ps[0] = A[0];
        for(int i=1;i<A.length;i++){
            ps[i] = A[i] + ps[i-1];
        }
        int st=A.length;
        int end=-1;
        HashMap<Long,Integer> hs = new HashMap<Long,Integer>();
        hs.put(0L,-1);
        for(int i=0;i<ps.length;i++){
            if(hs.containsKey(ps[i])){
                if((i-hs.get(ps[i])-1) > (end-st))
                {
                    st=hs.get(ps[i])+1;
                    end=i;
                }
                else if((i-hs.get(ps[i])-1) == (end-st))
                {
                    if(hs.get(ps[i])+1<st)
                    {
                        st=hs.get(ps[i])+1;
                        end=i;
                    }
                }
            }else{
                hs.put(ps[i],i);
            }
        }
        if(st==A.length)
            return new int[0];
        int[] B= new int[end-st+1];
        for(int i=st;i<=end;i++)
            B[i-st]=A[i];
        return B;
    }
}
