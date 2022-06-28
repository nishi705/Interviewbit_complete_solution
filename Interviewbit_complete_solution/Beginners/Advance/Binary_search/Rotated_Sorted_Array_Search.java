//package Beginners_Batch.Advance.Binary_search;



/*
public class Solution {
    static int solve(int[] A) {
       int pivot=0;

        for(int i=1; i<A.length; i++){
            if(A[i] < A[i-1]){
                pivot = i-1;
                break;
            }
        }
        return pivot;

    }

    public int search(final int[] A, int B) {
        int a = solve(A);
        int k = searchelement(A,B,a);
        return k;
    }
    static int searchelement(int[] A,int B,int a){
       int l = 0;
        int r = A.length-1;
        if(B<=A[a] && B >= A[l]){
            return searchelementusingbinarysearch(A,l,a,B);
        }else{
            return searchelementusingbinarysearch(A,a+1,r,B);
        }
    }
    static int searchelementusingbinarysearch(int[] A,int i,int j,int B){
        while(i<=j){
            int mid = (i+j)/2;
            if(A[mid]==B){
                return mid;
            }else if(B>A[mid]){
                i=mid+1;
            }else{
                j=mid-1;

            }
        }
        return -1;
    }
}

 */




//
//public class Rotated_Sorted_Array_Search {
//
//
//    public class Solution {
//        static int solve(int[] A) {
//            int pivot=0;
//
//            for(int i=1; i<A.length; i++){
//                if(A[i] < A[i-1]){
//                    pivot = i-1;
//                    break;
//                }
//            }
//            return pivot;
//        }
//
//        public int search(final int[] A, int B) {
//            int a = solve(A);
//            int k = searchelement(A,B,a);
//            return k;
//        }
//        static int searchelement(int[] A,int B,int a){
//            int l = 0;
//            int r = A.length-1;
//            if(B<=A[a] && B >= A[l]){
//                return searchelementusingbinarysearch(A,l,a,B);
//            }else{
//                return searchelementusingbinarysearch(A,a+1,r,B);
//            }
//        }
//        static int searchelementusingbinarysearch(int[] A,int i,int j,int B){
//            while(i<=j){
//                int mid = (i+j)/2;
//                if(A[mid]==B){
//                    return mid;
//                }else if(B>A[mid]){
//                    i=mid+1;
//                }else{
//                    j=mid-1;
//                }
//            }
//            return -1;
//        }
//    }
//        public static void main(String[] args) {
//        int[] A={19, 20, 21, 22, 28, 29, 32, 36, 39, 40, 41, 42, 43, 45, 48, 49,
//                51, 54, 55, 56, 58, 60, 61, 62, 65, 67, 69, 71, 72, 74, 75, 78, 81, 84,
//                85, 87, 89, 92, 94, 95, 96, 97, 98, 99, 100, 105, 107, 108, 109, 110, 112, 113, 115,
//                117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 128, 130, 131, 133, 134, 135, 136,
//                137, 138, 139, 141, 142, 144, 146, 147, 148, 149, 150, 153, 155, 157, 159, 161, 163, 164,
//                169, 170, 175, 176, 179, 180,
//                185, 187, 188, 189, 192, 196, 199, 201, 203, 205, 3, 7, 9, 10, 12, 13, 17 };
//
//        int B = 189;
////        int[] A={186, 192, 193, 202, 204, 2, 3, 6, 10, 11, 12, 17, 21, 28, 29,
////                30, 31, 32, 37, 38, 39, 40, 41, 47, 49, 50, 51, 52, 55, 57, 58, 59, 60, 65, 67, 68, 71,
////                72, 74, 77, 78, 80, 82, 83, 88, 89, 90, 94, 100, 107, 108, 109, 111, 112, 114, 115, 116, 118,
////                119, 121, 123, 124, 126, 129, 133, 134, 135, 137, 138, 144, 147, 148,
////                150, 151, 154, 156, 159, 161, 163, 165, 166, 167, 168, 169, 174, 178, 180, 182, 183, 185};
////        int B=143;
//
//            //int[] A = {12,19,25,101,5,10,15,20};
//           // int B = 5;
//         int a =searchthemaxelement(A,A.length-1,B);
//            System.out.println(a);
//
//       // int k = searchelement(A,B,a);
//      //  System.out.println(B+ " "+ a);
//      // System.out.println(k);
//
//
//
//    }
//}
