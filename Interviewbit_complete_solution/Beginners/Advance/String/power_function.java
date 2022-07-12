package Beginners_Batch.Advance.String;

public class power_function {
    static int powrec(int i,int j){
        if(i==0)return 0;
        if(j==0)return 1;

        return i*powrec(i,j-1);
    }
    public static void main(String[] args) {
        int i=2;
        int j=3;
        powrec(i,j);

        int pow = 1;

        while(j>=1){
           pow = pow*j;
           j--;
        }
        System.out.println(pow);

    }
}
