package Beginners_Batch.Advance.Maths;

import java.util.ArrayList;

public class List_Of_all_the_prime_numbers_of_given_array {
    static ArrayList<Integer> sieve(int n){
        ArrayList<Integer> prime = new ArrayList<Integer>();
        for(int i = 0; i < n + 1; i++)
            prime.add(0);
        int p = 2;
        while(p * p <= n){
            if(prime.get(p) == 0){
                for (int i = 2 * p; i < n + 1; i += p)
                    prime.set(i, 1);
            }
            p += 1;
        }

        ArrayList<Integer> allPrimes = new ArrayList<Integer>();
        for (int i = 2; i < n; i++){
            if (prime.get(i) == 0)
                allPrimes.add(i);
        }
        return allPrimes;
    }
    static ArrayList<Integer> distPrime(ArrayList<Integer> arr,
                                        ArrayList<Integer> allPrimes){

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < allPrimes.size(); i++){
            for (int j = 0; j < arr.size(); j++){
                if(arr.get(j) % allPrimes.get(i) == 0){
                    System.out.println(allPrimes.get(i));
                    list1.add(allPrimes.get(i));

                }
            }
        }
        return list1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> allPrimes = new ArrayList<>(sieve(10000));

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(15);
        arr.add(30);
        arr.add(60);
        ArrayList<Integer> ans = new ArrayList<Integer>(distPrime(arr, allPrimes));

    }
}
