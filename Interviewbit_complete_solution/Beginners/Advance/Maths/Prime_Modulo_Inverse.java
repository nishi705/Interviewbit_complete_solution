package Beginners_Batch.Advance.Maths;

public class Prime_Modulo_Inverse {
    int pow(int A,int B,int C){

        if(A==0)return 0;
        if(B==0)return 1;

        long p = pow(A,B/2,C);
        p = (p*p)%C;

        if(B%2!=0){
            p=(p*A+C)%C;
        }
        return (int)(p+C)%C;
    }


    public int solve(int A, int B) {
        return pow(A,B-2,B);

    }
}
