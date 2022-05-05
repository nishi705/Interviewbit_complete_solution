package String;

public class is_Alpha {
    public int solve(char[] A) {

        for(int i=0;i<A.length;i++){
            if(!(A[i] >= 'a' && A[i]<='z' || (A[i]>='A' && A[i]<='Z'))){
                return 0;
            }
        }
        return 1;
    }
}
