package Beginners_Batch.SubString_Subarray_Subseqience_subset;

import java.util.HashSet;

public class Substring {
    public static void main(String[] args) {
        String s = "abcaabcdba";
        HashSet<Character> set = new HashSet<>();
        int i=0;
        int j =0;
        int max_len=0;
        while(i<s.length() && j<s.length()){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            else{
                set.add(s.charAt(i));
                   int len= i-j+1;
                    if(len>max_len){
                        max_len= len;
                }
                    i++;
            }
        }
        System.out.print(max_len);
    }

}
