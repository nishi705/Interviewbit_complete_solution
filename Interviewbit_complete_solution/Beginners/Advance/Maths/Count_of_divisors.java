package Beginners_Batch.Advance.Maths;

public class Count_of_divisors {

    //for given array count the divisors
    public int[] solve(int[] A) {

        int[] arr = new int[A.length];
        for(int i=0;i<A.length;i++){
            int divisor = 1;
            int c = A[i];
            while(c>1){
                int x = spf(c);
                int power = 1;

                while(c % x == 0){
                    c = c/x;
                    power++;
                }
                divisor = divisor * (power);
            }
            arr[i] = divisor;
        }
        return arr;

    }

    private static int spf(int N) {

        for(int i=2;i*i<=N;i++){
            if(N%i == 0){
                return i;
            }
        }
        return N;

    }
    public static void main(String[] args) {

        //Brute Force
//        int[] A={2, 3, 4, 5};
//
//        int[] count= new int[A.length];
//        int k=0;
//        for(int i=0;i<A.length;i++){
//            k=0;
//           int a = A[i];
//            for(int j=1;j<=a;j++){
//                if(A[i]%j==0){
//
//                    k++;
//
//
//                }
//
//            }
//            count[i] = k;
//
//        }
//
//
//
//        for(int i=0;i<count.length;i++){
//            System.out.print(count[i]+" ");
//        }

           //Optimised approach


     int N = 600;
        int divisor = 1;
        while(N>1){
            int x = callspf(N);
            int power = 0;

            while(N%x == 0){
                N = N/x;
                power++;
            }
            divisor = divisor * (power+1);
        }

        System.out.print(divisor);

    }

    private static int callspf(int N) {

        for(int i=2;i*i<=N;i++){
            if(N%i == 0){
                return i;
            }
        }
        return N;

    }
}
