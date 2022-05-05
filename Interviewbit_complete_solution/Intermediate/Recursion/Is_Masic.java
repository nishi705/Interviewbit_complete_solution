package Recursion;

public class Is_Masic {
    static int calmagno(int A){
        if(A==0)
            return 0;
        return A%10+calmagno(A/10);
    }

    public int solve(int A) {
        int temp = A;

        while(temp>9){
            temp = calmagno(temp);
        }
        if(temp==1){
            return 1;}
        else{
            return 0;
        }

    }
}
