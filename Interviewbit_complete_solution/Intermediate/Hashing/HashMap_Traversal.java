package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Traversal {
    public static void main(String[] args) {
        String str = "abbac";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),0);
        }
        for (Map.Entry<Character, Integer> set :
                map.entrySet()) {
            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }
    }
}
