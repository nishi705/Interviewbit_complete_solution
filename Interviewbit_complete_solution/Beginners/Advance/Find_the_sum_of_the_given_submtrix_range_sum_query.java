package Beginners_Batch.Advance;

public class Find_the_sum_of_the_given_submtrix_range_sum_query {
   static  int M =4;//row
    static int N =5;//col
    public static void main(String[] args) {
        //given query Q= (1,2) and (4,3)
        int A[][] = {{1, 2, 3, 4, 6},
                {5, 3, 8, 1, 2},
                {4, 6, 7, 5, 5},
                {2, 4, 8, 9, 4}};


        int aux[][] = new int[M][N];

        preProcess(A, aux);

        /*
        tli :  Row number of top left of query submatrix
        tlj :  Column number of top left of query submatrix
        rbi :  Row number of bottom right of query submatrix
        rbj :  Column number of bottom right of query submatrix

         */
        int tli = 2, tlj = 2, rbi = 3, rbj = 4;

                 sumQuery(aux, tli, tlj, rbi, rbj);

    }

    private static int sumQuery(int[][] aux, int tli, int tlj, int rbi, int rbj) {
        int res = aux[rbi][rbj];
        if (tli > 0)
            res = res - aux[tli-1][rbj];

        // Remove elements between (0, 0)
        // and (rbi, tlj-1)
        if (tlj > 0)
            res = res - aux[rbi][tlj-1];

        // Add aux[tli-1][tlj-1] as elements
        // between (0, 0) and (tli-1, tlj-1)
        // are subtracted twice
        if (tli > 0 && tlj > 0)
            res = res + aux[tli-1][tlj-1];

        return res;

    }

    private static void preProcess(int[][] A, int[][] aux) {

        //copy the first row of the matrix to the aux matrix
        for(int i=0;i<N;i++){
            aux[0][i] = A[0][i];
        }
        //col wise sum
        for(int i=1;i<M;i++){
            for(int j=0;j<N;j++){
                aux[i][j]= A[i][j]+aux[i-1][j];
                //System.out.print(aux[i][j]+" ");
            }
            //System.out.println();
        }
        //row wise matrix
        for(int i=0;i<M;i++){
            for(int j=1;j<N;j++){
                aux[i][j] = A[i][j]+aux[i][j-1];
                System.out.print(aux[i][j]+" ");
            }
            System.out.println();
        }

//        for(int i=0;i<M;i++){
//            for(int j=0;j<N;j++){
//                System.out.print(aux[i][j]+" ");
//            }
//            System.out.println();
//        }

    }

}
