package Beginners_Batch.Basics;

import java.util.Scanner;

public class Max_of_three {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B= scn.nextInt();
        int C= scn.nextInt();

        if(A>=B && A>=C)
        {
            System.out.print(A);
        }
        else if(B>=C && B>=A)
        {
            System.out.print(B);
        }
        else
        {
            System.out.print(C);
        }

    }
}
