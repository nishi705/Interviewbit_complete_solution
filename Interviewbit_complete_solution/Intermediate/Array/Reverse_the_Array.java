package Array;

public class Reverse_the_Array {
    //Second method recursive equation
    void callrecursion(int[] A,int i,int j){

        if(i>=j){
            return;
        }
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

        callrecursion(A,i+1,j-1);
    }
    public int[] solve(final int[] A) {
        int i = 0;
        int j = A.length - 1;

        callrecursion(A, i, j);
        return A;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int i=0;
        int j = A.length-1;
        while(i<j){
            int temp = A[i];
            A[i]= A[j];
            A[j] = temp;
            i++;
            j--;
        }
         for(int k=0;k<A.length;k++){
             System.out.print(A[k]+" ");
         }
    }
}
