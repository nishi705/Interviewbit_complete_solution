package TWODMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Row_to_Column_Zero {
    public int[][] solve(int[][] A) {


      //Using Array:
        int answer[][] = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                answer[i][j] = A[i][j];
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 0) {
                    for (int k = 0; k < A[0].length; k++) {
                        answer[i][k] = 0;
                    }
                    break;
                }
            }
        }

        for (int j = 0; j < A[0].length; j++) {
            for (int i = 0; i < A.length; i++) {
                if (A[i][j] == 0) {
                    for (int k = 0; k < A.length; k++) {
                        answer[k][j] = 0;
                    }
                }
            }
        }

        return answer;





    }


    //Using ArrayList:
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        for (int i=0; i<A.size(); i++) {
            B.add(new ArrayList<>(A.get(i)));
        }
        int x,y;
        for (int i=0; i<A.size(); i++) {
            for (int j=0; j<A.get(i).size(); j++){
                if (A.get(i).get(j) == 0){
                    x=0; y=0;
                    while (x<B.get(i).size()) {
                        B.get(i).set(x,0);
                        x++;
                    }
                    while(y < B.size()) {
                        B.get(y).set(j,0);
                        y++;
                    }
                }
            }
        }
        return B;
    }
}
