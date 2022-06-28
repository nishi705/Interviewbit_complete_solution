package Beginners_Batch.Advance.Subaaray_Subsequence;

public class subaaray_with_sum_is_equal_to_zero {

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int B = 5;
int[] arr  = new int[2];

//        int sum =0;
//        int i=0;
//        for(;i<A.length;i++){
//            sum= sum+A[i];
//            if(sum>=B)break;
//        }
//        //System.out.println(i);
//
//
//        for(int j=i;j<A.length;j++){
//            if(sum==B){
//               // System.out.println(1);
//                arr[0] =
//                arr[1]=i;
//            }
//            if(sum>B){
//                sum=sum+A[j];
//               // sum=sum+A[j-i];
//            }
//        }
            int k =2;
            int sum = 0;
               for(int i=0;i<2;i++){
                   sum=sum+A[i];
               }

               for(int j=2;j<A.length;j++){
//                   sum= sum+A[j];
//                   sum= sum-A[j-k];
                   int x = A[j-k];
                   System.out.println(x);
               }

    }
}
