package TWODMatrix;


import java.util.ArrayList;

//    if we have N*M matrics then while creating the
//    anti-diagonal matrics we have N+M-1: column
public class Print_Anti_DiagonalMatrix {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int[][] ans = new int[(A.length+A.length)-1][A[0].length];

        int x,y,k=0;
        for(int j=0;j<A.length;j++){
            x=0;
            y=j;
            while(x<A.length && y>=0){
                ans[k][x] = A[x][y];
                x++;
                y--;
            }
            k++;
        }

        int z;
        for(int i=1;i<A.length;i++){
            x=i;
            y=A.length-1;
            z=0;
            while(x<A.length && y>=0){
                ans[k][z] = A[x][y];
                System.out.println(ans[k][z]);
                x++;
                y--;
                z++;
            }

            k++;
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.println(ans[i][j]);
            }
            System.out.println();
        }

    }



    //Lets try with ARRAYLIST
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        int x, y, z = 0;
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<>());
            x = 0;
            y = i;
            while (x < A.size() && y >= 0) {
                B.get(z).add(A.get(x).get(y));
                x++;
                y--;
            }
            while (x < A.size()) {
                B.get(z).add(0);
                x++;
            }
            z++;
        }

        for (int i = 1; i < A.size(); i++) {
            B.add(new ArrayList<>());
            x = i;
            y = A.size() - 1;
            while (x < A.size() && y >= 0) {
                B.get(z).add(A.get(x).get(y));
                x++;
                y--;
            }
            while (y >= 0) {
                B.get(z).add(0);
                y--;
            }
            z++;
        }
        return B;
    }


    }
