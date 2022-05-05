package Array;

public class Minimum_Pc {
    public static void main(String[] args) {
        //maximum among all the even element
        //minimum among all the odd element

        int[] A={0, 2, 9};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]%2 ==0){
                max=Math.max(max,A[i]);
            }
            else{
                min=Math.min(min,A[i]);
            }
        }
        System.out.println(max-min);

    }
}
