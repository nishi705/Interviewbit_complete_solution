package Beginners_Batch.Advance.Arrays;

public class Search_in_a_row_wise_and_column_wise_sorted_matrix {
        public int solve(int[][] A, int B) {
            int i =0,j=A[0].length-1;
            //here we took ans so that if we dont get value will
            //return -1
            int ans=Integer.MAX_VALUE;
            while(i<A.length && j>=0)
            {
                if(A[i][j]==B)
                {
                    ans=Math.min(ans,(i+1)*1009+j+1);
                    //here we are doing j-- to overcome the duplicate
                    //values if we have duplicate value we will take
                    //minimum row,col value
                    j--;

                }
                else if(B>A[i][j])
                    i++;
                else
                    j--;
            }

            if(ans ==Integer.MAX_VALUE)
                return -1;
            return ans;
        }
}
