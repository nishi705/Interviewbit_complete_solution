package Array;

public class Good_Pair {
    public int solve(int[] A, int B) {
        int n = A.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(A[i]+A[j]==B)
                    return 1;
            }
        }
        return 0;
    }
}
