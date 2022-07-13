package SubsetAndSubsequences;

public class Find_subsequence {
    public String solve(String A, String B) {
        int n = A.length();
        int m = B.length();
        int j=0;
        for(int i=0;i<m && j<n;i++)
            if(A.charAt(j)== B.charAt(i))
                j++;
        if(j==n)
            return "YES";
        return "NO";
    }
}
