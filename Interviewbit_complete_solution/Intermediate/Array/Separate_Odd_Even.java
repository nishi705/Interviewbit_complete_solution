package Array;

import java.util.Scanner;

public class Separate_Odd_Even {
    static void getseparateArray(int[] A)
    {
        int even_size = 0;
        int odd_size= 0;

        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
                even_size++;
            else
                odd_size++;
        }

        int[] even = new int[even_size];
        int[] odd = new int[odd_size];

        int j=0;
        int k=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                even[j++] =A[i];
            }
            else{
                odd[k++] = A[i];
            }
        }
        printArray(odd);
        printArray(even);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T>0)
        {
            int N = scn.nextInt();
            int[] A = new int[N];
            for(int i=0;i<A.length;i++)
            {
                A[i] = scn.nextInt();
            }
            getseparateArray(A);
            T--;
        }
    }

    static void printArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");

        }
        System.out.println();
    }
}
