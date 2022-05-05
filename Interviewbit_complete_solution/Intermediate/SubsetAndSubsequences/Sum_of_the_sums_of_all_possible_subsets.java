package SubsetAndSubsequences;

public class Sum_of_the_sums_of_all_possible_subsets {
    public static void main(String[] args) {
        int[] A= {3,7};
        int n = A.length;

        int total = 1<<(n-1);

        int sum=0;
        for(int i=0;i<total;i++){
            sum+= A[i] * total;
        }
        System.out.println(sum);
    }
}
