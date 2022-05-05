package SubsetAndSubsequences;

public class find_the_sum_of_all_the_subset_sum_divided_by_2_raise_to_power_n {
    public static void main(String[] args) {

        int[] A={3,7};
        int n = A.length;
        int total = 1<<(n-1);

        int sum=0;
        for(int i=0;i<total;i++){
            sum = (sum+A[i]);
        }
        int ans = sum/2;
        System.out.println(ans);
    }
}
