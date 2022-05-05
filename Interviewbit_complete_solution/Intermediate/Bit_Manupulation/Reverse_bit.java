package Bit_Manupulation;

public class Reverse_bit {
    public long reverse(long a) {
        long result=0;

        for (int i=0; i<32; i++) {
            long lsb = a & 1; //here (32 times)0000000........101 -> (lsb is 1 right most bit)
            long reverselsb = lsb << (31 - i);// we are left shifting the lsb so that we can do OR operation
                                              // with result.
            result = result | reverselsb; // result will store the value
            a = a >> 1; // we are doing right shifting of A so that we can perform the
                        // operation with next value
        }
        return result;
    }
}
