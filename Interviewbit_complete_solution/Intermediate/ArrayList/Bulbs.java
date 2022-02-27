package ArrayList;

import java.util.ArrayList;

public class Bulbs {
    public int bulbs(ArrayList<Integer> A) {
        int state =0;
        int ans =0;

        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)==state)
            {
                ans++;
                state = 1- state;
            }
        }
        return ans;
    }
}
