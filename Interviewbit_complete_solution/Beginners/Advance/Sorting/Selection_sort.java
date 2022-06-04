package Beginners_Batch.Advance.Sorting;

public class Selection_sort {
    public static void main(String[] args) {
        int[] A ={3,10,6,8,15,2,12,18,17};

        for(int i=0;i<A.length-1;i++){
            int idx = i;

            for(int j=i+1;j<A.length;j++)

                if(A[j]<A[idx])
                    idx = j;

                int temp = A[idx];
                A[idx] = A[i];
                A[i] = temp;

        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
