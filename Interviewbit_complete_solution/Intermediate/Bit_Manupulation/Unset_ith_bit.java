package Bit_Manupulation;

public class Unset_ith_bit {
    public static void main(String[] args) {
        int N = 25;
        int i= 3;

       // System.out.println(N & (~(1 >> (i-1))));
        System.out.println((N & (~(1 << (i - 1)))));

    }
}
