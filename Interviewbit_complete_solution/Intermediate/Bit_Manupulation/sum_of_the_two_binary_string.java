package Bit_Manupulation;

public class sum_of_the_two_binary_string {
    public String addBinary(String A, String B) {

        StringBuilder result = new StringBuilder();

        int i = A.length()-1;
        int j = B.length()-1;
        int s =0;


        while( i>=0 || j>=0 || s==1){

            s+= ((i>=0)? A.charAt(i) - '0' : 0);
            s+=((j>=0) ? B.charAt(j) - '0' : 0);
            /*here whats happening:
            s%2 = 1 or 0 i.e int value
            '0' = is char value
            so when we do s%2 - '0' resultant is ascaii value
            example 1+'0 = 1+48 = 49
            when we (char) 49 it gives us 1
            asscaii of 49 is 1
             */
            result.append((char) (s % 2 + '0'));
            s /= 2;

            i--;
            j--;
        }
        return result.reverse().toString();


    }
}
