package Beginners_Batch.Advance.Binary_search;

import java.util.ArrayList;

public class Matrix_Search_Binary_search {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {

        int n = A.size();
        int m = A.get(0).size();

        int i = 0;
        int j = n*m-1;

        while(i<=j){
            int mid = (i+j)/2;

            int row = mid/m;
            int col = mid%m;


            if(A.get(row).get(col)==B)
            {
                return 1;
            }
            else if(A.get(row).get(col)<B){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return 0;
    }
}
