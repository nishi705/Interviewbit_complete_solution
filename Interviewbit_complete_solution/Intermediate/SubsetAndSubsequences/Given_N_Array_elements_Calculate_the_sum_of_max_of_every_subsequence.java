package SubsetAndSubsequences;

public class Given_N_Array_elements_Calculate_the_sum_of_max_of_every_subsequence {

    public static void main(String[] args) {
        int[] A={-2,0,3,4,8};

        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+= A[i]*(1<<i);
        }
    }
}
