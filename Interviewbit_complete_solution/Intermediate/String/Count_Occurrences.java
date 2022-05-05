package String;

import java.util.Scanner;
/*
Find number of occurrences of bob in the string A consisting
of lowercase english alphabets.
 */
public class Count_Occurrences {
    public int solve(String A) {
        int count =0;
        for(int i=1;i<A.length()-1;i++){
            if(A.charAt(i) == 'o'){
                if(A.charAt(i-1) == 'b' && A.charAt(i+1)=='b'){
                    count++;
                }
            }
        }
        return count;
    }
}
