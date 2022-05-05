package Bit_Manupulation;
/*
You have an array A with N elements. We have two types of operation available on this array :
We can split an element B into two elements, C and D, such that B = C + D.
We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
You have to determine whether it is possible to convert array A to size 1,
containing a single element equal to 0 after several splits and/or merge?
 */


/*
Approach :

If any element in the array is even then it can be made 0.
Split that element in two equal parts of arr[i]/2 and arr[i]/2. XOR of two equal numbers is zero.
Therefore this strategy makes an element 0.
If any element is odd.
Split it into two parts: 1 and arr[i]-1. Since arr[i]-1 is even,
it can be made 0 by the above strategy. Therefore an odd element can reduce its size to 1.
Two odd elements can, therefore, be made 0 by following above strategy and finally XOR them (i.e. 1) as 1 XOR 1 = 0.
Therefore if the number of odd elements in the array is even, then the answer is possible. Otherwise,
 an element of value 1 will be left and it is not possible to satisfy the condition.
 */
import java.util.ArrayList;

public class Interesting_Array {
        public String solve(ArrayList<Integer> A) {
            int i, ctr = 0;
            for(i = 0; i < A.size(); i++)
            {
                // Check if element is odd
                if (A.get(i) % 2 == 1)
                {
                    ctr++;
                }
            }

            // According to the logic
            // in above approach
            if (ctr % 2 == 1)
            {
                return "No";
            }
            else
            {
                return "Yes";
            }
        }
}
