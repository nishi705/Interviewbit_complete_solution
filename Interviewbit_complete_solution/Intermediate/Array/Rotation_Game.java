package Array;

import java.util.Scanner;

public class Rotation_Game {
    static void reverse(int[] arr,int i,int j)
    {
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];
        for(int i=0;i<A.length;i++)
        {
            A[i] = scn.nextInt();
        }
        int B = scn.nextInt();
        callfunction(A,B);
        printarr(A);
    }
    static void callfunction(int[] A,int B){

        int n = A.length;

        B= B%n;

        reverse(A,0,n-1);
        reverse(A,0,B-1);
        reverse(A,B,n-1);
    }
    static void printarr(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
