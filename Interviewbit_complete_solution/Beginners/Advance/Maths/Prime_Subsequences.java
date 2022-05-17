package Beginners_Batch.Advance.Maths;

public class Prime_Subsequences {
    static boolean is_prime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    static int count_prime_subarrays(int ar[], int n) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (is_prime(ar[i]))
                count++;
            else {
                if (count != 0) {
                    ans += count * (count + 1) / 2;
                    count = 0;
                }
            }
        }
        if (count != 0)
            ans += count * (count + 1) / 2;

        return ans;
    }
    public static void main(String[] args) {

        int N = 6;
        int []ar = { 9, 9, 3, 6, 7, 5};
        System.out.print(count_prime_subarrays(ar, N));

    }
}
