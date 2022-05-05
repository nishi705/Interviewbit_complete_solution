package Beginners_Batch.Advance.Bit_Manupulation;

public class Total_set_bit_brute_force {
    public static void main(String[] args) {
        int A=3;

int check =0;
        for(int i=1;i<=A;i++) {
             check += checkset(i);
        }
       System.out.println(check);
    }

    private static int checkset(int i) {
        int c=0;
        while(i>=1){
            if((i&1)==1)
                c++;
            i>>=1;
        }
        return c;
    }
}
