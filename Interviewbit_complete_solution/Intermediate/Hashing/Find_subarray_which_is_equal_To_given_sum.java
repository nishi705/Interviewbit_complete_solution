package Hashing;

public class Find_subarray_which_is_equal_To_given_sum {
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int[] ps = new int[arr.length];
        ps[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            ps[i] = arr[i]+ps[i-1];
        }

        for(int i=0;i<ps.length;i++){
            System.out.print(ps[i]+" ");
        }
    }
}
