package Bit_Manupulation;

public class Unset_x_bits_from_right {
    public Long solve(Long A, int B) {

        while(B>=0){
            B--;
            if((A & (1 << B)) !=0){
                A = A^(1 << B);
            }
        }
        return A;
    }
}
