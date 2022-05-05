package String;
/*
You are given a function isalpha() consisting of a character array A.
Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z and 0-9),
else return 0.
 */
public class Alphanumeric {
    public int solve(char[] A) {

        boolean flag = false;
        for(int i=0;i<A.length;i++){
            if(!(A[i] >= 'a' && A[i]<='z' || (A[i]>='A' && A[i]<='Z') || (A[i]>='0' && A[i]<='9'))){
                return 0;
            }
        }
        return 1;
    }
}
