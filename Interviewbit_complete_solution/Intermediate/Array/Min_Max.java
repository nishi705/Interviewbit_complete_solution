package Array;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] A = new int[N];

        for(int i=0;i<A.length;i++)
        {
            A[i] = scn.nextInt();
        }
        getMinMax(A);
    }
    static void getMinMax(int[] A){
        int max = A[0];
        int min = A[0];

        for(int j=0;j<A.length;j++)
        {
            if(A[j]>max)
            {
                max = A[j];
            }
            else if(A[j]<min)
            {
                min=A[j];
            }
        }
        System.out.print(max+" "+min);
    }
}
