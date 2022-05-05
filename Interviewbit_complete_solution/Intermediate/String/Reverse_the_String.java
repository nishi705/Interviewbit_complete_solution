package String;
/*
You are given a string A of size N.
Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces,
 even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single
space in the reversed string.
 */
public class Reverse_the_String {
    static String[] reverseString(String[] N, int n){
        if(n%2 ==0){
            int j = n/2;
            while(j<= n-1){
                String temp;
                temp = N[n-j-1];
                N[n-j-1] = N[j];
                N[j] = temp;
                j++;
            }

        }else{
            int j = (n/2) +1;
            while(j<= n-1){
                String temp;
                temp = N[n-j-1];
                N[n-j-1] = N[j];
                N[j] = temp;
                j++;
            }

        }
        return N;
    }
    public String solve(String A) {

        String[] N = A.split("\\s");
        N = reverseString(N,N.length);
        A = String.join(" ", N);

        return A;
    }
}
