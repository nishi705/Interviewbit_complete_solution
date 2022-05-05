package Array;

public class Time_to_equality {
    public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        for(int j=0;j<A.length;j++)
        {
            max = Math.max(max,A[j]);
        }

        int sum=0;

        for(int i=0;i<A.length;i++)
        {
            if(A[i] != max)
            {
                sum+= max-A[i];
            }
        }
        return sum;
    }
}
