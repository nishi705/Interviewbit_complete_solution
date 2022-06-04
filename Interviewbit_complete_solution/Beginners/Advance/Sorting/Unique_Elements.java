package Beginners_Batch.Advance.Sorting;

import java.util.*;

public class Unique_Elements {

    public static void main(String[] args) {
//        int[] A = {1, 6, 4, 6, 4, 8, 2, 4, 1, 1};
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < A.length; i++) {
//            if (map.containsKey(A[i])) {
//                map.put(A[i], map.get(A[i] + 1));
//            } else {
//                map.put(A[i], 1);
//            }
//        }
        /*
        51, 6, 10, 8, 22, 61, 56, 48, 88, 85, 21, 98, 81, 76, 71,
                68, 18, 6, 14, 23, 72, 18, 56, 30, 97, 100, 81, 5, 99, 2, 85, 67, 46,
                32, 66, 51, 76, 53, 36, 31, 81, 56, 26, 75, 69, 54, 54, 54, 83, 41, 86, 48,
                7, 32, 85, 23, 47, 23, 18, 45, 79, 95, 73, 15, 55, 16, 66, 73, 13,
                85, 14, 80, 39, 92, 66, 20, 22, 25, 34, 14, 51, 14, 17, 10, 100, 35, 9, 83,
                31, 60, 24, 37, 69, 62
         */

        Integer[] A = {1, 1, 3};
        List<Integer> al = Arrays.asList(A);

        int count=0;
        int nextval = al.get(0);

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<al.size();i++){
            int num = al.get(i);
            if(set.contains(al.get(i))){
                if(nextval<=num) {
                    count++;
                    nextval= num+2;
                    set.add(num+1);
                }else{
                    count+= nextval-num;
                    set.add(nextval);
                    nextval++;
                }
            }else{
                set.add(al.get(i));
            }
        }

//        if(set.size()==al.size()) {
//            System.out.println("yes");
//        }else {
            System.out.print(count);
        //}
     //   return count;





    }


}
