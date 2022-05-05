package Beginners_Batch.Advance;

public class Search_in_a_row_wise_and_column_wise_sorted_matrix {
    static int search(int[][] mat,
                               int n, int x)
    {

        // set indexes for top right
        int i = 0, j = n - 1;
        // element

        while (i < n && j >= 0)
        {
            if (mat[i][j] == x)
            {

                return (i * 1009 + j);
            }
            if (mat[i][j] > x)
                j--;
            else // if mat[i][j] < x
                i++;
        }
        return -1;

    }
    // driver program to test above function
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 29, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 20, 37, 48 },
                { 32, 33, 39, 50 } };

        int n = search(mat, 4, 20);
        System.out.println(n);

    }
}
