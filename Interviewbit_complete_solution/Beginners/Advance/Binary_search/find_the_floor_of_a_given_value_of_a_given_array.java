package Beginners_Batch.Advance.Binary_search;

public class find_the_floor_of_a_given_value_of_a_given_array {

    public static void main(String[] args) {
        int[] A= {-5,2,3,6,9,10,11,15,18};
        int k =4;
        int i=0;
        int j= A.length-1;
        int ans = Integer.MIN_VALUE;

        while(i>j){
            int mid = (i+j)/2;
            if(A[mid]==k){
                System.out.print(A[mid]);
            }
            if(k>A[mid]){
                ans=A[mid];
                i=mid+1;
            }else{
                j = mid-1;
            }
        }
        System.out.print(ans);
    }
}
