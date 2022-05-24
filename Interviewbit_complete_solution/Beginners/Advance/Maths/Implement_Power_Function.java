package Beginners_Batch.Advance.Maths;

public class Implement_Power_Function {
    public int pow(int A, int B, int C) {
        if(A==0)return 0;
        if(B==0)return 1;

        long p = pow(A,B/2,C)%C;
        p = (p*p)%C;

        if(B%2!=0){
            p = (p*A +C)%C;
        }
        return (int)(p+C)%C;

    }
}
