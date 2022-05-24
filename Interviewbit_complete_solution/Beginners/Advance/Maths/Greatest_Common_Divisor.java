package Beginners_Batch.Advance.Maths;

public class Greatest_Common_Divisor {
    public int gcd(int A, int B) {
        if(A==0)return B;
        if(B==0)return A;
        if(A>=B){
            return gcd(A%B,B);
        }
        return gcd(B%A,A);


    }
}
