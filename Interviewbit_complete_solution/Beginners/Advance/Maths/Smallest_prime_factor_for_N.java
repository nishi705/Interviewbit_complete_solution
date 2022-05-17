package Beginners_Batch.Advance.Maths;

import java.util.ArrayList;

public class Smallest_prime_factor_for_N {
    public static void main(String[] args) {
        int N = 600;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=2;i*i<=N;i+=2){
            if(N%i ==0){
                al.add(i);
            }
        }
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
