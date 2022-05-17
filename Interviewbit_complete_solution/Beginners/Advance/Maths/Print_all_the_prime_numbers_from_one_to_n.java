package Beginners_Batch.Advance.Maths;

import java.util.ArrayList;
public class Print_all_the_prime_numbers_from_one_to_n {

    public static void main(String[] args) {
        int n = 8;

        //Optimise approach
        callprimeoptimised(n);


        //Brute Force Approach

//        ArrayList<Integer> al = new ArrayList<>();
//        for(int loop=2; loop<n; ++loop){
//            if(isPrime(loop)){
//                al.add(loop);
//            }
//        }
//         for(int i=0;i<al.size();i++){
//             System.out.print(al.get(i)+" ");
//         }
        
    }

    private static void callprimeoptimised(int n) {

        boolean[] A = new boolean[n+1];

        for(int i=0;i<A.length;i++){
            A[i] = true;
        }

        for(int j=2;j<=n;j++){
            if(A[j]){
                for(int k=j*j;k<=n;k+=j){
                    A[k] = false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(A[i]){
               System.out.print(i+" ");
            }

        }
    }



    private static boolean isPrime(int number) {
        int i;
        boolean flgPrime=true;
        for(i=2; i*i<=number; i++){
            if(number%i==0){
                flgPrime=false;
                break;
            }
        }
        return flgPrime;
    }
}
