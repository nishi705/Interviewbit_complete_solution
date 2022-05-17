package Beginners_Batch.Advance.Maths;

import java.util.ArrayList;

public class Largest_Coprime_Divisor {
    int GCD(int A,int B){
        if(A==0){
            return B;
        }

        if(A>=B){
            return GCD(A%B,B);
        }
        return GCD(B%A,A);

    }

    public int cpFact(int A, int B) {
        if(GCD(A,B)==1){
            return A;
        }

        //here using this A/GCD(A,B) we are trying tp remove the largest divisor one by one from A…
        //i.e at every iteration divide A by GCD(A,B)  until GCD(A,B)==1;;
        return cpFact(A/GCD(A,B),B);
    }
    //    static int GCD(int a,int b){
//        if(a==0){
//            return b;
//        }
//
//        return GCD(b%a,a);
//    }
    public static void main(String[] args) {
        int A= 921127411;
        int B = 8745993;
//
//
//        ArrayList<Integer> a = new ArrayList<>();
//        for(int i=1;i<=A;i++){
//            if(A%i ==0){
//
//               a.add(i);
//            }
//        }
//        int x = GCD(8745993, 921127411);
//
//   int max = Integer.MIN_VALUE;
//        int val =0;
//        for(int i=0;i<a.size();i++) {
//           // int x = GCD(8745993, 921127411);
//           // System.out.println(x);
//            if(x==1){
//                max = Math.max(max,x);
//                val = a.get(i);
//            }
//
//        }
//       // System.out.println(val);



    }
}
