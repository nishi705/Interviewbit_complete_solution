package Beginners_Batch.Advance.String;

/*
first we will rotate and then we will compare
so the time complexity will be O(n*n);
 */

public class Rotation_Of_a_String {
    //Brute Force
    int matchpattern(String B,String A){
        int count=0;
        String ans = "";
        for(int i=0;i<B.length();i++) {
            ans = B.substring(i) + B.substring(0, i);
            if(ans.equals(A)){
                count++;
            }
        }
        return count;
    }
    public int solve(String A, String B) {
        int s = matchpattern(B,A);
        return s;

    }
}
