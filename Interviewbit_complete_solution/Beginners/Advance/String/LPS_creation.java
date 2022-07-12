package Beginners_Batch.Advance.String;

public class LPS_creation {
    public static void main(String[] args) {
        String A = "CDCDFBFCDCDFDFCDCDFBFCDCDFDFCDC";


        int[] a = new int[A.length()];

        a[0] = 0;


        for (int i = 1; i < A.length(); i++) {
            int x = a[i - 1];

            while (A.charAt(i) != A.charAt(x)) {
                if (x == 0) {
                    x = -1;
                    break;
                }
                x = a[x - 1];
            }
            a[i] = x+1;
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}