package Beginners_Batch.Basics;
/*
You are given an integer A. You have to tell whether A is divible by both 5 and 11 or not.
 */

import java.util.Scanner;

public class Divisible_by_2_numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();

        if(A%5==0 && A%11==0)
        {
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }


}
