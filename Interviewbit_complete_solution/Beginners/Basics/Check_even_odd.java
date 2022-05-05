package Beginners_Batch.Basics;

import java.util.Scanner;

public class Check_even_odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();

        if(A%2==1)
        {
            System.out.print(1);
        }
        else
        {
            System.out.print(0);
        }

    }
}
