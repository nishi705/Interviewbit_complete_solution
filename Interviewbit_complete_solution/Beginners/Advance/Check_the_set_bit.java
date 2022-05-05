package Beginners_Batch.Advance;

public class Check_the_set_bit {
    public static void main(String[] args) {
        int n = 5, k = 1;
        isKthBitSet(n, k);
        usingrightshift(n,k);
    }

    private static void usingrightshift(int n, int k) {
        if(((n >> k-1) & 1) ==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    private static void isKthBitSet(int n, int k) {

        if(((n & (1 << k-1))==1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
