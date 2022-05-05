package Hashing;

import java.util.HashSet;
import java.util.Set;

public class Check_Palindrome {
    public int solve(String A) {

             Set<Character> oddLetters = new HashSet<>();
         for ( char c : A.toCharArray() ) {
             if ( ! oddLetters.remove(c) ) {
                 oddLetters.add(c);
             }
         }

             if (oddLetters.size() <= 1) {
                return 1;
             } else {
                 return 0;
             }



//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i=0;i<A.length();i++){
//            map.put(A.charAt(i),0);
//        }
//
//        for(int i=0;i<A.length();i++){
//            map.put(A.charAt(i),map.get(A.charAt(i))+1);
//        }
//        int c=0;
//        for (Map.Entry<Character, Integer> set :
//                map.entrySet()) {
//            if(set.getValue()%2 != 0){
//                c++;
//                if(c>1){
//                    return 1;
//                }
//            }
//        }
//        return 0;






    }
}
