package SubsetAndSubsequences;

public class For_Given_Array_find_Sum_Of_All_The_Subset_Sum {

    public static void main(String[] args) {
        int[] A = {5,4,3};
        int  n = A.length;
        int total = 1<<n;

        int sum;
        int total_sum=0;
        for(int i=0;i<total;i++){
            sum =0;
            for(int j=0;j<n;j++){
                if((i & (1 << j))!=0)
                    sum+=A[j];
            }
            total_sum+= sum;

        }
        System.out.println(total_sum);

    }
}
