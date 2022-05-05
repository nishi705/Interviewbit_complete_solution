package String;
/*
Given the array of strings A, you need to find the longest string S,
which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the
longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc"
 */
public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] A) {

        String prefix = A[0];
        for (int i = 1; i < A.length; i++)
            /*
            inside while index of prefix is matching or not
            if we do s1.indexOf(s1){where s1=rfgcbcvb, s2 ="abc"
            so basically we are checking the index of abc here.
             */
             /*
             we will cut down the characters and will try to get the index of
             that substring
             a moment will come when abc will only left and whose index i.e. 0 will
             match to the s2,s3,s4 string
             A = "abc d e fgh" and "abcefgh"
             s1 = abcefgh
             1. abcefg
             2.abcef
             3.abce
             4.abc in this situation index of abc will present in s1 i.e 0.
             s
              */
            while (A[i].indexOf(prefix) != 0) {
                /*
                we will cut down the character and will try to get the substring
                whose index will present in s1,s2,s3,
                 */
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        return prefix;
    }

//        String s1 = "jhtabctryh";
//        String s2 = "abc";
//        System.out.println(s1.indexOf(s2));

}

