package Beginners_Batch.Advance.Maths;

import java.util.ArrayList;

public class Prime_Factorization {
    public static void main(String[] args) {
        int N = 72;
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=2;i*i<=N;i++){

            while(N%i==0){
               a.add(i);
               N=N/i;
            }
        }

        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
    }


}
