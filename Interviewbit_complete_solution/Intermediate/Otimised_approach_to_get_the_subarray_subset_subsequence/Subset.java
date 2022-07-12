//package Otimised_approach_to_get_the_subarray_subset_subsequence;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Subset {
//    public static void main(String[] args) {
//       // [] [12 ] [12 13 ] [13 ]
//        Integer[]  a =  {},{12},{12,13},{13};
//        Arrays
//        List<Integer> list = Arrays.asList(a);
//
//    }
////    public class Solution {
////        boolean check_bit(int i,int j){
////            if(((i>>j)&1)==1){
////                return true;
////            }
////            retur false;
////        }
////
////
////        public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
////
////            ArrayList<ArrayList<Integer>> al = new ArrayList<>();
////            int n = A.size();
////            int subset_size = (int)Math.pow(2,n);
////            Collections.sort(A);
////
////            for(int i=0;i<subset_size;i++){
////                ArrayList<Integer> temp = new ArrayList<>();
////
////                for(int j=0;j<n;j++){
////                    if(check_bit(i,j)){//check whether the bit is set or not if set push into temp
////                        temp.add(A.get(j));
////
////                    }
////                }
////                al.add(temp);
////            }
////            Collections.sort(al);
////            return ans;
////
////
////        }
////    }
//
//
//}
