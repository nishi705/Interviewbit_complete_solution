package Beginners_Batch.Advance.Bit_Manupulation;

public class Smallest_bit {
    public static void main(String[] args) {


        //minimum xor

        int a = 3;
        int b = 5;

        int xor =0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= b; i++) {
          xor= xor^i;
          min= Math.min(min,xor);
        }
        System.out.print(min);
    }
}
