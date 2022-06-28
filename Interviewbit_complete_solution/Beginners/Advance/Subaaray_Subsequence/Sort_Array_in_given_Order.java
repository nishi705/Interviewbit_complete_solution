package Beginners_Batch.Advance.Subaaray_Subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Sort_Array_in_given_Order {
    public static void main(String[] args) {

      int[]  A  ={10, 2, 18, 16, 16, 16 };
       int[]  B  ={ 3, 13, 2, 16, 4, 19 };
        ArrayList<Integer> al = new ArrayList<>();
//        HashSet<Integer> set = new HashSet<>();
//
//        for(int i=0;i<A.length;i++){
//            set.add(A[i]);
//        }
//        int i=0;
//        for(;i<B.length;i++){
//            if(set.contains(B[i])){
//                al.add(B[i]);
//               set.remove(B[i]);
//            }
//        }
//
//        //al.addAll(set);
//
//  //      System.out.println(set.size());
//
//        int j=0;
//        while(j<A.length){
//            if(set.contains(A[j]))
//                al.add(A[j]);
//            j++;
//        }
////
//        for(int k=0;k<al.size();k++){
//            System.out.println(al.get(k));
//        }

//      int[]  A  ={ 12, 7 };
//        int[] B ={ 7, 1, 6, 17, 2, 19, 10 };




        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<A.length;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }

        /*
        int[]  A  ={10, 2, 18, 16, 16, 16 };
       int[]  B  ={ 3, 13, 2, 16, 4, 19 };
       16 = 3
       2 = 1
       18 = 1
       10 = 1
         */

        for(int i=0;i<B.length;i++) {
            if (map.containsKey(B[i])) {
                al.add(B[i]);

            if(map.get(B[i])>1){

                while(map.get(B[i])!=1){
                    al.add(B[i]);
                    map.put(B[i],map.get(B[i])-1);
                }

            }
            //if(map.get(B[i])==1){
            map.remove(B[i]);
             //}
        }

        }

        int j=0;
             while(j<A.length){
                 Arrays.sort(A);
                 if(map.containsKey(A[j]))
                     al.add(A[j]);

                 j++;
             }

//        for (HashMap.Entry<Integer, Integer> set :
//                map.entrySet()) {
//            System.out.println(set.getKey() + " = " + set.getValue());
//        }

        /*
        2 16 16 16 10 18
Your function returned the following:
2 16 10 18
         */

             for(int i=0;i<al.size();i++){
                 System.out.println(al.get(i));
             }

    }
}
