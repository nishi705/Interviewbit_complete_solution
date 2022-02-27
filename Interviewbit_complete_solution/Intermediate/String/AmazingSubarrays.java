package String;

public class AmazingSubarrays {
    public int solve(String A) {
        char[] c = A.toCharArray();
        int MOD = 10003;
        int ans = 0;
        int count = 0;
        for (int i = 0; i < c.length; i++) {

            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
                count++;
            }
            ans += count;

        }
        return ans % MOD;
    }
    }
