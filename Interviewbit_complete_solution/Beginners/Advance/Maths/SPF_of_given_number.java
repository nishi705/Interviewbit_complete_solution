package Beginners_Batch.Advance.Maths;

import java.util.ArrayList;
import java.util.HashMap;

public class SPF_of_given_number {
    public static void main(String[] args) {
        int A = 25;

        int[] spf = new int[A+1];

        for(int i=2;i<=A;i++){
            spf[i] = i;
        }


        for(int i=2;i*i<=A;i++){
            if(spf[i]==i){
                for(int j=i*i;j<=A;j+=i){
                    if(spf[j]==j){
                        spf[j] =i;
                    }
                }
            }
        }

        //this will give the answer without using if(spf[i] == i)
        for(int i=2;i<spf.length;i++){
            System.out.println(spf[i]);
        }
    }
}
