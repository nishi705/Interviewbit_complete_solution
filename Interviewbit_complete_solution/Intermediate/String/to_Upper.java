package String;

public class to_Upper {
    public char[] to_upper(char[] A) {

        for(int i=0;i<A.length;i++){
            if(A[i]>='a' && A[i]<='z'){
                A[i] = (char) (A[i]^32);
            }
        }
        return A;
    }
}
