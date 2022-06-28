package Beginners_Batch.Advance.Subaaray_Subsequence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sub_array_with_0_sum {
        public static void main(String[] args) {
//        int[] A= {96, -71, 18, 66, -39, -32, -16, -83, -11, -92, 55, 66, 93, 5, 50, -45, 66, -28,
//                69, -4, -34, -87, -32, 7, -53, 33, -12, -94, -80, -71, 48, -93, 62};


       // int[] A= {4,2,-3,1,6};


//        for(int k=1;k<=A.length;k++) {
//
//            int sum = 0;
//            for (int j = 0; j < k; j++) {
//                sum = sum + A[j];
//                if(sum==0){
//                    System.out.println(1);
//                }
//
//                for(int i=k;i<A.length;i++){
//                    sum= sum+A[i];
//                    sum= sum-A[i-k];
//
//                    if(sum==0){
//                        System.out.println(1);
//                    }
//                }
//
//            }
//        }

            ArrayList<Integer> al = new ArrayList<>();

            int[] A= {4,2,-3,1,6};
            int B =0;


            int end = A.length;
            int start =0;
            int sum=A[0];
            for(int k=1;k<=A.length;k++){

                while(sum>B && start<k-1){
                    sum=sum-A[start];
                    start++;
                }if(sum==B){
                    int p = k - 1;
                    System.out.println(
                            "Sum found between indexes " + start
                                    + " and " + p);
                }


                if(k<end){
                    sum=sum+A[k];
                }
            }


            for(int j=0;j<al.size();j++){
                System.out.println(al.get(j));
            }


    }
}
