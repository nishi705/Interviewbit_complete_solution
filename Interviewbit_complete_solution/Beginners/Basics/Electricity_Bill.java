package Beginners_Batch.Basics;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        double ans =0;
        double total = 0;
        int val=0;

        if(A<=50)
        {
            ans = 0.50*A;
            total = ans+0.20*ans;
            val = (int) total;
            System.out.print(val);
        }
        else if(A<=150)
        {
            ans = 0.5 * 50 +(A-50)*0.75;
            total = ans+0.20*ans;
            val = (int) total;
            System.out.print(val);
        }
        else if(A<=250)
        {
            ans = 0.50*50 +0.75*100+(A-150)*1.2;
            total = ans+0.20*ans;
            val = (int) total;
            System.out.print(val);
        }
        else{
            ans = 0.50*50+ 0.75*100+1.2*100+(A-250)*1.5;
            total = ans+0.20*ans;
            val = (int) total;
            System.out.print(val);
        }


    }
}
