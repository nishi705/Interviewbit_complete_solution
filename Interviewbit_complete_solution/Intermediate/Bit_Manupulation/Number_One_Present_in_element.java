package Bit_Manupulation;

public class Number_One_Present_in_element {
    public static void main(String[] args) {
        int A = 11;
        int total_ones = 0;
        while (A != 0) {
            System.out.println(A);
            A = A & (A - 1);
            total_ones++;
        }
       System.out.println(total_ones);
    }
}
