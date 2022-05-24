package Beginners_Batch.Advance.Maths;

public class Compute_nCr_mod_p {
   static int fact(int A,int C){
        if(A==0)return 1;

        long x = A*fact((A-1),C);

        return (int)x;

    }
   static int pow(int A,int B,int C) {

        if (A == 0) return 0;
        if (B == 0) return 1;

        long p = pow(A, B / 2, C);
        p = (p * p);

        if (B % 2 != 0) {
            p = (p * A + C);
        }
        return (int) (p + C);
    }
    public static void main(String[] args) {
       int A = 5;
        int B = 2;
        int C = 13;
        int factA = fact(A,C);
        int factB = fact(B,C);
        int aminusbFact= fact((A-B), C);
        System.out.println(aminusbFact);
        int i =pow(factA, factB-2,factB);
        System.out.println(i);


    }
}
