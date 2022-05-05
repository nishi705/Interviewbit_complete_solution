package Bit_Manupulation;
/*
Given the two positive numbers N and i
check if ith bit is 0 or 1 in N.
 */
public class CheckIthBitIsOneNZero {
    static boolean  checkBit(int N, int i){
 /*
 here we are checking if the ith bit is set(1) or unset (0):
  */
        if(((N >> i) & 1) == 1){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {


        int N = 10;
        int i = 3;
        System.out.println(checkBit(N,i));

    }
}
