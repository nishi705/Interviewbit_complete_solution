package Beginners_Batch.Advance.Maths;

public class GCD_for_Array_of_an_element {
    static int GCD(int a, int b){

        if (a == 0) {

            return b;
        }
        return GCD(b%a,a);

    }
    public static void main(String[] args) {

       int[] A = {2, 4, 6, 8, 16};

       int x = findGCD(A);
        System.out.print(x);

    }

    private static int findGCD(int[] A) {
        int x = A[0];
        for(int i=0;i<A.length;i++){
            x = GCD(x,A[i]);

            if(x==1){
                return (x);
            }
        }
        return (x);

    }
}
