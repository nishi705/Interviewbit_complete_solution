package Some_Extra_concept;

import java.util.ArrayList;
import java.util.Collections;

public class get_the_length_of_number {
    public static void main(String[] args) {
        //lets try to find out the length of the number
        //1. convert into string
        int N = 23;
        String s = "";
        while(N>0){
            s = s+  (char)(N%10 + '0');
            N = N/10;
        }
        //2. convert into arraylist
        int A = 23;
        ArrayList<Integer> al = new ArrayList<>();
        while(A!=0){
            int rem = A%10;
            al.add(rem);
            A = A/10;
        }
        System.out.println(al.size());
    }
}
