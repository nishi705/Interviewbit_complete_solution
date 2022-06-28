package Beginners_Batch.Advance.Two_Ponters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subarray_with_given_sum {
    static  ArrayList<Integer> callmed(List<Integer> A, int B){

        ArrayList<Integer> def = new ArrayList<Integer>();
        int start = 0;
        int sum = A.get(0);
        int s = A.size();

        for(int i=1; i<=s; i++){
            while(sum>B && start < i-1){
                sum -= A.get(start);
                start++;
            }
            if(sum == B){
                for(int j=start; j<i; j++){
                    def.add(A.get(j));
                }
                return def;
            }
            // elements are available at indexes i<s
            if(i<s)
                sum += A.get(i);
        }

        //if sum not found add -1 to ArrayListand return
        def.add(-1);
        return def;


    }
    public static void main(String[] args) {
//        int[] A = {1, 2, 3, 4, 5};
//        int B= 5;
//        int[] a = new int[2];
//        a[0] = -1;
//        // int k = -1;
//        // al.add(k);
//        int i=0;
//        int j=A.length-1;
//        //System.out.println(j);
//        while(i<=j){
//            if((A[i]+A[j])==B){
//                a[0] =A[i];
//                a[1] =A[j];
//                i++;
//                j--;
//            }else if(A[i]+A[j]<B){
//                i++;
//            }else{
//                j--;
//            }
//
//        }
//        for(int l=0;l<a.length;l++){
//            System.out.println(a[l]);
//
//        }



Integer[] a = {1,2,3,4,5};
List<Integer> A = Arrays.asList(a);

int B = 5;
callmed(A,B);



    }
}
