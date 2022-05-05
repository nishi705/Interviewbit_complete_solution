package String;

public class Reverse_Simple_string {
    public String solve(String A) {

        char[] N = A.toCharArray();
        int k=0;
        for(int i=A.length()-1;i>=0;i--){
            N[k++] =  A.charAt(i);
        }
        A = String. valueOf(N);
        return A;
    }
}
