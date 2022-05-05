package Array;

public class C_ount_ways_to_make_sum_of_odd_and_even_indexed_elements_equal_by_removing_an_array_element {
    public int solve(int[] A) {

        int n = A.length;

        int ans =0;

        //PS for even indexed:
        int[] pse = new int[n];
        pse[0] = A[0];
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
            {
                pse[i] = pse[i-1] + A[i];
            }
            else
            {
                pse[i] = pse[i-1];
            }
        }

        //PS for odd indexed:
        int[] pso = new int[n];
        pso[0] = A[1];
        pso[1] =A[1];
        for(int i=2;i<n;i++)
        {
            if(i%2==1)
            {
                pso[i] = pso[i-1] + A[i];
            }
            else
            {
                pso[i] = pso[i-1];
            }
        }

        int se = 0;
        int so = 0;

        for(int i=1;i<n;i++)
        {
            se = pse[i-1] + (pso[n-1] - pso[i]);
            so = pso[i-1] + (pse[n-1] - pse[i]);

            if(se==so)
            {
                ans++;
            }
        }
        if(ans==n-1)
        {
            return  n;
        }
        return ans;
    }
}
