package String;

public class SpecialSubsequencesAG {
    public int solve(String A) {
        char[] c = A.toCharArray();

        int count = 0;
        int ans = 0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i] == 'A')
            {
                count++;
            }
            else if(c[i] == 'G')
            {
                ans+= count;
            }
        }
        return ans;
    }
}
