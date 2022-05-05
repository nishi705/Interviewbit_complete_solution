package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Is_Dictionary {
    static boolean isvalid(String s1,String s2,HashMap<Character,Integer>map){

        for(int i=0; i< s1.length() && i< s2.length(); i++)
        {
            if(s1.charAt(i)!= s2.charAt(i)) // If same character then no need to check the order till then
            {
                if(map.get(s1.charAt(i)) > map.get(s2.charAt(i)))
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
        }
        if(s1.length() > s2.length())
        {
            return false;
        }

        return true;

    }
    public int solve(String[] A, String B) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<B.length();i++){
            map.put(B.charAt(i),i);
        }

        for(int i=0;i<A.length-1;i++){
            String s1 = A[i];
            String s2 = A[i+1];
            boolean b = isvalid(s1,s2,map);

            if(b==false){
                return 0;
            }
        }
        return 1;

    }
}
