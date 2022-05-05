package String;

public class toLowerCase {
    public char[] to_lower(char[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]>= 'A' && A[i]<='Z'){
                A[i] = (char) (A[i]^32);
            }
        }
        return A;
    }
}
