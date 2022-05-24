package Beginners_Batch.Advance.Maths;

public class Divisor_game {
//    static int GCD(int a,int b){
//        if(a==0)return b;
//        return GCD(b%a,a);
//    }
//    public int solve(int A, int B, int C) {
//
//        int lcm = (B*C)/GCD(B,C);
//        return A/lcm;
//    }
    //Brute Force

    public static void main(String[] args) {
        int A = 20;
        int B = 3;
        int C = 2;

        int count =0;
        while(A>(Math.max(B,C))){

            if(A%B ==0 && A%C==0){
                count++;
            }
            A--;
        }
        System.out.println(count);

    }
}
