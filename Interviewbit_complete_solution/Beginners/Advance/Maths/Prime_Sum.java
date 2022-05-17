package Beginners_Batch.Advance.Maths;

import java.util.ArrayList;
import java.util.HashSet;

public class Prime_Sum {
    public static void main(String[] args) {
        //int[] A={5,7,8,19,20,22,25};
//        int A = 25;
//        int g=0;
//        int mod=1000000007;
//        for(int i=0;i<=A;i++){
//            g = Math.max(g,i);
//        }
//        int[] spf =new int[g+1];
//
//        for(int i=0;i<spf.length;i++){
//            spf[i] =i;
//
//        }
//
//        for(int i=2;i*i<=g;i++){
//            for (int j = i * i; j <= g; j += i) {
//                if (spf[j] == j) {
//                    spf[j] = i;
//
//                }
//            }
//        }
//
//        //HashSet<Integer> set = new HashSet<Integer>();
//        ArrayList<Integer> al = new ArrayList<>();
//        for(int i=0;i<=A;i++){
//            if(i <2) continue;
//            int element = i;
//            while(element>1){
//               al.add(spf[element]);
//              //  System.out.println(spf[element]);
//                element= element/spf[element];
//
//            }
//        }




       int[] A ={1,2,3};
        int maxNum= 0;
        for(int i=0;i<A.length;i++){
            maxNum = Math.max(maxNum,A[i]);
        }

        int[] spf = new int[maxNum+1];

        for(int i=0;i<spf.length;i++){
            spf[i] =i;
        }

        for(int i=2;i*i<=maxNum;i++){
            for(int j=i*i;j<=maxNum;j+=i){
                if(spf[j] == j){
                    spf[j] =i;
                }
            }
        }


        long count=0L;int mod=1000000007;
        count = count%mod;

        long num=1L;

        for(int i=0;i<A.length;i++){
            if(A[i] < 2 ) continue;
            if(spf[A[i]] == A[i]){

                count = ((count%mod)+(num%mod))%mod;
                System.out.println(count);
                num = (num*2)%mod;
            }
        }
        //System.out.println(numOfPrimeNumbers);
       // return (int)count;
    }

}
