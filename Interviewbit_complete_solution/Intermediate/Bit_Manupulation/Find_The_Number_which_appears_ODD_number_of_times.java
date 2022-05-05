package Bit_Manupulation;
/*
find the number which is appearing odd number of times
 */

public class Find_The_Number_which_appears_ODD_number_of_times {
    public static void main(String[] args) {
        int[] A ={2,8,3,1,2,2,3,2,8,1,1};
        int ans =0;
        for(int i=0;i<A.length;i++){
            ans = ans^A[i];
        }
        System.out.println(ans);
    }
}
