package Beginners_Batch.Advance.Binary_search;

public class Matrix_Search_Brute_Force {
    public static void main(String[] args) {
        int[][] A = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int B = 30;

//int i =0;
//int j= A.length-1;
//
//while(i<j){
//    if(B==A[i][j]){
//        System.out.println("true");
//    }if(B<A[i][j]){
//        j--;
//    }else{
//        i++;
//    }
//}

//Brute Force Only
//        for(int i=0;i<A.length;i++){
//            int col_length = A[0].length;
//            for(int j=0;j<col_length;j++){
//                if(A[i][j]==B){
//                    System.out.println(i+""+j+":->"+1);
//                }
//            }
//        }
         int n = A.length;
        //System.out.println(n);
         int x =0;
        for(int i=0;i<A.length;i++) {
            System.out.println(i);
            System.out.println(A[i].length);
            System.out.println();
            x = searchvalue(A, i,A[i].length);
        }
        System.out.println(x);

    }
    static int searchvalue(int[][] A, int i, int j){
      //i = length for row
        //j = length for col
        System.out.println(i);


        int l=0;
        int r = j;
//        for(int m=l;m<r;m++){
//            System.out.print(A[i][m]+" ");
//        }
//        System.out.println();

        int k = 3;
        int ans =-1;

        while(l<r){
            int mid = (l+r)/2;
            if(A[i][mid]==k)
                return mid;
            else if(A[i][mid]<k) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }
        return ans;
    }
}
