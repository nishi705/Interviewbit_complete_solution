package Beginners_Batch.Advance.Maths;

import java.util.ArrayList;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {

        int n = 25;

        int[] spf = new int[n+1];

        for(int i=0;i<=n;i++){
              spf[i] = i;
        }

        for(int j=2;j*j<=n;j++){
            if(spf[j]==j){
                for(int k=j*j;k<=n;k+=j){
                    spf[k] = j;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(spf[i] == i){
                System.out.print(spf[i]+" ");
            }
        }
    }
}
