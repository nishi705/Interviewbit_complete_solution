package Beginners_Batch.Advance.Bit_Manupulation;

public class Count_Total_Set_Bits {
    static int max(int a){
        int c= 0;

        while((1<<c)<=a){
            c++;
        }
        return c-1;
    }

    public static void main(String[] args) {
        int n = 11;

        int x = max(n);


        int a1 = x*(1<<(x-1));
        int a2 = n - (1<<x) +1;
        int rest = n - (1<<x);
        int ans = a1+a2;



    }
}
