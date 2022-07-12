package Beginners_Batch.Advance.Arrays;

public class Minimum_swap {
    public static void main(String[] args) {

        int[] A ={1, 2, 3, 4, 0};

        int count =0;
        for(int i=0;i<A.length;i++){
            if(A[i]!=i){
                count++;
                int val = A[i];
                int temp = A[i];
                A[i] =A[val];
                A[val] = temp;
            }else{
                break;
            }
        }

        System.out.println(count);
    }
}
