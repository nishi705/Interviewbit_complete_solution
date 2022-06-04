package Beginners_Batch.Advance.Bit_Manupulation;

/*
We have equations like :
A + B = (A | B) + (A & B) - (1) - Trying using truth table
Explanation -
For bit set(1) at a position for both A and B - result will be 0 and carry(1) -> Since the same bit is set for both A | B and A & B it will give same result everytime.
For alternative bits - result will be always 1 -> A | B only contribute here.

Similarly
A | B = (A ^ B) + (A & B) - (2) - Using truth table
For bit set(1) at a position for both A and B - result will be always 1 - A& B will contribute here.
For alternative bits - result will be always 1 -> A ^ B only contribute here.

From Equation 1 and 2 :
A + B = (A ^ B) + 2(A & B) - (3)
Given condition :
If A + X = A ^ X , then (A & X) = 0
If A + Y = A ^ Y, then (A & Y) = 0.

For X smaller to A, X = ~A will satisfy above condition, but dont set bit greater then MSB, thats why A & (~tmp)
Example :
A = 5(0101) then X = 010 = 2

For Y smallest greater then A, Y = Make all unset bit set in A and then (A + 1) or make the bit set that is above than highest set bit of A to get greater than A, and unset rest all bit of A to get its min value and make A & Y = 0.
Example : If A = 5(0101), then Min value of Y that is greater then A and A & Y = 0 is :
0101 -> A
1000 -> Y

Make all unset bit set in A(0101) => 0111
A + 1 => 1000 => Y

public int solve(int A) {
int tmp = A;
// setting all bits right of MSB of A as 1, eg : 0001010101 => 0001111111
A = A | (A >> 1);
A = A | (A >> 2);
A = A | (A >> 4);
A = A | (A >> 8);
A = A | (A >> 16);
return (A & (~tmp))^(A + 1);
}
 */

public class Strange_Equality {
    public int solve(int A) {
        int tmp = A;
// setting all bits right of MSB of A as 1, eg : 0001010101 => 0001111111
            A = A | (A >> 1);
            A = A | (A >> 2);
            A = A | (A >> 4);
            A = A | (A >> 8);
            A = A | (A >> 16);
            return (A & (~tmp))^(A + 1);

        }
}
