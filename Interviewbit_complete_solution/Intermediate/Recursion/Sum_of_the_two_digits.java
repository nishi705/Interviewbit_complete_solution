package Recursion;

public class Sum_of_the_two_digits {
    public int solve(int A) {
        if(A<10)
            return A;
        return A%10+solve(A/10);
    }
}
